public class PutterThread implements Runnable{
    LimitedSpaceStructure myData;

    int start;
    int end;

    public PutterThread(LimitedSpaceStructure myData, int start, int end) {
        this.myData = myData;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for (int i = start; i<end; i ++) {
            boolean putWorked = myData.put(i);
            while(!putWorked) {
                System.out.println("put failed");
                putWorked=myData.put(i);
            }
        }


    }
}

