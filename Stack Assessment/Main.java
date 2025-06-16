import java.util.Scanner;
class stack1{
    int top=-1;
    int a[];
    int size;
    stack1(int size){
        this.size=size;
        a=new int[size];
    }
    public void push(int data){
        if(top==a.length-1){
           System.out.println("Stack is full");
           return;
        }
        else{
            top++;
            a[top]=data;
       
    }
    }
public void pop(){
    if(top==-1){
        System.out.println("Empty");
        return;
}
        int temp=a[top];
        top--;
        temp=0;
    }
public void display(){
    for(int i=0;i<=top;i++)
    {
        System.out.println(a[i]+ " ");
    }
}
}
class stack2{
   
    int top=-1;
    int a[];
    int size;
    stack1(int size){
        this.size=size;
        a=new int[size];
    }
    public void push(int data){
        if(top==a.length-1){
           System.out.println("Stack is full");
           return;
        }
        else{
            top++;
            a[top]=data;
       
    }
    }
public void pop(){
    if(top==-1){
        System.out.println("Empty");
        return;
}
        int temp=a[top];
        top--;
        temp=0;
    }
public void display(){
    for(int i=0;i<=top;i++)
    {
        System.out.println(a[i]+ " ");
    }
}
}
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the array size");
   int size=sc.nextInt();
stack1 s1=new stack1(size);
stack2 s2=new stack2(size);
while(true){
  System.out.println("push1");
  System.out.println("push2");
  System.out.println("pop1");
  System.out.println("pop2");
  System.out.println("display1");
  System.out.println("display2");
  System.out.println("Exit");
  System.out.println("Enter your choice: ");
int ch=sc.nextInt();
switch(ch){
   case 1:
       System.out.println("Enter a element in stack1: ");
       int num1=sc.nextInt();
       s1.push(num1);
       break;
       case 2:
       System.out.println("Enter a element in stack2: ");
       int num2=sc.nextInt();
       s2.push(num2);
       break;
       case 3:
           s1.pop();
           break;
       case 4:
           s2.pop();
           break;
         case 5:
               System.out.println("Display the stack1: ");
               s1.display();
               break;
               case 6:
               System.out.println("Display the stack2: ");
               s2.display();
               break;
               case 7:
                   System.out.println("Exit");
                   break;
}
}
}
}
