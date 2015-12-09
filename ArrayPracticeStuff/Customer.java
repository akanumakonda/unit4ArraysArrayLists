import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Customer
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name;
    private String amount;

    /**
     * Default constructor for objects of class Customer
     */
    public Customer( String nameOfCustomer, String amountSpent)
    {
        // initialise instance variables
        name = nameOfCustomer;
        amount = amountSpent;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    public String getAmount()
    {
        return amount;
    }
}
