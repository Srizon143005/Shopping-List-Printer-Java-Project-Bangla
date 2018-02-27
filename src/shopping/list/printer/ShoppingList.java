package shopping.list.printer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterJob;

public class ShoppingList extends javax.swing.JFrame {
    public static String s;
    public ShoppingList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LL1 = new javax.swing.JLabel();
        LL1T = new javax.swing.JTextField();
        LL2 = new javax.swing.JLabel();
        LL2T = new javax.swing.JTextField();
        LL3 = new javax.swing.JLabel();
        LL3T = new javax.swing.JTextField();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        LL4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LL4T = new javax.swing.JTextField();
        LL5 = new javax.swing.JLabel();
        LL5T = new javax.swing.JTextField();
        Set = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        LL6 = new javax.swing.JLabel();
        LL6T = new javax.swing.JTextField();
        Print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllT = new javax.swing.JTextArea();
        Heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LL1.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        LL1.setText("কেনার তারিখঃ");

        LL1T.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N

        LL2.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        LL2.setText("ক্রেতার নামঃ");

        LL2T.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N

        LL3.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        LL3.setText("ক্রেতার ঠিকানাঃ");

        LL3T.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N

        L1.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("সাধারণ তথ্য");

        L2.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setText("কৃত পণ্যের তথ্য");

        LL4.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        LL4.setText("পণ্যগুলির নামঃ");

        jLabel7.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("রিসিট কপির বর্তমান অবস্থা");

        LL4T.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N

        LL5.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        LL5.setText("সম্পূর্ণ দামঃ");

        LL5T.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N

        Set.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        Set.setText("প্রস্তুত করো");
        Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        Reset.setText("রিসেট করো");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        LL6.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        LL6.setText("বিক্রেতার নামঃ");

        LL6T.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N

        Print.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        Print.setText("প্রিন্ট করো");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        AllT.setEditable(false);
        AllT.setColumns(20);
        AllT.setFont(new java.awt.Font("NikoshLight", 0, 18)); // NOI18N
        AllT.setLineWrap(true);
        AllT.setRows(5);
        AllT.setText("রিসিট কপির বর্তমান অবস্থা দেখতে পাশের তথ্য পূরণ করে \"প্রস্তুত করো\" বাটন চাপুন।");
        jScrollPane1.setViewportView(AllT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LL4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LL4T))
                            .addComponent(L2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LL3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LL2T, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                                    .addComponent(LL1T, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LL3T)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LL6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(LL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LL6T, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Set, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LL5T))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 236, Short.MAX_VALUE)
                                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LL1T, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LL2T, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LL3T, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LL4T, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LL5T, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Set, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LL6T)
                    .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Heading.setFont(new java.awt.Font("NikoshLight", 1, 24)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("রিসিট কপি");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetActionPerformed
        // TODO add your handling code here:
        s=LL1.getText()+" "+LL1T.getText();
        s=s+"\n"+LL2.getText()+" "+LL2T.getText();
        s=s+"\n"+LL3.getText()+" "+LL3T.getText();
        s=s+"\n"+LL4.getText()+" "+LL4T.getText();
        s=s+"\n"+LL5.getText()+" "+LL5T.getText();
        s=s+"\n"+LL6.getText()+" "+LL6T.getText();
        AllT.setText(s);
        
    }//GEN-LAST:event_SetActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        LL1T.setText("");
        LL2T.setText("");
        LL3T.setText("");
        LL4T.setText("");
        LL5T.setText("");
        LL6T.setText("");
        AllT.setText("রিসিট কপির বর্তমান অবস্থা দেখতে পাশের তথ্য পূরণ করে \"প্রস্তুত করো\" বাটন চাপুন।");
        
    }//GEN-LAST:event_ResetActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        PrintingPage example = new PrintingPage();
    }//GEN-LAST:event_PrintActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AllT;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel LL1;
    private javax.swing.JTextField LL1T;
    private javax.swing.JLabel LL2;
    private javax.swing.JTextField LL2T;
    private javax.swing.JLabel LL3;
    private javax.swing.JTextField LL3T;
    private javax.swing.JLabel LL4;
    private javax.swing.JTextField LL4T;
    private javax.swing.JLabel LL5;
    private javax.swing.JTextField LL5T;
    private javax.swing.JLabel LL6;
    private javax.swing.JTextField LL6T;
    private javax.swing.JButton Print;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Set;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public static class PrintingPage {
    private PrintingPage(){
        PrinterJob printJob = PrinterJob.getPrinterJob();
        Book book = new Book();
        book.append(new IntroPage(), printJob.defaultPage());
        PageFormat documentPageFormat = new PageFormat();
        documentPageFormat.setOrientation(PageFormat.PORTRAIT);
        printJob.setPageable(book);
        
        if(printJob.printDialog()){
            try{
                printJob.print();
            }
            catch(Exception PrintException){
                PrintException.printStackTrace();
            }
        }
    }
    
    private class IntroPage implements Printable{
        public int print(Graphics g, PageFormat pageFormat, int Page){
            Graphics2D g2d = (Graphics2D)g;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            g2d.setPaint(Color.black);
            g2d.setStroke(new BasicStroke(12));
            Font titleFont = new Font("NikoshLight", Font.PLAIN, 18);
            g2d.setFont(titleFont);
            String[] bill = s.split("\n");
            int y = 15;
            for(int i=0; i<bill.length; i++){
                    g2d.drawString(bill[i], 5, y);
                    y=y+15;
            }
            return (PAGE_EXISTS);
        }
    }
    
    }
}