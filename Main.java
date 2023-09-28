import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Precios mk = new Precios(0, "Banano");
        System.out.println("Desea realizar la compra de un " + mk.comestibles + " por el valor de " + mk.valor);
        String alimento = sc.nextLine();

        /*
        * Complejidad temporal: O(1) Tiempo constante
        */

        if (alimento.equals("Si") || alimento.equals("si") ){
            mk.Compra();
        }//Cierra If
            else {
               mk.noCompra();
        }//Cierra else

    }//Cierra Main
}//Cierra Class