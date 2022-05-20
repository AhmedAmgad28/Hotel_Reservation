package hotel2;

import java.util.Scanner;


public class Room2 extends RoomFigure implements Display{
    Scanner sc=new Scanner(System.in);
    double total_price;
    final double price_per_night=1500;
    @Override
    public void set_details(){
    System.out.println("Number of Nights : ");
    no_of_nights=sc.nextInt();
    System.out.println();
    System.out.println("Number of Beds :            (max:3 beds)");
    bed_no=sc.nextInt();
    if(bed_no<=3)
        System.out.println();
    else
        {System.out.println("ERROR!!!  <The maximum number of beds in one room is 3 beds>");
        System.out.println("Number of Beds :            (max:3 beds)");
        bed_no=sc.nextInt();}
    System.out.println("Number of Meals :            (max:3 meals)");
    no_of_meals=sc.nextInt();
    if(no_of_meals<=3)
       System.out.println();
    else
        {System.out.println("ERROR!!!  <The maximum number of meals is 3 meals>");
        System.out.println("Number of meals :            (max:3 meals)");
        no_of_meals=sc.nextInt();}
    }
    public Room2() {
        Room_Type="Deluxe";
        Balacony="Big";
        Ac=true;
        TV=true;
    }

    public Room2(String Room_Type, int bed_no, int no_of_nights, int no_of_meals, String Balacony,Boolean Ac, Boolean TV,double bed_price, double meal_price) {
        super(Room_Type, bed_no, no_of_nights,no_of_meals, Balacony, Ac, TV,  bed_price, meal_price);
    }
    
    @Override
    public double Total_Price(){
        return ((1500*no_of_nights)+(bed_no*100)+(no_of_meals*80));
    }
    @Override
    public void Display_details(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void Display_TotalPrice(){
        System.out.println(Total_Price());
    }

    @Override
    public String toString() {
        return "Price per Night : " + price_per_night;
    }
    
}
