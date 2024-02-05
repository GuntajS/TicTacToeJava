import java.util.Scanner;
public class MarkerInput extends Input<String>{
    private String playerInput;
    private String validInput = "XOxo";
    MarkerInput(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("enter your selection between 'X' or 'O' ");
            String inputTemp = scanner.nextLine();
            if (validInput.contains(inputTemp)) {  // Read user input
                this.playerInput = inputTemp;
                System.out.println("got it!");
                break;
            } else {
                System.out.println("This is not a valid input");
            }
        }
    }

    @Override
    public String getBoardInput() {
        return playerInput;
    }
}
