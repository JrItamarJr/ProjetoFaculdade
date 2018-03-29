package projeto.form;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import projeto.bancodados.UserDao;
import projeto.classes.SalvarTXT;

/**
 *
 * @author JhonattanSouza_
 */
public class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
        this.getRootPane().setDefaultButton(jButtonEntrar);
        inicializacao();
//        jPasswordPass.requestFocus(); // Deixa o "jPasswordField" em foco //
    }

    private void exibirErro(javax.swing.JLabel label, String mensagem) {
        label.setVisible(true);
        label.setText(mensagem);
    }

    private boolean verificarCampo(String campo) {
        return campo != null && campo.trim().length() > 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordPass = new javax.swing.JPasswordField();
        jTextUser = new javax.swing.JTextField();
        jCheckLembrar = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLB_Minimizar = new javax.swing.JLabel();
        jLB_Fechar = new javax.swing.JLabel();
        jLB_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 340, 40));

        jPasswordPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordPass.setBorder(null);
        jPasswordPass.setOpaque(false);
        getContentPane().add(jPasswordPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 250, 30));

        jTextUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextUser.setBorder(null);
        jTextUser.setOpaque(false);
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 148, 250, 30));

        jCheckLembrar.setSelected(true);
        jCheckLembrar.setText("Lembrar usuario.");
        jCheckLembrar.setContentAreaFilled(false);
        getContentPane().add(jCheckLembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 100, 150, 40));

        jLB_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLB_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLB_MinimizarMouseReleased(evt);
            }
        });
        getContentPane().add(jLB_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 20));

        jLB_Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLB_Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLB_FecharMouseReleased(evt);
            }
        });
        getContentPane().add(jLB_Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 40));

        jLB_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/backgroud/login-background2.png"))); // NOI18N
        getContentPane().add(jLB_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLB_FecharMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLB_FecharMouseReleased
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair ?", "Atençao", JOptionPane.YES_NO_OPTION, 2);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLB_FecharMouseReleased

    private void jLB_MinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLB_MinimizarMouseReleased
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLB_MinimizarMouseReleased

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        loginConect();
        usuarios();
        

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    public void fecharFrame() {

    }

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
    private javax.swing.JLabel jLB_Fechar;
    private javax.swing.JLabel jLB_Minimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordPass;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
//################################################   CODIGOS DE PROGRAMAÇÃO   ############################################################//

    public void inicializacao() {
//        fundo(); // Inicia o contrutor da Imagem de fundo
        maiuscula(); // Inia o contrutor que deixa as letras sempres maiuscular no "jTextUser"
//        getRootPane().setDefaultButton(jButtonEntrar); // Deixa o "jButtonEntrar" em foco
//        jPasswordPass.requestFocus(); // Deixa o "jTextUser" em foco
        lerTxt(); // Ler o txt salvo com o Ultimo usuario logado
        setIcon(); // Inicia o Icone do Programa
    }

    // seta a imagem de fundo por meio de um parametro
//    public void fundo() {
//        // Pega o caminho da imagem
//        ImageIcon ImgFundo = new ImageIcon(getClass().getResource("/projeto/fundo/19585a37f6b458b.jpg"));
//        //Define a imagem e o tamanho dela, nesse caso o tamanho da imagem é o tamnho do Form
//        Image imgFundoPanel = ImgFundo.getImage().getScaledInstance(836, 398, Image.SCALE_DEFAULT);
//        //Define onde a imagem vai ficar, nesse caso no jLabelFundo
//        jLabelFundo.setIcon(new ImageIcon(imgFundoPanel));
//    }
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
//                SalvarTXT salva = new SalvarTXT();
//                salva.setUser(jTextUser.getText());
//                salva.Salvar();
//
//            } else {
//                SalvarTXT salva = new SalvarTXT();
//                salva.setUser("");
//                salva.Salvar();
//
//            }
//            // Chama a tela Principal  
//            FormPrincipal tela1 = new FormPrincipal(jTextUser.getText() + "   -   ADMINISTRADOR");
//            tela1.setVisible(true);
//            this.dispose();
//
//        } else if (jTextUser.getText().equalsIgnoreCase("winicius") && jPasswordPass.getText().equals("123")) {
//            if (jCheckLembrar.isSelected()) {
//                SalvarTXT salva = new SalvarTXT();
//                salva.setUser(jTextUser.getText());
//                salva.Salvar();
//
//            } else {
//                SalvarTXT salva = new SalvarTXT();
//                salva.setUser("");
//                salva.Salvar();
//
//            }
//            // Chama a tela Principal          
//            FormPrincipal tela1 = new FormPrincipal(jTextUser.getText() + "   -   ADMINISTRADOR");
//            FormPrincipal.jMenuArquivo.setVisible(false);
//            FormPrincipal.jMenuSepara.setVisible(false);
//            tela1.setVisible(true);
//            this.dispose();
//
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
            if (jCheckLembrar.isSelected()) {
                SalvarTXT salva = new SalvarTXT();
                salva.setUser(jTextUser.getText());
                salva.Salvar();

            } else {
                SalvarTXT salva = new SalvarTXT();
                salva.setUser("");
                salva.Salvar();
            }
            // Chama a tela Principal  
            FormPrincipal tela1 = new FormPrincipal(jTextUser.getText() + "   -   ADMINISTRADOR");
            tela1.setVisible(true);
            this.dispose();
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
