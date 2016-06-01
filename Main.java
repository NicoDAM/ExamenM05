
/**
 * Programa que simula el joc del penjat
 * 
 * @author Marina
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

    /**
     * Vector emmagatzema les paraules que s'utilitzaran al joc
     */
    static protected String paraules[] = {"hola","programació","casa"};
    
    /**
     * Variable que serveix per seleccionar aleatoriament
     * la paraula que s'utilitzara en cada partida
     */
    static protected int index;

    /**
     * Cadena que emmagatzemara els espais a omplir per
     * el jugador i les lletres introduides
     */
    static protected String paraula;
    static int ERRORS = 5;
    
    
    public static void main(String[] args) {
        System.out.println("Comença el joc!");
        int comptador;
        int num_errors = 0;
        
        /**Seleccionar aleatoriament la paraula que s'utilitzara*/
        Random rand = new Random();
        index = rand.nextInt(3);
        for (comptador=0; comptador<paraules[index].length(); comptador++) {
            paraula += "_";
        }
        
        /**Mostra per pantalla la cadena*/
        System.out.println(paraula);

        Scanner reader = new Scanner(System.in);

        while (!paraula.equals(paraules[index]) && num_errors < ERRORS) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(paraula);
        }
   }

        /**
         * Metode que comprova si la lletra indicada es correcte
         * 
         * @param nova Indicar una nova lletra
         * @return Retorna cert o fals si troba la lletra
         */
    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = paraula;
        int comptador;
        
        paraula = "";
        for (comptador=0; comptador<paraules[index].length(); comptador++) {
            if (paraules[index].charAt(comptador) == nova) {
            	paraula += paraules[index].charAt(comptador);
                trobada = true;
            }
            else {
            	paraula += paraula_old.charAt(comptador);
            }
        }
        return trobada;
    }

}
