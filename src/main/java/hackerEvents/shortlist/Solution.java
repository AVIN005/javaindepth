package hackerEvents.shortlist;

import java.util.*;

public class Solution {
    static Map<Integer, ArrayList<Integer>> myHashMap = new HashMap<Integer, ArrayList<Integer>>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.print("enter test cases :");
        int t = sc.nextInt();
        //System.out.print("enter m x n elements :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        //System.out.print("enter elements :\n");
        int[][] mat = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                mat[row][col] = sc.nextInt();
            }
        }
        int maxValue = findMaxValue(mat);
        System.out.print(maxValue);
        int[] maxValuesAt = findMaxPosition(maxValue, mat,m*n);
        System.out.println(Arrays.toString(maxValuesAt));
        ArrayList<Integer> hops= new ArrayList();
        for(int k=0; (k<maxValuesAt.length)&&maxValuesAt[k]!=-1;k=k+2){
            int minRowHops = findMinHops(maxValuesAt[k]+1,m);
            System.out.print(minRowHops+" ");
            int minColHops = findMinHops(maxValuesAt[k+1]+1,n);
            System.out.println(minColHops);
            hops.add(minRowHops + minColHops);
        }
        System.out.println(Arrays.toString(hops.toArray()));
        int min = hops.get(0);
        for (int i : hops){
            min = min < i ? min : i;
        }
        System.out.println("No. of min jumps req :"+min);

    }

    public static int findMaxValue(int[][] mat) {
        int maxVal = mat[0][0];
        for (int row = 0; row < mat.length; row++)
            for (int col = 0; col < mat[row].length; col++)
                if (mat[row][col] > maxVal)
                    maxVal = mat[row][col];
        return maxVal;
    }

    public static int[] findMaxPosition(int maxVal, int[][] mat,int x) {

        int[] maxValuesAt = new int[x];
        int t = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] > maxVal) {
                    maxVal = mat[row][col];
                    maxValuesAt[t] = row;
                    maxValuesAt[t + 1] = col;
                    t = t + 2;
                } else if (mat[row][col] == maxVal) {
                    maxValuesAt[t] = row;
                    maxValuesAt[t + 1] = col;
                    t = t + 2;
                }
                if(((row+1)==mat.length)&&((col+1)==mat[row].length)){
                    maxValuesAt[t]=-1;
                }
            }
        }
        return maxValuesAt;
    }
    public static int findMinHops(int maxValuesAt, int ln){
        int a=0,b=0,c=0,d=0;
        if(ln%2 == 0){
                if((maxValuesAt!=ln/2)||(maxValuesAt!=ln/2+1)){
                    if(maxValuesAt>ln/2)
                        a = maxValuesAt-ln/2;
                    else if(maxValuesAt<(ln/2))
                        a= (ln/2)-maxValuesAt;
                    if(maxValuesAt>(ln/2+1))
                        b= maxValuesAt-(ln/2+1);
                    else if(maxValuesAt<(ln/2+1))
                        b= (ln/2+1)-maxValuesAt;
                    a = Math.min(a,b);
                }
                else
                    a =0;
            }
        else{
                if(maxValuesAt!=(ln/2+1)){
                    if(maxValuesAt>(ln/2+1))
                        a=maxValuesAt-(ln/2+1);
                    else
                        a=(ln/2+1)-maxValuesAt;
                }
                else a=0;
            }
        return a;
    }
    }


