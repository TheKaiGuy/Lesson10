package assignments;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Sorting extends javax.swing.JFrame {

    int nums[] = new int[10000];
    DefaultListModel list;
    boolean sorted = false;

    public Sorting() {
        initComponents();
        shuffle();
        list = new DefaultListModel();
        //connect to actual list
        lstnums.setModel(list);
        //print nums
    }

    public void printList() {
        list.clear();
        for (int i = 0; i < 50000; i++) {
            list.add(i, "" + nums[i]);
        }
    }

    public void shuffle() {
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            nums[i] = r.nextInt(10000) + 1;
        }
    }

    public static void bubbleSort(int[] a) {
        int k = 0;
        boolean exchangeMade = true;
        // Make up to n - 1 passes through array, exit 
        //early if no exchanges are made on previous pass

        while ((k < a.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    exchangeMade = true;
                }//end if
            }//end for
        }//end while
    }

//supporting swap method
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

////////////////////////////////////////////////////////////////
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

/////////////////////////////////////////////////////////////
    public static void insertionSort(int a[]) {
        int itemToInsert, j;
        boolean stillLooking;

        //on the kth pass, pass item k upwards in list
        //and insert it in its proper place amoung the
        //first k entries in an array
        for (int k = 1; k < a.length; k++) {
            //move backwards through list, looking for
            //the right place to insert a[k];
            itemToInsert = a[k];
            j = k - 1;
            stillLooking = true;
            while (j >= 0 && stillLooking) {
                if (itemToInsert < a[j]) {
                    //move item higher
                    a[j + 1] = a[j];
                    j--;
                } else {
                    //we have found new home for a[k];
                    stillLooking = false;
                }//end else// j+1 is where the item goes
                a[j + 1] = itemToInsert;
            }//end while
        }//end for
    }//end method

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstnums = new javax.swing.JList<>();
        btnbubble = new javax.swing.JButton();
        btnselection = new javax.swing.JButton();
        btninsertion = new javax.swing.JButton();
        btnquick = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        btngenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstnums.setToolTipText("");
        jScrollPane1.setViewportView(lstnums);

        btnbubble.setText("Bubble Sort");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnselection.setText("Selection Sort");

        btninsertion.setText("Insertion Sort");

        btnquick.setText("Quick Sort");

        lbltime.setText("Time Lapsed = ?");
        lbltime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btngenerate.setText("Generate Numbers");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnselection)
                    .addComponent(btninsertion)
                    .addComponent(btnbubble)
                    .addComponent(btngenerate)
                    .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnquick))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btngenerate)
                        .addGap(18, 18, 18)
                        .addComponent(btnbubble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnselection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btninsertion)
                        .addGap(43, 43, 43)
                        .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(btnquick)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        shuffle();
        printList();

    }//GEN-LAST:event_btngenerateActionPerformed

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
        //start time
        if(sorted){
            JOptionPane.showMessageDialog(this,"The list is already sorted - generate new numbers first.");
            return;
        }
        bubbleSort(nums);
        sorted=true;
        //end timer
        printList();
    }//GEN-LAST:event_btnbubbleActionPerformed

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
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btninsertion;
    private javax.swing.JButton btnquick;
    private javax.swing.JButton btnselection;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JList<String> lstnums;
    // End of variables declaration//GEN-END:variables
}
