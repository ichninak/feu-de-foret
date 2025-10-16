public class Automata {

    private int dimension;
    private int[][] matrix;

    public Automata(int n, double p){
        if (n < 10){
            System.out.println("La dimension de la matrice doit etre supérieur ou egal a 10");
        }
        else {
            // write the construction of the matrix and also create the probability to have a tree on a case
        }
    }

    public Automata(double p){
        // do the same as the previous constructor but just remove the mandatory (n >= 10)
    }

    public void forestDisplay(){
        // show the matrix
        // empty cell = '.'
        // tree are represented by 'T'
        // tree in fire by 'O'
        // ashes by '_'

        String empty = ".";
        String tree = "T";
        String firetree = "O";
        String ash = "_";

        // create conditional if with the matrix Automata and return a new matrix with only string

    }

    public boolean isRazed(){
        // return false if we have at least one tree
        // return true if we don't have tree
        return false;
    }

    public boolean isOnFire(){
        // return true if at least one tree is burn or return false
        return false;
    }

    public putFire(int i, int j){
        // matrix[i][j] = 5
        // random
    }

    public putFire(){
        // modify the matrix to put a fire (5) even if isnot a tree
    }
    
}
