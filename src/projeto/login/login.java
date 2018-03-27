package projeto.login;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import projeto.tela.principal;
import projeto.txt.salvartxt;

public final class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        inicializacao();
        jPasswordPass.requestFocus(); // Deixa o "jPasswordField" em foco // 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIconPass = new javax.swing.JLabel();
        jLabelIconUser = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jSeparatorLogin = new javax.swing.JSeparator();
        jButtonExit = new javax.swing.JButton();
        jCheckLembrar = new javax.swing.JCheckBox();
        jTextUser = new javax.swing.JTextField();
        jPasswordPass = new javax.swing.JPasswordField();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabelIconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/imagens/if_Lock_132010.png"))); // NOI18N
        getContentPane().add(jLabelIconPass);
        jLabelIconPass.setBounds(35, 175, 48, 48);

        jLabelIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/imagens/if_User_131997.png"))); // NOI18N
        getContentPane().add(jLabelIconUser);
        jLabelIconUser.setBounds(35, 85, 48, 48);

        jButtonEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonEntrar.setDefaultCapable(false);
        jButtonEntrar.setFocusPainted(false);
        jButtonEntrar.setFocusable(false);
        jButtonEntrar.setPreferredSize(new java.awt.Dimension(38, 19));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(103, 260, 270, 48);

        jSeparatorLogin.setForeground(new java.awt.Color(102, 102, 102));
        jSeparatorLogin.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparatorLogin.setRequestFocusEnabled(false);
        getContentPane().add(jSeparatorLogin);
        jSeparatorLogin.setBounds(390, 32, 2, 315);

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Erase_132784.png"))); // NOI18N
        jButtonExit.setBorderPainted(false);
        jButtonExit.setContentAreaFilled(false);
        jButtonExit.setDefaultCapable(false);
        jButtonExit.setFocusPainted(false);
        jButtonExit.setFocusable(false);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(760, 5, 30, 24);

        jCheckLembrar.setSelected(true);
        jCheckLembrar.setText("Lembrar usuario.");
        jCheckLembrar.setContentAreaFilled(false);
        getContentPane().add(jCheckLembrar);
        jCheckLembrar.setBounds(103, 230, 270, 23);

        jTextUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextUser);
        jTextUser.setBounds(103, 85, 270, 48);

        jPasswordPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jPasswordPass);
        jPasswordPass.setBounds(103, 175, 270, 48);

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\itamar\\Desktop\\ProjetoHotel\\iconeHotel.png")); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(410, 30, 360, 320);
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 790, 377);

        setSize(new java.awt.Dimension(789, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
// Abre um jOptionPane com a pergunta se deseja fechar o progama
// este mesmo codido pode ser usado na tela principal no Botao Logoff
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair ?", "Atençao", JOptionPane.YES_NO_OPTION, 2);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(sair);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        usuarios();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
                if ("Windows".equals(info.getName())) {;
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JCheckBox jCheckLembrar;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelIconPass;
    private javax.swing.JLabel jLabelIconUser;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPasswordField jPasswordPass;
    private javax.swing.JSeparator jSeparatorLogin;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
//################################################   CODIGOS DE PROGRAMAÇÃO   ############################################################//

    public void inicializacao() {
        fundo(); // Inicia o contrutor da Imagem de fundo
        maiuscula(); // Inia o contrutor que deixa as letras sempres maiuscular no "jTextUser"
        getRootPane().setDefaultButton(jButtonEntrar); // Deixa o "jButtonEntrar" em foco
        jPasswordPass.requestFocus(); // Deixa o "jTextUser" em foco
        lerTxt(); // Ler o txt salvo com o Ultimo usuario logado
        setIcon(); // Inicia o Icone do Programa
    }

    // seta a imagem de fundo por meio de um parametro
    public void fundo() {
        // Pega o caminho da imagem
        ImageIcon ImgFundo = new ImageIcon(getClass().getResource("/projeto/fundo/19585a37f6b458b.jpg"));
        //Define a imagem e o tamanho dela, nesse caso o tamanho da imagem é o tamnho do Form
        Image imgFundoPanel = ImgFundo.getImage().getScaledInstance(836, 398, Image.SCALE_DEFAULT);
        //Define onde a imagem vai ficar, nesse caso no jLabelFundo
        jLabelFundo.setIcon(new ImageIcon(imgFundoPanel));
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

        //Aqui fica a conexao com os usuario definida por meio de um parametro simples -
        //Tambem ficara a conexao com o banco de dados na parte de verificar login - 
        if (jTextUser.getText().equalsIgnoreCase("itamar") && jPasswordPass.getText().equals("123")) {
            if (jCheckLembrar.isSelected()) {
                salvartxt salva = new salvartxt();
                salva.setUser(jTextUser.getText());
                salva.Salvar();

            } else {
                salvartxt salva = new salvartxt();
                salva.setUser("");
                salva.Salvar();

            }
            // Chama a tela Principal  
            principal tela1 = new principal(jTextUser.getText() + "   -   ADMINISTRADOR");
            tela1.setVisible(true);
            this.dispose();

        } else if (jTextUser.getText().equalsIgnoreCase("winicius") && jPasswordPass.getText().equals("123")) {
            if (jCheckLembrar.isSelected()) {
                salvartxt salva = new salvartxt();
                salva.setUser(jTextUser.getText());
                salva.Salvar();

            } else {
                salvartxt salva = new salvartxt();
                salva.setUser("");
                salva.Salvar();

            }
            // Chama a tela Principal          
            principal tela1 = new principal(jTextUser.getText() + "   -   ADMINISTRADOR");
            principal.jMenuArquivo.setVisible(false);
            principal.jMenuSepara.setVisible(false);
            tela1.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha Incorretos!");
            jTextUser.setText("");
            jPasswordPass.setText("");
            jTextUser.requestFocus();
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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projeto/fundo/if_Company_132680.png")));
    }
}
