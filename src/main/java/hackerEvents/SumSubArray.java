package hackerEvents;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class SumSubArray {
    // Computes sum all sub-array
    public static long SubArraySum(List<Integer> arr)
    {
        long result = 0;

        int arrSize = arr.size();

        //start point
        for (int startPoint = 0; startPoint <arrSize ; startPoint++) {
            //group sizes
            for (int grps = startPoint; grps <=arrSize ; grps++) {
                //if start point = 1 then
                //grp size = 1 , print 1
                //grp size = 2, print 1 2
                //grp size = 3, print 1 2 3 ans so on
                for (int j = startPoint ; j < grps ; j++) {
                    result += arr.get(j);
                }
            }
        }
        return result;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {/*
        int arr[] = {1, 2, 3, 5} ;
        ArrayList<Integer> arr1 = Arrays.asList(arr);
        System.out.println("Sum of SubArray : " +
                SubArraySum(arr1));*/
    }
}
