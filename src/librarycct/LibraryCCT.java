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
public class LibraryCCT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 500 objects type book
        book[] books = new book[500]; // create the array to hold Staff objects
        //fill the objects books with the method buildthem
        setup su = new setup();
            books = su.buildThem(books);
            
        // object type menu with attribute books
        menu me = new menu(books);
        me.myMenu();
//        }
       
    }
    
}
