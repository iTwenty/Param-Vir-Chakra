package net.thetranquilpsychonaut.pvc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by itwenty on 1/8/14.
 */
public class PVCDetailsActivity extends Activity
{
    PVCRecipient selectedRecipient;
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        //setContentView( R.layout.pvc_details_activity );
        Intent intent = getIntent( );
        int position = intent.getIntExtra( Helper.SELECTED_RECIPIENT, 0 );
        selectedRecipient = Recipients.recipients.get( position );
        TextView tv = new TextView( this );
        tv.setText( selectedRecipient.getName( ) );
        setContentView( tv);
    }
}
