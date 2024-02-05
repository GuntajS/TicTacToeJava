import java.util.Scanner;
public class NumberInput extends Input<Integer>{
    private int inputTemp;
    private int playerInput;
    NumberInput() {

    }
    public void setValue(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        while(true) {
            System.out.println("enter your selection between 1-9: ");
            this.inputTemp = scanner.nextInt(); // Read user input
            if (0 < inputTemp && inputTemp < 10) {
                this.playerInput = inputTemp;
                System.out.println("got it!");
                break;
            } else {
                System.out.println("This is not in 0-9!");
            }
        }
    }
    @Override
    public Integer getBoardInput() {
        return playerInput;
    }
//    public static void main(String[] args) {
//        Input newInput = new NumberInput();
//        System.out.println(newInput.getBoardInput());
//    }
}



