package javaPack;

import java.util.Scanner;

public class askuser 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        arraymenu order = new arraymenu();
        confirmation confirm = new confirmation();
       

       
        String[] reserve = 
        {
        	String[][] seatstp = 
        			{
        				{"ROW A ","ROW B ","ROW C ","ROW D","ROW E","ROW F","ROW G","ROW H"," ROW I","  ROW J",},
        				{" 1A     ","1B   ","1C   ","1D    ","1E    ","1F    ","1G    ","1H    ","1I    ","1J   ",},
        				{" 2A     ","2B   ","2C   ","2D    ","2E    ","2F    ","2G    ","2H    ","2I    ","2J   ",},
        				{" 3A     ","3B   ","3C   ","3D    ","3E    ","3F    ","3G    ","3H    ","3I    ","3J   ",},
        				{" 4A     ","4B   ","4C   ","4D    ","4E    ","4F    ","4G    ","4H    ","4I    ","4J   ",},
        				{" 5A     ","5B   ","5C   ","5D    ","5E    ","5F    ","5G    ","5H    ","5I    ","5J   ",},
        				{" 6A     ","6B   ","6C   ","6D    ","6E    ","6F    ","6G    ","6H    ","6I    ","6J   ",},
        				{" 7A     ","7B   ","7C   ","7D    ","7E    ","7F    ","7G    ","7H    ","7I    ","7J   ",},
        				{" 8A     ","8B   ","8C   ","8D    ","8E    ","8F    ","8G    ","8H    ","8I    ","8J   ",},
        				{" 9A     ","9B   ","9C   ","9D    ","9E    ","9F    ","9G    ","9H    ","9I    ","9J   ",},
        				{"10A   "," 10B  ","10C  ","10D   ","10E   ","10F   ","10G   ","10H   ","10I   ","10J   ",},
        				{"11A   "," 11B  ","11C  ","11D   ","11E   ","11F   ","11G   ","11H   ","11I   ","11J   ",},
        				{"12A   "," 12B  ","12C  ","12D   ","12E   ","12F   ","12G   ","12H   ","12I   ","12J   ",},
        				{"13A   "," 13B  ","13C  ","13D   ","13E   ","13F   ","13G   ","13H   ","13I   ","13J   ",},
        				{"14A   "," 14B  ","14C  ","14D   ","14E   ","14F   ","14G   ","14H   ","14I   ","14J   ",},
        				{"15A   "," 15B  ","15C  ","15D   ","15E   ","15F   ","15G   ","15H   ","15I   ","15J   ",},
        				{"16A   "," 16B  ","16C  ","16D   ","16E   ","16F   ","16G   ","16H   ","16I   ","16J   ",},
        				{"17A   "," 17B  ","17C  ","17D   ","17E   ","17F   ","17G   ","17H   ","17I   ","17J   ",},
        				{"18A   "," 18B  ","18C  ","18D   ","18E   ","18F   ","18G   ","18H   ","18I   ","18J   ",},
        				{"19A   "," 19B  ","19C  ","19D   ","19E   ","19F   ","19G   ","19H   ","19I   ","19J   ",},
        				{"20A   "," 20B  ","20C  ","20D   ","20E   ","20F   ","20G   ","20H   ","20I   ","20J   ",},
        				
        		};
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
            System.out.println("Select your option");
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

            if (choice == 1) selectedMenu = reserve;
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

