import java.util.Scanner;
class node{
int data;
node next;
node(int data){
this.data=data;
}
}
class stack{
node top=null;
public void push(int data){
node n=new node(data);
n.next=top;
top=n;
}
public void pop(){
node temp=top;
System.out.println(temp);
top=temp.next;
temp=null;

}
public void count(){
node temp=top;
int c=0;
while (temp!=null){
temp=temp.next;
c++;
}
System.out.println(c);
}
public void display(){
node temp=top;
while (temp!=null){
System.out.println(temp.data);
temp=temp.next;

}

}
}
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
stack s=new stack();
int c;
while(true){
System.out.println("\nChoice 1 : Push");
System.out.println("Choice 2 : Pop");
System.out.println("Choice 3 : Display");
System.out.println("Choice 4 : count");
System.out.println("Any other choice : Exit");
System.out.println("Enter your choice");
c=sc.nextInt();
switch(c){
case 1:
System.out.println("Enter the element to be pushed");
int a=sc.nextInt();
s.push(a);
break;
case 2:
s.pop();
break;
case 3:
System.out.println("The contents are:");
s.display();
break;
case 4:
s.count();
break;

}
}

}}
