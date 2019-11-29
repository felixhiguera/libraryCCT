/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycct;

import java.util.Scanner;

/**
 *
 * @author edy
 */
public class logic {
    
    //bubble sort
    public void searchByTitle(book[] books){
        //cycle for in order to get the elements of the array
        for(int i=0;i<books.length-1;i++){
            book temp = null;
            //it is comparing the title in i with the next element
            if(books[i].getTitle().compareToIgnoreCase(books[i+1].getTitle())>0)
            {
                //the element in the position i it will be saved in temp
                 temp = books[i];
                  //the element in the position i+1 it will be saved in the position i
                books[i]= books[i+1];
                //temp it will be saved in the position i+1 of the array
                books[i+1] = temp;
            }
            //print the result
            System.out.println(books[i].toString());       
        }
    }
    
    public void searchByGenre(book[] books){
       
        
    }//selection sort
    public void searchByYear(book[]books){
          //cycle for in order to get the elements of the array
         for(int i=0;i<books.length-1;i++){
             
             int min = i; 
             //cicyle for getting the next element of the array 
              for (int j = i+1; j<books.length; j++){
                  //comparation of the year between j and i element of the array 
                if (books[j].getYear() < books[min].getYear()){
                 min = j;
                }
               }
              //temp will have the value of the array books with the position min (j)
              book temp = books[min];
              //the array with the position min will have the value of  the array with the position i
              books[min] = books[i];
              //the array with the position i will have the value of temp
              books[i] = temp;
              
         }//print the values of the array books
          for (int i = 0 ;i< books.length; i++){
         System.out.print(" "+books[i].toString());
        }
          
    }
    //Insertion sort
    public void searchByIsbn(book[] books){
        
             int n = books.length;  
             //cycle for in order to get the elements of the array
        for (int j = 1; j < n; j++) {  
            //the value of the isbn is saved in key
            int key = books[j].getIsbn();  
            int i = j-1;  
            //2 comparatives if they are true
            while ( (i > -1) && ( books[i].getIsbn() > key ) ) {  
                 books[i+1] = books[i];  
                i--;  
            }  //the element of the array books i+1 will have the value of the array with the element key
            books[i+1] = books[key];  
        }  //print the result 
         for (int i = 0 ;i< books.length; i++){
         System.out.print(" "+books[i].toString());
        }
    }
    
   public book[] searchByAuthor(book[] books){
       book[] authorBooks = new book[500];
       
       //ask for the name of the author and save it in the variable author
       System.out.println("Give me the name of the author");
       Scanner se = new Scanner(System.in);
            
               String author =  se.nextLine();
             //comparative if a element of the array is equal to author 
               for(int i=0;i<books.length-1;i++){
                    if(books[i].getAuthor().equalsIgnoreCase(author)){
                        authorBooks[i] = books[i];
                       System.out.println(authorBooks[i].toString());
                        }
               }
            
               return authorBooks;
               
           

   }
}

