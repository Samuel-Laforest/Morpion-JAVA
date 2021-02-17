import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int tour = 1;
        String[][] plateau = new String[3][3];

        initplateau(plateau);

        while(tour != 10 && !conditionVictoire(plateau)){
            cochercase(plateau, joueur(tour));
            tour++;
            if(tour == 10){
                System.out.println("MATCH NUL, aucun joueur n'a gagné !");
            }
        }

    }


    public static void initplateau(String[][] plateau) {

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                plateau[i][j] = "";
            }
        }
    }

    public static void afficherplateau(String[][] plateau) {
        System.out.println("꧁╭⊱  \uD83C\uDD7C\uD83C\uDD7E\uD83C\uDD81\uD83C\uDD7F\uD83C\uDD78\uD83C\uDD7E\uD83C\uDD7D  ⊱╮꧂");
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                System.out.print("   |  " + plateau[i][j]);
            }
            System.out.println();
        }
        System.out.println("   ** ━―━―(･ω･)―━―━― **");
    }

    public static void cochercase(String[][] plateau, int joueur) {
        int x, y;

        if (joueur == 1) {
            System.out.println("C'est le tour de Joueur 1.");
            System.out.println("X :");
            x = saisiecoo();
            System.out.println("Y :");
            y = saisiecoo();


            if (plateau[x][y].equals("O") || plateau[x][y].equals("X")) {
                System.out.println("cette case est déjà coché !");
                cochercase(plateau, joueur);
            } else {
                plateau[x][y] = "X";
                afficherplateau(plateau);
            }
        } else {
            System.out.println("C'est le tour de Joueur 2.");
            System.out.println("X :");
            x = saisiecoo();
            System.out.println("Y :");
            y = saisiecoo();


            if (plateau[x][y].equals("O") || plateau[x][y].equals("X")) {
                System.out.println("cette case est déjà coché !");
                cochercase(plateau, joueur);
            } else {
                plateau[x][y] = "O";
                afficherplateau(plateau);
            }

        }
    }

    public static int saisiecoo() {
        Scanner input = new Scanner(System.in);
        int saisie;
        try {
            saisie = input.nextInt();
            if (saisie < 0 || saisie > 2) {
                System.out.println("ERREUR : veuillez saisir des coordonnées de 0 à 2");
                saisie = saisiecoo();
            }

        } catch (Exception e) {
            System.out.println("ERREUR veuillez saisir à nouveau");
            saisie = saisiecoo();
        }
        return saisie;
    }

    public static int joueur(int tour) {
        int joueur;
        if (tour % 2 == 1) {
            joueur = 1;
        } else {
            joueur = 2;
        }
        return joueur;
    }

    public static boolean conditionVictoire(String[][] plateau) {
        boolean victoire = false;

        if (plateau[0][0].equals("O") && plateau[0][1].equals("O") && plateau[0][2].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[1][0].equals("O") && plateau[1][1].equals("O") && plateau[1][2].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[2][0].equals("O") && plateau[2][1].equals("O") && plateau[2][2].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[0][0].equals("O") && plateau[1][0].equals("O") && plateau[2][0].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[0][1].equals("O") && plateau[1][1].equals("O") && plateau[2][1].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[0][2].equals("O") && plateau[1][2].equals("O") && plateau[2][2].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[0][0].equals("O") && plateau[1][1].equals("O") && plateau[2][2].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[2][0].equals("O") && plateau[1][1].equals("O") && plateau[0][2].equals("O")) {
            System.out.println("Bravo le joueur 2 à gagné !");
            victoire = true;
        }
        if (plateau[0][0].equals("X") && plateau[0][1].equals("X") && plateau[0][2].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }
        if (plateau[1][0].equals("X") && plateau[1][1].equals("X") && plateau[1][2].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }
        if (plateau[2][0].equals("X") && plateau[2][1].equals("X") && plateau[2][2].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }
        if (plateau[0][0].equals("X") && plateau[1][0].equals("X") && plateau[2][0].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }
        if (plateau[0][1].equals("X") && plateau[1][1].equals("X") && plateau[2][1].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }
        if (plateau[0][2].equals("X") && plateau[1][2].equals("X") && plateau[2][2].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }
        if (plateau[0][0].equals("X") && plateau[1][1].equals("X") && plateau[2][2].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }
        if (plateau[2][0].equals("X") && plateau[1][1].equals("X") && plateau[0][2].equals("X")) {
            System.out.println("Bravo le joueur 1 à gagné !");
            victoire = true;
        }


        return victoire;
    }
}
