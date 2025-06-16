class stack{
int top=-1;
int[] arr=new int[5];
public void push(int data){
//         if(top==arr.length)
top++;
arr[top]=data;

}
public void sum(){
int temp=0;
for(int i=0;i<=top;i++){
temp+=arr[i];
}
System.out.println(temp);


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
stack s=new stack();
s.push(10);
s.push(20);
s.push(30);
s.display();
System.out.println("Sum is :");
s.sum();
}
}
