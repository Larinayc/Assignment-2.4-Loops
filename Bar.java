import java.util.Scanner;

class Bar
{
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("What character do you want your bar made of?");
        String character = sc.nextLine();
        System.out.println ("How long do you want your bar?");
        int length = sc.nextInt();
        
        for (int i = 0; i <= length; i ++)
        {
            System.out.print (character);
        }
        
    }
}
 
