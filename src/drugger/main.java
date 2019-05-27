
package drugger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {
       
        Tree treelist=new Tree();
        Node returnNode;
        DefaultTableModel model1;
        DefaultTableModel model2;
        DefaultTableModel model3;
        DefaultTableModel model4;
        
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
        adddrugpanel.show();
        tabledatapanel.show();
        updatedeletepanel.hide();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adddrugpanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codeadd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nameadd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        typeadd = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        effectadd = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        reset1 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        updatedelete = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        tabledatapanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inorder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        descendingorder = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        preorder = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        postorder = new javax.swing.JTable();
        updatedeletepanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        insertcode = new javax.swing.JTextField();
        get = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        namedat = new javax.swing.JTextField();
        typedat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        effectdat = new javax.swing.JTextArea();
        nameupdate = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        effectupdate = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        typeupdate = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drug Information Management");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adddrugpanel.setBackground(new java.awt.Color(204, 0, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DRUG INFO MANAGEMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CODE");

        codeadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codeadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeaddActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAME");

        nameadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TYPE");

        typeadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typeadd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depressant", "Hallucinogen", "Painkiller", "Performance Enhancer", "Stimulant" }));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EFFECT");

        effectadd.setColumns(20);
        effectadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        effectadd.setLineWrap(true);
        effectadd.setRows(5);
        jScrollPane2.setViewportView(effectadd);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        reset1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset1.setText("RESET");
        reset1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setText("ADD");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        updatedelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatedelete.setText("UPDATE / DELETE");
        updatedelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatedelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(reset1)
                .addGap(18, 18, 18)
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(updatedelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset1)
                    .addComponent(add)
                    .addComponent(updatedelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("*CODE CAN ONLY BE USED ONCE / NUMBER*");

        javax.swing.GroupLayout adddrugpanelLayout = new javax.swing.GroupLayout(adddrugpanel);
        adddrugpanel.setLayout(adddrugpanelLayout);
        adddrugpanelLayout.setHorizontalGroup(
            adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adddrugpanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(62, 62, 62)
                .addGroup(adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(typeadd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameadd)
                    .addComponent(codeadd, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        adddrugpanelLayout.setVerticalGroup(
            adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adddrugpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codeadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adddrugpanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typeadd)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adddrugpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        getContentPane().add(adddrugpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 500));

        tabledatapanel.setBackground(new java.awt.Color(255, 255, 255));

        inorder.setBackground(new java.awt.Color(153, 255, 255));
        inorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "NAME", "TYPE", "EFFECT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inorder.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(inorder);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("IN ORDER");

        descendingorder.setBackground(new java.awt.Color(255, 153, 255));
        descendingorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "NAME", "TYPE", "EFFECT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        descendingorder.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(descendingorder);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DESCENDING ORDER");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PRE ORDER");

        preorder.setBackground(new java.awt.Color(255, 255, 153));
        preorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "NAME", "TYPE", "EFFECT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        preorder.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(preorder);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("POST ORDER");

        postorder.setBackground(new java.awt.Color(153, 255, 153));
        postorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "NAME", "TYPE", "EFFECT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        postorder.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(postorder);

        javax.swing.GroupLayout tabledatapanelLayout = new javax.swing.GroupLayout(tabledatapanel);
        tabledatapanel.setLayout(tabledatapanelLayout);
        tabledatapanelLayout.setHorizontalGroup(
            tabledatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabledatapanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(tabledatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        tabledatapanelLayout.setVerticalGroup(
            tabledatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabledatapanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(tabledatapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 520, 500));

        updatedeletepanel.setBackground(new java.awt.Color(204, 0, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("UPDATE / DELETE DATA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enter drug code to get data");

        insertcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        get.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        get.setText("GET");
        get.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Data from table");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("New data");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NAME");

        namedat.setEditable(false);
        namedat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        typedat.setEditable(false);
        typedat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TYPE");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("EFFECT");

        effectdat.setEditable(false);
        effectdat.setColumns(20);
        effectdat.setLineWrap(true);
        effectdat.setRows(4);
        jScrollPane3.setViewportView(effectdat);

        nameupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        effectupdate.setColumns(20);
        effectupdate.setLineWrap(true);
        effectupdate.setRows(4);
        jScrollPane4.setViewportView(effectupdate);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("BACK");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        reset2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset2.setText("RESET");
        reset2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(reset2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(43, 43, 43))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(back)
                    .addComponent(reset2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        typeupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typeupdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depressant", "Hallucinogen", "Painkiller", "Performance Enhancer", "Stimulant" }));

        javax.swing.GroupLayout updatedeletepanelLayout = new javax.swing.GroupLayout(updatedeletepanel);
        updatedeletepanel.setLayout(updatedeletepanelLayout);
        updatedeletepanelLayout.setHorizontalGroup(
            updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(updatedeletepanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatedeletepanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatedeletepanelLayout.createSequentialGroup()
                        .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(updatedeletepanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatedeletepanelLayout.createSequentialGroup()
                                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(typedat, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(namedat))
                                .addGap(24, 24, 24)
                                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameupdate)
                                    .addComponent(typeupdate, 0, 1, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatedeletepanelLayout.createSequentialGroup()
                                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatedeletepanelLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel14))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatedeletepanelLayout.createSequentialGroup()
                                        .addComponent(insertcode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(get)))
                                .addGap(0, 90, Short.MAX_VALUE)))
                        .addGap(42, 42, 42))))
        );
        updatedeletepanelLayout.setVerticalGroup(
            updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatedeletepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(get, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertcode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namedat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(typedat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatedeletepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(updatedeletepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getActionPerformed
        
        int thiscode=Integer.parseInt(insertcode.getText());
        Node returneditem=treelist.find(thiscode);
        drug thisone=(drug)returneditem.getObj();
        String name=thisone.getName();
        String type=thisone.getType();
        String effect=thisone.getEffect();
        namedat.setText(name);
        typedat.setText(type);
        effectdat.setText(effect);
        
    }//GEN-LAST:event_getActionPerformed

    private void updatedeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedeleteActionPerformed
        adddrugpanel.hide();
        updatedeletepanel.show();
    }//GEN-LAST:event_updatedeleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        adddrugpanel.show();
        updatedeletepanel.hide();
      
    }//GEN-LAST:event_backActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        insertcode.setText(null);
        namedat.setText(null);
        typedat.setText(null);
        effectdat.setText(null);
        nameupdate.setText(null);
        effectupdate.setText(null);
    }//GEN-LAST:event_reset2ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        codeadd.setText(null);
        nameadd.setText(null);
        effectadd.setText(null);
    }//GEN-LAST:event_reset1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        int code;
        String name,effect,type;
        code = Integer.parseInt(codeadd.getText());
        name = nameadd.getText();
        type = (String) typeadd.getSelectedItem();
        effect = effectadd.getText();
        
        drug newDrug=null;
        
        newDrug=new drug(code,name,type,effect);
        returnNode=treelist.insert(newDrug);
        
        
        model1=(DefaultTableModel)inorder.getModel();
        treelist.removeRow(model1);
        treelist.inorder(returnNode,model1);
        model2=(DefaultTableModel)descendingorder.getModel();
        treelist.removeRow(model2);
        treelist.descending(returnNode,model2);
        model3=(DefaultTableModel)preorder.getModel();
        treelist.removeRow(model3);
        treelist.preorder(returnNode,model3);
        model4=(DefaultTableModel)postorder.getModel();
        treelist.removeRow(model4);
        treelist.postorder(returnNode,model4);      
 
    }//GEN-LAST:event_addActionPerformed

    private void codeaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeaddActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int updatecode=Integer.parseInt(insertcode.getText());
        String changename=nameupdate.getText();
        String changetype=(String)typeupdate.getSelectedItem();
        String changeeffect=effectupdate.getText();
        
        treelist.update(updatecode,changename,changetype,changeeffect); 
        
        model1=(DefaultTableModel)inorder.getModel();
        treelist.removeRow(model1);
        treelist.inorder(returnNode,model1);
        model2=(DefaultTableModel)descendingorder.getModel();
        treelist.removeRow(model2);
        treelist.descending(returnNode,model2);
        model3=(DefaultTableModel)preorder.getModel();
        treelist.removeRow(model3);
        treelist.preorder(returnNode,model3);
        model4=(DefaultTableModel)postorder.getModel();
        treelist.removeRow(model4);
        treelist.postorder(returnNode,model4);  
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int delCode=Integer.parseInt(insertcode.getText());
        treelist.deletecode(delCode,returnNode);
        
        model1=(DefaultTableModel)inorder.getModel();
        treelist.removeRow(model1);
        treelist.inorder(returnNode,model1);
        model2=(DefaultTableModel)descendingorder.getModel();
        treelist.removeRow(model2);
        treelist.descending(returnNode,model2);
        model3=(DefaultTableModel)preorder.getModel();
        treelist.removeRow(model3);
        treelist.preorder(returnNode,model3);
        model4=(DefaultTableModel)postorder.getModel();
        treelist.removeRow(model4);
        treelist.postorder(returnNode,model4); 

    }//GEN-LAST:event_deleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel adddrugpanel;
    private javax.swing.JButton back;
    private javax.swing.JTextField codeadd;
    private javax.swing.JButton delete;
    private javax.swing.JTable descendingorder;
    private javax.swing.JTextArea effectadd;
    private javax.swing.JTextArea effectdat;
    private javax.swing.JTextArea effectupdate;
    private javax.swing.JButton get;
    private javax.swing.JTable inorder;
    private javax.swing.JTextField insertcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField nameadd;
    private javax.swing.JTextField namedat;
    private javax.swing.JTextField nameupdate;
    private javax.swing.JTable postorder;
    private javax.swing.JTable preorder;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    private javax.swing.JPanel tabledatapanel;
    private javax.swing.JComboBox<String> typeadd;
    private javax.swing.JTextField typedat;
    private javax.swing.JComboBox<String> typeupdate;
    private javax.swing.JButton update;
    private javax.swing.JButton updatedelete;
    private javax.swing.JPanel updatedeletepanel;
    // End of variables declaration//GEN-END:variables
}
