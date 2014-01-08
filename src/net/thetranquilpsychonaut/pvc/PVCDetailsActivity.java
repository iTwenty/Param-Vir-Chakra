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
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        //setContentView( R.layout.pvc_details_activity );
        Intent intent = getIntent( );
        int position = intent.getIntExtra( Helper.SELECTED_PVC, 0 );
        TextView tv = new TextView( this );
        tv.setText( Recipients.recipients.get( position ).getName( ) );
        setContentView( tv);
    }
}
