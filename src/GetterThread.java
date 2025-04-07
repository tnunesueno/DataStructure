public class GetterThread implements Runnable{

        LimitedSpaceStructure myData;

        int start;
        int end;

        public GetterThread(LimitedSpaceStructure myData, int start, int end) {
            this.myData = myData;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {

            for (int i = start; i<end; i ++) {
                Object obj = myData.get();
                System.out.println(obj);
                while(obj == null){
                    obj =myData;
                }
            }

        }
    }

