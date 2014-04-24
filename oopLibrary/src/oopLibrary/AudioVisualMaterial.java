
package oopLibrary;

import java.applet.*;
import sun.audio.*;
import java.io.*;
import javax.swing.ImageIcon;
import java.applet.AudioClip;

/**
 * @author Jen Sanders
 * This class retrieves and sets the data for the CDs and DVDs
 */

/** creates the class and fields */
public class AudioVisualMaterial extends LibraryMaterial{
    protected String mediaType;
    //protected String title;
    //protected String author;
    protected ImageIcon mediaName;
    protected AudioClip audioName;
    //protected int published;
    //protected double price
    String display = "";

    /** constructor*/   
    public AudioVisualMaterial(String author, String title, String type, double price, int published, ImageIcon image) {
        super(author, title, price, published);
        mediaType = type;
        mediaName = image;
    }
    protected void setMediaType(String type){
        mediaType = type;
    }
    protected String getMediaType()
    {
        return mediaType;
    }
    /** will set the cover in the display (if needed)*/
    protected void setCover(ImageIcon image){    
       //to do 
        mediaName = image;
    }
    protected ImageIcon getCover()
    {
        return mediaName;
    }
    protected void setClip(AudioClip clip)
    {
        audioName = clip;
    }
    protected AudioClip getClip()
    {
        return audioName;
    }
    /**sets variables to media data to display */
   protected void setInfo(){
       //LibraryMaterial.authorName = author;
       //LibraryMaterial.titleName = title;
       //LibraryMaterial.itemPrice = price;
       //LibraryMaterial.publishYear = published;
   }
   protected String displayInfo()
   {
       display = ("Title: " + titleName + "Artist: " + authorName + "Media Type: " + mediaType + "Price: " + itemPrice + "Year Published: " + publishYear);
       return display;
   }
}
