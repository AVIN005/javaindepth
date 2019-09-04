package hackerEvents.uhg.gom;

import java.util.HashMap;
import java.util.Map;

class Result {
    static long calScore(char[] ec ){
        long ecScore=0;
        long temp = 0;
        for (char anEc : ec) {
            System.out.println(anEc);
            if (anEc == 'E') {
                ecScore = +1;
            } else if (anEc == 'M') {
                ecScore = +3;
            } else if (anEc == 'H') {
                ecScore = +5;
            }
            temp = temp + ecScore;
        }
        return  temp;
    }

    public static String winner(String erica, String bob) {

        char[] ec = erica.toCharArray();
        char[] bc = bob.toCharArray();
        if(calScore(ec)>calScore(bc))
            return "Erica";
        else if(calScore(ec)<calScore(bc))
            return "Bob";
        else
        return "Tie";
    }
}

