package alejandro;
import java.util.Scanner; /*importas la herramienta del Scanner  */
public class Main {
    public static void main(String[] args) {
    /*una de las herramientas muy utiles en java es el Scanner 
    que hace el SCANNER CON (SYSTEM.IN) =  te lee el teclado*/

    Scanner sc= new Scanner (System.in);/*System in (TE LEE EL TECLADO) */
    String nombre; //CREAS LA VARIABLE 
    System.out.println("ESCRIBE TU NOMBRE: "); //LE PREGUNTAS PARA GUARDAR EN VARIABLE 
    nombre = sc.nextLine(); //GUARDA EL RESULTADO EN NOMBRE DE TU TECLADO 
    System.out.println("TU NOMBRE ES: "+nombre); //IMPRIME EL RESULTADO
    
    sc.close(); /*CIERRAS EL SCANNER PARA QUE NO VUELVA LEER NADA MÁS*/

/*DIFERENCIAS*/
//System.in (DENTRO) (RECIBE INFORMACIÓN) Y System.out(FUERA)(EXPULSA INFORMACIÓN)

                     /*Y HAY DISTINTOS TIPOS PARA CADA TIPO*/








    }
}