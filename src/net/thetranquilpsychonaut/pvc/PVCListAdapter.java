package net.thetranquilpsychonaut.pvc;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by itwenty on 1/5/14.
 */
public class PVCListAdapter extends ArrayAdapter<PVCRecipient>
{
    Context ctx;

    public PVCListAdapter( Context context, int textViewResourceId )
    {
        // The primary data source is the mutableRecipientsList since we want it to be modified by search queries
        super( context, textViewResourceId, Recipients.mutableRecipientsList );
        this.ctx = context;
    }

    /**
     * Denotes all Views inside a single ListRow
     */
    private class ViewHolder
    {
        ImageView ivThumbnail;
        TextView  tvName;
        TextView  tvAwardDate;
        TextView  tvPosthumous;
    }

    @Override
    public View getView( int position, View convertView, ViewGroup parent )
    {
        View view = convertView;
        ViewHolder holder;
        PVCRecipient recipient = Recipients.mutableRecipientsList.get( position );
        LayoutInflater inflater = ( LayoutInflater ) ctx.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );
        // If the row has not been initialised before, inflate the layout and populate ViewHolder with inflated Views
        if ( view == null )
        {
            view = inflater.inflate( R.layout.pvc_list_row, null );
            holder = new ViewHolder();
            holder.ivThumbnail = ( ImageView ) view.findViewById( R.id.iv_list_thumbnail );
            holder.tvName = ( TextView ) view.findViewById( R.id.tv_list_name );
            holder.tvAwardDate = ( TextView ) view.findViewById( R.id.tv_list_award_date );
            holder.tvPosthumous = ( TextView ) view.findViewById( R.id.tv_posthumous );
            view.setTag( holder );
        }
        else
        {
            holder = ( ViewHolder ) view.getTag( );
        }

        // Fill in the data for each View in the holder
        holder.tvName.setText( recipient.getRank( ) + " " + recipient.getName( ) );
        holder.tvAwardDate.setText( Helper.formatter.format( recipient.getAwardDate( ).getTime( ) ) );
        holder.ivThumbnail.setImageDrawable( ctx.getResources( ).getDrawable( recipient.getImageID( ) ) );
        holder.tvPosthumous.setText( recipient.isPosthumous( ) ? "P" : "" );
        return view;
    }
}
