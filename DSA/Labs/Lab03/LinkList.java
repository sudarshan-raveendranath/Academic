public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }
    public boolean isEmpty() {
        return(first == null);
    }
    public void displayList() {
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void insertFirst(int id) {
        Link mylink = new Link(id);
        mylink.next = first;
        first = mylink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }
}
