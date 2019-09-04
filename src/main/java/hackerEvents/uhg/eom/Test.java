package hackerEvents.uhg.eom;

public class Test {
    public static void main(String []s){
        try{
            throw new Exc1();
        }
        catch (Exc0 e0){
            System.out.println("Ex0 caught");
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }
    }
}
