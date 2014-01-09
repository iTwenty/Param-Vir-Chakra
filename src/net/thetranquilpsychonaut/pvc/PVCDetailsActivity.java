package net.thetranquilpsychonaut.pvc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by itwenty on 1/8/14.
 */
public class PVCDetailsActivity extends Activity
{
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

    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.pvc_details_activity );
        Intent intent = getIntent();
        int position = intent.getIntExtra( Helper.SELECTED_RECIPIENT, 0 );
        selectedRecipient = Recipients.recipients.get( position );
        ivImage = (ImageView)findViewById( R.id.iv_image );
        tvName = (TextView)findViewById( R.id.tv_name );
        tvBirthDate = (TextView)findViewById( R.id.tv_birth_date );
        tvDeathDate = (TextView)findViewById( R.id.tv_death_date );
        tvBirthPlace = (TextView)findViewById( R.id.tv_birth_place );
        tvAwardNumber = (TextView)findViewById( R.id.tv_award_number );
        tvAwardDate = (TextView)findViewById( R.id.tv_award_date );
        tvAwardPlace = (TextView)findViewById( R.id.tv_award_place );
        tvRegiment = (TextView)findViewById( R.id.tv_regiment );
        tvCitation = (TextView)findViewById( R.id.tv_citation );

        ivImage.setImageDrawable( this.getResources( ).getDrawable( selectedRecipient.getImageID( ) ) );
        tvName.setText( selectedRecipient.getRank( ) + " " + selectedRecipient.getName( ) );
        tvBirthDate.setText( Helper.formatter.format( selectedRecipient.getBirthDate( ).getTime( ) ) );
        tvDeathDate.setText(
            selectedRecipient.getDeathDate( ) != null ?
                Helper.formatter.format( selectedRecipient.getDeathDate( ).getTime( ) ) :
                "????" );
        tvBirthPlace.setText( selectedRecipient.getBirthPlace( ) );
        tvAwardNumber.setText( selectedRecipient.getAwardNumber( ) );
        tvAwardDate.setText( Helper.formatter.format( selectedRecipient.getAwardDate( ).getTime( ) ) );
        tvAwardPlace.setText( selectedRecipient.getAwardPlace( ) );
        tvRegiment.setText( selectedRecipient.getRegiment( ) );
        tvCitation.setText( selectedRecipient.getCitation( ) );
    }
}
