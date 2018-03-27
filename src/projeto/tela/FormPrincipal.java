package projeto.tela;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import projeto.jdialog.configuser;
import projeto.login.FormLogin;
import projeto.telainterna.InternaCadUser;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal(String usuario) {
        initComponents();
        jLabelLogado.setText(usuario); //  Puxa o usuario Logado  //
        inicializa(); //  Carrega todos os itens que devem iniciar Junto ao programa  //

    }

    private FormPrincipal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jDesktopPaneFundo = new javax.swing.JDesktopPane();
        jLabelimgFundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelDataIcon = new javax.swing.JLabel();
        jLabelTimeIcon = new javax.swing.JLabel();
        jSeparatorData = new javax.swing.JSeparator();
        jSeparatorDataFinal = new javax.swing.JSeparator();
        jSeparatorHora = new javax.swing.JSeparator();
        jSeparatorHoraFinal = new javax.swing.JSeparator();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jSeparatorUser = new javax.swing.JSeparator();
        jLabelLogado = new javax.swing.JLabel();
        jSeparatorUserFinal = new javax.swing.JSeparator();
        jButtonUser = new javax.swing.JButton();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemTrocaUser = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuCadastros = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSepara1 = new javax.swing.JMenu();
        jMenuHospedes = new javax.swing.JMenu();
        jMenuSepara2 = new javax.swing.JMenu();
        jMenuQuartos = new javax.swing.JMenu();
        jMenuSepara3 = new javax.swing.JMenu();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuSepara4 = new javax.swing.JMenu();
        jMenuControladoria = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuSepara5 = new javax.swing.JMenu();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuSepara6 = new javax.swing.JMenu();
        jMenuColaboradores = new javax.swing.JMenu();
        jMenuItemCadColab = new javax.swing.JMenuItem();
        jMenuSepara7 = new javax.swing.JMenu();
        jMenCafe = new javax.swing.JMenu();
        jMenuSepara8 = new javax.swing.JMenu();
        jMenuEstacionamento = new javax.swing.JMenu();
        jMenuSepara9 = new javax.swing.JMenu();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuSepara10 = new javax.swing.JMenu();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelimgFundo.setForeground(new java.awt.Color(255, 255, 153));

        jDesktopPaneFundo.setLayer(jLabelimgFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneFundoLayout = new javax.swing.GroupLayout(jDesktopPaneFundo);
        jDesktopPaneFundo.setLayout(jDesktopPaneFundoLayout);
        jDesktopPaneFundoLayout.setHorizontalGroup(
            jDesktopPaneFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimgFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPaneFundoLayout.setVerticalGroup(
            jDesktopPaneFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneFundoLayout.createSequentialGroup()
                .addComponent(jLabelimgFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelDataIcon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDataIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Calendar_132582.png"))); // NOI18N
        jLabelDataIcon.setText("Data");

        jLabelTimeIcon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTimeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Compass_132701.png"))); // NOI18N
        jLabelTimeIcon.setText("Hora");

        jSeparatorData.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorData.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparatorDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorDataFinal.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparatorHora.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorHora.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparatorHoraFinal.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorHoraFinal.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jSeparatorUser.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorUser.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelLogado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jSeparatorUserFinal.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorUserFinal.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Male_132787.png"))); // NOI18N
        jButtonUser.setText("Usuario");
        jButtonUser.setBorderPainted(false);
        jButtonUser.setContentAreaFilled(false);
        jButtonUser.setFocusPainted(false);
        jButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorUserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(jSeparatorData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDataIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTimeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDataIcon)
                        .addComponent(jLabelTimeIcon))
                    .addComponent(jSeparatorUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparatorUserFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorData, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorDataFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorHora, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorHoraFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jMenuBarFuncoes.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBarFuncoes.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        jMenuBarFuncoes.setForeground(new java.awt.Color(204, 204, 204));
        jMenuBarFuncoes.setToolTipText("");
        jMenuBarFuncoes.setName(""); // NOI18N

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Company_132680.png"))); // NOI18N
        jMenuArquivo.setText("Arquivo");

        jMenuItem6.setText("jMenuItem6");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem7");
        jMenuArquivo.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        jMenuArquivo.add(jMenuItem8);

        jMenuItem9.setText("jMenuItem9");
        jMenuArquivo.add(jMenuItem9);

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/help.png"))); // NOI18N
        jMenuItemSobre.setText("Sobre");
        jMenuArquivo.add(jMenuItemSobre);
        jMenuArquivo.add(jSeparator2);

        jMenuItemTrocaUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenuItemTrocaUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Person_132730.png"))); // NOI18N
        jMenuItemTrocaUser.setText("Trocar usuario");
        jMenuItemTrocaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTrocaUserActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemTrocaUser);
        jMenuArquivo.add(jSeparator3);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jMenuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Exit_132751.png"))); // NOI18N
        jMenuItemExit.setText("Sair");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemExit);
        jMenuArquivo.add(jSeparator4);

        jMenuBarFuncoes.add(jMenuArquivo);

        jMenuSepara.setText("|");
        jMenuSepara.setEnabled(false);
        jMenuSepara.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara);

        jMenuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/user_add.png"))); // NOI18N
        jMenuCadastros.setText("Cadastros");
        jMenuCadastros.add(jSeparator1);

        jMenuBarFuncoes.add(jMenuCadastros);

        jMenuSepara1.setText("|");
        jMenuSepara1.setEnabled(false);
        jMenuSepara1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara1);

        jMenuHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_User_group_132619.png"))); // NOI18N
        jMenuHospedes.setText("Hospedes");
        jMenuBarFuncoes.add(jMenuHospedes);

        jMenuSepara2.setText("|");
        jMenuSepara2.setEnabled(false);
        jMenuSepara2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara2);

        jMenuQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/door_out.png"))); // NOI18N
        jMenuQuartos.setText("Quartos");
        jMenuBarFuncoes.add(jMenuQuartos);

        jMenuSepara3.setText("|");
        jMenuSepara3.setEnabled(false);
        jMenuSepara3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara3);

        jMenuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Accounting_132692.png"))); // NOI18N
        jMenuFinanceiro.setText("Financeiro");

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Wallet_132753.png"))); // NOI18N
        jMenuItem15.setText("Contas a Receber");
        jMenuFinanceiro.add(jMenuItem15);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_calculate_16x16_9750.gif"))); // NOI18N
        jMenuItem23.setText("Contas a Pagar");
        jMenuFinanceiro.add(jMenuItem23);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Buy_132700.png"))); // NOI18N
        jMenuItem14.setText("Compras");
        jMenuFinanceiro.add(jMenuItem14);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Dollar_132599.png"))); // NOI18N
        jMenuItem13.setText("Pagamentos");
        jMenuFinanceiro.add(jMenuItem13);

        jMenuBarFuncoes.add(jMenuFinanceiro);

        jMenuSepara4.setText("|");
        jMenuSepara4.setEnabled(false);
        jMenuSepara4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara4);

        jMenuControladoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Notes_132689.png"))); // NOI18N
        jMenuControladoria.setText("Controladoria");

        jMenuItem16.setText("Controle de Produção");
        jMenuControladoria.add(jMenuItem16);

        jMenuItem17.setText("Controle de Setores");
        jMenuControladoria.add(jMenuItem17);

        jMenuItem18.setText("Controle de Estoque");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenuControladoria.add(jMenuItem18);

        jMenuItem19.setText("Agendar Entrevista de Emprego");
        jMenuControladoria.add(jMenuItem19);

        jMenuItem20.setText("Agendar Reunião");
        jMenuControladoria.add(jMenuItem20);

        jMenuItem22.setText("Entrevistas de Emprego");
        jMenuControladoria.add(jMenuItem22);

        jMenuItem21.setText("Reuniões");
        jMenuControladoria.add(jMenuItem21);

        jMenuBarFuncoes.add(jMenuControladoria);

        jMenuSepara5.setText("|");
        jMenuSepara5.setEnabled(false);
        jMenuSepara5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara5);

        jMenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_graph2_16x16_9865.gif"))); // NOI18N
        jMenuRelatorios.setText("Relatórios");
        jMenuBarFuncoes.add(jMenuRelatorios);

        jMenuSepara6.setText("|");
        jMenuSepara6.setEnabled(false);
        jMenuSepara6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara6);

        jMenuColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_People_132775.png"))); // NOI18N
        jMenuColaboradores.setText("Colaboradores");

        jMenuItemCadColab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItemCadColab.setText("Cadastro de Colaboradores");
        jMenuItemCadColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadColabActionPerformed(evt);
            }
        });
        jMenuColaboradores.add(jMenuItemCadColab);

        jMenuBarFuncoes.add(jMenuColaboradores);

        jMenuSepara7.setText("|");
        jMenuSepara7.setEnabled(false);
        jMenuSepara7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara7);

        jMenCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_shopping_cart_16x16_9988.gif"))); // NOI18N
        jMenCafe.setText("Café");
        jMenuBarFuncoes.add(jMenCafe);

        jMenuSepara8.setText("|");
        jMenuSepara8.setEnabled(false);
        jMenuSepara8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara8);

        jMenuEstacionamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/if_Delivery_132748.png"))); // NOI18N
        jMenuEstacionamento.setText("Estacionamento");
        jMenuEstacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEstacionamentoActionPerformed(evt);
            }
        });
        jMenuBarFuncoes.add(jMenuEstacionamento);

        jMenuSepara9.setText("|");
        jMenuSepara9.setEnabled(false);
        jMenuSepara9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara9);

        jMenuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/icones/Application.png"))); // NOI18N
        jMenuConfiguracoes.setText("Configurações");
        jMenuBarFuncoes.add(jMenuConfiguracoes);

        jMenuSepara10.setText("|");
        jMenuSepara10.setEnabled(false);
        jMenuSepara10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBarFuncoes.add(jMenuSepara10);

        setJMenuBar(jMenuBarFuncoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneFundo)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneFundo)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //  Data  //
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jLabelDate.setText(formato.format(dataSistema));

        //  Hora  //
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        //  Abre um jOptionPane com a pergunta se deseja fechar o progama  //
        //  Este mesmo codido pode ser usado na tela FormPrincipal no Botao Logoff  //
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair ?", "Atençao", JOptionPane.YES_NO_OPTION, 2);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(sair);
        }


    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed


    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItemTrocaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTrocaUserActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja logoff?", "Atençao", JOptionPane.YES_NO_OPTION, 2);
        if (sair == JOptionPane.YES_OPTION) {
            try {
                Runtime.getRuntime().exec("calc");
            } catch (IOException ex) {
                Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemTrocaUserActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuEstacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstacionamentoActionPerformed


    }//GEN-LAST:event_jMenuEstacionamentoActionPerformed

    private void jMenuItemCadColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadColabActionPerformed

        InternaCadUser internaCadUser = new InternaCadUser();
        jDesktopPaneFundo.add(internaCadUser);
        internaCadUser.setLocation(
                jDesktopPaneFundo.getWidth() / 2 - internaCadUser.getWidth() / 2,
                jDesktopPaneFundo.getHeight() / 2 - internaCadUser.getHeight() / 2);
        internaCadUser.setVisible(true);

//        try {
//              internaCadUser.setMaximum(true);
//              } catch (PropertyVetoException e) {
//      }
    }//GEN-LAST:event_jMenuItemCadColabActionPerformed

    private void jButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserActionPerformed
        configuser configuser = new configuser(this, false);
        configuser.setModal(true);
        configuser.setLocation(
                jDesktopPaneFundo.getWidth() /850 - configuser.getWidth() / 850,
                jDesktopPaneFundo.getHeight() +25 - configuser.getHeight() +25);
        configuser.setVisible(true);


    }//GEN-LAST:event_jButtonUserActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUser;
    private javax.swing.JDesktopPane jDesktopPaneFundo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDataIcon;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelLogado;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTimeIcon;
    private javax.swing.JLabel jLabelimgFundo;
    private javax.swing.JMenu jMenCafe;
    public static final javax.swing.JMenu jMenuArquivo = new javax.swing.JMenu();
    public static final javax.swing.JMenuBar jMenuBarFuncoes = new javax.swing.JMenuBar();
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuColaboradores;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenu jMenuControladoria;
    private javax.swing.JMenu jMenuEstacionamento;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenu jMenuHospedes;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCadColab;
    public static final javax.swing.JMenuItem jMenuItemExit = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTrocaUser;
    private javax.swing.JMenu jMenuQuartos;
    private javax.swing.JMenu jMenuRelatorios;
    public static final javax.swing.JMenu jMenuSepara = new javax.swing.JMenu();
    private javax.swing.JMenu jMenuSepara1;
    private javax.swing.JMenu jMenuSepara10;
    private javax.swing.JMenu jMenuSepara2;
    private javax.swing.JMenu jMenuSepara3;
    private javax.swing.JMenu jMenuSepara4;
    private javax.swing.JMenu jMenuSepara5;
    private javax.swing.JMenu jMenuSepara6;
    private javax.swing.JMenu jMenuSepara7;
    private javax.swing.JMenu jMenuSepara8;
    private javax.swing.JMenu jMenuSepara9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparatorData;
    private javax.swing.JSeparator jSeparatorDataFinal;
    private javax.swing.JSeparator jSeparatorHora;
    private javax.swing.JSeparator jSeparatorHoraFinal;
    private javax.swing.JSeparator jSeparatorUser;
    private javax.swing.JSeparator jSeparatorUserFinal;
    // End of variables declaration//GEN-END:variables
//################################################   CODIGOS DE PROGRAMAÇÃO   ############################################################//
    public final void inicializa() {
        setExtendedState(MAXIMIZED_BOTH);
        //this.setLocationRelativeTo(null);
        fundo();
        setIcon();//  Iniciando a Classe do Ione Frame  //

    }

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jLabelTime.setText(String.format("%1$tH:%1$tM:%1$tS", now));

        }
    }

    public void fundo() {
        //  Pega o caminho da imagem  //
        ImageIcon ImgFundo = new ImageIcon(getClass().getResource("/projeto/fundo/395153-popular-polygon-background-3000x2000.jpg"));
        //  Define a imagem e o tamanho dela, nesse caso o tamanho da imagem é o tamnho do Form  //
        Image imgFundoPanel = ImgFundo.getImage();
        //  Define onde a imagem vai ficar, nesse caso no jLabelFundo  //
        jLabelimgFundo.setIcon(new ImageIcon(imgFundoPanel));
    }

    private void setIcon() {
        //  Caminho até a imagem (OBS: A imagem deve estar no pacote onde o framerecebera o Icone)  //
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projeto/fundo/if_Company_132680.png")));
    }
}
