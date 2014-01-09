package net.thetranquilpsychonaut.pvc;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class PVCListActivity extends ListActivity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        Recipients.addRecipients( );
        super.onCreate( savedInstanceState );
        setContentView( R.layout.pvc_list_activity );
        PVCListAdapter adapter = new PVCListAdapter( this, R.layout.pvc_list_row );
        setListAdapter( adapter );
    }

    @Override
    protected void onListItemClick( ListView l, View v, int position, long id )
    {
        super.onListItemClick( l, v, position, id );
        Intent intent = new Intent( this, PVCDetailsActivity.class );
        intent.putExtra( Helper.SELECTED_RECIPIENT, position );
        intent.setFlags( Intent.FLAG_ACTIVITY_NO_HISTORY );
        startActivity( intent );
    }
}
