/*Given an integer ‘N’, you are supposed to return the square of the given integer 
without using multiplication (*), division (/) or power function (pow()).*/
import java.util.* ;

public class Solution 
{
    public static int calculateSquare(int num) 
    {
        int s=0,c=0;
        int abs=Math.abs(num);
        while(c<abs){
            s+=abs;
            c++;
        }
        return s;
    }
}
