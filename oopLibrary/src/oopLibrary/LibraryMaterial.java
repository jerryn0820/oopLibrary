/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopLibrary;

/**
 *
 * @author jerrynguyen
 */
public class LibraryMaterial 
{
    protected String authorName, titleName;
    protected double itemPrice;
    protected int publishYear;
    
    public LibraryMaterial(String author, String title, double price, int published)
    {
        authorName = author;
        titleName = title;
        itemPrice = price;
        publishYear = published;
    }
    
    public void setAuthorName(String author)
    {
        authorName = author;
    }
    public String getAuthorName()
    {
        return authorName;
    }
    
    public void setTitleName(String title)
    {
        titleName = title;
    }
    
    public String getTitleName()
    {
        return titleName;
    }
    
    public void setItemPrice(double price)
    {
        itemPrice = price;
    }
    
    public double getItemPrice()
    {
        return itemPrice;
    }
    
    public void setPublishYear(int published)
    {
        publishYear = published;
    }
    
    public int getPublishYear()
    {
        return publishYear;
    }
    
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
