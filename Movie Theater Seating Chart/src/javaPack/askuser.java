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
            System.out.println("1. Row A");
            System.out.println("2. Row B");
            System.out.println("3. Row C");
            System.out.println("4. Row D");
            System.out.println("5. Row E");
            System.out.println("6. Row F");
            System.out.println("7. Row G");
            System.out.println("8. Row H");
            System.out.println("9. Row I");
            System.out.println("10. Row J");
            System.out.println("11. Reserve");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            if (choice == 11)
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
            else if (choice == 3) selectedMenu = rowC;
            else if (choice == 2) selectedMenu = rowD;
            else if (choice == 3) selectedMenu = rowE;
            else if (choice == 2) selectedMenu = rowF;
            else if (choice == 3) selectedMenu = rowG;
            else if (choice == 2) selectedMenu = rowH;
            else if (choice == 3) selectedMenu = rowI;
            else if (choice == 10) selectedMenu = rowJ;
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

