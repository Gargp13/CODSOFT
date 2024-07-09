import java.util.Random;
import java.util.Scanner;


class Game {
    public int Number;
    public int GuessesOfNumber = 0;
    public int inputNumber;
    public int getGuessesOfNumber()
    {
        return GuessesOfNumber;
    }

    public void setGuessesOfNumber(int guessesOfNumber)
    {
        this.GuessesOfNumber = guessesOfNumber;
    }

        Game ()
        {
        Random rand = new Random();
        this.Number = rand.nextInt(100);
    }

    void takeinputuser ()
    {
        System.out.println("Guess the Number : ");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner (System.in);
            inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber()
    {
        GuessesOfNumber++;
            if(inputNumber == Number)
            {
                System.out.format("Yes you gussed it right , it was " + Number +  " You Guessed it in " + GuessesOfNumber +" Attempt ");
                // return true;
            }
            else if (inputNumber < Number )
            {
                    System.out.println("Guessed Number is too low.....");
            }
            else if (inputNumber > Number )
            {
                System.out.println("Guessed Number is too high.....");
            }
            return false;
    }
}
public class Guess_Number{
    public static void main(String[] args){
        Game g = new Game();
        boolean b  = false;
        while (!b)
        {
        g.takeinputuser();
        b = g.isCorrectNumber();
        System.out.println(b);
        }
    }
}