
package Vista;

import javax.swing.table.DefaultTableModel;

public class ConsPaciente extends javax.swing.JInternalFrame {

    public Controlador.GestorPacienteControl gestorPacientecontrol;
    private DefaultTableModel tabla;
    public ConsPaciente() {
        initComponents();
        gestorPacientecontrol = new Controlador.GestorPacienteControl(this);
        String titulosTabla[]={"Identificacion","Nombre","Apellido","Fecha Nacimiento","Genero"};
        tabla = new DefaultTableModel(null,titulosTabla);
        tbl_datos.setModel(tabla);
        btn_aceptar.addActionListener(gestorPacientecontrol);
    }
    
        public DefaultTableModel getTableModel(){
        
            return tabla;
            
        }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdb_nombres = new javax.swing.JRadioButton();
        rdb_apellidos = new javax.swing.JRadioButton();
        rdb_genero = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        rdb_identificacion = new javax.swing.JRadioButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Conslta Pacientes");

        rdb_nombres.setText("Nombres");
        rdb_nombres.setName("nombres"); // NOI18N

        rdb_apellidos.setText("Apellidos");
        rdb_apellidos.setName("apellidos"); // NOI18N
        rdb_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_apellidosActionPerformed(evt);
            }
        });

        rdb_genero.setText("Sexo");
        rdb_genero.setName("genero"); // NOI18N

        jLabel1.setText("Valor a Buscar:");

        txt_valor.setName("valor a buscar"); // NOI18N

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setName("AceptarBtn"); // NOI18N

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Apellidos", "Genero"
            }
        ));
        tbl_datos.setName("tabla"); // NOI18N
        jScrollPane1.setViewportView(tbl_datos);

        rdb_identificacion.setText("Identificacion");
        rdb_identificacion.setName("identificacion"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_aceptar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(rdb_identificacion)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_nombres)
                        .addGap(14, 14, 14)
                        .addComponent(rdb_apellidos)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_genero)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_identificacion)
                    .addComponent(rdb_nombres)
                    .addComponent(rdb_apellidos)
                    .addComponent(rdb_genero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_apellidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdb_apellidos;
    public javax.swing.JRadioButton rdb_genero;
    public javax.swing.JRadioButton rdb_identificacion;
    public javax.swing.JRadioButton rdb_nombres;
    public javax.swing.JTable tbl_datos;
    public javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
