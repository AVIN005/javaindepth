package hackerEvents.sumAllBeforeK;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int vCount = 0;
        vCount = s.nextInt();
        List<Integer> v = new ArrayList<Integer>();

        for (int i = 0; i < vCount; i++) {
            int vItem = s.nextInt();
            v.add(vItem);
        }

        int result = Result1.exam(v);
        System.out.print(result);

    }
}
