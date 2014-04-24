
package oopLibrary;

import java.applet.*;
import sun.audio.*;
import java.io.*;
/**
 * @author Jen Sanders
 * This class retrieves and sets the data for the CDs and DVDs
 */


public class AudioVisualMaterial extends LibraryMaterial{
    protected String title;
    protected String author;
    protected int published;
    protected double price;

    protected AudioVisualMaterial(String author, String title, double price, int published) {
        super(author, title, price, published);
    }
    
    protected void setCover(){    
       //to do 
    }
   
   protected void setInfo(){
       LibraryMaterial.authorName = author;
       LibraryMaterial.titleName = title;
       LibraryMaterial.itemPrice = price;
       LibraryMaterial.publishYear = published;
   }
}
