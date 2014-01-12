package net.thetranquilpsychonaut.pvc;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class PVCListActivity extends ListActivity
{
    /**
     * Called when the activity is first created.
     */
    SearchView              svSearchByName;
    PVCListAdapter          adapter;

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        // Initialise our data sources before doing anything else.
        Recipients.fillMutableRecipientsList( );
        Recipients.fillImmutableRecipientsList();
        setContentView( R.layout.pvc_list_activity );
        adapter = new PVCListAdapter( this, R.layout.pvc_list_row );
        setListAdapter( adapter );
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        MenuInflater mi = getMenuInflater( );
        mi.inflate( R.menu.options_menu, menu );
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
        return true;
    }

    @Override
    public boolean onMenuItemSelected( int featureId, MenuItem item )
    {
        int itemId = item.getItemId( );
        if( itemId == R.id.menu_about )
        {
            Intent aboutIntent = new Intent( this, AboutActivity.class );
            startActivity( aboutIntent );
        }
        return true;
    }

    @Override
    protected void onListItemClick( ListView l, View v, int mutableListPosition, long id )
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
        Intent intent = new Intent( this, PVCDetailsActivity.class );
        intent.putExtra( Helper.SELECTED_RECIPIENT, immutableListPosition );
        intent.setFlags( Intent.FLAG_ACTIVITY_NO_HISTORY );
        startActivity( intent );
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
}
