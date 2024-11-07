/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desingera;


/**
 *
 * @author Daniela
 */
public class Jefe_DesingEra {
    /**
     * Es el método controlador del proyecto
     * 
     */
    private Modelo_DesingEra bestModel;
    private Pantalla_DesingEra firstVentana;

    public Jefe_DesingEra(Modelo_DesingEra bestModel, Pantalla_DesingEra firstVentana) {
        this.bestModel = bestModel;
        this.firstVentana = firstVentana;
        
        //bestModel.setTitulo("DesingEra");
    }
    
    
   public void iniciandoJefazo(){ 
       firstVentana.setVisible(true);
   }
}
