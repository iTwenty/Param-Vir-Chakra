package net.thetranquilpsychonaut.pvc;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.*;
import android.widget.ListView;
import android.widget.SearchView;

/**
 * Created by itwenty on 1/19/14.
 */
public class PVCListFragment extends ListFragment
{
    PVCListAdapter adapter;
    SearchView              svSearchByName;

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setHasOptionsMenu( true );
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        return inflater.inflate( R.layout.fragment_pvc_list, container, false );
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState )
    {
        super.onActivityCreated( savedInstanceState );
        adapter = new PVCListAdapter( getActivity( ), R.layout.pvc_list_row );
        setListAdapter( adapter );
    }

    @Override
    public void onListItemClick( ListView l, View v, int mutableListPosition, long id )
    {
        // The position this method recieves denotes position in mutable list as we have used that as our primary data source.
        // We need to find position of same PVCRecipient in immutable list so that Prev/Next buttons work as intended in PVCDetailsActivity
        int immutableListPosition = 0;
        super.onListItemClick( l, v, mutableListPosition, id );
        PVCRecipient mutableRecipient = Recipients.mutableRecipientsList.get( mutableListPosition );
        for( PVCRecipient pr : Recipients.immutableRecipientsList )
        {
            if( pr.equals( mutableRecipient ) )
            {
                immutableListPosition = Recipients.immutableRecipientsList.indexOf( pr );
                break;
            }
        }
        Bundle bundle = new Bundle( );
        bundle.putInt( Helper.SELECTED_RECIPIENT, immutableListPosition );
        PVCDetailsFragment fragment = ( PVCDetailsFragment )getFragmentManager( ).findFragmentById( R.id.fragment_pvc_details );
        if( fragment != null && fragment.isInLayout( ) )
        {
        }
        else
        {
            Intent intent = new Intent( getActivity( ), PVCDetailsActivity.class );
            intent.putExtras( bundle );
            intent.setFlags( Intent.FLAG_ACTIVITY_NO_HISTORY );
            startActivity( intent );
        }
    }

    public void filter( String searchString )
    {
        // Clear the whole data source when search begins
        Recipients.mutableRecipientsList.clear( );
        // If no search query is present, just fill back the whole data source
        if( searchString.length( ) == 0 )
        {
            Recipients.fillMutableRecipientsList();
        }
        // else only fill those PVCRecipients which match the entered search query
        else
        {
            for( PVCRecipient pr : Recipients.immutableRecipientsList )
            {
                String RankName = ( pr.getRank( ) + " " + pr.getName( ) ).toLowerCase( );
                if( RankName.contains( searchString.toLowerCase( ) ) )
                {
                    Recipients.mutableRecipientsList.add( pr );
                }
            }
        }
        // Refresh the adapter to show searched list
        adapter.notifyDataSetChanged( );
    }

    @Override
    public void onCreateOptionsMenu( Menu menu, MenuInflater inflater )
    {
        inflater.inflate( R.menu.options_menu, menu );
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
        {
            svSearchByName = ( SearchView )menu.findItem( R.id.menu_search ).getActionView( );
            svSearchByName.setOnQueryTextListener( new SearchView.OnQueryTextListener( )
            {
                @Override
                public boolean onQueryTextSubmit( String query )
                {
                    return false;
                }

                @Override
                public boolean onQueryTextChange( String newText )
                {
                    filter( newText );
                    return true;
                }
            } );
        }
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        int itemId = item.getItemId( );
        if( itemId == R.id.menu_about )
        {
            Intent aboutIntent = new Intent( getActivity( ), AboutActivity.class );
            startActivity( aboutIntent );
        }
        return true;
    }
}
