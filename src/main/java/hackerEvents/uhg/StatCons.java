package hackerEvents.uhg;

public class StatCons {
    static String str;
    public void StatCons(){
        System.out.print("In cons");
        str = "Hello World";
    }
    public static void main(String []s){
       /* StatCons s = */new StatCons();
        System.out.println(str);
    }

}
