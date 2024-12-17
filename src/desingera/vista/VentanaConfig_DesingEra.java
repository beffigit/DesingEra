/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package desingera.vista;

import java.awt.event.ActionListener;

/**
 *
 * @author daniela
 */
public class VentanaConfig_DesingEra extends javax.swing.JDialog {

    /**
     * Constructor de la clase VentanaConfig_DesingEra, inicializa la ventana JDialog 
     * con todas las propiedades que tenga.
     * @param parent La ventana principal (de tipo java.awt.Frame) que actúa como padre de este diálogo.
     * @param modal  Un booleano que indica si el diálogo debe ser modal.
     * Si es `true`, bloquea la interacción con la ventana principal mientras este diálogo esté abierto.
     */
    public VentanaConfig_DesingEra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        System.out.println("Lanzando la ventana JDialog......");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBotones = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalon = new javax.swing.JButton();
        btnCocina = new javax.swing.JButton();
        btnHabit = new javax.swing.JButton();
        btnBaño = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelBotones.setBackground(new java.awt.Color(0, 103, 41));

        btnOk.setText("OK");
        PanelBotones.add(btnOk);

        btnCancelar.setText("Cancelar");
        PanelBotones.add(btnCancelar);

        getContentPane().add(PanelBotones, java.awt.BorderLayout.PAGE_END);

        panelCentral.setBackground(new java.awt.Color(0, 103, 41));

        jLabel1.setText("¿Desea insertar nuevos productos?");

        btnSalon.setText("Salón");

        btnCocina.setText("Cocina");

        btnHabit.setText("Habitación");

        btnBaño.setText("Baño");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(btnSalon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCocina)
                        .addGap(18, 18, 18)
                        .addComponent(btnHabit)
                        .addGap(18, 18, 18)
                        .addComponent(btnBaño))
                    .addComponent(jLabel1))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalon)
                    .addComponent(btnCocina)
                    .addComponent(btnHabit)
                    .addComponent(btnBaño))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JButton btnBaño;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCocina;
    private javax.swing.JButton btnHabit;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables


     /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void addActionListenerbtnCancelar(ActionListener l){
        btnCancelar.addActionListener(l);
        //System.out.println("Has pulsado --> botón Cancelar");
    }
    /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void addActionListenerbtnOk(ActionListener l){
        btnOk.addActionListener(l);
    }
    /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void addActionListenerbtnSalon(ActionListener l){
        btnSalon.addActionListener(l);
    }
    /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void addActionListenerbtnCocina(ActionListener l){
        btnCocina.addActionListener(l);
    }
    /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void addActionListenerbtnHabit(ActionListener l){
        btnHabit.addActionListener(l);
    }
    /**
    * Doy control selectivo, sólo a la capacidad de escuchar.
    */
    public void addActionListenerbtnBaño(ActionListener l){
        btnBaño.addActionListener(l);
    }

}
