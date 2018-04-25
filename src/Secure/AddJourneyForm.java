/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Mercyck
 */
public class AddJourneyForm extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst = null;


SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
String addDate = dateFormat.format(date);

boolean acc=false;
//String time ="00:00";

boolean buttonClicked = false;
boolean buttonClicked2 = false;

public String[] getData = new String [1];

public void posData(){
    if (buttonClicked==true){
        this.txtPickupPoint.setText(getData[0]);
        buttonClicked=false;
        }
    if (buttonClicked2==true){
        this.txtDestination.setText(getData[0]);
        buttonClicked2=false;
        }
}
    /**
     * Creates new form AddJourneyForm
     */
    public AddJourneyForm() {
        initComponents();
        jLabeLDate.setText(addDate);
    }
    /*public Connection getConnection(){
        Connection con=null;
        con = DriverManager.getConnection("", "","");
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPickupPoint = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAddNewJourney = new javax.swing.JButton();
        btnCancelAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComBoxHour = new javax.swing.JComboBox<>();
        jComboBoxMin = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        txtPassenger = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDriverID = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxAcc = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNameAcc = new javax.swing.JTextField();
        jFormattedtxtTel = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabeLDate = new javax.swing.JLabel();
        btnLondonMap = new javax.swing.JButton();
        btnLondonMapD = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPasswordField1.setText("jPasswordField1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Journey");

        jLabelClose.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 49, 63));

        txtPickupPoint.setBackground(new java.awt.Color(108, 122, 137));
        txtPickupPoint.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtPickupPoint.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Destination");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Greenwich Cabs");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Start Time");

        btnAddNewJourney.setBackground(new java.awt.Color(65, 131, 215));
        btnAddNewJourney.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddNewJourney.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewJourney.setText("Add");
        btnAddNewJourney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewJourneyActionPerformed(evt);
            }
        });

        btnCancelAdd.setBackground(new java.awt.Color(242, 38, 19));
        btnCancelAdd.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCancelAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelAdd.setText("Cancel");
        btnCancelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAddActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pick-up point");

        jComBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jComboBoxMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText(" :");

        txtDestination.setBackground(new java.awt.Color(108, 122, 137));
        txtDestination.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtDestination.setForeground(new java.awt.Color(255, 255, 255));

        txtPassenger.setBackground(new java.awt.Color(108, 122, 137));
        txtPassenger.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtPassenger.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Driver's ID");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Passenger");

        jComboBoxDriverID.setBackground(new java.awt.Color(34, 49, 63));
        jComboBoxDriverID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Fare");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("£    0.00");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Optional Tip");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("£    0.00");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Account job");

        jComboBoxAcc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Name of Account");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Telephone");

        txtNameAcc.setBackground(new java.awt.Color(108, 122, 137));
        txtNameAcc.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtNameAcc.setForeground(new java.awt.Color(255, 255, 255));

        jFormattedtxtTel.setBackground(new java.awt.Color(108, 122, 137));
        jFormattedtxtTel.setForeground(new java.awt.Color(204, 204, 204));
        try {
            jFormattedtxtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedtxtTel.setToolTipText("020-770-9876");
        jFormattedtxtTel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jFormattedtxtTel.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Date");

        jLabeLDate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabeLDate.setForeground(new java.awt.Color(204, 204, 204));
        jLabeLDate.setText("01/01/2017");

        btnLondonMap.setBackground(new java.awt.Color(248, 148, 6));
        btnLondonMap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLondonMap.setForeground(new java.awt.Color(255, 255, 255));
        btnLondonMap.setText("Map");
        btnLondonMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLondonMapActionPerformed(evt);
            }
        });

        btnLondonMapD.setBackground(new java.awt.Color(248, 148, 6));
        btnLondonMapD.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLondonMapD.setForeground(new java.awt.Color(255, 255, 255));
        btnLondonMapD.setText("Map");
        btnLondonMapD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLondonMapDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnCancelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddNewJourney, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNameAcc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassenger, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDestination, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDriverID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAcc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeLDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPickupPoint, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedtxtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLondonMap, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLondonMapD, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPickupPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnLondonMap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLondonMapD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxDriverID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jFormattedtxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabeLDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNewJourney, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMin)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//VALIDATION
public boolean checkInputs()
 {
     String time2 = (String)jComboBoxMin.getSelectedItem();
     time2= time2 + ":";
     time2+=(String)jComboBoxMin.getSelectedItem();
     
     
     if(txtPickupPoint.getText().equals("") || time2.equals("00:00") || txtDestination.getText().equals("") || (jComboBoxAcc.getSelectedIndex()==1 && txtNameAcc.getText().equals("")))
     {
     return false;
     }else{
     try{
         int driverid = Integer.parseInt((String) jComboBoxDriverID.getSelectedItem());
         return true;
        }catch(Exception ex)
        {
        return false;
        }
     }
 }
public int generateJourneyID(){
               
//String Sql="SELECT MAX(JOURNEYID) FROM JOURNEY";
    conn = MySqlConnect.ConnectDB();
        String query = "SELECT MAX(JOURNEYID) AS LASTADDED FROM JOURNEY";

        Statement st;
        ResultSet rs;
        int lastJourneyID = 0;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
            //System.out.println(rs.getInt("LASTADDED"));
            lastJourneyID = rs.getInt("LASTADDED");
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(AddJourneyForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastJourneyID;

}
 
 public void CleanFields()
 {
 txtPickupPoint.setText("");
 txtDestination.setText("");
 txtPassenger.setText("");
 txtNameAcc.setText("");
 jFormattedtxtTel.setText("");
 }
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);        // Exit the app
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // Minimize box
        this.setState(JFrame.ICONIFIED); //minimize screen when clicked
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btnAddNewJourneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewJourneyActionPerformed
        // ADD NEW JOURNEY
        System.out.println(checkInputs());
        if(checkInputs()){
            try{
                String time = (String)jComBoxHour.getSelectedItem();
                time= time + ":";
                time+=(String)jComboBoxMin.getSelectedItem();
                
                int actualJourneyID= generateJourneyID();
                //System.out.println(actualJourneyID);
                actualJourneyID = actualJourneyID+1;
                //System.out.println(actualJourneyID);
                
                conn= MySqlConnect.ConnectDB();
                pst = conn.prepareStatement("INSERT INTO JOURNEY (JOURNEYID, DRIVERID, STARTTIME, PICKUPPOINT, DESTINATION,NAMEPASSENGER, FARE,OPTIONALTIP,ACCOUNTJOB, NAMEACCOUNT, TELEPHONE,DATEOFJOURNEY) "
                        + "VALUES (?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?) ");
               
                pst.setInt(1,actualJourneyID);//pst.setString(1, "3");
                pst.setString(2, (String) jComboBoxDriverID.getSelectedItem());
                pst.setString(3, time);
                pst.setString(4, txtPickupPoint.getText());
                pst.setString(5, txtDestination.getText());
                pst.setString(6, txtPassenger.getText());
                pst.setString(7,"0.00");
                pst.setString(8,"0.00");
                
                //boolean acc=false;
                if(jComboBoxAcc.getSelectedIndex()==1)
                {acc=true;}
                
                pst.setBoolean(9, acc);
                pst.setString(10,txtNameAcc.getText());
                pst.setString(11,jFormattedtxtTel.getText());
                pst.setString(12, addDate);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "New Journey added");
                CleanFields();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "One or more Fields are Empty");
        }
    }//GEN-LAST:event_btnAddNewJourneyActionPerformed

    private void btnCancelAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAddActionPerformed
        // T
        MainMenu mm = new MainMenu();
               mm.setVisible(true);
               mm.pack();
               mm.setLocationRelativeTo(null);
                //w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_btnCancelAddActionPerformed

    private void btnLondonMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLondonMapActionPerformed
        buttonClicked=true;
        mapLondon sec = new mapLondon(this);
        sec.setVisible(true);
    }//GEN-LAST:event_btnLondonMapActionPerformed

    private void btnLondonMapDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLondonMapDActionPerformed
        buttonClicked2=true;
        mapLondon sec = new mapLondon(this);
        sec.setVisible(true);
    }//GEN-LAST:event_btnLondonMapDActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddJourneyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddJourneyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddJourneyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddJourneyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//
//        /* Create and display the form*/
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddJourneyForm().setVisible(true);
//            }
//        });
//
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewJourney;
    private javax.swing.JButton btnCancelAdd;
    private javax.swing.JButton btnLondonMap;
    private javax.swing.JButton btnLondonMapD;
    private javax.swing.JComboBox<String> jComBoxHour;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxAcc;
    private javax.swing.JComboBox<String> jComboBoxDriverID;
    private javax.swing.JComboBox<String> jComboBoxMin;
    private javax.swing.JFormattedTextField jFormattedtxtTel;
    private javax.swing.JLabel jLabeLDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtNameAcc;
    private javax.swing.JTextField txtPassenger;
    private javax.swing.JTextField txtPickupPoint;
    // End of variables declaration//GEN-END:variables
}
