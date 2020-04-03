/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.DatabaseClass;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.ColorTabla;

public class AssignEmployee extends javax.swing.JFrame {
    
    DatabaseClass con = new DatabaseClass();
    Connection reg = con.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    DefaultTableModel modeloE, modeloT, modeloZ, modeloHxE, modeloD;
    static DateFormat f = new SimpleDateFormat("yyyy/MM/dd");

    int band = 0;
    double metaVxE = 0;
    int zonaE = 0, zonaT = 0, idT = 0, mvTienda = 0, requeT = 0, idE = 0;
    String nombreE, razonS;
    int st1 = 0, st2 = 0, st3 = 0, st4 = 0;

    ArrayList<String> listaTienda;
    ArrayList<String> listaTrabajador;
    ArrayList<String> listaDias; // ESTA ES LA LISTA DE DIAS QUE SALE DEL RANGO QUE PONGAN 
    ArrayList<String> listaHorarioTienda;
    ArrayList<String> listaHorarios;
    ArrayList<String> listaComidas;

    public AssignEmployee() {
        initComponents();
       
        verEmpleado();
        verTienda();
        this.setExtendedState(MAXIMIZED_BOTH);
        jPanel1.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTienda = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblZonaxEmpleado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHorarioxEmpleado = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDias = new javax.swing.JTable();
        dtFechaInicio = new com.toedter.calendar.JDateChooser();
        dtFechaFin = new com.toedter.calendar.JDateChooser();
        btnAsignarPersonal = new javax.swing.JButton();
        lblIDTienda = new javax.swing.JLabel();
        lblNombreEmpleado = new javax.swing.JLabel();
        btnGuardarHQ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTienda);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblEmpleados);

        tblZonaxEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblZonaxEmpleado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblHorarioxEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblHorarioxEmpleado);

        tblDias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblDias);

        btnAsignarPersonal.setText("ASIGNAR");
        btnAsignarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarPersonalActionPerformed(evt);
            }
        });

        btnGuardarHQ.setText("GUARDAR HORARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblIDTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(dtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnAsignarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(btnGuardarHQ))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dtFechaInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(161, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAsignarPersonal)
                    .addComponent(dtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDTienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarHQ)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(dtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAsignarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarPersonalActionPerformed
        modeloD = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        if (dtFechaInicio.getDate() == null && dtFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese el rango de fechas");
        } else if (dtFechaInicio.getDate() == null || dtFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese el rango de ambas fechas");
        } else {
            asignarZona();

            try {
                ps = reg.prepareStatement("DELETE FROM ASIGNACION");
                int res = ps.executeUpdate();
                if (res > 0) {

                }
            } catch (Exception e) {
            }
            for (int i = 0; i < tblZonaxEmpleado.getRowCount(); i++) {
                int idTienda = Integer.parseInt(tblZonaxEmpleado.getValueAt(i, 0).toString());
                int idEmpleado = Integer.parseInt(tblZonaxEmpleado.getValueAt(i, 2).toString());

                try {
                    ps = reg.prepareStatement("INSERT INTO ASIGNACION (ID_TIENDA, ID_EMPLEADO) VALUES (?,?)");
                    ps.setString(1, String.valueOf(idTienda));
                    ps.setString(2, String.valueOf(idEmpleado));

                    int res = ps.executeUpdate();
                    if (res > 0) {
                        //System.out.println("Se guardo");

                    } else {
                        //System.out.println("No se guardo");
                    }
                } catch (Exception e) {
                    System.err.println(e.toString());
                }
            }
            
            llenarHorarioEmpleados();
            String fechaInicio = f.format(dtFechaInicio.getDate());
            String fechaFin = f.format(dtFechaFin.getDate());
            llenarListaFechas(fechaInicio, fechaFin);
            
            /*****************************************************************************************************/
            /*Creamos estas columas al modeloD*/
            modeloD.addColumn("DÍA");
            modeloD.addColumn("FECHA");
            modeloD.addColumn("EMPLEADO");
            modeloD.addColumn("ENTRADA");
            modeloD.addColumn("INICIO COMIDA");
            modeloD.addColumn("FIN COMIDA");
            modeloD.addColumn("SALIDA");
            modeloD.addColumn("ID TIENDA");
            tblDias.setModel(modeloD);

            btnAsignarPersonal.setEnabled(false);

            /*ACÁ MANDAMOS A EJECUTAR EL METODO OBTENERCLAVETIENDA, ESTE MÉTODO YA ES EL QUE HACE LOS HORARIOS
            DENTRO DE ESTE MÉTODO ESTAN INVOCADOS LOS MÉTODOS EMPLEADOSXTIENDA Y HORARIOQUINCENAL*/
            obtenerClaveTiendas();
            
            /*Recorremos los renglones de la tablaDias*/
            for(int i=0; i<tblDias.getRowCount(); i++){
                //Invocamos el metodo que guarda el horarioQuincenal
                guardarHorarioQuincenal(tblDias.getValueAt(i, 0).toString(),tblDias.getValueAt(i, 1).toString(),tblDias.getValueAt(i, 2).toString(),
                                            tblDias.getValueAt(i, 3).toString(),tblDias.getValueAt(i, 4).toString(),tblDias.getValueAt(i, 5).toString(),
                                            tblDias.getValueAt(i, 6).toString(),tblDias.getValueAt(i, 7).toString());
            }
            try {
                /*Acá borramos los renglones del modeloD*/
                modeloD.setRowCount(0);
                /*Hacemos consulta a la BD para obtener todos los registros de la tabla HORARIO_QUINCENAL ordenandolos por
                el id de la tienda, empleado y fecha, esto para que se puedan visualizar ordenadas las fechas del horario
                de cada empleado*/
                ps = reg.prepareStatement("SELECT * FROM HORARIO_QUINCENAL ORDER BY ID_TIENDA, EMPLEADO, FECHA");
                rs = ps.executeQuery();

                while (rs.next()) {
                    /*Al modeloD le añadimos los renglones con lo que traiga nuestra consulta*/
                    modeloD.addRow(new Object[]{rs.getString("DIA"),
                        rs.getString("FECHA"),
                        rs.getString("EMPLEADO"),
                        rs.getString("ENTRADA"),
                        rs.getString("INICIO_COMIDA"),
                        rs.getString("FIN_COMIDA"),
                        rs.getString("SALIDA"),
                        rs.getString("ID_TIENDA")});
                }
                //tblDias.setModel(modeloD);
            } catch (SQLException e) {
                System.err.println(e.toString());
            }
        }
    }//GEN-LAST:event_btnAsignarPersonalActionPerformed

    protected final void verEmpleado() {
        modeloE = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            ps = reg.prepareStatement("SELECT c.ID AS IDE, d.NOMBRE AS EMPLEADO, COUNT(CAPACITACION) AS TOTAL_CP, l.ZONA AS ZONA"
                    + " FROM CAPACITACION_EMPLEADO as c"
                    + " INNER JOIN datos_empleado as  d on d.id = c.id"
                    + " INNER JOIN laboral AS l ON l.ID = c.ID"
                    + " WHERE l.STATUS='ACTIVO'"
                    + " GROUP BY IDE ORDER BY TOTAL_CP DESC;");
            rs = ps.executeQuery();
            modeloE.setColumnIdentifiers(new Object[]{"ID_EMPLEADO", "EMPLEADO", "TOTAL CAPA", "ZONA"});

            while (rs.next()) {
                modeloE.addRow(new Object[]{rs.getString("IDE"),
                    rs.getString("EMPLEADO"),
                    rs.getString("TOTAL_CP"),
                    rs.getString("ZONA")});
            }
            tblEmpleados.setModel(modeloE);
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }
    
    protected final void verTienda() {
        modeloT = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            ps = reg.prepareStatement("SELECT T.CLAVE, T.RAZON_SOCIAL, TN.REQUERIMIENTO_PERSONAL, TN.META_VENTA, TN.ZONA\n"
                    + "FROM TIENDA AS T\n"
                    + "INNER JOIN tienda_nomina AS TN ON TN.ID_TIENDA_BASE = T.CLAVE ORDER BY TN.META_VENTA DESC");
            rs = ps.executeQuery();
            modeloT.setColumnIdentifiers(new Object[]{"CLAVE", "R_S", "REQUERIMIENTO", "MV", "ZONA"});
            while (rs.next()) {
                modeloT.addRow(new Object[]{rs.getString("CLAVE"),
                    rs.getString("RAZON_SOCIAL"),
                    rs.getString("REQUERIMIENTO_PERSONAL"),
                    rs.getString("META_VENTA"),
                    rs.getString("ZONA")});
            }
            tblTienda.setModel(modeloT);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    public void asignarZona() {
        modeloZ = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        int n_capacitacion = 0;
        modeloZ.setColumnIdentifiers(new Object[]{"ID_TIENDA", "META_VT", "ID_EMPLEADO", "EMPLEADO", "META_V_E"});
        try {
            do {
                if (tblEmpleados.getRowCount() == 0) {
                    band = 0;
                } else if (tblEmpleados.getRowCount() != 0) {
                    band = 1;

                    for (int i = 0; i < tblEmpleados.getRowCount(); i++) {
                        zonaE = Integer.parseInt(tblEmpleados.getValueAt(i, 3).toString());
                        n_capacitacion = Integer.parseInt(tblEmpleados.getValueAt(i, 2).toString());
                        idE = Integer.parseInt(tblEmpleados.getValueAt(i, 0).toString());
                        nombreE = tblEmpleados.getValueAt(i, 1).toString();
                        System.out.println("ZONA EMPLEADO " + zonaE + " NOMBRE " + nombreE + " CAPACITACIONES " + n_capacitacion);

                        for (int t = 0; t < tblTienda.getRowCount(); t++) {
                            zonaT = Integer.parseInt(tblTienda.getValueAt(t, 4).toString());

                            if (zonaE == zonaT) {
                                System.out.println("TIENDA" + tblTienda.getValueAt(t, 1).toString());
                                idT = Integer.parseInt(tblTienda.getValueAt(t, 0).toString());
                                razonS = tblTienda.getValueAt(t, 1).toString();
                                mvTienda = Integer.parseInt(tblTienda.getValueAt(t, 3).toString());
                                requeT = Integer.parseInt(tblTienda.getValueAt(t, 2).toString());
                                System.out.println("REQUERIMIENTO " + requeT);

                                switch (idT) {
                                    case 1:
                                        st1 = st1 + 1;
                                        asignarEmpleado(st1, requeT, mvTienda, idT, nombreE, i, idE);
                                        break;
                                    case 2:
                                        st2 = st2 + 1;
                                        asignarEmpleado(st2, requeT, mvTienda, idT, nombreE, i, idE);
                                        break;
                                    case 3:
                                        st3 = st3 + 1;
                                        asignarEmpleado(st3, requeT, mvTienda, idT, nombreE, i, idE);

                                        break;
                                    case 4:
                                        st4 = st4 + 1;
                                        asignarEmpleado(st4, requeT, mvTienda, idT, nombreE, i, idE);
                                        break;

                                }
                                band = 1;
                            } else if (zonaE != zonaT) {

                            }
                        }
                    }
                }

            } while (band == 0);

        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
    }

    protected void asignarEmpleado(int suma, int requerimiento, int metaVenta, int id, String nombre, int i, int idEmpleado) {
        if (suma <= requerimiento) {
            metaVxE = metaVenta / suma;
            modeloZ.addRow(new Object[]{
                id,
                metaVenta,
                idEmpleado,
                nombre,
                metaVxE});

            tblZonaxEmpleado.setModel(modeloZ);
            tblEmpleados.setValueAt(0, i, 3);

            for (int h = 0; h < tblZonaxEmpleado.getRowCount(); h++) {
                int idTH = Integer.parseInt(tblZonaxEmpleado.getValueAt(h, 0).toString());
                if (id == idTH) {
                    tblZonaxEmpleado.setValueAt(metaVxE, h, 4);
                }

            }
            zonaT = 0;
            zonaE = 0;
        } else {
            System.out.println("REBASA REQUERIMIENTO");
        }
    }

    public final void llenarHorarioEmpleados() {
        modeloHxE = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {

            ps = reg.prepareStatement("SELECT A.ID_TIENDA, E.ID, E.NOMBRE, E.APELLIDOS, H.HORA_E1, H.HORA_S1, H.HORA_E2, H.HORA_S2, H.HORA_E3, H.HORA_S3, H.HORA_E4, H.HORA_S4, H.DIA\n"
                    + "FROM horario_nomina AS H\n"
                    + "INNER JOIN datos_empleado AS E ON E.ID = H.ID_EMPLEADO\n"
                    + "INNER JOIN ASIGNACION AS A ON A.ID_EMPLEADO = E.ID ORDER BY A.ID_TIENDA");
            rs = ps.executeQuery();
            modeloHxE.setColumnIdentifiers(new Object[]{"TIENDA", "EMPLEADO", "DIA", "HORA 1", "SALIDA 1",
                "HORA 2", "SALIDA 2",
                "HORA 3", "SALIDA 3",
                "HORA 4", "SALIDA 4"});
            while (rs.next()) {
                modeloHxE.addRow(new Object[]{rs.getString("ID_TIENDA"),
                    rs.getString("NOMBRE") + " " + rs.getString("APELLIDOS"),
                    rs.getString("DIA"),
                    rs.getString("HORA_E1"),
                    rs.getString("HORA_S1"),
                    rs.getString("HORA_E2"),
                    rs.getString("HORA_S2"),
                    rs.getString("HORA_E3"),
                    rs.getString("HORA_S3"),
                    rs.getString("HORA_E4"),
                    rs.getString("HORA_S4")});
                tblHorarioxEmpleado.setDefaultRenderer(Object.class, new ColorTabla());
            }
            tblHorarioxEmpleado.setModel(modeloHxE);
            jPanel1.setVisible(false);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public List<Date> obtenerRangoFechas(Date fechaInicio, Date fechaFin) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(fechaInicio);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(fechaFin);

        List<Date> listaFechas = new ArrayList<Date>();

        while (!c1.after(c2)) {
            listaFechas.add(c1.getTime());
            c1.add(Calendar.DAY_OF_MONTH, 1);
        }
        return listaFechas;
    }

    public final void llenarListaFechas(String fechaInicio, String fechaFin) {
        // Creamos las fechas utilizando la clase Calendar (recomendado)
        String[] separadorInicio;
        int añoIni, mesIni, diaIni;
        separadorInicio = fechaInicio.split("/");
        añoIni = Integer.parseInt(separadorInicio[0]);
        mesIni = Integer.parseInt(separadorInicio[1]);
        diaIni = Integer.parseInt(separadorInicio[2]);

        Calendar c1 = Calendar.getInstance();
        c1.set(añoIni, mesIni - 1, diaIni);

        String[] separadorFin;
        int añoFin, mesFin, diaFin;
        separadorFin = fechaFin.split("/");
        añoFin = Integer.parseInt(separadorFin[0]);
        mesFin = Integer.parseInt(separadorFin[1]);
        diaFin = Integer.parseInt(separadorFin[2]);

        Calendar c2 = Calendar.getInstance();
        c2.set(añoFin, mesFin - 1, diaFin);

        // Obtenemos la lista de fechas utilizando el método que está líneas más abajo
        List<Date> listaEntreFechas = obtenerRangoFechas(c1.getTime(), c2.getTime());

        // Creamos el SimpleDateFormat con nuestro patrón deseado E yyyy-MM-dd
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd");

        listaDias = new ArrayList<>();
        for (Date date : listaEntreFechas) {
            listaDias.add(sdf.format(date));
        }
    }

        
    //DESDE ESTE MÉTODO COMENZAMOS A HACER EL CÓDIGO PARA ASIGNAR LOS HORARIOS A LOS EMPLEADOS
    protected final void obtenerClaveTiendas() {
        try {
            /*Hacemos una consulta para obtener la clave de las tiendas*/
            ps = reg.prepareStatement("SELECT CLAVE FROM tienda;");
            rs = ps.executeQuery();
            listaTienda = new ArrayList<>();
            while (rs.next()) {
                //A la listaTienda le establecemos el resultado de la consulta
                listaTienda.add(rs.getString("CLAVE"));

            }
            /*En un ciclo for recorremos listaTienda, donde creamos una variable listaTienda1 y le asignamos lo que tenga listaTienda*/
            for(String listaTienda1 : listaTienda){
                //Invocamos estos metodos pasandoles como parametros un entero que equivale a la clave de cada tienda
                empleadosXtienda(Integer.parseInt(listaTienda1));
                horarioQuincenal(Integer.parseInt(listaTienda1));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    /*ESTE MÉTODO SIRVE PARA CONSULTAR LOS EMPLEADOS QUE ESTÁN ASIGNADOS EN CADA TIENDA*/
    protected final void empleadosXtienda(int idTienda) {
        try {
            /*Creamos la consulta para obtener los empleados de cada tienda,
            pasandole como parametro en el where un entero que es la clave de la tienda*/
            ps = reg.prepareStatement("SELECT A.ID_TIENDA,E.ID,E.NOMBRE, E.APELLIDOS "
                    + "FROM datos_empleado AS E "
                    + "INNER JOIN ASIGNACION AS A ON A.ID_EMPLEADO = E.ID "
                    + "WHERE A.ID_TIENDA ='" + idTienda + "'");
            listaTrabajador = new ArrayList<>();
            rs = ps.executeQuery();
            
            while (rs.next()) {
                /*A listaTrabajador le asignamos el resultado de nuestra consulta*/
                listaTrabajador.add(rs.getString("ID_TIENDA") + "-" + rs.getString("NOMBRE") + " " + rs.getString("APELLIDOS") + "-" + rs.getString("E.ID"));

            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    /*EN ESTE MÉTODO YA ES DONDE COMENZAMOS A CREAR LOS HORARIOS*/
    public void horarioQuincenal(int idTienda) {
        //Le asginamos valores a la listaComidas
        listaComidas = new ArrayList<>();
        listaComidas.add("13:00:00-15:00:00");
        listaComidas.add("14:00:00-16:00:00");
        listaComidas.add("15:00:00-17:00:00");
        
        //Inicializamos listaHorarios que acá es donde se guardaran todos los horarios de los empleados
        listaHorarios = new ArrayList<>();
        
        try {
            /*Hacemos una consulta para obtener el horario x día de cada tienda, 
            pasandole como parametro un entero que equivale a la clave de la tienda*/
            ps = reg.prepareStatement("SELECT HORA_E1, HORA_S1, DIA FROM thorario_nomina WHERE ID_TIENDA ='" + idTienda + "'");

            listaHorarioTienda = new ArrayList<>();
            rs = ps.executeQuery();
            while (rs.next()) {
                //A listaHorarioTienda le establecemos el resultado de la consulta
                listaHorarioTienda.add(rs.getString("HORA_E1") + "-" + rs.getString("HORA_S1") + "-" + rs.getString("DIA"));
            }
            //Creamos un contador para la lista de listaComidas para ir corriendo las posiciones de la lista
            int cont=0;
            
            /*En un ciclo for recorremos la listaTrabajador, le asignamos a una variable listaTrabajador1
            lo que tenga listaTrabajador*/
            for (String listaTrabajador1 : listaTrabajador) {
                //Creamos un arreglo de cadenas para asignarle lo que contiene listaTrabajador1 partiendo las cadenas donde haya un "-"
                String[] empleado = listaTrabajador1.split("-");
                /*Obtenemos la clave de la tienda en la posición 0 y el nombre del empleado en la posición 1*/
                String tienda = empleado[0];
                String nombre = empleado[1];

                /*Recorremos la listaHorarioTienda, asignandole a la variable listaHorarioTienda1 lo que contenga
                listaHorarioTienda*/
                for (String listaHorarioTienda1 : listaHorarioTienda) {
                    //Creamos un arreglo de cadenas asignandole lo que tenga listaHorarioTienda1 partiendola por "-"
                    String[] listaHorario = listaHorarioTienda1.split("-");
                    //Obtenemos en variables la hora de entrada en posición 0, hora de salida en posición 1 y el diaTienda en posición 2
                    String horaEntrada = listaHorario[0];
                    String horaSalida = listaHorario[1];
                    String diaTienda = listaHorario[2];

                    /*Creamos una lista de arreglos llamada diaTienda 1*/
                    ArrayList<String> diaTienda1 = new ArrayList<>();
                    /*A la lista le añadimos lo que contenga la variable diaTienda (DOMINGO,LUNES,MARTES,ETC.)*/
                    diaTienda1.add(diaTienda);
                    //Creamos variable fecha
                    String fecha;
                    
                    /*En un ciclo for recorremos la lista diaTienda1, asignandole a una variable "dia" lo que contenga la lsita*/
                    for(String dia : diaTienda1){
                        /*En otro ciclo for recorremos la listaDias que es la que contiene
                        los días que hay entre el rango de las fechas que hayamos puesto*/
                        for (String listaDia : listaDias) {
                                /*A la variable fecha le asignamos lo que tenga la variable listaDia convirtiendolo en MAYUSCULAS
                                 y solo obteniendo las dos primeras letras (DO,LU,MA, ETC)*/
                                fecha = listaDia.toUpperCase().substring(0, 2);
                                    /*Comparamos que la variable dia obteniendo solo las 2 primeras letras sea igual
                                    que la variable fecha*/
                                    if (dia.substring(0, 2).equals(fecha)) {
                                        /*Si son iguales la listaHorarios le añadimos lo que tiene LISTADIA ("dom 2020-05-10" los rangos de fechas)
                                        el NOMBRE del empleado, su HORA DE ENTRADA, su INICIO DE COMIDA que esta en listaComidas en la posición que éste el contador
                                        solo obteniendo las primeras 8 letras,
                                        también su FIN DE COMIDA que igual lo obtenemos de lista comidas en la posición del contador obteniendo de la palabra 9 a la 17,
                                        su HORA DE SALIDA y la TIENDA a la que pertenece*/
                                        listaHorarios.add(listaDia + "--" + nombre + "--" + horaEntrada + "--" + listaComidas.get(cont).substring(0, 8) + "--" + listaComidas.get(cont).substring(9, 17) + "--" + horaSalida + "--" + tienda);

                                    }
                        }
                    }
                }
                /*Si el contador es igual a 2, 2 representa el tamaño del arreglo de la listaComidas*/
                if (cont == 2) {
                    /*Entonces a contador le establecemos -1*/
                    cont = -1;
                }
                /*Incrementamos contador*/
                cont++;
            }
            /*AHORA ACÁ VAMOS A PARTIR LO QUE TIENE LA LISTA HORARIOS, PARA OBTENER CADA POSICIÓN Y ASÍ AGREGARLA AL MODELOD PARA VISUALIZARLO EN UNA TABLA*/
           /*Recorremos la LISTAHORARIOS y a la variable listaHorario1 le establecemos lo que tiene LISTAHORARIOS*/
            for (String listaHorario1 : listaHorarios) {
                /*Creamos un arreglo de cadenas y le asignamos lo que tiene listaHorario1 partiendola por "-"*/
                String[] lista = listaHorario1.split("--");
                /*En variables iremos asignando los valores que hay en cada posición*/
                String fe = lista[0];
                String no = lista[1];
                String entrada = lista[2];
                String inicioComida = lista[3];
                String finComida = lista[4];
                String salida = lista[5];
                String iTienda = lista[6];

                //System.out.println("HORARIOS " + fe + " " + no + " " + entrada + " " + inicioComida + " " + finComida + " " + salida);
                /*Al modeloD le agregamos renglones estableciendole las variables, fe(DIA), fe(FECHA), no(NOMBRE), entrada, inicio comida, fin comida, salida, idTienda
                todo esto se va a estableces en la tablaDias (tblDias)*/
                modeloD.addRow(new Object[]{fe.toUpperCase().substring(0, 3), fe.substring(4, 14), no, entrada, inicioComida, finComida, salida, iTienda});
            }

            /*AHORA VAMOS A ASIGNAR EL DÍA DE DESCANSO EN LOS HORARIOS DEL EMPLEADO*/
            /*Recorremos los renglones que tiene la tablaHorarioxEmpleado*/
            for (int i = 0; i < tblHorarioxEmpleado.getRowCount(); i++) {
                /*Obtenemos el nombre del empleado que esta en la columna 1 en la posición i de la tblHorarioxEmpleado*/
                String nombreEmpleado = tblHorarioxEmpleado.getValueAt(i, 1).toString();
                
                /*Recorremos los renglones de la tablaDias*/
                for (int d = 0; d < tblDias.getRowCount(); d++) {
                    /*Obtenemos el nombre del empleado que esta en la columna 2 en la posición d de la tabla Dias
                    y el día que esta en la columna 0 en la posición d*/
                    String nombreE = tblDias.getValueAt(d, 2).toString();
                    String diaDescanso = tblDias.getValueAt(d, 0).toString();

                    /*Comparamos que la variable nombreE sea igual a la variable nombreEmpleado*/
                    if (nombreE.equals(nombreEmpleado)) {
                        /*Obtenemos la hora de entrada del empleado que está en la columa 3 en la posición i de la tabla horarioxEmpleado
                        y lo guardamos en la variable descanso*/
                        String descanso = tblHorarioxEmpleado.getValueAt(i, 3).toString();
                        /*Verificamos que la variable descanso sea igual a 00:00:00*/
                        if (descanso.equals("00:00:00")) {
                            /*Si se cumple la condición sacamos el día de descanso del empleado que está en la columna 2 en la posición i de
                            la tabla horarioxEmpleado*/
                            String diaSemana = tblHorarioxEmpleado.getValueAt(i, 2).toString();

                            /*Verificamos que la variable diaSemana obteniendo las dos primeras letras (LU,MA, ETC)
                            sea igual a la variable diaDescanso convertida a mayusculas y también obteniendo solo las 2 primeras letras*/
                            if (diaSemana.substring(0, 2).equals(diaDescanso.toUpperCase().substring(0, 2))) {
                                /*Si son iguales entonces en la tablaDias estableceremos 00:00:00 en las columnas 3,4,5 y 6
                                en todas las posiciones donde sean iguales*/
                                tblDias.setValueAt("00:00:00", d, 3);
                                tblDias.setValueAt("00:00:00", d, 4);
                                tblDias.setValueAt("00:00:00", d, 5);
                                tblDias.setValueAt("00:00:00", d, 6);
                                //Invocamos a la clase ColorTabla para que colore de amarillo en la tabla días todas las coincidencias de 00:00:00
                                tblDias.setDefaultRenderer(Object.class, new ColorTabla());
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
        }
    }

    /*ESTE METODO SIRVE PARA GUARDAR EL HORARIO QUINCENAL QUE ESTA EN LA TABLA DIAS, PARA ESO DEBES TENER UNA TABLA EN MYSQL QUE SE LLAME HORARIO_QUINCENAL*/
    public final void guardarHorarioQuincenal(String dia,String fecha, String nombre, String entrada, String inicioComida, String finComida, String salida, String tienda){
        try {
                    ps = reg.prepareCall("INSERT INTO HORARIO_QUINCENAL (DIA,FECHA,EMPLEADO,ENTRADA,INICIO_COMIDA,FIN_COMIDA,SALIDA,ID_TIENDA) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setString(1, dia);
                    ps.setString(2, fecha);
                    ps.setString(3, nombre);
                    ps.setString(4, entrada);
                    ps.setString(5, inicioComida);
                    ps.setString(6, finComida);
                    ps.setString(7, salida);
                    ps.setString(8, tienda);
                    
                    int res = ps.executeUpdate();
                    if (res > 0) {

                        System.out.println("Se guardo el registro");
                    } else {
                        System.err.println("Error al guardar el registro");
                    }
                } catch (SQLException | HeadlessException e) {
                    System.err.println(e.toString());
                }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarPersonal;
    private javax.swing.JButton btnGuardarHQ;
    private com.toedter.calendar.JDateChooser dtFechaFin;
    private com.toedter.calendar.JDateChooser dtFechaInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblIDTienda;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JTable tblDias;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblHorarioxEmpleado;
    private javax.swing.JTable tblTienda;
    private javax.swing.JTable tblZonaxEmpleado;
    // End of variables declaration//GEN-END:variables
}
