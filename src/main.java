import types.APP;

public class Main {

    public static void main(String[] args) {

        SacADos sac = new APP(args[0], Float.parseFloat(args[1]));

        // Resout le pb du sac a dos avec l'algorithme choisi
        sac.resoudre(args[2]);

        // Affiche la solution
        System.out.println(sac.toString());

    }
}
