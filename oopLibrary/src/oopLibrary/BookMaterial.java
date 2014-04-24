/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopLibrary;

import oopLibrary.LibraryMaterial;

/**
 * @author NinaRitchie
 * BookMaterial Class 
 * 
 */
public class BookMaterial extends LibraryMaterial 
{
    protected String bookType;  
    protected int printEdition;  
    protected int numberOfPages; 
    
    /**
     * 
     * Concept #5 - Super Reference - uses inherited constructor from LibraryMaterial  
     * @param author
     * @param title
     * @param price
     * @param published 
     * 
     * Constructor - not inherited parameters 
     * @param type  
     * @param edition 
     * @param pages 
     */ 
       
 public BookMaterial(String author, String title, double price, int published, String type, int edition, int pages)
 { 
//        authorName = author;
//        titleName = title;
//        itemPrice = price;
//        publishYear = published;
   
        super(author, title, price, published);
        //if ((type == "hardcover") || (type == "paperback" )|| (type == "large" ))
        bookType = type;
        printEdition = edition;
        numberOfPages = pages;  
    }
 
     /**
     * First edition books only
     * Concept #5 - Super Reference - uses inherited constructor from LibraryMaterial  
     * @param author
     * @param title
     * @param price
     * @param published 
     * 
     * Constructor - fields not inherited  
     * @param type  
     * @param pages 
     */ 
 
 public BookMaterial(String author, String title, double price, int published, String type, int pages)
   { 
//        authorName = author;
//        titleName = title;
//        itemPrice = price;
//        publishYear = published;
//       
        super(author, title, price, published);
        bookType = type;
        printEdition = 1;
        numberOfPages = pages;  
    } 
 /**
     * set Book Type method
     * @param type
     */
  public void setBookType(String type)
    {
        bookType = type;
    } // end set book method 
  
    /**
     * get method to return book type 
     * @return 
     */
  public String getBookType()
    {
        return bookType;
    } // end get book method 
    
   /**
     * set Print Edition method
     * @param edition
     */
  public void setPrintEdition(int edition)
    {
        printEdition = edition;
    } // end set book print edition  
  
    /**
     * get method to return print edition  
     * @return print edition 
     */
  public int getPrintEdition()
    {
        return printEdition;
    } // end get book edition method 
 
   /** 
     * set number of pages method
     * @param pages 
     */
  public void setNumberOfPages (int pages)
    {
        numberOfPages = pages;
    } // end set method for number of pages   
  
    /** get method to return number of pages  
     *  @return numberOfPages
     */
  public int getNumberOfPages()
    {
        return numberOfPages;
    } // end get method for number of pages  

    /**
     * Method to return string of info
     * @return 
     */
    
  /** 
   * Display all information of Book Class 
   * 
   * @Override - above public String display() 
   *      only if Library Class Display is identical - need to discuss with Jerry
   */
  
   public String displayInfo()
    {
      return "Author: " + authorName + " Title: " + titleName + " Item Price: " 
                + itemPrice + " Published in " + publishYear + "Print Edition" 
                + printEdition + "Book Type is a "+ bookType + "with "
                + numberOfPages +"pages";
          
    }

}
