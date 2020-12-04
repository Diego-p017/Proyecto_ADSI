
package Vista;

/**
 * @author AustiinTellez
 */
public class RegPaciente extends javax.swing.JInternalFrame {

    private Controlador.PacienteControl pacienteControlador;
    public RegPaciente() {
        initComponents();
        pacienteControlador = new Controlador.PacienteControl(this);
        BtnRegistrar.addActionListener(pacienteControlador);
        BtnNuevo.addActionListener(pacienteControlador);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JTextField();
        RdbM = new javax.swing.JRadioButton();
        DbdFechaNaci = new com.toedter.calendar.JDateChooser();
        RdbF = new javax.swing.JRadioButton();
        BtnRegistrar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro Pacientes");

        jLabel1.setText("Identificación:");
        jLabel1.setToolTipText("text");
        jLabel1.setName(""); // NOI18N

        BtnNuevo.setText("Nuevo");

        jLabel2.setText("Nombres:");
        jLabel2.setToolTipText("text");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Fecha de Nacimiento:");

        jLabel5.setText("Sexo:");

        TxtID.setToolTipText("");
        TxtID.setName("identificacion"); // NOI18N

        TxtNombre.setName("nombres"); // NOI18N

        TxtApellidos.setName("apellidos"); // NOI18N

        RdbM.setText("Masculino");
        RdbM.setToolTipText("");
        RdbM.setName("Masculino"); // NOI18N
        RdbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdbMActionPerformed(evt);
            }
        });

        DbdFechaNaci.setDateFormatString("yyyy/MM/dd");
        DbdFechaNaci.setName("fecha nacimiento"); // NOI18N

        RdbF.setText("Femenino");
        RdbF.setName("Femenino"); // NOI18N

        BtnRegistrar.setText("Registrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(RdbM)
                                .addGap(18, 18, 18)
                                .addComponent(RdbF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnNuevo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtID, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(TxtNombre)
                                    .addComponent(TxtApellidos)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(DbdFechaNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(DbdFechaNaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RdbM)
                    .addComponent(RdbF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevo)
                    .addComponent(BtnRegistrar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RdbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdbMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdbMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnNuevo;
    public javax.swing.JButton BtnRegistrar;
    public com.toedter.calendar.JDateChooser DbdFechaNaci;
    public javax.swing.JRadioButton RdbF;
    public javax.swing.JRadioButton RdbM;
    public javax.swing.JTextField TxtApellidos;
    public javax.swing.JTextField TxtID;
    public javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
