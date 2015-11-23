public class PartialArray
{
    private int[] values;
    private int currentSize;

    /**
     * Default constructor for objects of class PartialArray
     */
    public PartialArray()
    {
        // initialise instance variables
        this.values = new int[100];
        
        for(this.currentSize= 0;
            this.currentSize < 10;
            this.currentSize++)
        {
            values[currentSize] = currentSize* currentSize;
        }
    }

}
