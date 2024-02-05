public abstract class Input<T> {

    Input() {
//        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter input");
//        String inputPlayer = scanner.nextLine();  // Read user input
//        System.out.println("enter your input" + inputPlayer);
//        this.playerInput = playerInput;
//        scanner.close();
    }

    public abstract T getBoardInput();
}

