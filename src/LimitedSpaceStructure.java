public class LimitedSpaceStructure implements  DataStructure {
    int amtOfNums = 0;
    Object[] objects = new Object[100];

    public LimitedSpaceStructure() {
        this.objects = new Object[100];
    }

    synchronized public boolean put(Object obj) {

        if (amtOfNums > objects.length - 1) {
            return false;
        } else {
            objects[amtOfNums] = obj;
            amtOfNums = amtOfNums + 1;
            return true;
        }
    }


    synchronized public Object get() {

        Object obj;
        if (amtOfNums == 0) {
            return null;
        } else {
            amtOfNums = amtOfNums - 1;
            obj = objects[amtOfNums];
        }

        return obj;
    }
}

