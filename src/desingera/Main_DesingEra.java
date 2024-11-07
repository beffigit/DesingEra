/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desingera;

/**
 *
 * @author Daniela
 */
public class Main_DesingEra {

    /**
     * Es el método principal del proyecto
     * @param args El array de cadena-palabras que captura el programa
     */
    public static void main(String[] args) {
        // Aqui hemos hecho algunas pruebas para ver si nos funciona 
        System.out.println("Hola");
        System.out.println("Hola de nuevo");
        System.out.println("Probando cosas");
        
        //creamos tes objetos de las clases
        Pantalla_DesingEra pantallita = new Pantalla_DesingEra();
        Modelo_DesingEra ModeloRef = new Modelo_DesingEra();
        Jefe_DesingEra jefazo = new Jefe_DesingEra(ModeloRef,pantallita);
        
        //hacemos una llamada de la clase controlador utilizando el método creado.
        jefazo.iniciandoJefazo();
    }
    
}
