class Node{
int data;
Node next;
Node (int data)
{
this.data=data;
}
}
class Soft{
Node head,tail;
public void insert(int data)
{
Node n=new Node(data);
if(head==null)
{
head=n;
tail=n;
}
else{
tail.next=n;
tail=n;
}
}
public void sort()
{
if(head==null)
{
return;
}
boolean swap=true;
Node end=null;
while(swap)
{
swap=false;
Node current=head;
while(current.next!=end)
{
if(current.data>current.next.data)
{
int temp=current.data;
current.data=current.next.data;
current.next.data=temp;
swap=true;
}
current=current.next;
}
end=current;
}
}

public void display()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}
}

public class Main{
public static void main(String[] args) {
Soft st = new Soft();
int num=0;
Scanner sc=new Scanner(System.in);
int c;
while(true)
{
System.out.println("1.Enter a new file");
System.out.println("2.View desktop");
System.out.println("3.Arrange in order");
System.out.println("4.Exit");
System.out.println("Enter your choice");
c=sc.nextInt();
switch(c){
case 1:
do{
if(num>100)
{
System.out.println("Oops!!! not in the range.");
}
System.out.println("Enter the file");
num= sc.nextInt();
}
while(num>100);
st.insert(num);
break;
case 2:
System.out.println("Files are:");
st.display();
break;
case 3:
st.sort();
st.display();
break;
case 4:
System.out.println("Exit");
break;

default:
System.out.println("Exit");
return;
}
}
}
}
