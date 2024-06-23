/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import view.LoginAccount;

/**
 *
 * @author Asus
 */
public class menuApp extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Creates new form menuApp
     */
    public menuApp() {
        initComponents();
        setTitle("MENU");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1050, 650);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 1036, 613);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1_1 = new JLabel("New label");
        lblNewLabel_1_1.setIcon(new ImageIcon("Z:\\img\\mainpage-img.jpg"));
        lblNewLabel_1_1.setBounds(290, 0, 746, 613);
        panel.add(lblNewLabel_1_1);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(204, 204, 204));
        panel_1.setBounds(0, 0, 290, 613);
        panel.add(panel_1);

        JButton btnNewButton = new JButton("Trang chủ");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(102, 102, 102));
        btnNewButton.setBounds(26, 68, 222, 47);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Introduce mp = new Introduce();
                mp.setVisible(true);
                dispose();
            }
        });
        panel_1.setLayout(null);
        panel_1.add(btnNewButton);

        JButton btnQunL = new JButton("Quản Lí\r\n\r\n");
        btnQunL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LogInManager la = new LogInManager();
                la.setVisible(true);
                dispose();
            }
        });
        btnQunL.setForeground(new Color(255, 255, 255));
        btnQunL.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnQunL.setBackground(new Color(102, 102, 102));
        btnQunL.setBounds(26, 151, 222, 47);
        panel_1.add(btnQunL);

        JButton btnCustomer = new JButton("Khách Hàng\r\n");
        btnCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomerAccount ca = new CustomerAccount();
                ca.setVisible(true);
                dispose();
            }
        });
        btnCustomer.setForeground(new Color(255, 255, 255));
        btnCustomer.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnCustomer.setBackground(new Color(102, 102, 102));
        btnCustomer.setBounds(26, 233, 222, 47);
        panel_1.add(btnCustomer);

        JButton btnNewButton_3 = new JButton("Thoát\r\n");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_3.setBackground(new Color(102, 102, 102));
        btnNewButton_3.setBounds(26, 316, 222, 47);
        panel_1.add(btnNewButton_3);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(204, 204, 204));
        panel_2.setBounds(285, 0, 5, 613);
        panel_1.add(panel_2);

        JButton Ok_signup = new JButton("OK");
        Ok_signup.setForeground(new Color(250, 233, 175));
        Ok_signup.setFont(new Font("Tahoma", Font.BOLD, 18));
        Ok_signup.setBackground(new Color(150, 102, 1));
        Ok_signup.setBounds(935, 564, 91, 39);
        panel.add(Ok_signup);

        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBounds(290, 0, 746, 10);
        panel.add(panel_2_1);
        panel_2_1.setBackground(new Color(204, 204, 204));

        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setBackground(new Color(204, 204, 204));
        panel_2_1_1.setBounds(290, 603, 746, 10);
        panel.add(panel_2_1_1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(menuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
