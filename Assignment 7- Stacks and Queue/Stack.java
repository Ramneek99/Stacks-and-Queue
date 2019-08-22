public class Stack<T> implements StackInterface<T>{

    LinkedList<T> myList;

    public Stack() {
        this.myList = new LinkedList<T>();
    }

    //Puts entry on top of the stack
    public void push(T newEntry){
        this.myList.addToFront(newEntry);

    }

    //Takes entry off the top of the stack and returns that entry
    //Returns NULL in the empty stack scenario
    public T pop(){
        if(myList.getLength()==0){
            return null;
        }
        return myList.removeFromFront();

    }

    //Returns a reference to  the entry on the top of the stack but does not remove it
    //Returns NULL in the empty stack scenario
    public T peek(){
        if(myList.getLength()==0){
            return null;
        }
      return myList.getFrontData();

    }

    //Returns true if the stack is empty, false if not
    public boolean isEmpty(){
        if(myList.getLength()==0){
            return true;
        }
        return false;
    }

    //clears the stack
    public void clear(){
        myList.clear();

    }

    public String toString() {
        return myList.toString();
    }
}