package main.java.volatileTest;



import java.util.Scanner;

public class volatileExample {
    private static Scanner s;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.start();


        System.out.println("Press return to stop the barking!");
        s = new Scanner(System.in);
        s.nextLine();

        dog.shhh();
    }

    private static class Dog extends Thread{
        private volatile Boolean canDogBark = true;

        public void run(){
            while (canDogBark){
                System.out.println("Bark!");

                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        public void shhh() {
            canDogBark = false;
        }
    }
}
