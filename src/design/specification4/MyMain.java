package design.specification4;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        car car=new car();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the CarBrand:");
        String carmake=sc.nextLine();
        car.setMake(carmake);
        System.out.println("Enter the Model:");
        String carmodel=sc.nextLine();
        car.setMake(carmodel);
        System.out.println("Enter the Color:");
        String carcolor=sc.nextLine();
        car.setColor(carcolor);
        System.out.println("Enter the Car Year");
        int caryear=sc.nextInt();
        car.setYear(caryear);
        System.out.println();
        System.out.println(car.displayInfo());
    }
}
