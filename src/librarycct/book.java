/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycct;

/**
 *
 * @author edy
 */
//variables
public class book {
    String title;
    String author;
    String genre;
    int year;
    int isbn;
    //get and set
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    @Override
   public String toString() {
        return " title " + title + "\n"+" Author " + author +"\n"+ "Genre " + genre + "\n"+" Year " + year + "\n"+" ISBN " + isbn+ "\n";
    }    
    
}
