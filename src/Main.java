import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        char[] characterArray = {'#',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        Board board = new Board(characterArray);
        MarkerInput markerInput = new MarkerInput();
        Boolean turn = true;
        Boolean gameOn = true;
        Player player1;
        Player player2;
        NumberInput numberInput = new NumberInput();
        board.displayBoard();
        while(gameOn) {
            if (markerInput.getBoardInput().equalsIgnoreCase("x")) {
                player1 = new Player('X');
                player2 = new Player('O');
            } else {
                player1 = new Player('O');
                player2 = new Player('X');
            }
            Player[] players = {player1, player2};
            numberInput.setValue();
            if (turn) {
                board.placeMarker(numberInput, players[0]);
            } else {
                board.placeMarker(numberInput, players[1]);
            }
            board.displayBoard();
            if (turn) {
                if (board.winCheck(player1)) {
                    System.out.println("Congrats, Player 1 You have Won!!!!");
                    gameOn = false;
                }
            } else {
                if (board.winCheck(player2)) {
                    System.out.println("Congrats, Player 2 You have Won!!!!");
                    gameOn = false;
                }
            }
            turn = !turn;
        }





//        Player1('marker')
//        player2('marker')
//        list player = new List [player1,player2]
//        placemarker(board,player,Input)
//        board.displayboard()
//        wincheck(board,player)

    }

}