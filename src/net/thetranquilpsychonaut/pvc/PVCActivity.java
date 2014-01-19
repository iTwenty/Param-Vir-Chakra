package net.thetranquilpsychonaut.pvc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

public class PVCActivity extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        // Initialise our data sources before doing anything else.
        Recipients.fillMutableRecipientsList( );
        Recipients.fillImmutableRecipientsList( );
        setContentView( R.layout.activity_pvc );
    }
}
