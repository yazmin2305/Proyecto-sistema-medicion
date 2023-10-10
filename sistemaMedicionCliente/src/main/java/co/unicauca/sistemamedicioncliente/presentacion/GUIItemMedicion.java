/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.sistemamedicioncliente.presentacion;

import co.unicauca.sistemamedicion.cliente.acceso.FabricaItemMedicion;
import co.unicauca.sistemamedicion.cliente.doominio.servicio.ServicioMedicion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import co.unicauca.sistemamedicion.cliente.acceso.IServicioItemMedicion;
import co.unicauca.sistemamedicion.commons.infra.Protocolo;
import co.unicauca.sistemamedicion.comun.dominio.Disparador;
import co.unicauca.sistemamedicion.comun.dominio.LataCerveza;
import com.google.gson.Gson;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mfcaicedo
 */
public class GUIItemMedicion extends javax.swing.JInternalFrame {
    
    /**
     * Atributos 
     */
    ServicioMedicion servicioMedicion;
    /**
     * Creates new form GUIItemMedicion
     */
    public GUIItemMedicion() {
        initComponents();
        this.jButtonMuestra.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentral = new javax.swing.JPanel();
        jButtonIniciarSimulacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPaneInfoDatosOptimos = new javax.swing.JScrollPane();
        jTableInfoElementOptimos = new javax.swing.JTable();
        jScrollPaneInfoElementDefectuosos = new javax.swing.JScrollPane();
        jTableInfoElementDefectuosos = new javax.swing.JTable();
        jLabelAltura = new javax.swing.JLabel();
        jtxtAltura = new javax.swing.JTextField();
        jLabelAncho = new javax.swing.JLabel();
        jtxtAncho = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jtxtPeso = new javax.swing.JTextField();
        jButtonMuestra = new javax.swing.JButton();

        jButtonIniciarSimulacion.setBackground(new java.awt.Color(54, 102, 167));
        jButtonIniciarSimulacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarSimulacion.setText("Iniciar simulación");
        jButtonIniciarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSimulacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Impresión de resultados ");

        jLabel3.setText("Latas en estado Optimo");

        jLabel4.setText("Latas en estado defectuoso");

        jTableInfoElementOptimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alto(cm)", "Ancho(cm)", "Peso(kg)", "Estado", "Tipo"
            }
        ));
        jScrollPaneInfoDatosOptimos.setViewportView(jTableInfoElementOptimos);

        jTableInfoElementDefectuosos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alto(cm)", "Ancho(cm)", "Peso(kg)", "Estado", "Tipo"
            }
        ));
        jScrollPaneInfoElementDefectuosos.setViewportView(jTableInfoElementDefectuosos);

        jLabelAltura.setText("Altura(cm):");

        jtxtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAlturaActionPerformed(evt);
            }
        });

        jLabelAncho.setText("Ancho(cm):");

        jLabelPeso.setText("Peso(kg):");

        jButtonMuestra.setBackground(new java.awt.Color(54, 102, 167));
        jButtonMuestra.setText("Enviar muestra");
        jButtonMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMuestraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAltura)
                            .addComponent(jLabelAncho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jtxtAncho))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCentralLayout.createSequentialGroup()
                                .addComponent(jLabelPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonMuestra)))
                    .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPaneInfoDatosOptimos, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneInfoElementDefectuosos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addComponent(jButtonIniciarSimulacion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonIniciarSimulacion)
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeso)
                    .addComponent(jtxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAncho)
                    .addComponent(jtxtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMuestra))
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneInfoElementDefectuosos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jScrollPaneInfoDatosOptimos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1038, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void deteccionElemento(){
        String peticion = "start";
        Disparador objDisparador = new Disparador();
        IServicioItemMedicion objItemMedicion;
        objItemMedicion = FabricaItemMedicion.getInstance().obtenerItemMedicion();
        objDisparador.deteccionElemento(peticion);
        // Inyecta la dependencia
        servicioMedicion = new ServicioMedicion(objItemMedicion);
        
        //Eviamos la petición 
        String respuesta = "";
        try {
            respuesta = servicioMedicion.deteccionElemento(objDisparador); 
        } catch (Exception ex) {
            Logger.getLogger(GUIItemMedicion.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Según la respuesta del servidor tomo decisiones 
        if (respuesta.equals("datos")) {
            //Eviamos los datos de la muestra al servidor
            JOptionPane.showMessageDialog(this, "Esperando "+respuesta,"Respuesta servidor",JOptionPane.INFORMATION_MESSAGE);
             this.jButtonMuestra.setVisible(true);    
        }else{
            JOptionPane.showMessageDialog(this, respuesta,"Respuesta servidor",JOptionPane.INFORMATION_MESSAGE);
        }  
    }   
    private void recolectarDatos(){
        String respuesta = "";
        if (servicioMedicion != null) {
            
            LataCerveza objCerveza = new LataCerveza();   
            try{
                if (this.jtxtAltura.getText() != null && this.jtxtAncho.getText() != "" && this.jtxtPeso.getText() != "" ) {
                    objCerveza.setAltura(Float.parseFloat(this.jtxtAltura.getText()));
                    objCerveza.setAncho(Float.parseFloat(this.jtxtAncho.getText()));
                    objCerveza.setPeso(Float.parseFloat(this.jtxtPeso.getText()));                          
                    respuesta = servicioMedicion.recoleccionDatos(objCerveza);
                    JOptionPane.showMessageDialog(this, respuesta,"Respuesta servidor",JOptionPane.INFORMATION_MESSAGE);
                    mostrarInfoResultado(respuesta);
                }
                
            }catch(Exception e){
                System.out.println("Verificar datos");
            }
           
            
        }
        
    }
    /**
     * Mostrar datos del resultado 
     * @param 
     */
    private void mostrarInfoResultado(String respuesta){
        Gson gson = new Gson();
        LataCerveza cerveza = gson.fromJson(respuesta, LataCerveza.class);
        cargarTabla(cerveza);
    }
    private void cargarTabla(LataCerveza cerveza){ 
        Object [] fila = new Object[5];
        fila[0] = cerveza.getAltura();
        fila[1] = cerveza.getAncho();
        fila[2] = cerveza.getPeso();
        fila[3] = cerveza.getEstado();
        fila[4] = cerveza.getTipo();
        //Depende del estado lo agrega a la tabla de optimos o defectuosos
        if (cerveza.getEstado().equals("optimo")) {
            System.out.println("entra al optimo");
            DefaultTableModel modelo =(DefaultTableModel) this.jTableInfoElementOptimos.getModel(); 
            modelo.addRow(fila); 
            this.jTableInfoElementOptimos.setModel(modelo);
        }else{
            DefaultTableModel modelo =(DefaultTableModel) this.jTableInfoElementDefectuosos.getModel(); 
            modelo.addRow(fila); 
            this.jTableInfoElementDefectuosos.setModel(modelo);
        }
    
    }
    
    /**
     * Accion del disparador 
     * @param evt 
     */
    private void jButtonIniciarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSimulacionActionPerformed
        
        // TODO add your handling code here:
         deteccionElemento();
    }//GEN-LAST:event_jButtonIniciarSimulacionActionPerformed

   
    
    private void jtxtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAlturaActionPerformed
    /**
    * Accion del boton muestra de datos 
    * @param evt 
    */
    private void jButtonMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMuestraActionPerformed
        // TODO add your handling code here:
        recolectarDatos();
    }//GEN-LAST:event_jButtonMuestraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSimulacion;
    private javax.swing.JButton jButtonMuestra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelAncho;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JScrollPane jScrollPaneInfoDatosOptimos;
    private javax.swing.JScrollPane jScrollPaneInfoElementDefectuosos;
    private javax.swing.JTable jTableInfoElementDefectuosos;
    private javax.swing.JTable jTableInfoElementOptimos;
    private javax.swing.JTextField jtxtAltura;
    private javax.swing.JTextField jtxtAncho;
    private javax.swing.JTextField jtxtPeso;
    // End of variables declaration//GEN-END:variables

}
