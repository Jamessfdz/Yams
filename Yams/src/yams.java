import java.util.Scanner ;

public class yams {

	static Scanner sc = new Scanner (System.in);
	
	// Déclaration des 5 dés
	public static int d1, d2, d3, d4, d5 ;
	
	// Tableau valeur dés
	public static int [] des = new int[5];
	
	// Nombres de parties jouées
	public static int cptjouee ;
	
	
	// Sous programme du menu du jeu
	public static void menu () {
			System.out.println ("*****Menu Yams*****");
			System.out.println ("1. Jouer");
			System.out.println ("2. Statistique");
			System.out.println ("3. Aide");
			System.out.println ("4. Quitter");
			System.out.println ("*******************");
		}
	
	// Sélection de l'adversaire
	public static void joueur () {
		System.out.println ("*Selection joueurs*");
		System.out.println ("1. Versus");
		System.out.println ("2. Ordinateur");
		System.out.println ("*******************");
	}
	
	
	// Lancement du jeu
	public static int PremierTour (){
		for (int i=0; i<des.length ; i++){
			des[i] = PremierTour () ;
		}
		System.out.println("Sélectionnez les dés à relancer.");
        for ( int a = 0; a < des.length; a++ ){  
            System.out.print(des[a] + " " );  
        }
	}
	
	// Sous programme pour retourner la valeur des dés
	public static int valeur (){
		int valeur = (int) (Math.random()*6+1) ;
		return valeur ;
	}
	
	
	
	// Programme principal
	public static void main(String[] args) {
		
		// Lancement du menu
		menu ();
		
		// Sélection du mode
		int selection = sc.nextInt();
		if (selection == 1){
			joueur () ;
			
			// Sélection du nombre de joueurs
			if (int joueurs == 1){
				System.out.println ("Donnez le nombre de joueur.");
				int fin = sc.nextInt ();
				
				// Création des joueurs
				Joueur[] j = new Joueur[fin];
				for(int i=1; i<=fin; i++){
				j[i-1] = new Joueur("Joueur");
				}
				
			}
			PremierTour ();
			break;
			// Si 1 est sélectionné début du jeu et fin du menu
		}
		
		// Affichage des statistiques
		else if (selection == 2){
			System.out.println ("Nombre de parties jouées =");
			System.out.println (cptjouee);
			System.out.println ("Nombres de parties gagnées par joueurs :");

		}
		
		
		

	}

}

