// Management System
// Created by : Christiane A. Bacani
import java.util.Scanner;
public class HospitalManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String meds[] = {"Lagundi Capsule","Potassium Chloride","Flu Capsule"};
        int price[] = {3,4,5};
        
        System.out.print("Welcome to Bataan General Hospital App!");
        
        System.out.print("\n1.) Book an appointment to the doctor\n2.) Buy a medicine\n3.) Exit\n");
        
        System.out.print("Enter your choice : ");
        String choice = input.nextLine();
        
        if(choice.equals("1")){
            System.out.print("PLEASE WAIT FOR 10 MINUTES---\n");
            System.out.print("THE DOCTOR IS ON THE WAY!");
            
        }else if(choice.equals("2")){
            int num = 1;
            System.out.print("Available medicines :\n");
            for(int i = 0; i < meds.length ; i++){
               System.out.print(num + ") " + meds[i] + " / P " + price[i] + "\n");
               num++;
            }
            System.out.print("Please enter your choice : ");
            String userChoice = input.nextLine();
            
            if (userChoice.equals("1")){
              System.out.print("Enter quantity : ");
              int quantity = input.nextInt();
              
              int totalPrice = price[0] * quantity;
              
              System.out.print("The total price is : P " + totalPrice);
              System.out.print("\nEnter your payment : P ");
              int payment = input.nextInt();
              int change = payment - totalPrice;
              
              System.out.print("\nChange : P " + change);
             
            }else if(userChoice.equals("2")){
              System.out.print("Enter quantity : ");
              int quantity = input.nextInt();
              
              int totalPrice = price[1] * quantity;
              
              System.out.print("\nThe total price is : P " + totalPrice);
              System.out.print("\nEnter your payment : P ");
              int payment = input.nextInt();
              int change = payment - totalPrice;
              
              System.out.print("Change : P " + change);
              
                
                
            }else if(userChoice.equals("3")){
               System.out.print("Enter quantity : ");
              int quantity = input.nextInt();
              
              int totalPrice = price[2] * quantity;
              System.out.print("\nThe total price is : P " + totalPrice);
              System.out.print("\nEnter your payment : P ");
              int payment = input.nextInt();
              int change = payment - totalPrice;
              
              System.out.print("\nChange : P " + change);
            }     
            
        }else if(choice.equals("3")){
            System.out.print("EXITING APP--\n");
            
            
        }else{
            System.out.print("INVALID CHOICE!\n");
             
        }  
        
        
    }
}
