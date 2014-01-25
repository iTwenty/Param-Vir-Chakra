package net.thetranquilpsychonaut.pvc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by itwenty on 1/24/14.
 */
public class PVCDetailsPagerAdapter extends FragmentPagerAdapter
{
    public PVCDetailsPagerAdapter( FragmentManager fm )
    {
        super( fm );
    }

    @Override
    public Fragment getItem( int i )
    {
        PVCDetailsFragment pvcDetailsFragment = new PVCDetailsFragment( );
        Bundle b = new Bundle( );
        b.putInt( Helper.SELECTED_RECIPIENT, i );
        pvcDetailsFragment.setArguments( b );
        return pvcDetailsFragment;
    }

    @Override
    public int getCount( )
    {
        return Recipients.immutableRecipientsList.size( );
    }

    @Override
    public CharSequence getPageTitle( int position )
    {
        return Character.toString( '\u25CF' );
    }
}
