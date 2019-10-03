import java.util.Scanner;

class Triangle
{
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What character do you want your triangle made of?");
        String character = sc.nextLine();
        System.out.println("How tall do you want your triangle?");
        int height = sc.nextInt();
        System.out.println("Here is your triangle!");
        
        int i = 1;
        int j = 1;
        for (i = 1; i <= height; i ++)
        {
            for (j = 1; j < i; j ++)
            {
                System.out.print(character);
            }
            System.out.println(character);
        }
        
    }
}
