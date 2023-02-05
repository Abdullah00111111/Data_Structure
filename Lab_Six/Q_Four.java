package Lab_Six;

public class Q_Four {
    public void merge(DoublyLinkedList M){
        if(!isEmpty() && !M.isEmpty()){
            while(!M.isEmpty()){
                addLast((E) M.removeFirst());
            }
        } 
    }
}
