package net.thetranquilpsychonaut.pvc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by itwenty on 1/19/14.
 */
public class PVCDetailsFragment extends Fragment
{
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        return inflater.inflate( R.layout.fragment_pvc_details, container, false );
    }
}
