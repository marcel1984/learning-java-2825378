import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);

        int inputtedNum = input.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend bring you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
    }
}
