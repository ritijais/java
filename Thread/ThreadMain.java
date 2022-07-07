public class ThreadMain {

 static void call(int n){
  if (n==100){
   PlayerThread thread = new PlayerThread(n);
   thread.start();
  }
  else{
   PlayerThread thread = new PlayerThread(n);
   thread.start();
   try{
    thread.sleep(100);
   } catch (Exception ex){
   }
   call(n+1);
   
  }
 }
 public static void main(String[] args) {
  Integer i = 1;
  call(i);
 }
 
}