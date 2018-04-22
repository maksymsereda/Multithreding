package main.java.threadImplementation;

public class ContestantTwo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
    }
}

class SecondWay{
    public static void main(String[] args) {
        ContestantTwo contestantTwo1 =new ContestantTwo();
        ContestantTwo contestantTwo2 =new ContestantTwo();
        ContestantTwo contestantTwo3 =new ContestantTwo();

        contestantTwo1.start();
        contestantTwo2.start();
        contestantTwo3.start();
    }
}
