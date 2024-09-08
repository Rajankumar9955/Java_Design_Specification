package design.specification2;

public class MyUtility {
    public static boolean isValidAddress(Address address)
    {
        boolean response=false;
        int pinCode= address.getPinCode();
        int flatNumber= address.getFlatNumber();
        if(flatNumber>0)
        {
            if(flatNumber<=999999  && pinCode>100000)
            {
                response=true;
            }
        }
        return response;
    }
    public static boolean isValidPanCard(Employee employee)
    {
        boolean response=false;
        String pancard=employee.getPanCard();
        String[] name=employee.getName().split("");
        if(pancard.charAt(3)==name[1].charAt(0))
        {
            response=true;
        }
        return response;
    }
}
