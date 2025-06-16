import java.util.Scanner;
class stack{
int top=-1;
int[] arr=new int[5];
public void push(int data){
top++;
arr[top]=data;

}
public void pop(){
if(top==-1){
System.out.println("stack is empty");
}else{
int temp=arr[top];
System.out.println(" the element  poped is"+temp);

top--;
temp=0;
}
}

public void display(){
if(top==-1){
System.out.println("empty");
}else{
for(int i=0;i<=top;i++){
System.out.println(arr[i]);
}

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
System.out.println("Choice 1 : Push");
System.out.println("Choice 2 : Pop");
System.out.println("Choice 3 : Display");
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
s.display();
break;

}
}
}
}
