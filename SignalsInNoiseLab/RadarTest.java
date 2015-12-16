import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (Anusha Anumakonda) 
 * @version (12/15/15)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testMonsterLoc()
    {
        //sets the location to (70,50)
        final int ROWS = 100;
        final int COLS = 100;
        int x = 70;
        int y = 50;
        //makes the radar object, and sets the noise
        Radar radar = new Radar(ROWS, COLS , x, y);
        radar.setNoiseFraction(0.10);
        //scans the radar object 101 times
        for (int i = 0; i <= 100; i++)
        {
            radar.scan();
        }
        //finds the which cell has the highest row and column
        int highestDet = radar.getAccumulatedDetection(0,0);
        int highestRow = 0;
        int highestCol = 0;
        for (int i = 0; i < ROWS; i++)
        {
            for ( int j = 0; j < COLS; j++)
            {
                if ( radar.getAccumulatedDetection(i,j) > highestDet )
                {
                    highestRow = i;
                    highestCol = j;
                    highestDet = radar.getAccumulatedDetection(i,j);
                }
            }
        }
        // checks if everything was done right
        assertEquals(x, highestRow);
        assertEquals(y, highestCol);
    }
    @Test
    public void testMonsterLoc2()
    {
        //sets the location 
        final int ROWS = 100;
        final int COLS = 100;
        int x = 90;
        int y = 20;
        Radar radar = new Radar(ROWS, COLS , x, y);
        radar.setNoiseFraction(0.90);
        //scans the radar object 101 times
        for (int i = 0; i <= 100; i++)
        {
            radar.scan();
        }
        //finds the which cell has the highest row and column
        int highestDet = radar.getAccumulatedDetection(0,0);
        int highestRow = 0;
        int highestCol = 0;
        for (int i = 0; i < ROWS; i++)
        {
            for ( int j = 0; j < COLS; j++)
            {
                if ( radar.getAccumulatedDetection(i,j) > highestDet )
                {
                    highestRow = i;
                    highestCol = j;
                    highestDet = radar.getAccumulatedDetection(i,j);
                }
            }
        }
        // checks if everything was done right
        assertEquals(x, highestRow);
        assertEquals(y, highestCol);
    }

}
