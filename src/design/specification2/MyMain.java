package design.specification2;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Address parmanent=new Address();
        System.out.println("Enter the FlatNumber:");
        int flatNumber=sc.nextInt();
        sc.nextLine();
        parmanent.setFlatNumber(flatNumber);
        System.out.println("enter the Building Name");
        String buildingName=sc.nextLine();
        parmanent.setBuildingName(buildingName);

        System.out.println("Enter the Locality");
        String locality=sc.nextLine();
        parmanent.setLocality(locality);

        System.out.println("Enter the City");
        String city=sc.nextLine();
        parmanent.setCity(city);

        System.out.println("Enter the District");
        String district=sc.nextLine();
        parmanent.setDistrict(district);

        System.out.println("Enter the State");
        String state=sc.nextLine();
        parmanent.setState(state);

        System.out.println("Enter the Country");
        String  country=sc.nextLine();
        parmanent.setCountry(country);

        System.out.println("Enter the PinCode");
        int piccode=sc.nextInt();
        parmanent.setPinCode(piccode);

        System.out.println(parmanent.fullAddress());

        if(MyUtility.isValidAddress(parmanent))
        {
            System.out.println("valid Address");
        }
        sc.nextLine();

        Employee employee=new Employee();
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        employee.setName(name);

        System.out.println("Enter your Email: ");
        String email=sc.nextLine();
        employee.setEmail(email);

        System.out.println("Enter Your Pancard : ");
        String pancard=sc.nextLine();
        employee.setPanCard(pancard);

        System.out.println("Enter Your Mobile Number :");
        String mobile=sc.nextLine();
        employee.setMobile(mobile);

        System.out.println(employee.employeeDetails());





    }
}
