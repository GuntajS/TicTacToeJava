public class Board {
    private char[] board;
    Board(char[] board){
        this.board = board;
    }
    public void displayBoard(){
        for(int i = 9; i>0; i -= 3)
        {
            System.out.println("   |   |   ");
            System.out.printf(" %c | %c | %c\n", board[ i-2 ], board[i-1], board[i]);
            System.out.println("___|___|___");
        }
    };
    public void placeMarker(NumberInput number,Player player){
        if(spaceCheck(number.getBoardInput())) {
            board[number.getBoardInput()] = player.getMarker();
        }else{
            System.out.println("There is not space to place the marker here");
        }

    }
    public boolean fullCheck(){
        for (char c : board) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }
    public boolean winCheck(Player player){
        char mark = player.getMarker();
        return (board[1] == board[2] && board[2] == board[3] && board[1] == mark) ||
                (board[4] == board[5] && board[5] == board[6] && board[4] == mark) ||
                (board[7] == board[8] && board[8] == board[9] && board[7] == mark) ||
                (board[3] == board[6] && board[6] == board[9] && board[3] == mark) ||
                (board[1] == board[4] && board[4] == board[7] && board[1] == mark) ||
                (board[2] == board[5] && board[5] == board[8] && board[2] == mark) ||
                (board[1] == board[5] && board[5] == board[9] && board[1] == mark) ||
                (board[3] == board[5] && board[5] == board[7] && board[3] == mark);
    }
    public boolean spaceCheck(int position){

        return board[position] == ' ';
    }

}