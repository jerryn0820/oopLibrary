
package oopLibrary;

import java.applet.*;
import sun.audio.*;
import java.io.*;
/**
 * @author Jen Sanders
 * This class retrieves and sets the data for the CDs and DVDs
 */


public class AudioVisualMaterial {
    protected void setCover(){    
       //to do 
    }
   
    protected static void endersSet() {
        LibraryMaterial.displayInfo("Lionsgate", "Ender's Game", 14.99, 2013); 
    }
 
    protected static void tangledSet() {
        LibraryMaterial.displayInfo("Walt Disney", "Tangled", 14.99, 2010); 
    }
    
    protected static void shakiraSet() {
       LibraryMaterial.displayInfo("Shakira", "Laundry Service", 7.99, 2001);          
    }
    
    protected static void sandeSet() {
        LibraryMaterial.displayInfo("Emeli Sande", "Our Version of Events", 11.62, 2012);
    }
}
