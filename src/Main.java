import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Directions:\n" + "1) Enter a number\n" + "2) Respond to each Guess with Too High, Too Low, or Correct\n");
        System.out.print("Input A Number: ");
        Scanner nInput = new Scanner(System.in);
        nInput.nextInt();
        String word = ("blank");
        int guess = -1;
        int max = 100;
        int min = 0;

//         Repeats until number is correctly guessed
        while(!word.equalsIgnoreCase("Correct"))
        {
//            Guesses number
            guess = (max + min) / 2;
            System.out.println("Is this your number: " + guess);

//            Asks for user input about the accuracy of the guess
            Scanner wInput = new Scanner(System.in);
            word = wInput.nextLine();

//            Changes the guessing range based on user input
            if (word.equalsIgnoreCase("Too High"))
            {
                max = guess;
            }
            else if (word.equalsIgnoreCase("Too Low"))
            {
                min = guess;
            }
            else if (word.equalsIgnoreCase("Correct"))
            {
//                Do nothing
            }
            else
            {
                System.out.println("Say: 'Too High' or 'Too Low' ");
            }

        }

    }
}
