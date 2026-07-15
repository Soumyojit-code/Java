

 class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}




public class SinglyLinked
{
    Node head;
    Node tail;
    int size;
    public boolean Isempty()
    {
        return (head == null&&tail == null);
    }
    public boolean Append(int Data)
    {
        if(Isempty())
        {
            Node n = new Node(Data);
            head =tail = n;
            size++;
            return true;

        }
        else
        {
            Node n = new Node(Data);
            tail.next = n;
            tail = n;
            size++;
            return true;
        }
    }
    public boolean Preappend(int Data)
    {
        if(Isempty())
        {
            Node n = new Node(Data);
            head =tail = n;
            size++;
            return true;

        }
        else
        {
            Node n = new Node(Data);
            n.next = head;
            head = n;
            size++;
            return true;
        }
    }
    void Print()
    {
        if(Isempty())
        {
            System.out.println("Empty List");

        }
        else
        {
            Node temp=head;
            while (temp!= null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
        }
    }
}
class Call
{
    public static void main(String[] args)
    {
        SinglyLinked sll = new SinglyLinked();
        sll.Print();
        sll.Preappend(13);
        sll.Append(14);
        sll.Append(30);
        sll.Append(15);
        sll.Append(56);
        sll.Preappend(20);

        sll.Print();
    }
}
