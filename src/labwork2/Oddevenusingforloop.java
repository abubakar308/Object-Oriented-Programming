package labwork2;

public class Oddevenusingforloop {
    public static void main(String[] args) {
        //Q-6:Print 0ddEven from 1 to 10 using for loop.

        for(int i=1; i<=10; i++)
        {
            if(i%2==0)
            {
                System.out.println("The Output is 'Even': " +i);
            }
            else
            {
                System.out.println("The Output is 'Odd': " +i);
            }
                
       }
    }

}

