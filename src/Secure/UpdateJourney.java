/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mercyck
 */
public class UpdateJourney extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    String UpdateQuery = null;

    boolean acc=false;
    /**
     * Creates new form UpdateJourney
     */
    public UpdateJourney() {
        initComponents();
        Show_Journeys_In_Table();
    }

    public boolean checkInputs()
 {   
     if(jFormattedtxtFare.getText().equals("0.0") || (jCheckBoxAcc.isSelected()==true && txtNameAcc.getText().equals("")))
     {
     return false;
     }else{
     try{
         if(jCheckBoxAcc.isSelected()==false){
             txtNameAcc.setText("");
             txtNameAcc.setEnabled(false);
         }
         acc = jCheckBoxAcc.isSelected();
         System.out.println(acc);
         return true;
        }catch(Exception ex)
        {
        return false;
        }
     }
 }

    public void CleanFields() {
        txtStartTime.setText("");
        txtPickupPoint.setText("");
        txtDestination.setText("");
        txtDriverID.setText("");
        txtPassenger.setText("");
        jFormattedtxtFare.setText("");
        jFormattedtxtTip.setText("");
       // txtBooleanAcc.setText("");
        txtNameAcc.setText("");
        jFormattedtxtTel.setText("");
        jLabelDate.setText("");
        txtIDJourney.setText("");
    }

    //DISPLAY DATA IN JTABLE
    //1 - FILL ArrayList WITH DATA
    public ArrayList<Journey> getJourneyList() {

        ArrayList<Journey> journeyList = new ArrayList<Journey>();
        conn = MySqlConnect.ConnectDB();
        String query = "SELECT * FROM JOURNEY";

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Journey journey;

            while (rs.next()) {
                //Float.parseFloat(rs.getString("fare")) 
                //DB FIELDS
                journey = new Journey(rs.getInt("JOURNEYID"), rs.getInt("DRIVERID"), rs.getString("STARTTIME"), rs.getString("PICKUPPOINT"), rs.getString("DESTINATION"), rs.getString("NAMEPASSENGER"), rs.getDouble("FARE"), rs.getDouble("OPTIONALTIP"), rs.getBoolean("ACCOUNTJOB"), rs.getString("NAMEACCOUNT"), rs.getString("TELEPHONE"), rs.getString("DATEOFJOURNEY"));
                journeyList.add(journey);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateJourney.class.getName()).log(Level.SEVERE, null, ex);
        }
        return journeyList;
    }

    //POPULATE THE JTABLE
    public void Show_Journeys_In_Table() {
        ArrayList<Journey> list = getJourneyList();
        DefaultTableModel model = (DefaultTableModel) jTable_Journeys.getModel();
        
        //clean JTable
        model.setRowCount(0);
        Object[] row = new Object[12];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getJid();
            row[1] = list.get(i).getDriverId();
            row[2] = list.get(i).getStartTime();
            row[3] = list.get(i).getPickupPoint();
            row[4] = list.get(i).getDestination();
            row[5] = list.get(i).getPassengerName();
            row[6] = list.get(i).getFare();
            row[7] = list.get(i).getTip();
            row[8] = list.get(i).getAccount();
            row[9] = list.get(i).getNameAccount();
            row[10] = list.get(i).getTel();
            row[11] = list.get(i).getDateOfJourney();

            model.addRow(row);

        }
    }

    public  void ShowItem(int index)
    {
        txtIDJourney.setText(Integer.toString(getJourneyList().get(index).getJid()));
        txtDriverID.setText(Integer.toString(getJourneyList().get(index).getDriverId()));
        txtStartTime.setText(getJourneyList().get(index).getStartTime());
        txtPickupPoint.setText(getJourneyList().get(index).getPickupPoint());
        txtDestination.setText(getJourneyList().get(index).getDestination());
        txtPassenger.setText(getJourneyList().get(index).getPassengerName());
        jFormattedtxtFare.setText(Double.toString(getJourneyList().get(index).getFare()));
        jFormattedtxtTip.setText(Double.toString(getJourneyList().get(index).getTip()));
        //txtBooleanAcc.setText(Boolean.toString(getJourneyList().get(index).getAccount()));
        if(getJourneyList().get(index).getAccount()==true)
        {
        jCheckBoxAcc.setSelected(true);
        txtNameAcc.setEnabled(true);
        }else{
        jCheckBoxAcc.setSelected(false);
        txtNameAcc.setEnabled(false);
        }
        txtNameAcc.setText(getJourneyList().get(index).getNameAccount());
       // jFormattedtxtTel.setText(getJourneyList().get(index).getTel());
        String str = getJourneyList().get(index).getTel();
        String stt=str.replaceAll("\\D+","");
        //System.out.println(stt);
        jFormattedtxtTel.setText(stt);
        jLabelDate.setText(getJourneyList().get(index).getDateOfJourney());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPickupPoint = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnUpdateJourney = new javax.swing.JButton();
        btnCancelUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        txtPassenger = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNameAcc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jFormattedtxtTel = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Journeys = new javax.swing.JTable();
        jFormattedtxtFare = new javax.swing.JFormattedTextField();
        jFormattedtxtTip = new javax.swing.JFormattedTextField();
        txtDriverID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtIDJourney = new javax.swing.JTextField();
        txtStartTime = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jCheckBoxAcc = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update Journey");

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

        txtPickupPoint.setEditable(false);
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

        btnUpdateJourney.setBackground(new java.awt.Color(65, 131, 215));
        btnUpdateJourney.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateJourney.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateJourney.setText("Update");
        btnUpdateJourney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateJourneyActionPerformed(evt);
            }
        });

        btnCancelUpdate.setBackground(new java.awt.Color(242, 38, 19));
        btnCancelUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCancelUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelUpdate.setText("Cancel");
        btnCancelUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelUpdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pick-up point");

        txtDestination.setEditable(false);
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

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Fare   £");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Optional Tip   £");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Account job");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Name of Account");

        txtNameAcc.setBackground(new java.awt.Color(108, 122, 137));
        txtNameAcc.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtNameAcc.setForeground(new java.awt.Color(255, 255, 255));
        txtNameAcc.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Telephone");

        jFormattedtxtTel.setBackground(new java.awt.Color(108, 122, 137));
        jFormattedtxtTel.setForeground(new java.awt.Color(204, 204, 204));
        try {
            jFormattedtxtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedtxtTel.setToolTipText("020-770-9876");
        jFormattedtxtTel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jFormattedtxtTel.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Date");

        jLabelDate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDate.setText("01/01/2017");

        jTable_Journeys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JOURNEY ID", "DRIVER ID", "START TIME", "PICK-UP TIME", "DESTINATION", "PASSENGER'S NAME", "FARE", "OPTIONAL TIP", "ACCOUNT JOB", "NAME OF ACCOUNT", "TELEPHONE", "DATE OF JOURNEY"
            }
        ));
        jTable_Journeys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_JourneysMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Journeys);

        jFormattedtxtFare.setBackground(new java.awt.Color(108, 122, 137));
        jFormattedtxtFare.setForeground(new java.awt.Color(204, 204, 204));
        jFormattedtxtFare.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedtxtFare.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jFormattedtxtFare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedtxtFareActionPerformed(evt);
            }
        });

        jFormattedtxtTip.setBackground(new java.awt.Color(108, 122, 137));
        jFormattedtxtTip.setForeground(new java.awt.Color(204, 204, 204));
        jFormattedtxtTip.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedtxtTip.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jFormattedtxtTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedtxtTipActionPerformed(evt);
            }
        });

        txtDriverID.setEditable(false);
        txtDriverID.setBackground(new java.awt.Color(108, 122, 137));
        txtDriverID.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtDriverID.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("ID Journey");

        txtIDJourney.setEditable(false);
        txtIDJourney.setBackground(new java.awt.Color(108, 122, 137));
        txtIDJourney.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtIDJourney.setForeground(new java.awt.Color(255, 255, 255));
        txtIDJourney.setEnabled(false);

        txtStartTime.setEditable(false);
        txtStartTime.setBackground(new java.awt.Color(108, 122, 137));
        txtStartTime.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(255, 255, 255));

        btnDelete.setBackground(new java.awt.Color(248, 148, 6));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jCheckBoxAcc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jCheckBoxAcc.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBoxAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel16)
                            .addComponent(jLabel1)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDJourney)
                            .addComponent(txtPassenger)
                            .addComponent(jFormattedtxtFare)
                            .addComponent(jFormattedtxtTip)
                            .addComponent(txtPickupPoint)
                            .addComponent(txtDestination)
                            .addComponent(txtDriverID)
                            .addComponent(txtNameAcc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedtxtTel)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStartTime)
                            .addComponent(jCheckBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnCancelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateJourney, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPickupPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDriverID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedtxtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedtxtTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jFormattedtxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabelDate))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txtIDJourney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdateJourney, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);        // Exit the app
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // Minimize box
        this.setState(JFrame.ICONIFIED); //minimize screen when clicked
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btnUpdateJourneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateJourneyActionPerformed
        // ADD NEW JOURNEY
        if (checkInputs() && txtIDJourney.getText() != null) {
            try {

                conn = MySqlConnect.ConnectDB();

                UpdateQuery = "UPDATE JOURNEY SET NAMEPASSENGER = ?, FARE=?, OPTIONALTIP=?, ACCOUNTJOB=?, NAMEACCOUNT=?,TELEPHONE=?"
                        + "WHERE JOURNEYID=?";
                pst = conn.prepareStatement(UpdateQuery);

                pst.setString(1, txtPassenger.getText());
                pst.setFloat(2, (float) Double.parseDouble(jFormattedtxtFare.getText()));
                pst.setFloat(3, (float) Double.parseDouble(jFormattedtxtTip.getText()));
                pst.setBoolean(4, acc); //how to pass a boolean to a sql statement
                pst.setString(5, txtNameAcc.getText());
                pst.setString(6, jFormattedtxtTel.getText());
                pst.setInt(7, Integer.parseInt(txtIDJourney.getText()));

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Journey Updated");
                Show_Journeys_In_Table();
                CleanFields();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "One or more Fields are Empty");
        }
    }//GEN-LAST:event_btnUpdateJourneyActionPerformed

    private void btnCancelUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelUpdateActionPerformed
        // T
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        mm.pack();
        mm.setLocationRelativeTo(null);
        //w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCancelUpdateActionPerformed

    private void jFormattedtxtFareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedtxtFareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedtxtFareActionPerformed

    private void jFormattedtxtTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedtxtTipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedtxtTipActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!txtIDJourney.getText().equals("")) {
            try {
                conn = MySqlConnect.ConnectDB();
                pst = conn.prepareStatement("DELETE FROM JOURNEY WHERE JOURNEYID =?");
                int id = Integer.parseInt(txtIDJourney.getText());
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Journey Deleted");
                Show_Journeys_In_Table();
                CleanFields();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(UpdateJourney.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Journey Not Deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable_JourneysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_JourneysMouseClicked
        int index = jTable_Journeys.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_jTable_JourneysMouseClicked

    private void jCheckBoxAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAccActionPerformed
        txtNameAcc.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxAccActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateJourney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelUpdate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateJourney;
    private javax.swing.JCheckBox jCheckBoxAcc;
    private javax.swing.JFormattedTextField jFormattedtxtFare;
    private javax.swing.JFormattedTextField jFormattedtxtTel;
    private javax.swing.JFormattedTextField jFormattedtxtTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Journeys;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtDriverID;
    private javax.swing.JTextField txtIDJourney;
    private javax.swing.JTextField txtNameAcc;
    private javax.swing.JTextField txtPassenger;
    private javax.swing.JTextField txtPickupPoint;
    private javax.swing.JTextField txtStartTime;
    // End of variables declaration//GEN-END:variables
}
