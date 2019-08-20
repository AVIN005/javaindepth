package hackerEvents;

import java.util.Scanner;
// 5
//i/p = [85 25 64 78], o/p no
//5+5+4+8 % 10 ==0 ?
public class Divsblty {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        if(N<0 || N>Math.pow(10,5) )
            System.exit(0);
        StringBuilder genNum = new StringBuilder();
        double x=0;
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
            x= x+ (data[i]%10)*Math.pow(10,N-i);
        }

        if (x%100==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
