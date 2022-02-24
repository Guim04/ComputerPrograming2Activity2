package AronGuimIS;

import java.util.Scanner;
    class CandyMachine{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        // Display the menu
        System.out.println("1\t Gum");
        System.out.println("2\t Candy");
        System.out.println("3\t Cookies");
        System.out.println("4\t Chips");
    
    System.out.println("-------------------------- "); 
        
        System.out.println("Please enter the number of your choice:");
           System.out.println("-------------------------- "); 
   
        int choice=sc.nextInt();
          System.out.println("-------------------------- ");
        switch (choice) {
              
            case 1: System.out.println("Gum cost 5php"); 
	   break;
            case 2: System.out.println("Candy cost 2php");
                    break;
            case 3: System.out.println("Cookies cost 20php"); 
                    break;
            case 4: System.out.println("Chips cost 50php"); 
                     break;
            default: System.out.println("Invalid choice");
        System.out.println("-------------------------- "); 
      }
       System.out.println("-------------------------- "); 
        System.out.println("Please Choose the cost amount "); 
         System.out.println("-------------------------- ");
       Scanner k = new Scanner(System.in);
        System.out.println("1\t 5php");
        System.out.println("2\t 2php");
        System.out.println("3\t 20php");
        System.out.println("4\t 50php");
          System.out.println("-------------------------- ");
          int Purchase=k.nextInt();
          System.out.println("-------------------------- ");
         switch (Purchase) {
             case 1: System.out.println("Thank U for Purchasing"); 
	   break;
            case 2: System.out.println("Thank U for Purchasing");
                    break;
            case 3: System.out.println("Thank U for Purchasing"); 
                    break;
            case 4: System.out.println("Thank U for Purchasing"); 
                     break;
            default: System.out.println("Invalid choice");
  }
}
}