package Icecreamordering;

import java.util.Scanner;

public class IcecreamMain {

    public static void main (String[]args){
        
        Scanner reader = new Scanner(System.in);

        Scoops scoop = new Scoops();

        Member member1 = new Member();
        Toppings topping = new Toppings();
        int num_of_icecream = scoop.getNumicecream(); 
        int member = member1.getMember();
        int stype = scoop.getSType();
        
        System.out.print("Are you a member: ");
        member1.member = reader.nextInt();
        System.out.print("Number of ice cream: ");
        scoop.num_of_icecream = reader.nextInt();
        
        Scoops [] scoops = new Scoops[scoop.getNumicecream()];
        Toppings [] toppings = new Toppings[scoop.getNumicecream()];
           
        for (int i = 0 ; i<scoop.num_of_icecream; i++)
        {  
           scoops[i] = new Scoops();
           toppings[i] = new Toppings();
           System.out.print("Number of scoops: ");
           scoops[i].setSType(reader.nextInt()); 
           System.out.print("Topping: ");
           toppings[i].setTtype(reader.next().charAt(0));
        }
        
           System.out.println("");
           System.out.println("========================================================");
           System.out.println("\t\t Welcome To Ice Cream Shop\t\t");
           System.out.println("========================================================");
           System.out.println("\t\t\t\t\t\tRM");
           System.out.println("--------------------------------------------------------");
           System.out.println("");
           System.out.println("Number of ice cream:  " + scoop.getNumicecream());
           System.out.println("Member type:  " + member1.getxmember());
           
           for (int i =0; i<scoop.num_of_icecream; i++)
            {
                System.out.println("Type of ice cream: " + scoops[i].getType()+ "\t\t\t" + scoops[i].getSPrice());
                System.out.println("Topping: " + toppings[i].getTtype()+ "\t\t\t\t\t"+toppings[i].getTprice());
            }
           
           System.out.println("----------------------------------------------------------");
           System.out.println("Discount =" + "\t\t\t\t\t" + (1-member1.getpayment())*(scoop.getSPrice() + topping.getTprice()));
           System.out.println("Amount =" + "\t\t\t\t\t" + ((scoop.getTotalamount()+topping.getTprice())*member1.getpayment())*scoop.getNumicecream());
           System.out.println("----------------------------------------------------------");

}
}
