public class Main{
static int x=1;
static int a=1000000;
 public static void main(String args[]){
  // System.out.println("Hello world");
  
  // System.out.println(1/0);
  // System.out.println("Nepal");
  System.out.println(Thread.currentThread().getName());
 

  Thread t1 = new Thread(()->{
   for(int i=1;i<=a;i++){
    x++;
   }

   // while(true){
   //  System.out.println(Thread.currentThread().getName());

   // }
  }
   );
  t1.setName("Ritika");
  t1.start();

  Thread t2 = new Thread(()->{

   for(int i=1;i<=a;i++){
    x++;
   }
  //  while(true){
  //   System.out.println(Thread.currentThread().getName());

  // }
 }
 );
  t2.setName("Babina");
  t2.start();

  Thread t3 = new Thread(()->{

   for(int i=1;i<=a;i++){
    x++;
   }
  //  while(true){
  //   System.out.println(Thread.currentThread().getName());

  // }
 }
 );
  t3.setName("Jinu");
  t3.start();

  Thread t4 = new Thread(()->{

   for(int i=1;i<=a;i++){
    x++;
   }
  //  while(true){
  //   System.out.println(Thread.currentThread().getName());

  // }
 }
 );
  t4.setName("Rasik");
  t4.start();

  Thread t5 = new Thread(()->{

   for(int i=1;i<=a;i++){
    x++;
   }
  //  while(true){
  //   System.out.println(Thread.currentThread().getName());

  // }
 }
 );
  t5.setName("Jinish");
  t5.start();

  System.out.println(x);

 }

}
