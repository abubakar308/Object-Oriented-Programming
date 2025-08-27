package labwork3;

public class Breakpointbywhileloop {
    public static void main(String[] args) {
      //Q-10:Print 'a' to 'z' and break in 'k' using while loop.

       char i='a';
       while(i<='z') {
    System.out.println(i);
    if(i=='k') break;
    i++;
}
    }
    
}
