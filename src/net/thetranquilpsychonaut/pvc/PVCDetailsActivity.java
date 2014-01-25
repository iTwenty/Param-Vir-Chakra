package net.thetranquilpsychonaut.pvc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by itwenty on 1/8/14.
 */
public class PVCDetailsActivity extends FragmentActivity
{
    ViewPager viewPager;
    PVCDetailsPagerAdapter pvcDetailsPagerAdapter;

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pvc_details );
        viewPager = ( ViewPager )findViewById( R.id.viewpager_pvc_details );
        pvcDetailsPagerAdapter = new PVCDetailsPagerAdapter( getSupportFragmentManager( ) );
        viewPager.setAdapter( pvcDetailsPagerAdapter );
        viewPager.setCurrentItem( getIntent( ).getExtras( ).getInt( Helper.SELECTED_RECIPIENT ) );
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        getMenuInflater( ).inflate( R.menu.options_menu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        int itemId = item.getItemId( );
        if( itemId == R.id.menu_about )
        {
            Intent aboutIntent = new Intent( this, AboutActivity.class );
            startActivity( aboutIntent );
        }
        return true;
    }
}
