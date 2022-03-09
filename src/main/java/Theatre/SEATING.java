package Theatre;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SEATING extends javax.swing.JFrame {

    /**
     * Creates new form SEATING
     */
    public SEATING() {
        initComponents();
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         Statement stmt= con.createStatement();
         int i = 1;
         while(i<=50)
         {
         String sql = "select * from seat where seat_no = '"+i+"'";
         ResultSet rs = stmt.executeQuery(sql);
          rs.next();
          int bok = rs.getInt("booked");
          if(bok == 1)
          {
              if(i == 1)
              TButton1.setBackground(Color.blue);
              if(i == 2)
              TButton2.setBackground(Color.blue);
              if(i == 3)
              TButton3.setBackground(Color.blue);
              if(i == 4)
              TButton4.setBackground(Color.blue);
              if(i == 5)
              TButton5.setBackground(Color.blue);
              if(i == 6)
              TButton6.setBackground(Color.blue);
              if(i == 7)
              TButton7.setBackground(Color.blue);
              if(i == 8)
              TButton8.setBackground(Color.blue);
              if(i == 9)
              TButton9.setBackground(Color.blue);
              if(i == 10)
              TButton10.setBackground(Color.blue);
              if(i == 11)
              TButton11.setBackground(Color.blue);
              if(i == 12)
              TButton12.setBackground(Color.blue);
              if(i == 13)
              TButton13.setBackground(Color.blue);
              if(i == 14)
              TButton14.setBackground(Color.blue);
              if(i == 15)
              TButton15.setBackground(Color.blue);
              if(i == 16)
              TButton16.setBackground(Color.blue);
              if(i == 17)
              TButton17.setBackground(Color.blue);
              if(i == 18)
              TButton18.setBackground(Color.blue);
              if(i == 19)
              TButton19.setBackground(Color.blue);
              if(i == 20)
              TButton20.setBackground(Color.blue);
              if(i == 21)
              TButton21.setBackground(Color.blue);
              if(i == 22)
              TButton22.setBackground(Color.blue);
              if(i == 23)
              TButton23.setBackground(Color.blue);
              if(i == 24)
              TButton24.setBackground(Color.blue);
              if(i == 25)
              TButton25.setBackground(Color.blue);
              if(i == 26)
              TButton26.setBackground(Color.blue);
              if(i == 27)
              TButton27.setBackground(Color.blue);
              if(i == 28)
              TButton28.setBackground(Color.blue);
              if(i == 29)
              TButton29.setBackground(Color.blue);
              if(i == 30)
              TButton30.setBackground(Color.blue);
              if(i == 31)
              TButton31.setBackground(Color.blue);
              if(i == 32)
              TButton32.setBackground(Color.blue);
              if(i == 33)
              TButton33.setBackground(Color.blue);
              if(i == 34)
              TButton34.setBackground(Color.blue);
              if(i == 35)
              TButton35.setBackground(Color.blue);
              if(i == 36)
              TButton36.setBackground(Color.blue);
              if(i == 37)
              TButton37.setBackground(Color.blue);
              if(i == 38)
              TButton38.setBackground(Color.blue);
              if(i == 39)
              TButton39.setBackground(Color.blue);
              if(i == 40)
              TButton40.setBackground(Color.blue);
              if(i == 41)
              TButton41.setBackground(Color.blue);
              if(i == 42)
              TButton42.setBackground(Color.blue);
              if(i == 43)
              TButton43.setBackground(Color.blue);
              if(i == 44)
              TButton44.setBackground(Color.blue);
              if(i == 45)
              TButton45.setBackground(Color.blue);
              if(i == 46)
              TButton46.setBackground(Color.blue);
              if(i == 47)
              TButton47.setBackground(Color.blue);
              if(i == 48)
              TButton48.setBackground(Color.blue);
              if(i == 49)
              TButton49.setBackground(Color.blue);
              if(i == 50)
              TButton50.setBackground(Color.blue);
          }
          i++;
         }
         con.close();
         }catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        TButton2 = new javax.swing.JToggleButton();
        TButton3 = new javax.swing.JToggleButton();
        TButton4 = new javax.swing.JToggleButton();
        TButton5 = new javax.swing.JToggleButton();
        TButton6 = new javax.swing.JToggleButton();
        TButton7 = new javax.swing.JToggleButton();
        TButton9 = new javax.swing.JToggleButton();
        TButton10 = new javax.swing.JToggleButton();
        TButton11 = new javax.swing.JToggleButton();
        TButton13 = new javax.swing.JToggleButton();
        TButton12 = new javax.swing.JToggleButton();
        TButton14 = new javax.swing.JToggleButton();
        TButton15 = new javax.swing.JToggleButton();
        TButton16 = new javax.swing.JToggleButton();
        TButton17 = new javax.swing.JToggleButton();
        TButton18 = new javax.swing.JToggleButton();
        TButton19 = new javax.swing.JToggleButton();
        TButton20 = new javax.swing.JToggleButton();
        TButton21 = new javax.swing.JToggleButton();
        TButton22 = new javax.swing.JToggleButton();
        TButton23 = new javax.swing.JToggleButton();
        TButton24 = new javax.swing.JToggleButton();
        TButton25 = new javax.swing.JToggleButton();
        TButton26 = new javax.swing.JToggleButton();
        TButton27 = new javax.swing.JToggleButton();
        TButton28 = new javax.swing.JToggleButton();
        TButton29 = new javax.swing.JToggleButton();
        TButton30 = new javax.swing.JToggleButton();
        TButton31 = new javax.swing.JToggleButton();
        TButton32 = new javax.swing.JToggleButton();
        TButton33 = new javax.swing.JToggleButton();
        TButton34 = new javax.swing.JToggleButton();
        TButton36 = new javax.swing.JToggleButton();
        TButton41 = new javax.swing.JToggleButton();
        TButton42 = new javax.swing.JToggleButton();
        TButton43 = new javax.swing.JToggleButton();
        TButton44 = new javax.swing.JToggleButton();
        TButton1 = new javax.swing.JToggleButton();
        TButton37 = new javax.swing.JToggleButton();
        TButton38 = new javax.swing.JToggleButton();
        TButton39 = new javax.swing.JToggleButton();
        TButton40 = new javax.swing.JToggleButton();
        TButton35 = new javax.swing.JToggleButton();
        TButton45 = new javax.swing.JToggleButton();
        TButton46 = new javax.swing.JToggleButton();
        TButton47 = new javax.swing.JToggleButton();
        TButton48 = new javax.swing.JToggleButton();
        TButton49 = new javax.swing.JToggleButton();
        TButton50 = new javax.swing.JToggleButton();
        TButton8 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TASeats = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton2.setText("BACK");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TButton2.setBackground(new java.awt.Color(255, 255, 255));
        TButton2.setText("2");
        TButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton2ActionPerformed(evt);
            }
        });

        TButton3.setBackground(new java.awt.Color(255, 255, 255));
        TButton3.setText("3");
        TButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton3ActionPerformed(evt);
            }
        });

        TButton4.setBackground(new java.awt.Color(255, 255, 255));
        TButton4.setText("4");
        TButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton4ActionPerformed(evt);
            }
        });

        TButton5.setBackground(new java.awt.Color(255, 255, 255));
        TButton5.setText("5");
        TButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton5ActionPerformed(evt);
            }
        });

        TButton6.setBackground(new java.awt.Color(255, 255, 255));
        TButton6.setText("6");
        TButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton6ActionPerformed(evt);
            }
        });

        TButton7.setBackground(new java.awt.Color(255, 255, 255));
        TButton7.setText("7");
        TButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton7ActionPerformed(evt);
            }
        });

        TButton9.setBackground(new java.awt.Color(255, 255, 255));
        TButton9.setText("9");
        TButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton9ActionPerformed(evt);
            }
        });

        TButton10.setBackground(new java.awt.Color(255, 255, 255));
        TButton10.setText("10");
        TButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton10ActionPerformed(evt);
            }
        });

        TButton11.setBackground(new java.awt.Color(255, 255, 255));
        TButton11.setText("11");
        TButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton11ActionPerformed(evt);
            }
        });

        TButton13.setBackground(new java.awt.Color(255, 255, 255));
        TButton13.setText("13");
        TButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton13ActionPerformed(evt);
            }
        });

        TButton12.setBackground(new java.awt.Color(255, 255, 255));
        TButton12.setText("12");
        TButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton12ActionPerformed(evt);
            }
        });

        TButton14.setBackground(new java.awt.Color(255, 255, 255));
        TButton14.setText("14");
        TButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton14ActionPerformed(evt);
            }
        });

        TButton15.setBackground(new java.awt.Color(255, 255, 255));
        TButton15.setText("15");
        TButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton15ActionPerformed(evt);
            }
        });

        TButton16.setBackground(new java.awt.Color(255, 255, 255));
        TButton16.setText("16");
        TButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton16ActionPerformed(evt);
            }
        });

        TButton17.setBackground(new java.awt.Color(255, 255, 255));
        TButton17.setText("17");
        TButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton17ActionPerformed(evt);
            }
        });

        TButton18.setBackground(new java.awt.Color(255, 255, 255));
        TButton18.setText("18");
        TButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton18ActionPerformed(evt);
            }
        });

        TButton19.setBackground(new java.awt.Color(255, 255, 255));
        TButton19.setText("19");
        TButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton19ActionPerformed(evt);
            }
        });

        TButton20.setBackground(new java.awt.Color(255, 255, 255));
        TButton20.setText("20");
        TButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton20ActionPerformed(evt);
            }
        });

        TButton21.setBackground(new java.awt.Color(255, 255, 255));
        TButton21.setText("21");
        TButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton21ActionPerformed(evt);
            }
        });

        TButton22.setBackground(new java.awt.Color(255, 255, 255));
        TButton22.setText("22");
        TButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton22ActionPerformed(evt);
            }
        });

        TButton23.setBackground(new java.awt.Color(255, 255, 255));
        TButton23.setText("23");
        TButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton23ActionPerformed(evt);
            }
        });

        TButton24.setBackground(new java.awt.Color(255, 255, 255));
        TButton24.setText("24");
        TButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton24ActionPerformed(evt);
            }
        });

        TButton25.setBackground(new java.awt.Color(255, 255, 255));
        TButton25.setText("25");
        TButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton25ActionPerformed(evt);
            }
        });

        TButton26.setBackground(new java.awt.Color(255, 255, 255));
        TButton26.setText("26");
        TButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton26ActionPerformed(evt);
            }
        });

        TButton27.setBackground(new java.awt.Color(255, 255, 255));
        TButton27.setText("27");
        TButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton27ActionPerformed(evt);
            }
        });

        TButton28.setBackground(new java.awt.Color(255, 255, 255));
        TButton28.setText("28");
        TButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton28ActionPerformed(evt);
            }
        });

        TButton29.setBackground(new java.awt.Color(255, 255, 255));
        TButton29.setText("29");
        TButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton29ActionPerformed(evt);
            }
        });

        TButton30.setBackground(new java.awt.Color(255, 255, 255));
        TButton30.setText("30");
        TButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton30ActionPerformed(evt);
            }
        });

        TButton31.setBackground(new java.awt.Color(255, 255, 255));
        TButton31.setText("31");
        TButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton31ActionPerformed(evt);
            }
        });

        TButton32.setBackground(new java.awt.Color(255, 255, 255));
        TButton32.setText("32");
        TButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton32ActionPerformed(evt);
            }
        });

        TButton33.setBackground(new java.awt.Color(255, 255, 255));
        TButton33.setText("33");
        TButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton33ActionPerformed(evt);
            }
        });

        TButton34.setBackground(new java.awt.Color(255, 255, 255));
        TButton34.setText("34");
        TButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton34ActionPerformed(evt);
            }
        });

        TButton36.setBackground(new java.awt.Color(255, 255, 255));
        TButton36.setText("36");
        TButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton36ActionPerformed(evt);
            }
        });

        TButton41.setBackground(new java.awt.Color(255, 255, 255));
        TButton41.setText("41");
        TButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton41ActionPerformed(evt);
            }
        });

        TButton42.setBackground(new java.awt.Color(255, 255, 255));
        TButton42.setText("42");
        TButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton42ActionPerformed(evt);
            }
        });

        TButton43.setBackground(new java.awt.Color(255, 255, 255));
        TButton43.setText("43");
        TButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton43ActionPerformed(evt);
            }
        });

        TButton44.setBackground(new java.awt.Color(255, 255, 255));
        TButton44.setText("44");
        TButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton44ActionPerformed(evt);
            }
        });

        TButton1.setBackground(new java.awt.Color(255, 255, 255));
        TButton1.setText("1");
        TButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton1ActionPerformed(evt);
            }
        });

        TButton37.setBackground(new java.awt.Color(255, 255, 255));
        TButton37.setText("37");
        TButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton37ActionPerformed(evt);
            }
        });

        TButton38.setBackground(new java.awt.Color(255, 255, 255));
        TButton38.setText("38");
        TButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton38ActionPerformed(evt);
            }
        });

        TButton39.setBackground(new java.awt.Color(255, 255, 255));
        TButton39.setText("39");
        TButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton39ActionPerformed(evt);
            }
        });

        TButton40.setBackground(new java.awt.Color(255, 255, 255));
        TButton40.setText("40");
        TButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton40ActionPerformed(evt);
            }
        });

        TButton35.setBackground(new java.awt.Color(255, 255, 255));
        TButton35.setText("35");
        TButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton35ActionPerformed(evt);
            }
        });

        TButton45.setBackground(new java.awt.Color(255, 255, 255));
        TButton45.setText("45");
        TButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton45ActionPerformed(evt);
            }
        });

        TButton46.setBackground(new java.awt.Color(255, 255, 255));
        TButton46.setText("46");
        TButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton46ActionPerformed(evt);
            }
        });

        TButton47.setBackground(new java.awt.Color(255, 255, 255));
        TButton47.setText("47");
        TButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton47ActionPerformed(evt);
            }
        });

        TButton48.setBackground(new java.awt.Color(255, 255, 255));
        TButton48.setText("48");
        TButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton48ActionPerformed(evt);
            }
        });

        TButton49.setBackground(new java.awt.Color(255, 255, 255));
        TButton49.setText("49");
        TButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton49ActionPerformed(evt);
            }
        });

        TButton50.setBackground(new java.awt.Color(255, 255, 255));
        TButton50.setText("50");
        TButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton50ActionPerformed(evt);
            }
        });

        TButton8.setBackground(new java.awt.Color(255, 255, 255));
        TButton8.setText("8");
        TButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButton8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("(Screen)");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("SEATING ARRANGEMENT");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Total seats:");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("50");

        TASeats.setBackground(new java.awt.Color(255, 255, 255));
        TASeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TASeatsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("- Available seats");

        jButton3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton3.setText("Proceed to payment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(TASeats, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(TButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(TButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(TButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(TButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(TButton23)
                                .addGap(18, 18, 18)
                                .addComponent(TButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(TButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(TButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(TButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(TButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(TButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(TButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(TButton42)
                                .addGap(30, 30, 30)
                                .addComponent(TButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(TButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(TButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(TButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(TButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(TButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(TButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TASeats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void TButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton39ActionPerformed
       if(TButton39.isSelected())
    {
      TButton39.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 39;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton39ActionPerformed

    private void TButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton42ActionPerformed
     if(TButton42.isSelected())
    {
      TButton42.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 42;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton42ActionPerformed

    private void TButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton44ActionPerformed
     if(TButton44.isSelected())
    {
      TButton44.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 44;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton44ActionPerformed

    private void TButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton45ActionPerformed
    if(TButton45.isSelected())
    {
      TButton45.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 45;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton45ActionPerformed

    private void TButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton46ActionPerformed
      if(TButton46.isSelected())
    {
      TButton46.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 46;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton46ActionPerformed

    private void TButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton47ActionPerformed
       if(TButton47.isSelected())
    {
      TButton47.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 47;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton47ActionPerformed

    private void TButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton48ActionPerformed
      if(TButton48.isSelected())
    {
      TButton48.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 48;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton48ActionPerformed

    private void TButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton49ActionPerformed
     if(TButton49.isSelected())
    {
      TButton49.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 49;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }       
    }//GEN-LAST:event_TButton49ActionPerformed

    private void TButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton50ActionPerformed
      if(TButton50.isSelected())
    {
      TButton50.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 50;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        // TODO add your handling code here:
    }//GEN-LAST:event_TButton50ActionPerformed

    private void TButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton8ActionPerformed
        if(TButton8.isSelected())
        {
             TButton8.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 8;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
        }
    }//GEN-LAST:event_TButton8ActionPerformed

    private void TButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton1ActionPerformed
   if(TButton1.isSelected())
    {
        TButton1.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 1;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }                                     
    }//GEN-LAST:event_TButton1ActionPerformed
    
    private void TButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton23ActionPerformed
      if(TButton23.isSelected())
    {
        TButton23.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 23;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }                                       
    }//GEN-LAST:event_TButton23ActionPerformed

    private void TASeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TASeatsActionPerformed
    if(TASeats.isSelected())
    {
      TASeats.setBackground(Color.white);
      jLabel5.setText("- Available seats");
    }//GEN-LAST:event_TASeatsActionPerformed
     else
    {
      TASeats.setBackground(Color.blue);
      jLabel5.setText("- Booked seats");
    }
    }
    private void TButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton2ActionPerformed
     if(TButton2.isSelected())
    {
      TButton2.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 2;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton2ActionPerformed

    private void TButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton3ActionPerformed
    if(TButton3.isSelected())
    {
      TButton3.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 3;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton3ActionPerformed

    private void TButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton4ActionPerformed
    if(TButton4.isSelected())
    {
     TButton4.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 4;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton4ActionPerformed

    private void TButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton5ActionPerformed
    if(TButton5.isSelected())
    {
      TButton5.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 5;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton5ActionPerformed

    private void TButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton6ActionPerformed
      if(TButton6.isSelected())
    {
      TButton6.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 6;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton6ActionPerformed

    private void TButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton7ActionPerformed
    if(TButton7.isSelected())
    {
      TButton7.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 7;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton7ActionPerformed

    private void TButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton9ActionPerformed
    if(TButton9.isSelected())
    {
     TButton9.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 9;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton9ActionPerformed

    private void TButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton10ActionPerformed
     if(TButton10.isSelected())
    {
     TButton10.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 10;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton10ActionPerformed

    private void TButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton11ActionPerformed
      if(TButton11.isSelected())
    {
      TButton11.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 11;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton11ActionPerformed

    private void TButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton12ActionPerformed
      if(TButton12.isSelected())
    {
      TButton12.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 12;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton12ActionPerformed

    private void TButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton13ActionPerformed
        if(TButton13.isSelected())
    {
      TButton13.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 13;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton13ActionPerformed

    private void TButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton14ActionPerformed
      if(TButton14.isSelected())
    {
      TButton14.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 14;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton14ActionPerformed

    private void TButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton15ActionPerformed
      if(TButton15.isSelected())
    {
      TButton15.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 15;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton15ActionPerformed

    private void TButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton16ActionPerformed
      if(TButton16.isSelected())
    {
      TButton16.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 16;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton16ActionPerformed

    private void TButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton17ActionPerformed
      if(TButton17.isSelected())
    {
      TButton17.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 17;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton17ActionPerformed

    private void TButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton18ActionPerformed
      if(TButton18.isSelected())
    {
      TButton18.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 18;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton18ActionPerformed

    private void TButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton19ActionPerformed
        if(TButton19.isSelected())
    {
      TButton19.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 19;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton19ActionPerformed

    private void TButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton20ActionPerformed
      if(TButton20.isSelected())
    {
      TButton20.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 20;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton20ActionPerformed

    private void TButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton21ActionPerformed
      if(TButton21.isSelected())
    {
      TButton21.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 21;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton21ActionPerformed

    private void TButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton22ActionPerformed
      if(TButton22.isSelected())
    {
      TButton22.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 22;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton22ActionPerformed

    private void TButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton24ActionPerformed
      if(TButton24.isSelected())
    {
      TButton24.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 24;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton24ActionPerformed

    private void TButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton25ActionPerformed
      if(TButton25.isSelected())
    {
      TButton25.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 25;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton25ActionPerformed

    private void TButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton26ActionPerformed
       if(TButton26.isSelected())
    {
      TButton26.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 26;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton26ActionPerformed

    private void TButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton27ActionPerformed
  if(TButton27.isSelected())
    {
      TButton27.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 27;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton27ActionPerformed

    private void TButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton28ActionPerformed
      if(TButton28.isSelected())
    {
      TButton28.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 28;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton28ActionPerformed

    private void TButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton29ActionPerformed
      if(TButton29.isSelected())
    {
      TButton29.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 29;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton29ActionPerformed

    private void TButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton30ActionPerformed
      if(TButton30.isSelected())
    {
      TButton30.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 30;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton30ActionPerformed

    private void TButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton31ActionPerformed
      if(TButton31.isSelected())
    {
      TButton31.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 31;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton31ActionPerformed

    private void TButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton32ActionPerformed
      if(TButton32.isSelected())
    {
      TButton32.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 32;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton32ActionPerformed

    private void TButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton33ActionPerformed
      if(TButton33.isSelected())
    {
      TButton33.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 33;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton33ActionPerformed

    private void TButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton34ActionPerformed
      if(TButton34.isSelected())
    {
      TButton34.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 34;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton34ActionPerformed

    private void TButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton35ActionPerformed
        if(TButton35.isSelected())
    {
      TButton35.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 35;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton35ActionPerformed

    private void TButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton36ActionPerformed
      if(TButton36.isSelected())
    {
      TButton36.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 36;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton36ActionPerformed

    private void TButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton37ActionPerformed
      if(TButton37.isSelected())
    {
      TButton37.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 37;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton37ActionPerformed

    private void TButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton38ActionPerformed
       if(TButton38.isSelected())
    {
      TButton38.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 38;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton38ActionPerformed

    private void TButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton40ActionPerformed
       if(TButton40.isSelected())
    {
      TButton40.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 40;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton40ActionPerformed

    private void TButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton41ActionPerformed
      if(TButton41.isSelected())
    {
      TButton41.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 41;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton41ActionPerformed

    private void TButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButton43ActionPerformed
     if(TButton43.isSelected())
    {
      TButton43.setBackground(Color.blue);
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","lynjsql#22");
         int i = 43;
         String book = Integer.toString(1);
         String sql = "update seat set booked = ? where seat_no = '"+i+"'";
         PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,book);
         ps.executeUpdate();
        con.close();
            }
       catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }        
    }//GEN-LAST:event_TButton43ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        payment pn = new payment();
        pn.show();
    }//GEN-LAST:event_jButton3ActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(SEATING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEATING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEATING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEATING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEATING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton TASeats;
    private javax.swing.JToggleButton TButton1;
    private javax.swing.JToggleButton TButton10;
    private javax.swing.JToggleButton TButton11;
    private javax.swing.JToggleButton TButton12;
    private javax.swing.JToggleButton TButton13;
    private javax.swing.JToggleButton TButton14;
    private javax.swing.JToggleButton TButton15;
    private javax.swing.JToggleButton TButton16;
    private javax.swing.JToggleButton TButton17;
    private javax.swing.JToggleButton TButton18;
    private javax.swing.JToggleButton TButton19;
    private javax.swing.JToggleButton TButton2;
    private javax.swing.JToggleButton TButton20;
    private javax.swing.JToggleButton TButton21;
    private javax.swing.JToggleButton TButton22;
    private javax.swing.JToggleButton TButton23;
    private javax.swing.JToggleButton TButton24;
    private javax.swing.JToggleButton TButton25;
    private javax.swing.JToggleButton TButton26;
    private javax.swing.JToggleButton TButton27;
    private javax.swing.JToggleButton TButton28;
    private javax.swing.JToggleButton TButton29;
    private javax.swing.JToggleButton TButton3;
    private javax.swing.JToggleButton TButton30;
    private javax.swing.JToggleButton TButton31;
    private javax.swing.JToggleButton TButton32;
    private javax.swing.JToggleButton TButton33;
    private javax.swing.JToggleButton TButton34;
    private javax.swing.JToggleButton TButton35;
    private javax.swing.JToggleButton TButton36;
    private javax.swing.JToggleButton TButton37;
    private javax.swing.JToggleButton TButton38;
    private javax.swing.JToggleButton TButton39;
    private javax.swing.JToggleButton TButton4;
    private javax.swing.JToggleButton TButton40;
    private javax.swing.JToggleButton TButton41;
    private javax.swing.JToggleButton TButton42;
    private javax.swing.JToggleButton TButton43;
    private javax.swing.JToggleButton TButton44;
    private javax.swing.JToggleButton TButton45;
    private javax.swing.JToggleButton TButton46;
    private javax.swing.JToggleButton TButton47;
    private javax.swing.JToggleButton TButton48;
    private javax.swing.JToggleButton TButton49;
    private javax.swing.JToggleButton TButton5;
    private javax.swing.JToggleButton TButton50;
    private javax.swing.JToggleButton TButton6;
    private javax.swing.JToggleButton TButton7;
    private javax.swing.JToggleButton TButton8;
    private javax.swing.JToggleButton TButton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
