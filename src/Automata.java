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

    }
}
