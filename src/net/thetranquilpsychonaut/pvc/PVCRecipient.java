package net.thetranquilpsychonaut.pvc;

import java.util.GregorianCalendar;

/**
 * Created by itwenty on 1/5/14.
 */
public class PVCRecipient
{
    String            rank;
    String            name;
    String            awardNumber;
    String            regiment;
    GregorianCalendar awardDate;
    String            awardPlace;
    boolean           posthumous;
    GregorianCalendar birthDate;
    GregorianCalendar deathDate;
    String            birthPlace;
    String            citation;
    int               imageID;

    public PVCRecipient( String rank,
                         String name,
                         String awardNumber,
                         String regiment,
                         GregorianCalendar awardDate,
                         String awardPlace,
                         boolean posthumous,
                         GregorianCalendar birthDate,
                         GregorianCalendar deathDate,
                         String birthPlace,
                         String citation,
                         int imageID )
    {
        this.rank = rank;
        this.name = name;
        this.awardNumber = awardNumber;
        this.regiment = regiment;
        this.awardDate = awardDate;
        this.awardPlace = awardPlace;
        this.posthumous = posthumous;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.birthPlace = birthPlace;
        this.citation = citation;
        this.imageID = imageID;
    }

    public String getRank()
    {
        return rank;
    }

    public void setRank( String rank )
    {
        this.rank = rank;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public GregorianCalendar getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate( GregorianCalendar birthDate )
    {
        this.birthDate = birthDate;
    }

    public GregorianCalendar getDeathDate()
    {
        return deathDate;
    }

    public void setDeathDate( GregorianCalendar deathDate )
    {
        this.deathDate = deathDate;
    }

    public String getBirthPlace()
    {
        return birthPlace;
    }

    public void setBirthPlace( String birthPlace )
    {
        this.birthPlace = birthPlace;
    }

    public String getAwardNumber()
    {
        return awardNumber;
    }

    public void setAwardNumber( String awardNumber )
    {
        this.awardNumber = awardNumber;
    }

    public String getRegiment()
    {
        return regiment;
    }

    public void setRegiment( String regiment )
    {
        this.regiment = regiment;
    }

    public GregorianCalendar getAwardDate()
    {
        return awardDate;
    }

    public void setAwardDate( GregorianCalendar awardDate )
    {
        this.awardDate = awardDate;
    }

    public String getAwardPlace()
    {
        return awardPlace;
    }

    public void setAwardPlace( String awardPlace )
    {
        this.awardPlace = awardPlace;
    }

    public String getCitation()
    {
        return citation;
    }

    public void setCitation( String citation )
    {
        this.citation = citation;
    }

    public boolean isPosthumous()
    {
        return posthumous;
    }

    public void setPosthumous( boolean posthumous )
    {
        this.posthumous = posthumous;
    }

    public int getImageID()
    {
        return imageID;
    }

    public void setImageID( int imageID )
    {
        this.imageID = imageID;
    }
}
