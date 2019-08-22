public class LinkedList <T>
{ //MUST IMPLEMENT ALL FUNCTIONS
    private Node head;
    private Node tail;

    public LinkedList()
    {
        head=null;
        tail=null;

    }

    public T getFrontData()
    {
        if(this.head==null){
            return null;
        }
        return this.head.getdata();

    }

    public int getLength()
    {
        int count=0;
        Node cursor = this.head;
        while(cursor!=null){
            count++;
            cursor = cursor.getnext();
        }
        return count;
    }


    public void addToFront(T toAdd)
    {
        Node node = new Node(toAdd, this.head);
        this.head = node;
        if(this.head==null){
            this.tail=this.head;
        }

    }

    public void addToEnd(T toAdd)
    {
        if(head==null){
            this.head = new Node(toAdd, null);
            this.tail=this.head;
            return;
        }
        else{
            Node newTail = new Node (toAdd, null);
            this.tail.setnext(newTail);
            this.tail = newTail;
        }


    }


    public T removeFromFront()
    {
        Node r = null;
        if(this.head==null)
            return null;
        else {
            r = head;
            this.head = this.head.getnext();
            return r.getdata();
        }

    }
    
    public void clear(){
        this.head=null;
    }


    public String toString()
    {
        String string= "head->";
        Node cursor = this.head;
        while(cursor != null){
            string = string + cursor.toString() + "->";
            cursor = cursor.getnext();
        }
        string += "null";
        return string;
    }

    private class Node
    {
        private T data;
        private Node next;
        Node(T dataPassed, Node nextPassed)
        {
            data=dataPassed;
            next=nextPassed;
        }

        public void setdata(T dataPassed)
        {
            data=dataPassed;
        }
        public T getdata()
        {
            return data;
        }
        public Node getnext()
        {
            return next;
        }
        public void setnext(Node passed)
        {
            next=passed;
        }
        public String toString()
        {
            return (""+data);
        }

    }


}