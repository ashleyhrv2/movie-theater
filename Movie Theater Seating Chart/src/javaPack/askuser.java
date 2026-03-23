package javaPack;

import java.util.Scanner;

public class askuser 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        arraymenu order = new arraymenu();
        confirmation confirm = new confirmation();

       
        String[] rowA = 
        {
             
        };

        String[] rowB = 
        {
            
        };

        String[] rowC = 
        {
            
        };
        
        String[] rowD =
        {
                
        };
        
        String[] rowE = 
        {
                
        };
        
        String[] rowF = 
        {
                
        };

        String[] rowG = 
        {
                
        };
        
        String[] rowH = 
        {
                
        };

        String[] rowI = 
        {
                
        };
          
        String[] rowJ = 
        {
                    
        };

               
        boolean running = true;

        while (running)
        {
            System.out.println("Choose a row:");
            System.out.println("1. Reserve seats");
            System.out.println("2. View your Seats");
            System.out.println("3. View available seats");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            if (choice == 2)
            {
                confirmation.printReceipt(order.getCart());
                running = false;
                continue;
            }

            String[] selectedMenu = null;

            if (choice == 1) selectedMenu = rowA;
            else if (choice == 2) selectedMenu = rowB;
            else if (choice == 3) selectedMenu = rowC;
            else if (choice == 2) selectedMenu = rowB;
            
            else 
            {
                System.out.println("Invalid choice.");
                continue;
            }

           
            for (int i = 0; i < selectedMenu.length; i++)
            {
                System.out.println((i + 1) + ". " + selectedMenu[i]);
            }

            System.out.print("Pick an item number: ");
            int itemNum = input.nextInt();

            if (itemNum >= 1 && itemNum <= selectedMenu.length)
            {
                order.addItem(selectedMenu[itemNum - 1]);
            }
            else
            {
                System.out.println("Invalid item number.");
            }
        }

        System.out.println("Thanks for visiting!");
    }
}

