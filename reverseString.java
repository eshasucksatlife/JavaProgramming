
 
public class reverseString {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("HelloWorld");
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;
 
       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);
 
       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }
 
     System.out.println(sb);
   }
}

// another method

public class reverseString1{
 public static void main(String[] args){
  String str = "Hello";
  int n = str.length();
  String rev = "";
for(int i = n-1 ; i>=0; i--){
rev = rev + str.charAt(i);
}
 
System.out.println(rev);
 }}
