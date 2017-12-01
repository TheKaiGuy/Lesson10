package assignments;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PersonList extends javax.swing.JFrame {

    ArrayList<Person> people = new ArrayList();
    DefaultListModel list = new DefaultListModel();

    public PersonList() {
        initComponents();
        people.add(new Person("Billy", 16, "M"));
        people.add(new Person("Dennis", 37, "M"));
        people.add(new Person("Janine", 41, "F"));
        people.add(new Person("Olivia", 29, "F"));
        lstpeople.setModel(list);
        for (Person p : people) {
            list.addElement(p.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstpeople = new javax.swing.JList<>();
        btnmale = new javax.swing.JRadioButton();
        btnfemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new java.awt.TextField();
        txtage = new java.awt.TextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnufile = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        mnuedit = new javax.swing.JMenu();
        mnuclear = new javax.swing.JMenuItem();
        mnuadd = new javax.swing.JMenuItem();
        mnudelete = new javax.swing.JMenuItem();
        mnufilter = new javax.swing.JMenu();
        mnuall = new javax.swing.JMenuItem();
        mnumale = new javax.swing.JMenuItem();
        mnufemale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstpeople);

        buttonGroup1.add(btnmale);
        btnmale.setText("Male");
        btnmale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnfemale);
        btnfemale.setText("Female");
        btnfemale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfemaleActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        mnufile.setText("File");

        mnuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignments/exit.png"))); // NOI18N
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        mnufile.add(mnuexit);

        jMenuBar1.add(mnufile);

        mnuedit.setText("Edit");

        mnuclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignments/exit.png"))); // NOI18N
        mnuclear.setText("Clear");
        mnuedit.add(mnuclear);

        mnuadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignments/insert.png"))); // NOI18N
        mnuadd.setText("Add");
        mnuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddActionPerformed(evt);
            }
        });
        mnuedit.add(mnuadd);

        mnudelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnudelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignments/delete.png"))); // NOI18N
        mnudelete.setText("Delete");
        mnudelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudeleteActionPerformed(evt);
            }
        });
        mnuedit.add(mnudelete);

        jMenuBar1.add(mnuedit);

        mnufilter.setText("Filter");

        mnuall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignments/all.png"))); // NOI18N
        mnuall.setText("Show All");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        mnufilter.add(mnuall);

        mnumale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnumale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignments/male.png"))); // NOI18N
        mnumale.setText("Male");
        mnumale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumaleActionPerformed(evt);
            }
        });
        mnufilter.add(mnumale);

        mnufemale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnufemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignments/female.png"))); // NOI18N
        mnufemale.setText("Female");
        mnufemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufemaleActionPerformed(evt);
            }
        });
        mnufilter.add(mnufemale);

        jMenuBar1.add(mnufilter);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmale)
                        .addGap(18, 18, 18)
                        .addComponent(btnfemale))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnfemale)
                            .addComponent(btnmale))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnumaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumaleActionPerformed
        list.clear();
        for(Person person: people){
            if(person.getGender()=="M")
                list.addElement(person.getName());
        }
    }//GEN-LAST:event_mnumaleActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void btnmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmaleActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void mnudeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudeleteActionPerformed
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name, 0, ""));
        list.removeElementAt(lstpeople.getSelectedIndex());
        people.remove(loc);
        clearForm();
    }//GEN-LAST:event_mnudeleteActionPerformed

    private void mnuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddActionPerformed
        String name = txtname.getText();
        int age = Integer.parseInt(txtage.getText());
        String gender = buttonGroup1.getSelection().getActionCommand();
        Person p = new Person(name, age, gender);
        int loc = findInsertPoint(people, p);
        people.add(loc,p);
        list.add(loc,p.getName());
        clearForm();
    }//GEN-LAST:event_mnuaddActionPerformed

    private void mnufemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufemaleActionPerformed
        list.clear();
        for(Person person: people){
            if(person.getGender()=="F")
                list.addElement(person.getName());
        }
            
    }//GEN-LAST:event_mnufemaleActionPerformed

    private void btnfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfemaleActionPerformed
        
    }//GEN-LAST:event_btnfemaleActionPerformed

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
        list.clear();
        for(Person person: people){
                list.addElement(person.getName());
        }
    }//GEN-LAST:event_mnuallActionPerformed
    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }

    public void clearForm() {
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        lstpeople.clearSelection();
    }

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }
    private void lstpeopleMouseClicked(java.awt.event.MouseEvent evt){
        String name=""+lstpeople.getSelectedValue();
        int loc=search(people,new Person(name,0,""));
        show(people.get(loc));
    }
    public void show(Person p){
        txtname.setText(p.getName());
        txtage.setText(""+p.getAge());
        if(p.getGender()=="M")
            btnmale.setSelected(true);
        else
            btnfemale.setSelected(true);
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
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnfemale;
    private javax.swing.JRadioButton btnmale;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstpeople;
    private javax.swing.JMenuItem mnuadd;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnudelete;
    private javax.swing.JMenu mnuedit;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnufemale;
    private javax.swing.JMenu mnufile;
    private javax.swing.JMenu mnufilter;
    private javax.swing.JMenuItem mnumale;
    private java.awt.TextField txtage;
    private java.awt.TextField txtname;
    // End of variables declaration//GEN-END:variables
}
