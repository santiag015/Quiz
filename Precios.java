public class Precios {
    //Atributos
    int valor;
    String comestibles;
    /*Metodo Constructor para inicializar la clase
     * @param comestibles el tipo de frutas
     * @param valor de comestibles
     * Complejidad temporal: O(1) Tiempo Constante
     * */
    public Precios (int valor, String comestibles){
        this.valor = valor;
        this.comestibles = comestibles;
    }//Cierra Public Precios

    /* Metodo Constructor de Compra
     * Complejidad temporal: O(1) Tiempo constante
     */
    void Compra (){
         System.out.println("Gracias por su compra, que tenga buen día");
     }//Cierra Compra

    /* Metodo Constructor de NoCompra
     * Complejidad temporal: O(1) Tiempo constante
     */
    void noCompra (){
        System.out.println("Que vuelva pronto");
    }// Cierra noCompra
}//Cierra Precios