package hackerEvents.uhg.fom;

public class TestThread {
    public static void main(String []s){
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");
        B.start();
        A.start();
    }
}
