
class Main{
    public static void main(String[] args){


//        This is the way of implementing Runnable Interface to create thread
     Decrement loop = new Decrement();


    Increment increment = new Increment();
    Thread thread = new Thread(increment);
    thread.start();
        loop.run();


    }

}

// 1. Using Runnable Interface
 class Decrement implements Runnable{


     @Override
     public void run() {
         for (int count = 10; count >0;count--){
             System.out.println(count);

//            Delay Thread for 1 sec after every decrement
//             putting in (try/catch) block because it throws exception
             try {
                 Thread.sleep(1000);
             }catch (Exception e){
                 System.out.println(e);
             }
         }
     }
 }

// 2. Using Thread Class
class Increment extends Thread{

    @Override
    public void run() {
        for (int count =0;count<10;count++){
            System.out.println(count);

            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
