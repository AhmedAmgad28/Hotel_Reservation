package hotel2;

import java.util.Scanner;
public abstract class RoomFigure {
    Scanner sc=new Scanner(System.in);
    protected String Room_Type;
    int bed_no;
    int no_of_nights;
    protected Boolean Ac;
    protected Boolean TV;
    int no_of_meals;
    protected String Balacony;
    protected double bed_price =100;
    protected double meal_price=80;
    
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
    
    public RoomFigure() {
        
    }

    public RoomFigure(String Room_Type, int bed_no, int no_of_nights,int no_of_meals, String Balacony, Boolean Ac, Boolean TV,  double bed_price, double meal_price) {
        this.Room_Type = Room_Type;
        this.bed_no = bed_no;
        this.no_of_nights = no_of_nights;
        this.Ac = Ac;
        this.TV = TV;
        this.no_of_meals = no_of_meals;
        this.Balacony = Balacony;
        bed_price=100;
        meal_price=80;
    }
    
    
    public abstract double Total_Price();
    //public abstract double Total_Price(int no_of_nights,int bed_no,int no_of_meals);

    @Override
    public String toString() {
        return "** Room Figure **" + "\nRoom Type : " + Room_Type + "\nNumber of Beds : " + bed_no + "\nNumber of Nights : " + no_of_nights +"\nNumber of Meals : " + no_of_meals + "\nBalacony : " + Balacony +  "\nAc : " + Ac + "\nTV : " + TV + "\nBed Price = " + bed_price + "\nMeal Price = " + meal_price;
    }
    
}
