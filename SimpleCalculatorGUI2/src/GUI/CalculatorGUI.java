/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Emilio
 */
public class CalculatorGUI extends javax.swing.JFrame
{

    int status;
    String unit;
    public CalculatorGUI()
    {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAmount1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAmount2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rtoPositive = new javax.swing.JRadioButton();
        rtoNegative = new javax.swing.JRadioButton();
        chkDolar = new javax.swing.JCheckBox();
        chkPound = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnSubstraction = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnAddiction = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 5, true));
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("SIMPLE CALCULATOR (+-*/)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 5, true), "INPUT &  OUTPUT.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(0, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Amount 1: ");

        txtAmount1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Amount 2: ");

        txtAmount2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        txtAmount2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtAmount2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Result: ");

        txtResult.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(txtAmount2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAmount1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 5, true), "CHOICES.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(0, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Result Unit: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Bonus Is:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Bonus:");

        rtoPositive.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rtoPositive);
        rtoPositive.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        rtoPositive.setForeground(new java.awt.Color(0, 255, 255));
        rtoPositive.setText("Positive");
        rtoPositive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rtoPositiveActionPerformed(evt);
            }
        });

        rtoNegative.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rtoNegative);
        rtoNegative.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        rtoNegative.setForeground(new java.awt.Color(0, 255, 255));
        rtoNegative.setText("Negative");
        rtoNegative.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rtoNegativeActionPerformed(evt);
            }
        });

        chkDolar.setBackground(new java.awt.Color(255, 0, 0));
        chkDolar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        chkDolar.setForeground(new java.awt.Color(0, 255, 255));
        chkDolar.setText("$");
        chkDolar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkDolarActionPerformed(evt);
            }
        });

        chkPound.setBackground(new java.awt.Color(255, 0, 0));
        chkPound.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        chkPound.setForeground(new java.awt.Color(0, 255, 255));
        chkPound.setText("£");
        chkPound.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkPoundActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rtoPositive)
                                    .addComponent(chkDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPound, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rtoNegative)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rtoPositive)
                    .addComponent(rtoNegative))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chkDolar)
                    .addComponent(chkPound))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 5, true), "OPERATIONS.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(0, 255, 255))); // NOI18N

        btnSubstraction.setBackground(new java.awt.Color(255, 0, 0));
        btnSubstraction.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSubstraction.setForeground(new java.awt.Color(0, 255, 255));
        btnSubstraction.setText("Substraction");
        btnSubstraction.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubstractionActionPerformed(evt);
            }
        });

        btnMultiplication.setBackground(new java.awt.Color(255, 0, 0));
        btnMultiplication.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnMultiplication.setForeground(new java.awt.Color(0, 255, 255));
        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnAddiction.setBackground(new java.awt.Color(255, 0, 0));
        btnAddiction.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnAddiction.setForeground(new java.awt.Color(0, 255, 255));
        btnAddiction.setText("Addiction");
        btnAddiction.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddictionActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(255, 0, 0));
        btnDivision.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 255, 255));
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDivisionActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnAddiction)
                .addGap(30, 30, 30)
                .addComponent(btnSubstraction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnMultiplication)
                .addGap(29, 29, 29)
                .addComponent(btnDivision)
                .addGap(36, 36, 36)
                .addComponent(btnClear)
                .addGap(45, 45, 45)
                .addComponent(btnExit)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddiction)
                    .addComponent(btnSubstraction)
                    .addComponent(btnMultiplication)
                    .addComponent(btnDivision)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmount2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtAmount2ActionPerformed
    {//GEN-HEADEREND:event_txtAmount2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmount2ActionPerformed

    private void rtoPositiveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rtoPositiveActionPerformed
    {//GEN-HEADEREND:event_rtoPositiveActionPerformed
        status = 1;
    }//GEN-LAST:event_rtoPositiveActionPerformed

    private void rtoNegativeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rtoNegativeActionPerformed
    {//GEN-HEADEREND:event_rtoNegativeActionPerformed
        status = -1;
    }//GEN-LAST:event_rtoNegativeActionPerformed

    private void chkDolarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkDolarActionPerformed
    {//GEN-HEADEREND:event_chkDolarActionPerformed
       
         if (chkDolar.isSelected())
        {
            chkPound.setSelected(false);
        }
        
        unit = "$";
    }//GEN-LAST:event_chkDolarActionPerformed

    private void chkPoundActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkPoundActionPerformed
    {//GEN-HEADEREND:event_chkPoundActionPerformed
       
        
         if (chkPound.isSelected())
        {
            chkDolar.setSelected(false);
        }
        
        unit = "£";
    }//GEN-LAST:event_chkPoundActionPerformed

    private void btnAddictionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddictionActionPerformed
    {//GEN-HEADEREND:event_btnAddictionActionPerformed
        double amount1 = Double.parseDouble(txtAmount1.getText());
        double amount2 = Double.parseDouble(txtAmount2.getText());
        double sum = (amount1 + amount2);
        
        selectCheckBox();
             
       double result = sum + status * Double.parseDouble(jComboBox1.getSelectedItem().toString());
       txtResult.setText(String.valueOf(result)  +  unit);
        
        
        
    }//GEN-LAST:event_btnAddictionActionPerformed

    private void btnSubstractionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubstractionActionPerformed
    {//GEN-HEADEREND:event_btnSubstractionActionPerformed
       double amount1 = Double.parseDouble(txtAmount1.getText());
        double amount2 = Double.parseDouble(txtAmount2.getText());
        double sum = (amount1 - amount2);
       double result = sum + status * Double.parseDouble(jComboBox1.getSelectedItem().toString());
       txtResult.setText(String.valueOf(result)  +  unit);
    }//GEN-LAST:event_btnSubstractionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicationActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicationActionPerformed
       double amount1 = Double.parseDouble(txtAmount1.getText());
        double amount2 = Double.parseDouble(txtAmount2.getText());
        double sum = (amount1 * amount2);
        
        
        
       double result = sum + status * Double.parseDouble(jComboBox1.getSelectedItem().toString());
       txtResult.setText(String.valueOf(result)  +  unit);
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDivisionActionPerformed
    {//GEN-HEADEREND:event_btnDivisionActionPerformed
       double amount1 = Double.parseDouble(txtAmount1.getText());
        double amount2 = Double.parseDouble(txtAmount2.getText());
        double sum = (amount1 / amount2);
       double result = sum + status * Double.parseDouble(jComboBox1.getSelectedItem().toString());
       txtResult.setText(String.valueOf(result)  +  unit);
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
                txtAmount1.setText("");
                txtAmount2.setText("");
                txtResult.setText("");
                buttonGroup1.clearSelection();
               chkDolar.setSelected(false);
               chkPound.setSelected(false);
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void selectCheckBox()
    {
        
      
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        }
//        catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//                new CalculatorGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddiction;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnSubstraction;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkDolar;
    private javax.swing.JCheckBox chkPound;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton rtoNegative;
    private javax.swing.JRadioButton rtoPositive;
    private javax.swing.JTextField txtAmount1;
    private javax.swing.JTextField txtAmount2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

  

    
}
