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
        PVCListAdapter adapter = new PVCListAdapter( this, R.layout.pvc_list_row, recipients );
        setListAdapter( adapter );
    }
}
