import java.util.Stack;
import java.util.Scanner;
public class Main
{
public static boolean isValid(String s){
Stack<Character> st=new Stack<>();
for(int i=0;i<=s.length()-1;i++){
char ch=s.charAt(i);
if(ch=='('||ch=='{'||ch=='['){
st.push(ch);
}else{
if(st.isEmpty()){
return false;
}
char top=st.pop();
if((ch==')'&&top!='(')||
(ch==']'&&top!='[')||
(ch=='}'&&top!='{')){
return false;
}
}
}
return st.isEmpty();
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String arr[]=new String[n];
for(int i=0;i<n;i++){
arr[i]=sc.next();
}
for(int i=0;i<n;i++){
System.out.println(isValid(arr[i]));
}
}
}
