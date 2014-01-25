package net.thetranquilpsychonaut.pvc;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by itwenty on 1/19/14.
 */
public class PVCListFragment extends ListFragment implements TextWatcher
{
    public final static int DEFAULT_SELECTION = 0;
    PVCListAdapter adapter;
    TextView       tvSearchPVCList;
    // Needed to highlight/unhighlight rows in listview
    View           currentSelectedView;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        View v = inflater.inflate( R.layout.fragment_pvc_list, container, false );
        tvSearchPVCList = ( TextView )v.findViewById( R.id.tv_search_pvc_list );
        tvSearchPVCList.addTextChangedListener( this );
        return v;
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState )
    {
        super.onActivityCreated( savedInstanceState );
        adapter = new PVCListAdapter( getActivity( ), R.layout.pvc_list_row );
        setListAdapter( adapter );
        // Click on first row by default for tablets
        if( PVCApplication.isMultiPane( ) )
        {
            View defaultView = adapter.getView( DEFAULT_SELECTION, null, null );
            getListView( ).performItemClick( defaultView, DEFAULT_SELECTION, defaultView.getId( ) );
            changeHighlight( defaultView, true );
        }
    }

    @Override
    public void onListItemClick( ListView l, View v, int mutableListPosition, long id )
    {

        super.onListItemClick( l, v, mutableListPosition, id );
        // If a row is already selected and it is not the currently clicked row, then unhighlight it
        if( currentSelectedView != null && currentSelectedView != v )
            changeHighlight( currentSelectedView, false );
        // Set clicked row as currently selected row
        currentSelectedView = v;
        // Highlight currently clicked row
        changeHighlight( currentSelectedView, true );
        // The position this method receives denotes position in mutable list
        // We need to find position of same PVCRecipient in immutable list
        int immutableListPosition = 0;
        PVCRecipient mutableRecipient = Recipients.mutableRecipientsList.get( mutableListPosition );
        for( PVCRecipient pr : Recipients.immutableRecipientsList )
        {
            if( pr.equals( mutableRecipient ) )
            {
                immutableListPosition = Recipients.immutableRecipientsList.indexOf( pr );
                break;
            }
        }
        // We need to pass this immutable position to PVCDetailsFragment
        Bundle b = new Bundle( );
        b.putInt( Helper.SELECTED_RECIPIENT, immutableListPosition );
        // In multipane layout, the fragment is already initialized. Just update the details
        if( PVCApplication.isMultiPane( ) )
        {
            PVCDetailsFragment pvcDetailsFragment = ( PVCDetailsFragment )getActivity( ).getSupportFragmentManager( ).findFragmentById( R.id.fragment_pvc_details );
            pvcDetailsFragment.updateDetails( b );
        }
        // In single pane layout start a new activity which takes care of displaying details
        else
        {
            Intent i = new Intent( getActivity( ), PVCDetailsActivity.class );
            i.putExtras( b );
            startActivity( i );
        }
    }

    public void filter( String searchString )
    {
        // Clear the whole data source when search begins
        Recipients.mutableRecipientsList.clear( );
        // If no search query is present, just fill back the whole data source
        if( searchString.length( ) == 0 )
        {
            Recipients.fillMutableRecipientsList( );
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
        adapter.notifyDataSetChanged();
    }

    public void changeHighlight( View v, boolean b )
    {
        if( !PVCApplication.isMultiPane( ) )
            return;
        v.setBackgroundColor( b ? getResources().getColor( android.R.color.holo_blue_dark ) : Color.TRANSPARENT );
    }

    @Override
    public void afterTextChanged( Editable s )
    {
        String searchText = s.toString( ).toLowerCase( );
        if( currentSelectedView != null )
            changeHighlight( currentSelectedView, false );
        filter( searchText );
    }

    @Override
    public void beforeTextChanged( CharSequence s, int start, int count, int after ) { }

    @Override
    public void onTextChanged( CharSequence s, int start, int before, int count ) { }
}
