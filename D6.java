import java.util.Scanner;

class D6
{

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double x = 0;
        String again = "y";

        while (again.equals("y"))
        {
            System.out.println ("How many D6's do you want to roll?");
            int num = sc.nextInt();
            System.out.print ("You rolled: ");
            int sum = 0;
            for (int i = 0; i < num; i ++) {
                x = Math.random();
                int a = (int) (x * 6) + 1;
                System.out.print (a + " ");
                sum = sum + a;
               
            }
            System.out.println ("");
            System.out.println ("Total: " + sum);

            System.out.println ("Again? [y,n]");
            again = sc.next();
        }

       
       
    }
}
