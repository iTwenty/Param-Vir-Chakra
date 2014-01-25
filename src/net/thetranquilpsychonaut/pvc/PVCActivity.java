package net.thetranquilpsychonaut.pvc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

public class PVCActivity extends FragmentActivity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pvc );
        // Fill our primary data sources
        Recipients.fillMutableRecipientsList( );
        Recipients.fillImmutableRecipientsList( );
    }

    @Override
    protected void onDestroy( )
    {
        super.onDestroy();
        Recipients.mutableRecipientsList.clear( );
        Recipients.immutableRecipientsList.clear( );
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
