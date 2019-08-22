public class Queue<T> implements QueueInterface<T>{
    LinkedList<T> myList;
    public Queue() {
        this.myList = new LinkedList<T>();
    }

    /** Adds a new entry to the back of this queue.
     @param newEntry  An object to be added. */
    public void enqueue(T newEntry){
        myList.addToEnd(newEntry);
    }

    //Removes and returns the entry at the front of this queue.
    // @return  The object at the front of the queue.
    // @throws  EmptyQueueException if the queue is empty before the operation.
    public T dequeue(){
        return myList.removeFromFront();

    }

    /**  Retrieves the entry at the front of this queue.
     @return  The object at the front of the queue.
     returns null if the queue is empty*/
    public T getFront(){
        return myList.getFrontData();

    }

    /** Detects whether this queue is empty.
     @return  True if the queue is empty, or false otherwise. */
    public boolean isEmpty(){
        if(myList.getLength()==0){
            return true;
        }
        return false;
    }

    /** Removes all entries from this queue. */
    public void clear(){
          myList.clear();
    }

    public String toString() {
        return myList.toString();
    }
}