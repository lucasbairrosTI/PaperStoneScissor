import java.util.Scanner;
import java.util.Random;

public class TheGame {
    public void secret () {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("command information:\n1 = stone\2 = paper\n3 = scissors\n0 = quit game\n9=Match Result ");

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        int continueRunning = 1;

        int points = 0;

        while(continueRunning != 0) {

        System.out.println("\n \nchoose your move:");
        int interact = keyboard.nextInt();

        Random random = new Random();

        int numberRandom = random.nextInt(3) + 1;
        int number = numberRandom * 10;

        int result = interact - number;

        if (result == -27){
            System.out.println("scissors / scissors \n    DRAW");
        }else if (result == -17){
            System.out.println("scissors / paper \n  You Won!!!");
        }else if(result == -7){
            System.out.println("scissors / Stone \n  You Lose!!!");
        }

        if (result == -28){
            System.out.println("papers / scissors \n  You Lose!!!");
        }else if(result == -18){
            System.out.println("papers / paper \n    DRAW");
        }else if(result == -8){
            System.out.println("papers / Stone \n    You Won!!!");
        }

        if (result == -29){
            System.out.println("Stone / scissors \n  You Won!!!");
        }else if (result == -19){
            System.out.println("Stone / paper \n    You Lose!!!");
        }else if (result == -9){
            System.out.println("Stone / Stone \n    DRAW");
        }

        if (interact == 0){
            System.out.println("Thanks for Playing");
            System.exit(0);
        }

        if (result == -17){
            points = points + 1;
        }else if(result == -29){
            points = points + 1;
        }else if(result == -8){
            points = points + 1;
        }

        if (result == -19){
            points = points - 1;
        }else if(result == -28){
            points = points -1;
        }else if(result == -7){
            points = points -1;
        }

        if (interact == 9) {
            System.out.printf("You've %s points",points);
        }

        


        }
        keyboard.close();
    }
}
