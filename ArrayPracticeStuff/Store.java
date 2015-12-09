import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Store
{
    /** description of instance variable x (add comment for each instance variable) */
    private ArrayList<Customer> names = new ArrayList<Customer>();
    public void cashierEnter()
    {
        Scanner s = new Scanner(System.in);
        String answer = "y";
        while (answer == "y")
        {
            System.out.println("Please enter the next Customer name: ");
            String name = s.next();
            System.out.println("Please enter the amount");
            String price = s.next();
            names.addSale(name, price);
            System.out.println("Is there another customer?(y/n)");
            answer = s.next();
        }
        
    }
    public void addSale(String customerName, String amount)
    {
        Customer c = new Customer[
        names.addasArray(customerName, amount);
    }
    public String nameOfBestCustomer()
    {
        String highest = "";
        for (int i = 0;
            i < names.length;
            i ++)
            {
                if (names[i][1] > highest)
                {
                    highest = names[i][0];
                }
            }
        return highest;
    }
}
