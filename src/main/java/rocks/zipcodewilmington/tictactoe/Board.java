package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private final Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i<matrix.length; i++) {
            if (matrix[i][0] == 'X' && matrix[i][1] == 'X' && matrix[i][2] == 'X'){
                return true;
            } else if (matrix[0][i] == 'X' && matrix[1][i] == 'X' && matrix[2][i] == 'X'){
                return true;
            } else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X'){
                return true;
            } else if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X'){
                return true;
            }
        } return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i<matrix.length; i++) {
            if (matrix[i][0] == 'O' && matrix[i][1] == 'O' && matrix[i][2] == 'O'){
                return true;
            } else if (matrix[0][i] == 'O' && matrix[1][i] == 'O' && matrix[2][i] == 'O'){
                return true;
            } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O'){
                return true;
            } else if (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O'){
                return true;
            }
        } return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfX() && !isInFavorOfO()){
            return true;
        } else return false;
    }

    public String getWinner() {
        if (isTie()) {
            return "It's a tie!";
        }
        else if (isInFavorOfX()) {
            return "X";
        }
        else if (isInFavorOfO()) {
            return "O";
        }
        return "";
    }

}
