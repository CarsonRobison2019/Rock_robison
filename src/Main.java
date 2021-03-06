import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //used to get a random number either 1 2 or 3
        List<Integer> computerMoves = Arrays.asList(1, 2, 3);
        //just my scanner
        Scanner Keyborde = new Scanner(System.in);

        loop : while(true){
            System.out.print("make your play here Rock, Paper, Scissors.---> ");
            String move = Keyborde.nextLine().toLowerCase();
            Collections.shuffle(computerMoves);

            switch(move){
                case "rock" : determineWinner(computerMoves.get(0), "Tie", "You Lose", "You Win"); break;
                case "paper" : determineWinner(computerMoves.get(0), "You Win", "Tie", "You Lose"); break;
                case "scissors" : determineWinner(computerMoves.get(0), "You Lose", "You Win", "Tie"); break;
                case "exit" : break loop;
                case "" : continue loop;
                default : System.out.println("Invalid Input");
            }
        }
    }


    private static void determineWinner(int computerMove, String m1, String m2, String m3){
        if(computerMove == 1){ // computer move is rock
            System.out.printf("Computer Chose Rock, %s%n", m1);
        } else if(computerMove == 2){ // computer move is paper
            System.out.printf("Computer Chose Paper, %s%n", m2);
        } else { // computer move is scissors
            System.out.printf("Computer Chose Scissors, %s%n", m3);
        }
    }
}