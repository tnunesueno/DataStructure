public class Main {
    public static void main(String[] args) {
        System.out.println("Testing stack data structure");
        LimitedSpaceStructure myData = new LimitedSpaceStructure();

        PutterThread test1 = new PutterThread(myData, 200, 300);
        Thread testThread1 = new Thread(test1);
        testThread1.start();

        GetterThread test2 = new GetterThread(myData, 200,300);
        Thread testThread2 = new Thread(test2);
        testThread2.start();
    }

}

