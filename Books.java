import java.util.*;
public class Books {
    String title;
    String author;
    String year;
    String edition;
    String price;
}
 class BookTestDrive{
     public static void main(String [] args) {
     
         Books[] myBooks = new Books[13];
         int x = 0;

         myBooks[0] = new Books();
         myBooks[1] = new Books();
         myBooks[2] = new Books();
         myBooks[3] = new Books();
         myBooks[4] = new Books();
         myBooks[5] = new Books();
         myBooks[6] = new Books();
         myBooks[7] = new Books();
         myBooks[8] = new Books();
         myBooks[9] = new Books();
         myBooks[10] = new Books();
         myBooks[11] = new Books();
         myBooks[12] = new Books();

      myBooks[0].title = "Northanger Abbey";
      myBooks[0].author = " Austen, Jane";
      myBooks[0].year = " 1814";
      myBooks[0].edition = " Penguin";
      myBooks[0].price = " 18.2";

      myBooks[1].title = "War and Peace";
      myBooks[1].author = " Tolstoy, Leo";
      myBooks[1].year = " 1865";
      myBooks[1].edition = " Penguin";
      myBooks[1].price = " 12.7";
      
      myBooks[2].title = "Anna Karenina";
      myBooks[2].author = " Tolstoy, Leo";
      myBooks[2].year = " 1875";
      myBooks[2].edition = " Penguin";
      myBooks[2].price = " 13.5";
      
      myBooks[3].title = "Mrs. Dalloway";
      myBooks[3].author = " Woolf, Virginia";
      myBooks[3].year = " 1925";
      myBooks[3].edition = " Harcourt Brace";
      myBooks[3].price = " 25.0";
      
      myBooks[4].title = "The Hours";
      myBooks[4].author = " Cunnningham, Michae";
      myBooks[4].year = " 1999";
      myBooks[4].edition = " Harcourt Brace";
      myBooks[4].price = " 12.35";
      
      myBooks[5].title = "Huckleberry Finn";
      myBooks[5].author = " Twain, Mark";
      myBooks[5].year = " 1865";
      myBooks[5].edition = " Penguin";
      myBooks[5].price = " 5.76";
      
      myBooks[6].title = "Bleak House";
      myBooks[6].author = " Dickens, Charles";
      myBooks[6].year = " 1870";
      myBooks[6].edition = " Random House";
      myBooks[6].price = " 5.75";
      
      myBooks[7].title = "Tom Sawyer";
      myBooks[7].author = " Twain, Mark";
      myBooks[7].year = " 1862";
      myBooks[7].edition = " Random House";
      myBooks[7].price = " 7.75";
      
      myBooks[8].title = "A Room of One's Own";
      myBooks[8].author = " Woolf, Virginia";
      myBooks[8].year = " 1922";
      myBooks[8].edition = " Penguin";
      myBooks[8].price = " 29.0";
      
      myBooks[9].title = "Harry Potter";
      myBooks[9].author = " Rowling, J.K.";
      myBooks[9].year = " 2000";
      myBooks[9].edition = " Harcourt Brace";
      myBooks[9].price = " 19.95";
      
      myBooks[10].title = "One Hundred Years of Solitude";
      myBooks[10].author = " Marquez";
      myBooks[10].year = " 1967";
      myBooks[10].edition = " Harper Perennial";
      myBooks[10].price = " 14.0";
      
      myBooks[11].title = "Hamlet, Prince of Denmark";
      myBooks[11].author = " Shakespeare";
      myBooks[11].year = " 1603";
      myBooks[11].edition = " Signet Classics";
      myBooks[11].price = " 7.95";
      
      myBooks[12].title = "Lord of the Rings";
      myBooks[12].author = " Tolkien,J.R.";
      myBooks[12].year = " 1937";
      myBooks[12].edition = " Penguin";
      myBooks[12].price = " 27.45";


     Scanner scan = new Scanner(System.in);
     System.out.println("Press 0 to View All Books");
	  System.out.println("Press 1 to Purchase New Books");
     System.out.println("Press 2 to Read Purchased Books");
     
     // User Input
     int n = scan.nextInt();
     System.out.println("You've selected: " + n);
     
     // if else for options 0 - 2
     if (n > -1 && n < 1) {

         while (x < 13){
             System.out.print(myBooks[x].title);
             System.out.println(myBooks[x].author);
             x++;
         }
         } else if  (n > 0 && n < 2) {
             while (x < 13){
             System.out.print(myBooks[x].title);
             System.out.print(myBooks[x].author);
             System.out.print(myBooks[x].year);
             System.out.print(myBooks[x].edition);
             System.out.println(myBooks[x].price);
             x++;
             }
             Scanner one = new Scanner(System.in);
             System.out.println("");
             System.out.println("");
             System.out.print("Please enter the price of the book you ");
             System.out.println("would like to purchase.");
             System.out.print("Example: If you would like to purchase ");
             System.out.println("'Harry Potter' you would type: 19.95");
             
             double o = one.nextDouble();
             System.out.println("You've typed: " + o);
             
             //Case-Switch for Book Title = Price.
              
           } else if (n > 1 && n < 3) {
                
                System.out.println("No Books Available");
           
           }
         
     }

   //purchase book - When user select to buy a book, send book to purchased.
   //view list - when user views list, display purchased books.
   // read book - when user reads book, display list of purchased books. 
   // prompt the user to select a book.
   // display text from selected book. 
 
}
