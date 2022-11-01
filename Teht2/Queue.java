public class Queue {
    private ListItem first;
    private int size;

    public Queue() {
        this.first = null;
        this.size = 0;
    }

    public void push(String aData) {
        ListItem listItem = new ListItem(aData, null);
        ListItem temp = first;
        size++;

        if(temp == null) {
            first = listItem;
            return;
        }

        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(listItem);
    }

    public ListItem pop() {
        if (first == null)
            return null;

        ListItem oldTop = first;
        first = first.getNext();
        size--;
        return oldTop;

    }

    public void printItems() {

        String printString = "";
        ListItem next = first;
        for (int i = 0; i < size; i++) {
            printString += next + "\n";
            next = next.getNext();
        }
        System.out.println(printString);
    }

    public int getSize() {
        return size;
    }
}
