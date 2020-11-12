import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing Current Song");
            System.out.println("Would you like to take this son off repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next Song");
    }
}
