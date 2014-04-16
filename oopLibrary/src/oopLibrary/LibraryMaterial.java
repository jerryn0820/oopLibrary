/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopLibrary;

/**
 *
 * @author jerrynguyen
 * LibraryMaterials class
 */
public class LibraryMaterial 
{
    protected String authorName, titleName;
    protected double itemPrice;
    protected int publishYear;
    
    /**
     * Constructor
     * @param author
     * @param title
     * @param price
     * @param published 
     */
    public LibraryMaterial(String author, String title, double price, int published)
    {
        authorName = author;
        titleName = title;
        itemPrice = price;
        publishYear = published;
    }
    /**
     * set method
     * @param author 
     */
    public void setAuthorName(String author)
    {
        authorName = author;
    }
    /**
     * get method to return authorName
     * @return 
     */
    public String getAuthorName()
    {
        return authorName;
    }
    /**
     * set method to set parameter to titleName
     * @param title 
     */
    public void setTitleName(String title)
    {
        titleName = title;
    }
    /**
     * get method returns titleName
     * @return 
     */
    public String getTitleName()
    {
        return titleName;
    }
    /**
     * set method to set parameter to itemPrice
     * @param price 
     */
    public void setItemPrice(double price)
    {
        itemPrice = price;
    }
    /**
     * get method to return itemPrice
     * @return 
     */
    public double getItemPrice()
    {
        return itemPrice;
    }
    /**
     * set method to set parameter to publishYear
     * @param published 
     */
    public void setPublishYear(int published)
    {
        publishYear = published;
    }
    /**
     * get method to return publishYear
     * @return 
     */
    public int getPublishYear()
    {
        return publishYear;
    }
    /**
     * Method to return string of info
     * @param author
     * @param title
     * @param price
     * @param published
     * @return 
     */
    public String displayInfo(String author, String title, double price, int published)
    {
        authorName = author;
        titleName = title;
        itemPrice = price;
        publishYear = published;
        
        return "Author: " + authorName + " Title: " + titleName + " Item Price: " 
                + itemPrice + " Published in " + publishYear;
    }
}
