public class TestThreadEXercise {
    public static void main(String[] args){
        Thread t1 = new sayHi();
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi " + i);
            if(i == 5){
                try{
                    t1.start();
                    t1.join();
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class sayHi extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello " + i);
        }
        System.out.println("子线程结束");
    }
}
