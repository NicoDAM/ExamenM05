
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
    static protected String p;

    public static void main(String[] args) {
        System.out.println("Comença el joc!");
        
        /**Seleccionar aleatoriament la paraula que s'utilitzara*/
        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            p += "_";
        }
        
        /**Mostra per pantalla la cadena*/
        System.out.println(p);

        Scanner reader = new Scanner(System.in);

        int num_errors = 0;

        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
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
        String paraula_old = p;
        p = "";
        for (int i=0; i<paraules[index].length(); i++) {
            if (paraules[index].charAt(i) == nova) {
                p += paraules[index].charAt(i);
                trobada = true;
            }
            else {
                p += paraula_old.charAt(i);
            }
        }
        return trobada;
    }

}
