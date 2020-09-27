package Patient_Registration;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import LogIn.LoginForm;
import Reception.Receptionist_page;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author ADMIN
 */
public class Patient_registrationFinal extends javax.swing.JFrame {

   
   Connection con = null;
    PreparedStatement pat = null;
    ResultSet rs = null;
    
    public Patient_registrationFinal() {
        initComponents();
         setSize(1370,750);
       // setLocation(450,200);
        setResizable(false);
        showTableData(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        email1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        Pid = new javax.swing.JTextField();
        patientId = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        Fullname = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Contactno = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Note = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        age = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        note = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Viewfield = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(email1);
        email1.setBounds(90, 370, 150, 20);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 102, 0));
        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("HAPPY SMILE DENTAL CLINIC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 70);
        jPanel1.add(Pid);
        Pid.setBounds(90, 130, 160, 22);

        patientId.setBackground(new java.awt.Color(0, 102, 0));
        patientId.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        patientId.setText("Patient Id");
        jPanel1.add(patientId);
        patientId.setBounds(10, 130, 70, 17);

        fullname.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        fullname.setText("Full name");
        jPanel1.add(fullname);
        fullname.setBounds(290, 130, 60, 17);

        Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameActionPerformed(evt);
            }
        });
        jPanel1.add(Fullname);
        Fullname.setBounds(390, 130, 160, 22);

        Address.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Address.setText("Address");
        jPanel1.add(Address);
        Address.setBounds(10, 200, 80, 17);
        jPanel1.add(address);
        address.setBounds(90, 180, 160, 50);

        gender.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        gender.setText("Gender");
        jPanel1.add(gender);
        gender.setBounds(290, 190, 70, 17);

        Age.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Age.setText("Age");
        jPanel1.add(Age);
        Age.setBounds(10, 270, 41, 17);

        Contactno.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Contactno.setText("Contact No");
        jPanel1.add(Contactno);
        Contactno.setBounds(290, 270, 70, 17);

        Email.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Email.setText("Email");
        jPanel1.add(Email);
        Email.setBounds(10, 340, 29, 17);

        Note.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Note.setText("Note");
        jPanel1.add(Note);
        Note.setBounds(290, 350, 40, 17);

        buttonGroup1.add(male);
        male.setText("Male");
        male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maleMouseClicked(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(380, 190, 55, 25);

        buttonGroup1.add(female);
        female.setText("Female");
        female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femaleMouseClicked(evt);
            }
        });
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(480, 190, 71, 25);

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(90, 270, 160, 22);

        contactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactnoKeyTyped(evt);
            }
        });
        jPanel1.add(contactno);
        contactno.setBounds(390, 270, 160, 22);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(90, 340, 160, 22);
        jPanel1.add(note);
        note.setBounds(390, 330, 160, 80);

        ADD.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        ADD.setText("ADD");
        ADD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD);
        ADD.setBounds(20, 490, 130, 40);

        DELETE.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE);
        DELETE.setBounds(20, 550, 280, 40);

        UPDATE.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE);
        UPDATE.setBounds(170, 490, 130, 40);

        RESET.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        RESET.setText("RESET");
        RESET.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        jPanel1.add(RESET);
        RESET.setBounds(370, 550, 130, 40);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(102, 255, 102));
        jTable1.setSelectionBackground(new java.awt.Color(51, 255, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(630, 180, 660, 160);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("PATIENT REGISTRATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 80, 380, 40);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(630, 560, 130, 40);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jButton2.setText("PRINT");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton2);
        jButton2.setBounds(1160, 560, 130, 40);

        search.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 51));
        search.setText("SEARCH");
        search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(1050, 130, 49, 23);
        jPanel1.add(Search);
        Search.setBounds(880, 130, 130, 22);

        jComboBox1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "NAME" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(760, 130, 80, 27);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel6.setText("SEARCH BY");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(640, 130, 120, 30);

        jButton3.setText("LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1210, 70, 160, 25);

        jButton5.setText("CONFIRM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(370, 490, 130, 40);

        Viewfield.setColumns(20);
        Viewfield.setRows(5);
        jScrollPane2.setViewportView(Viewfield);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(630, 360, 660, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 70, 650, 680);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1300, 70, 70, 680);

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 70, 80, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 70, 650, 680);

        jButton6.setText("<BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(0, 0, 71, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1388, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullnameActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
      
         if(fullname.getText().isEmpty()||address.getText().isEmpty()||age.getText().isEmpty()||contactno.getText().isEmpty()||email.getText().isEmpty()||note.getText().isEmpty()||buttonGroup1.isSelected(null)){
               JOptionPane.showMessageDialog(null, "Fields cannot be Empty");
         }
        
              else{
        
        try{    
        String sql = "INSERT INTO patient_registration( Name, Address, Gender, Age, ContactNo, Email, Note)" +""
                + "VALUES (?,?,?,?,?,?,?)";
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           pat = con.prepareStatement(sql);
            pat.setString(1,Fullname.getText());
            pat.setString(2,address.getText());
            pat.setString(3,Gender);
             pat.setString(4,age.getText());
              pat.setString(5,contactno.getText());
              pat.setString(6,email.getText());
              pat.setString(7,note.getText());
             
        
                   pat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Inserted Successfully");
                   // otp...............................................................................................................
                             

                   // otp...............................................................................................................
        }
        catch(SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
        
    }
        showTableData();    
         }                                   
    }//GEN-LAST:event_ADDActionPerformed

    private void maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maleMouseClicked
        Gender = "Male";
    }//GEN-LAST:event_maleMouseClicked

    private void femaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femaleMouseClicked
        Gender = "Female";
    }//GEN-LAST:event_femaleMouseClicked

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed

         if(Pid.getText().isEmpty()){
            
             JOptionPane.showMessageDialog(null, "Enter Pid to Delete ");
        }       
         else{
        
        int YesOrNo =  JOptionPane.showConfirmDialog(null,"do you want to Delete?","",JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
           
        try{ 
            
        
        String sql = "DELETE FROM patient_registration WHERE Pid = ? ";
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           pat = con.prepareStatement(sql);
            pat.setString(1,Pid.getText());
           
                   pat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Deleted Successfully");
        }
        catch(SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
        
    }
        }   
                                       
    }
         showTableData();
    }//GEN-LAST:event_DELETEActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
          
         if(fullname.getText().isEmpty()||address.getText().isEmpty()||age.getText().isEmpty()||contactno.getText().isEmpty()||email.getText().isEmpty()||note.getText().isEmpty()||buttonGroup1.isSelected(null)){
               JOptionPane.showMessageDialog(null, "Fields cannot be Empty");
         }
        
         else{
         int YesOrNo =  JOptionPane.showConfirmDialog(null,"do you want to Update?","Update",JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
        
        try{    
        String sql = "UPDATE patient_registration SET Name=?,Address=?,Gender=?,Age=?,ContactNo=?,Email=?,Note=? WHERE Pid = ?";
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           pat = con.prepareStatement(sql);
             pat.setString(8,Pid.getText());
            pat.setString(1,Fullname.getText());
            pat.setString(2,address.getText());
            pat.setString(3,Gender);
             pat.setString(4,age.getText());
              pat.setString(5,contactno.getText());
              pat.setString(6,email.getText());
              pat.setString(7,note.getText());
             
        
                   pat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Updated Successfully");
        }
        catch(SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
        
    }
                       
        
         showTableData();
                       }
                       
                       }
                                         
    }//GEN-LAST:event_UPDATEActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        clearFeild();
    }//GEN-LAST:event_RESETActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          int i = jTable1.getSelectedRow();
       TableModel model = jTable1.getModel();
      
       fullname.setText(model.getValueAt(i,1).toString());
        address.setText(model.getValueAt(i,2).toString()); 
       String gender = model.getValueAt(i,3).toString();
            if(gender.equals("Male")){
                male.setSelected(true);
            }
            else{
            female.setSelected(true);
            }
        age.setText(model.getValueAt(i,4).toString()); 
        contactno.setText(model.getValueAt(i,5).toString()); 
        email.setText(model.getValueAt(i,6).toString()); 
        note.setText(model.getValueAt(i,7).toString()); 
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        Viewfield.setText("*******************************************PATIENT REGISTRATION***************************************\n");
        Viewfield.setText(Viewfield.getText()+"Patient ID : " + model.getValueAt(i, 0).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Patient Name : " + model.getValueAt(i, 1).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Address : " + model.getValueAt(i, 2).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Gender : " + model.getValueAt(i, 3).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Age : " + model.getValueAt(i, 4).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Contact No : "  + model.getValueAt(i, 5).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Email : " + model.getValueAt(i, 6).toString()+"\n");
     
        
        }catch(Exception ex){
            
        }
                  
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        Object sel1 = jComboBox1.getSelectedItem();
        String selitem = sel1.toString();

        if("ID" == selitem){
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
                String sql2 = "SELECT * FROM patient_registration WHERE Pid = ?";
                pat = con.prepareStatement(sql2);
                pat.setString(1,Search.getText());
                rs=pat.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                if(jTable1.getModel().getRowCount()<=0)
                JOptionPane.showMessageDialog(null,"Please enter the correct ID");
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if("NAME" == selitem){
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
                String sql2 = "SELECT * FROM patient_history WHERE name LIKE '"+Search.getText()+"%'";
                pat = con.prepareStatement(sql2);
                rs=pat.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                if(jTable1.getModel().getRowCount()<=0)
                JOptionPane.showMessageDialog(null,"Please Enter the correct Name");
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO SIGN OUT?", "SIGN OUT", JOptionPane.YES_NO_OPTION);
        if(op==0){
            LoginForm l1 = new LoginForm();
            l1.setVisible(true);
            this.setVisible(false);}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void contactnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnoKeyTyped
        char in = evt.getKeyChar();
        System.out.println(in);
        if(Character.isLetter(in)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Contact number should be numeric value");

        }
    }//GEN-LAST:event_contactnoKeyTyped

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
       char in = evt.getKeyChar();
        System.out.println(in);
        if(Character.isLetter(in)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Age should be numeric value");

        }
    }//GEN-LAST:event_ageKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Receptionist_page obj = new Receptionist_page();
        obj.setVisible(true);
        dispose();
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        String PATTERN="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(email.getText());
        if(!match.matches()){
            email1.setText("incorrect!");
        }
        else{
            email1.setText(null);
        }
    }//GEN-LAST:event_emailKeyReleased

      public void showTableData(){
    
     try{    
    
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
        String sql = "SELECT * FROM patient_registration";
          pat = con.prepareStatement(sql);
          rs = pat.executeQuery();
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
      catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
    }
  }
      public void clearFeild(){
      Pid.setText(null);    
      fullname.setText(null);
      address.setText(null);
      age.setText(null);
      contactno.setText(null);
      email.setText(null);
      note.setText(null);
      
      
  }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient_registrationFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_registrationFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_registrationFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_registrationFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_registrationFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Contactno;
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField Fullname;
    private javax.swing.JLabel Note;
    private javax.swing.JTextField Pid;
    private javax.swing.JButton RESET;
    private javax.swing.JTextField Search;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextArea Viewfield;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email1;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Label label3;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField note;
    private javax.swing.JLabel patientId;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables

private String Gender="male";

}