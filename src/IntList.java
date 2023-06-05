public class IntList {

    private ListElement head;
    private ListElement tail;
    private int size;

    public IntList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addElement(int e) {
        if (e < 0) e *= -1;
        ListElement newElement = new ListElement(e);

        if (head == null) {
            head = newElement;
            tail = newElement;
        } else {
            tail.setNext(newElement);
            newElement.setPrev(tail);
            tail = newElement;
        }
        this.size++;
    }

    public ListElement getElement(int i) {
        if (i >= this.size || i < 0) {
            return null;
        }
        ListElement iterator = head;
        for (int j = 0; j < i; j++) {
            iterator = iterator.getNext();
        }
        //System.out.println(iterator);
        return iterator;
    }

    public void removeElementAtPosition(int pos) {

        ListElement toRemove = getElement(pos);

        removeElement(toRemove);

    }

    public void removeElementsWithValue(int v) {
        if (size == 0) {
            System.out.println("List is empty, no elements to remove");
        } else {
            for ( ListElement i = this.head; i != null; i = i.getNext()) {
                if (i.getValue() == v) {
                    removeElement(i);
                    System.out.println("Elements with value of " + v + " are removed from the list");
                }
            }
        }
        System.out.println("No element with value of " + v);
    }

    public void removeElement (ListElement toRemove){
        if (toRemove == null) {
            System.out.println("Wrong index");
            return;
        }

        ListElement prev = toRemove.getPrev();
        ListElement next = toRemove.getNext();

        //proveravamo da li smo izbacili head
        if (prev != null) {
            prev.setNext(next);
        } else {
            this.head = next;
        }

        //proveravamo da li smo izbacili tail
        if (next != null) {
            next.setPrev(prev);
        } else {
            this.tail = prev;
        }
        this.size--;
    }

    public void print(IntList list) {
        if (list.size == 0) {
            System.out.println("List is empty");
        }
        else{
            for (int i = 0; i < list.size; i++) {
                System.out.print(list.getElement(i).getValue() + " ");

            }
        }
    }

    public void printReverse(IntList list) {

        if (list.size == 0) {
            System.out.println("List is empty");
        }
        else{
            for (int i = list.size - 1; i != -1; i--) {
                System.out.print(list.getElement(i).getValue() + " ");
            }
        }
    }
}
//    За вежбу
//        1) metoda
//        void removeElementsWithValue(int v);
//        [4:00 PM]
//        metoda iz liste izbacuje sve elemente cija je vrednost val
//        [4:00 PM]
//        2) metoda print
//        Ispisuje celu listu na standardni izlaz
//        [4:01 PM]
//        3) metoda printReverse
//        ispisuje al unazad
//        [4:01 PM]
//        Napisati klasu Main u kojoj se kreira jedna ovakva lista i testira
