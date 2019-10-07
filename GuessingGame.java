import java.util.Scanner;

class GuessingGame{
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("I've picked a random number between 1 and 100. Try to guess it!");
        
        int num = (int) (Math.random()*100 + 1);
        int guess = 0;
        int tries = 0;
        
        
        
        while (guess != num ){
            System.out.println ("");
            System.out.println ("What is your guess?");
            guess = sc.nextInt();
            
            if (guess > num)
                System.out.println ("Too high");
            if (guess < num) 
                System.out.println ("Too low");
            
            tries ++;
                
            
        }
        System.out.println ("You've guessed my number! It took you " + tries + " tries!");
        
        
    }
}
