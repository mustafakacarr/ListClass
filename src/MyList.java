
import java.util.ArrayList;


public class MyList<T> {
    private int listCapacity;
    private static ArrayList list;

    MyList() {
        this.setListCapacity(10);
        list = new ArrayList(listCapacity);
    }

    MyList(int listCapacity) {
        this.setListCapacity(listCapacity);
        list = new ArrayList(listCapacity);
    }

    public int getListCapacity() {
        return listCapacity;
    }

    public void setListCapacity(int listCapacity) {
        this.listCapacity = listCapacity;

    }

    public ArrayList getList() {
        return list;
    }

    public int size() {
       return list.size();

    }

    public int getCapacity() {
        return listCapacity;
    }

    public void add(T data) {
        if(listCapacity==size()){
            setListCapacity(listCapacity*2);
        }
        list.add(data);
    }

}
