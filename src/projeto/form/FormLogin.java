package projeto.form;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import projeto.infobanco.UserDao;
import projeto.classes.ClassSalvarTXT;

/**
 *
 * @author JhonattanSouza_
 */
public final class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
        this.getRootPane().setDefaultButton(jButtonEntrar);
        inicializacao();
//        jPasswordPass.requestFocus(); // Deixa o "jPasswordField" em foco //
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordPass = new javax.swing.JPasswordField();
        jTextUser = new javax.swing.JTextField();
        jCheckLembrar = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelFechar = new javax.swing.JLabel();
        jLB_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEntrar.setToolTipText("Entrar no Sistema");
        jButtonEntrar.setBorder(null);
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setFocusPainted(false);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 273, 334, 35));

        jPasswordPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordPass.setToolTipText("Senha");
        jPasswordPass.setBorder(null);
        jPasswordPass.setOpaque(false);
        getContentPane().add(jPasswordPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 250, 30));

        jTextUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextUser.setToolTipText("Usuário");
        jTextUser.setBorder(null);
        jTextUser.setOpaque(false);
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 148, 250, 30));

        jCheckLembrar.setSelected(true);
        jCheckLembrar.setText("Lembrar usuario.");
        jCheckLembrar.setToolTipText("Lembrar ultimo usuario Logado.");
        jCheckLembrar.setContentAreaFilled(false);
        getContentPane().add(jCheckLembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 235, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 100, 150, 40));

        jLabelMinimizar.setToolTipText("Minimizar");
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 20));

        jLabelFechar.setToolTipText("Fechar");
        jLabelFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelFecharMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 40));

        jLB_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/backgroud/login-background2.png"))); // NOI18N
        getContentPane().add(jLB_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFecharMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharMouseReleased
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair ?", "Atençao", JOptionPane.YES_NO_OPTION, 2);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelFecharMouseReleased

    private void jLabelMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseReleased
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseReleased

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        loginConect();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton jButtonEntrar = new javax.swing.JButton();
    private javax.swing.JCheckBox jCheckLembrar;
    private javax.swing.JLabel jLB_Background;
    private javax.swing.JLabel jLabelFechar;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordPass;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
//################################################   CODIGOS DE PROGRAMAÇÃO   ############################################################//

    public void inicializacao() {
        maiuscula();  // Inia o contrutor que deixa as letras sempres maiuscular no "jTextUser"
        lerTxt();    // Ler o txt salvo com o Ultimo usuario logado
        setIcon();  // Inicia o Icone do Programa
    }

    // este comando pega tudo o que estiver na variavel selecionada que no cao é a jTextUser e deixa maiusculo
    public void maiuscula() {
        jTextUser.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(final KeyEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JTextField campo = (JTextField) e.getSource();
                        int posicaoCursor = campo.getCaretPosition();
                        campo.setText(campo.getText().toUpperCase());
                        if (posicaoCursor != campo.getCaretPosition()) {
                            campo.setCaretPosition(posicaoCursor);
                        }
                    }
                }
                );
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });
    }

    public void usuarios() {
//
//        //Aqui fica a conexao com os usuario definida por meio de um parametro simples -
//        //Tambem ficara a conexao com o banco de dados na parte de verificar FormLogin - 
//        if (jTextUser.getText().equalsIgnoreCase("itamar") && jPasswordPass.getText().equals("123")) {
//            if (jCheckLembrar.isSelected()) {
//                ClassSalvarTXT salva = new ClassSalvarTXT();
//                salva.setUser(jTextUser.getText());
//                salva.Salvar();
//            } else {
//                ClassSalvarTXT salva = new ClassSalvarTXT();
//                salva.setUser("");
//                salva.Salvar();
//            }
//            // Chama a tela Principal  
//            FormPrincipal tela1 = new FormPrincipal(jTextUser.getText() + "   -   ADMINISTRADOR");
//            tela1.setVisible(true);
//            this.dispose();
//        } else {
//            JOptionPane.showMessageDialog(null, "Usuario ou senha Incorretos!");
//            jTextUser.setText("");
//            jPasswordPass.setText("");
//            jTextUser.requestFocus();
//        }
    }

    public void loginConect() {
        UserDao userd = new UserDao();

        if (userd.CheckLogin(jTextUser.getText(), jPasswordPass.getText())) {
            // Se a checkBox estiver marcada irá salvar o nome do Usuario
            if (jCheckLembrar.isSelected()) {
                ClassSalvarTXT salva = new ClassSalvarTXT();
                salva.setUser(jTextUser.getText());
                salva.Salvar();
            } else {
                ClassSalvarTXT salva = new ClassSalvarTXT();
                salva.setUser("");
                salva.Salvar();
            }
            try {
                FormBackground formBackground = new FormBackground();
                Thread.sleep(1000);
                FormPrincipal tela1 = new FormPrincipal(jTextUser.getText() + "   -   ADMINISTRADOR");
                tela1.setVisible(true);
                this.dispose();

            } catch (InterruptedException ex) {
                Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha Incorretos!");
            jPasswordPass.setText("");
            jPasswordPass.requestFocus();
        }
    }

    public void lerTxt() {
        Path caminho = Paths.get("build\\classes\\projeto\\login\\user\\ultimouser\\login.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            jTextUser.setText(leitura);
        } catch (Exception erro) {
        }
    }

    private void setIcon() {
        //  Caminho até a imagem (OBS: A imagem deve estar no pacote onde o framerecebera o Icone)
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projeto/backgroud/if_Company_132680.png")));
    }
}
