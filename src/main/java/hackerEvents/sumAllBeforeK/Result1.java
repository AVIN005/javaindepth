package hackerEvents.sumAllBeforeK;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result1 {

    /*
     * Complete the 'exam' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY v as parameter.
     */

    public static int exam(List<Integer> v) {
        int k=0;


        for (; k<=v.size(); k++){
            int me=0,frnd =0;
            for (int i =0; i<k;i++){
                if(v.get(i)==1)
                    me = me + 1;
                else
                me = me -1;
            }
            for (int j=k; j<v.size();j++){
               if(v.get(j)==1)
                   frnd = frnd + 1;
               else
               frnd = frnd -1;
            }
            if(me>frnd){
                return k;
            }

        }
        return v.size();
    }

}

