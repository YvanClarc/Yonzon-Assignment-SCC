
package barangaydocs;

import java.util.Scanner;

public class citizens {
    Scanner sc = new Scanner(System.in);

    public void getcitizen(){
        System.out.println("-----------------------");
        System.out.println("\nWelcome to BarangayDocs!");
        System.out.println("\n-----------------------");
         boolean status = false;
      do{        
          System.out.println("1.Request Documents");
          System.out.println("\n2.Document Status");
          System.out.println("\n3.Update Document");
          System.out.println("\n4.Delete Document");
          System.out.println("\n5.Exit");
          System.out.println("\nSelect Options:");
          int choice = sc.nextInt();         
          int counter = 0;
          
          if (choice > 1 && choice < 5){
                      System.out.println("Invalid Input, Try Again:");
                      break;                      
                  }else{                                                               
          
          switch(choice){
                           
              case 1:
                  addDocuments();
                  break;
              case 2:
                  if (counter == 0){
                      System.out.println("No Requests Found Just Yet");
                      status = false;
                  }else{
                      System.out.println("--------------------------------------------");
                      System.out.printf("%-10s %-10s %10-s %-10s %-10s\n",
                              "ID", "First Name", "Last name", "Address", "Postal Code");
                  }
                  
              case 3:
                  System.out.println("Exiting the Account App. Thank you for using!");
                    return;
                default:
                    System.out.println("Error! Try again.");
                    status = false;
          }
         }
          
         
      }while(!status);
        System.out.println("Thank you for using!");
    }
    
    public void addDocuments(){ 
        
        System.out.println("Enter number of Document:");
        int dnum = sc.nextInt();
        
        for (int i = 0 ; i < dnum ; i++){           
            System.out.println("Document Request "+(i++));
            System.out.printf("\nEnter first name:");
            String fname;
            fname = sc.nextLine();
            System.out.printf("\nEnter Last Name:");
            String lname;
            lname = sc.nextLine();
            System.out.println("\nEnter address:");
            String address = sc.nextLine();
            System.out.println("\nEnter  Postal Code:");
            String pcode = sc.nextLine();
            
        }

}

}

