package net.thetranquilpsychonaut.pvc;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by itwenty on 1/5/14.
 */
public class PVCListAdapter extends ArrayAdapter<PVCRecipient>
{
    Context ctx;
    ArrayList<PVCRecipient> recipients;

    public PVCListAdapter( Context context, int textViewResourceId,  ArrayList<PVCRecipient> recipients )
    {
        super( context, textViewResourceId, recipients );
        this.ctx = context;
        this.recipients = recipients;
    }

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
        PVCRecipient recipient = recipients.get( position );
        LayoutInflater inflater = ( LayoutInflater ) ctx.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );
        if ( view == null )
        {
            view = inflater.inflate( R.layout.pvc_list_row, null );
            holder = new ViewHolder();
            holder.ivThumbnail = ( ImageView ) view.findViewById( R.id.iv_thumbnail );
            holder.tvName = ( TextView ) view.findViewById( R.id.tv_name );
            holder.tvAwardDate = ( TextView ) view.findViewById( R.id.tv_awardDate );
            holder.tvPosthumous = ( TextView ) view.findViewById( R.id.tv_posthumous );
            view.setTag( holder );
        }
        else
        {
            holder = ( ViewHolder ) view.getTag();
        }
        holder.tvName.setText( recipient.getRank( ) + " " + recipient.getName( ) );
        holder.tvAwardDate.setText( Helper.formatter.format( recipient.getAwardDate( ).getTime( ) ) );
        holder.ivThumbnail.setImageDrawable( ctx.getResources( ).getDrawable( recipient.getImageID( ) ) );
        holder.tvPosthumous.setText( recipient.isPosthumous( ) ? "P" : "" );
        return view;
    }
}
