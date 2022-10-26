public class Stack {
    private ListItem top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(String aData) {
        ListItem listItem = new ListItem(aData, top);
        top = listItem;
        size++;
    }

    public ListItem pop() {
        if (top == null)
            return null;

        ListItem oldTop = top;
        top = top.getNext();
        size--;
        return oldTop;

    }

    public void printItems() {

        String printString = "";
        ListItem next = top;
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
