package hackerEvents.uhg.com;

public class child {
    public static void main (String[] s){
        try
        {
            badmethod();
            System.out.print("A");
        }
        catch(Exception ex){
            System.out.print("B");
        }
        finally {
            System.out.print("C");
        }
        System.out.print("D");
    }
    public static void badmethod(){}
}
