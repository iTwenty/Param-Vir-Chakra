package net.thetranquilpsychonaut.pvc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by itwenty on 1/19/14.
 */
public class PVCDetailsFragment extends Fragment
{
    int          position;
    PVCRecipient selectedRecipient;
    ImageView    ivImage;
    TextView     tvName;
    TextView     tvBirthDate;
    TextView     tvDeathDate;
    TextView     tvBirthPlace;
    TextView     tvAwardNumber;
    TextView     tvAwardDate;
    TextView     tvAwardPlace;
    TextView     tvRegiment;
    TextView     tvCitation;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        View view = inflater.inflate( R.layout.fragment_pvc_details, container, false );
        ivImage = (ImageView)view.findViewById( R.id.iv_image );
        tvName = (TextView)view.findViewById( R.id.tv_name );
        tvBirthDate = (TextView)view.findViewById( R.id.tv_birth_date );
        tvDeathDate = (TextView)view.findViewById( R.id.tv_death_date );
        tvBirthPlace = (TextView)view.findViewById( R.id.tv_birth_place );
        tvAwardNumber = (TextView)view.findViewById( R.id.tv_award_number );
        tvAwardDate = (TextView)view.findViewById( R.id.tv_award_date );
        tvAwardPlace = (TextView)view.findViewById( R.id.tv_award_place );
        tvRegiment = (TextView)view.findViewById( R.id.tv_regiment );
        tvCitation = (TextView)view.findViewById( R.id.tv_citation );
        if( !PVCApplication.isMultiPane( ) )
            updateDetails( getArguments( ) );
        return view;
    }

    public void updateDetails( Bundle b )
    {
        position = b.getInt( Helper.SELECTED_RECIPIENT );
        selectedRecipient = Recipients.immutableRecipientsList.get( position );

        ivImage.setImageDrawable( this.getResources( ).getDrawable( selectedRecipient.getImageID( ) ) );
        tvName.setText( selectedRecipient.getRank( ) + " " + selectedRecipient.getName( ) );
        tvBirthDate.setText(
            selectedRecipient.getBirthDate( ) != null ?
                Helper.formatter.format( selectedRecipient.getBirthDate( ).getTime( ) ) :
                "????" );
        tvDeathDate.setText(
            selectedRecipient.getDeathDate( ) != null ?
                Helper.formatter.format( selectedRecipient.getDeathDate( ).getTime( ) ) :
                "????" );
        tvBirthPlace.setText( selectedRecipient.getBirthPlace( ) );
        tvAwardNumber.setText( selectedRecipient.getAwardNumber( ) );
        String posthumous = selectedRecipient.isPosthumous( ) ? "(posth.)" : "";
        tvAwardDate.setText( Helper.formatter.format( selectedRecipient.getAwardDate( ).getTime( ) ) +" " + posthumous );
        tvAwardPlace.setText( selectedRecipient.getAwardPlace( ) );
        tvRegiment.setText( selectedRecipient.getRegiment( ) );
        tvCitation.setText( selectedRecipient.getCitation( ) );
    }
}
