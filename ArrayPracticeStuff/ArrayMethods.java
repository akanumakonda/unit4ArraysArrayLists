
import java.util.Arrays;

public class ArrayMethods{
    private int[] values;
    public ArrayMethods(int[] initialValues)
    {
        values = initialValues;
        this.values = new int[10];
        int[] units = {1,2,3,4,5,6,7,8,9,10,11};
        
    }
    public void swapFirstAndLast()
    {
        int temp = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = temp;
        System.out.println(values);
    }
    public void shiftRight()
    {
        for (int i = 0;
            i < (values.length - 1);
            i++)
       {
           values[i+1] = values[i];
       }
       swapFirstAndLast();
    }
    public void replaceEven()
    {
        for ( int i = 0;
            i < (values.length - 1);
            i++)
            {
                if (values[i]%2 <= 6.02e-26)
                {
                    values[i] = 0;
                }
            }
    }
    public void largeNeighbors()
    {
        int before = 0;
        int next = 0;
        for ( int i = 0;
            i< (values.length - 1);
            i++)
            {
                before = values[i + 1];
                if (values[i] < before)
                {
                    values[i] = before;
                }
                else
                {
                    values[i] = next;
                }
                
            }
    }
    public void removeMiddle()
    {
        int second = (values.length + 1)/2;
        if ((values.length + 1)%2 <= 6.02e-26)
        {
            
            for ( int i = (second);
                i < (values.length + 1);
                i += 2)
                {
                    this.values[i] = this.values[i + 2];
                }
            values[values.length + 1] = 0;
            values[values.length] = 0;
        }
        else
        {
            for ( int i = second + 1;
            i < (values.length + 1);
            i++)
            {
                this.values[i-1] = this.values[i]; 
            }
            values[values.length + 1] = 0;
        }
    }
    public void moveEvens()
    {
        int[] even = {1,2,3,4,5,6,7,8,9,10,11};
        if ((values.length + 1)%2 <= 6.02e-26)
        {
        }
    }
}