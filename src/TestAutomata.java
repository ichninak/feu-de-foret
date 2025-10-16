public class TestAutomata {
    
    public static void main(String[] args) {
        Automata iAC = new Automata(0.3);
        System.out.println("Is the forest on fire ? " + iAC.isOnFire());
        System.out.println("Is the forest completely rased ? " + iAC.isRazed());
        iAC.forestDisplay();

        Automata jAC = new Automata(25 , 0.8);
        System.out.println("Is the forest on fire ? " + jAC.isOnFire());
        System.out.println("Is the forest completely rased ? " + iAC.isRazed());
        jAC.forestDisplay();

        Automata kAC = new Automata(20, 0.7);
        System.out.println("Is the forest on fire ? " + kAC.isOnFire());
        System.out.println("Is the forest completely rased ? " + kAC.isRazed());
        kAC.forestDisplay();

        // add another test, for testing if we chose a dimension under 10 is working
    }
}
