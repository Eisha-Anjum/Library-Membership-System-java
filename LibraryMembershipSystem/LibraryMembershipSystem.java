import java.util.Scanner;
       public class LibraryMembershipSystem{
       public static void main (String args[]){

       Scanner sc=new Scanner(System.in); 
  
           String name;
    while(true){
          System.out.print("Enter your full name:");
          name=sc.nextLine(); 

          boolean valid=true;
          for(int i=0 ; i<name.length() ; i++){
               char ch=name.charAt(i);

           if(!Character.isLetter(ch) && ch!=' '){
              valid=false;
              break;
          }
        }
         if(valid){
            break;
         }
         else{
            System.out.println("Invalid Input. Please use only letters and spaces.");
         }
      
   }
   
       System.out.print("Enter your Age:");
       int age=sc.nextInt();
   
       while(age<12 || age>100){
         System.out.println("Invalid age. Please enter age between 12 and 100.");
         System.out.print("Enter your Age:");
         age=sc.nextInt();
   }
       double price=assignMemberShip(name,age);
       userPayment(price,name);
  }
       public static double assignMemberShip(String name, int age){
             System.out.println("Welcome, "+ name.toUpperCase() + "!"); 
               double price;
               if(age>=12 && age<=17){
                 price=1500.0;
                 System.out.println("Your Membership Type: Child Membership");   
            }
               else if(age>=18 && age<=59){
                 price=3000.0;
                 System.out.println("Your Membership Type: Adult Membership");  
            }
               else{
                 price=5000.0;
                 System.out.println("Your Membership Type: Senior Membership");              
            }
               System.out.println("Your Membership Price is = "+ price);
               return price;
                
      }
        public static void userPayment(double price,String name){
               Scanner sc=new Scanner(System.in); 
               System.out.print("Enter the amount you have: ");
               double amount=sc.nextDouble();

          if(amount>=price){
            System.out.println("Congragulations! "+name+ ", You Have Purchased The Membership Successfully.");
        }
          else{
            System.out.println("You Have Insufficient Balance!");
        }

         System.out.println("Thank you for using this System!"); 

    }
       

  }
















