package net.thetranquilpsychonaut.pvc;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class PVCListActivity extends ListActivity
{
    ArrayList<PVCRecipient> recipients = new ArrayList<PVCRecipient>();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main );
        recipients.add( Recipients.one );
        recipients.add( Recipients.two );
        ListAdapter adapter = new ArrayAdapter<PVCRecipient>( this, android.R.layout.simple_list_item_1, recipients );
        setListAdapter( adapter );
    }
}
