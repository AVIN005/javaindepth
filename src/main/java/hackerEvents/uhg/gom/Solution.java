package hackerEvents.uhg.gom;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("enter erica's");
        String erica = s.next();
        System.out.println("enter bob's");
        String bob = s.next();

        String result = Result.winner(erica, bob);
        System.out.println(result);

    }
}