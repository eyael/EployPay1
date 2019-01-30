
import java.util.Scanner;

    public class Ep{

        public static void main(String[] args){

            Scanner Keyboard = new Scanner(System.in);

            System.out.println("enter number");

            int score1 = Keyboard.nextInt();

            int score2 = Keyboard.nextInt();

            int score3 = Keyboard.nextInt();

            int score4 = Keyboard.nextInt();

            int score5 = Keyboard.nextInt();

            int score6 = Keyboard.nextInt();

            int score7 = Keyboard.nextInt();

            int score8 = Keyboard.nextInt();

            int score9 = Keyboard.nextInt();

            int score10 = Keyboard.nextInt();

            int average = (score1+score2+score3+score4+score5+score6+score7+score8+score9+score10)/10;

            System.out.println(average);


        }
