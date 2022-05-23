import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class game {
    
    private int iA [];
    public game (){
        init();
        
    }

    public void init() {
        System.out.println("Juegas contra la maquina");
        randomIA();
        System.out.println(Arrays.toString(iA));
        selecciona();

    }
    public void selecciona() {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        while (contador <= 2) {
            System.out.println("Selecciona piedra[1] papel[2] o tijera[3]");
            int opcJugador = Integer.parseInt(scan.nextLine());
            if (opcJugador < 0 || opcJugador > 3 ){
                System.out.println("Solo se admite como opcion, 1 2 o 3");
                }else{
                    comprobacion(opcJugador, contador);
                    contador ++;
                }
            
        }
        scan.close();
    }
    public void comprobacion(int opcJugador, int contador) {

        int resultado = opcJugador - iA[contador];
        
        switch (resultado) {
            case 0:
                System.out.println("Empate");
                break;
            case -1:
                System.out.println("Gana Jugador");
                break;
            case 1:
                System.out.println("Gana Maquina");
                break;
            case 2:
                System.out.println("Gana Jugador");
                break;
            case -2:
                System.out.println("Gana Maquina");
            default:
                break;
        } 
    }
    public void randomIA() {
        Random rng = new Random();
        iA = new int[3];
        for(int i=0; i < iA.length; i++){
            iA[i] = rng.nextInt(2 + 1) + 1;
        }
    }
}
