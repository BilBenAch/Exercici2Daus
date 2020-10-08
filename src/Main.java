import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio = 0;
        int victorias = 0;
        int derrotas = 0;
        while(opcio != 3) {
            System.out.println("----Menu----");
            System.out.println("1- Jugar als daus");
            System.out.println("2- Jugar al fifa 20");
            System.out.println("3- Sortir");
            opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    JocDaus jugar = new JocDaus();
                    jugar.Jugar();
                    jugar.comprobarVictoria();
                    if(jugar.comprobarVictoria() == 1){
                        System.out.println("Has guanyat");
                        victorias++;
                    }
                    else {
                        System.out.println("Has perdut");
                        derrotas++;
                    }
                    System.out.println(jugar.toString());
                    break;
                case 2:
                    System.out.println("No disponible actualment ");
                    break;
                case 3:
                    System.out.println("Adeu");
                    break;
                default:
                    System.out.println("Opció incorrecta, el numero entre 1 i el 3 només");
            }
        }
        System.out.println("Has guanyat "+victorias+" vegades");
        System.out.println("Has perdut "+derrotas+" vegades");
    }
}
