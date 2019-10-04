import java.util.Scanner;
class RunningTally
{
    
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("Let's add some numbers! Input a negative integer to quit.");
        
        int sum = 0;
        int n = 0;
        
        n = sc.nextInt();
        while (n >= 0 )
        {
            
            System.out.println ("Add: " + n);
            sum = sum + n;
            n = sc.nextInt();
        }
        System.out.println("Add: " + n);
        System.out.println ("Your total is " + sum);
    }
        
}
