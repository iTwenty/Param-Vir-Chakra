package net.thetranquilpsychonaut.pvc;

import android.app.Application;

/**
 * Created by itwenty on 1/20/14.
 */
public class PVCApplication extends Application
{
    private static PVCApplication app;

    @Override
    public void onCreate( )
    {
        super.onCreate( );
        app = this;
    }

    public static boolean isMultiPane( )
    {
        return ( app.getApplicationContext().getResources().getString( R.string.screen_type ).equals( "Tablet" ) );
    }
}
