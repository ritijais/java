public class PlayerThread extends Thread{

  private int i;
  
  public PlayerThread(int i){
   this.i = i;
  }
 
  public void run(){
   try{
 
    System.out.println("Started thread is " + Thread.currentThread().getName());
    System.out.println("Ended thread is " + Thread.currentThread().getName());
   } catch (Exception ex){
    
   }
   }
 
 }
  
 
