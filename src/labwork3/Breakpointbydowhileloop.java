package labwork3;

public class Breakpointbydowhileloop {
    public static void main(String[] args) {
      //Q-11:Print 'a' to 'z' and break in 'k' using do while loop.

       char i='a';
       do {
    System.out.println(i);
    if(i=='k') break;
    i++;

} while(i<='z');

}
}
