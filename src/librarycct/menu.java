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
public class menu {
    logic lo = new logic();
    book[] books;
    public menu(book[] books){
        this.books = books;
    }

     
    public void myMenu(){
       
        //conditional in order to show the menu again
        int choiceentry = 0;
        while(choiceentry!=4){
            if(choiceentry!=0){
                System.out.println("Press enter to continue");
                Scanner s = new Scanner(System.in);
                s.nextLine();
            }
            System.out.println("Enter one of the following commands");
            System.out.println("Books-- Press 1");
            System.out.println("Authors-- Press 2");
            System.out.println("Quit the program-- Press 3");
        
            Scanner scanchoice = new Scanner(System.in);
            int choice = scanchoice.nextInt();
            //switch in order to choice the option
            switch (choice){
                case 1: 
                    sortBy(books);
                  
                break;
                case 2:
                   books= lo.searchByAuthor(books);
                  
                   sortBy(books);
                    
                break;
                
                //it finishes the program
                case 3:
                    System.out.println("End of the program");
                    System.exit(0);
                // when is not valid any number prints this msg
                default:
               System.out.println(choiceentry+ " is not a valid Menu Option! Please Select Another.");
               
               
            }
            
        } 
        
    }
    //method sortBy
    public void sortBy(book[] books){
        
                        Scanner s = new Scanner(System.in);
                   // choose which kind of method 
                   System.out.println("Search by ISBN press 1" + "\n"+ 
                           "search by Year press 2" + "\n"+
                           "search by title press 3"+ "\n"+
                           "search by  Genre press 4");
                    int num = s.nextInt();
                   if(num==1){
                       //it calls the method searchByISbn
                        System.out.println("Search by ISBN");
                       lo.searchByIsbn(books);
                      
                   }
                   
                   else if(num==2){
                        //it calls the method searchByYear
                       System.out.println("Search by Year");
                       lo.searchByYear(books);
                       
                   }
                   else if(num==3){
                        //it calls the method searchByTitle
                        System.out.println("Search by Title");
                       lo.searchByTitle(books);
                   }
                   else if(num==4){
                        //it calls the method searchByGenre
                       System.out.println("Search by Genre");
                      lo.searchByGenre(books);
                       
                   }
            }
}