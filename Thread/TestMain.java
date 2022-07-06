import java.util.stream.IntStream;

public class TestMain {
    
    public static void main(String args[]){
        
        TestValue testValue = new TestValue(1);

        Thread t1 = new Thread(() -> IntStream.range(1, 100).forEach(i -> testValue.increment()));
        // Thread t2 = new Thread(() -> IntStream.range(1, 100).forEach(i -> testValue.decrement()));

        t1.start();
        // t2.start();

        Thread t2 = new Thread(() -> IntStream.range(1, 100).forEach(i -> testValue.decrement()));
        // Thread t2 = new Thread(() -> IntStream.range(1, 100).forEach(i -> testValue.decrement()));

        t2.start();

        try{
        Thread.sleep(2000);
        }catch(Exception ex){

        }
        try{
         Thread.sleep(2000);
         }catch(Exception ex){
 
         }
         
        System.out.println(testValue);
        
    }

}