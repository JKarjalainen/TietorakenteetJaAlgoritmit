import java.util.*;
public class Stack {
    private LinkedList<String> list;
    public Stack() {
        list = new LinkedList<String>();
    }

    public void push(String aData) {
        list.push(aData);
    }

    public String pop() {
        if(list.isEmpty()) return null;
        return list.pop();

    }

    public void printItems() {
        String printString = "";
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()) {
            printString += iterator.next() + "\n";
        }
        System.out.println(printString);
    }

    public int getSize() {
        return list.size();
    }
}