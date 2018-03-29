package projeto.telainterna;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InternaCadUser extends javax.swing.JInternalFrame {

    private static int sequence = 1;
    private int id;

    public InternaCadUser() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPaneCadUser = new javax.swing.JPanel();
        jTextIdentidade = new javax.swing.JFormattedTextField();
        jDataNasc = new com.toedter.calendar.JDateChooser();
        jLabelCPF = new javax.swing.JLabel();
        jTextCPF = new javax.swing.JFormattedTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelDateNasc = new javax.swing.JLabel();
        jLabelIdent = new javax.swing.JLabel();
        jLabelCell = new javax.swing.JLabel();
        jTextNunFixo = new javax.swing.JFormattedTextField();
        jLabelTelFixo = new javax.swing.JLabel();
        jTextNumCal = new javax.swing.JFormattedTextField();
        jLabelSalario = new javax.swing.JLabel();
        jTextSalario = new javax.swing.JFormattedTextField();
        jLabelPiss = new javax.swing.JLabel();
        jtextPis = new javax.swing.JFormattedTextField();
        jLabelCartTrab = new javax.swing.JLabel();
        jTextCartTrab = new javax.swing.JFormattedTextField();
        jLabelFuncao = new javax.swing.JLabel();
        jComboFuncao = new javax.swing.JComboBox<>();
        jLabelFilial = new javax.swing.JLabel();
        jComboFilial = new javax.swing.JComboBox<>();
        jPainelGuia = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabelRua = new javax.swing.JLabel();
        jTextRua = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabelnUM = new javax.swing.JLabel();
        jTextNum = new javax.swing.JTextField();
        jLabelUF = new javax.swing.JLabel();
        jComboUF = new javax.swing.JComboBox<>();
        jLabelCidade = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtchegada = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        txtsaidaalmoco = new javax.swing.JFormattedTextField();
        txtsaida = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        txtvolta = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextCarga = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        combotransporte = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        txtgratificacao = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        txtvlrhr = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelId = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jPanelOpcoes = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonRelatorio = new javax.swing.JButton();
        jButtonLimpaTela = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jPaneFunc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jPanelFiltros = new javax.swing.JPanel();
        jCheckBoxADM = new javax.swing.JCheckBox();
        jCheckBoxTI = new javax.swing.JCheckBox();
        jCheckBoxRecep = new javax.swing.JCheckBox();
        jCheckBoxCPD = new javax.swing.JCheckBox();
        jCheckBoxFiscal = new javax.swing.JCheckBox();
        jCheckBoxGerente = new javax.swing.JCheckBox();
        jCheckBoxDiurno = new javax.swing.JCheckBox();
        jCheckBoxDateNasc = new javax.swing.JCheckBox();
        jCheckBoxNoturno = new javax.swing.JCheckBox();
        jCheckBoxHoraChegada = new javax.swing.JCheckBox();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonLimpTela = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Funcionarios");

        jPaneCadUser.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        try {
            jTextIdentidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextIdentidade.setEnabled(false);

        jDataNasc.setEnabled(false);

        jLabelCPF.setText("CPF");
        jLabelCPF.setEnabled(false);

        try {
            jTextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCPF.setEnabled(false);

        jLabelNome.setText("Nome");
        jLabelNome.setEnabled(false);

        jTextNome.setEnabled(false);
        jTextNome.setMaximumSize(new java.awt.Dimension(6, 20));
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jLabelDateNasc.setText("Data de Nascimento");
        jLabelDateNasc.setEnabled(false);

        jLabelIdent.setText("Identidade");
        jLabelIdent.setEnabled(false);

        jLabelCell.setText("Celular");
        jLabelCell.setEnabled(false);

        try {
            jTextNunFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextNunFixo.setEnabled(false);

        jLabelTelFixo.setText("Telefone Fixo");
        jLabelTelFixo.setEnabled(false);

        try {
            jTextNumCal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextNumCal.setEnabled(false);

        jLabelSalario.setText("Salário");
        jLabelSalario.setEnabled(false);

        try {
            jTextSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ####,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextSalario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextSalario.setDoubleBuffered(true);
        jTextSalario.setDragEnabled(true);
        jTextSalario.setEnabled(false);

        jLabelPiss.setText("PIS");
        jLabelPiss.setEnabled(false);

        try {
            jtextPis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.######.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtextPis.setEnabled(false);

        jLabelCartTrab.setText("Carteira de Trabalho");
        jLabelCartTrab.setEnabled(false);

        try {
            jTextCartTrab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######/###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCartTrab.setEnabled(false);

        jLabelFuncao.setText("Função");
        jLabelFuncao.setEnabled(false);

        jComboFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Costureiro", "Auxiliar de Costura", "Bordador", "Mecanico", " " }));
        jComboFuncao.setEnabled(false);

        jLabelFilial.setText("Filial");
        jLabelFilial.setEnabled(false);

        jComboFilial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1 - Matrix", "2 - São Domingos do Norte", "3 - Nova Venecia" }));
        jComboFilial.setEnabled(false);

        jPainelGuia.setEnabled(false);

        jLabelRua.setText("Rua");
        jLabelRua.setEnabled(false);

        jTextRua.setEnabled(false);

        jLabel35.setText("Bairro");
        jLabel35.setEnabled(false);

        jTextBairro.setEnabled(false);

        jLabelnUM.setText("Numero");
        jLabelnUM.setEnabled(false);

        jTextNum.setEnabled(false);

        jLabelUF.setText("UF");
        jLabelUF.setEnabled(false);

        jComboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboUF.setEnabled(false);

        jLabelCidade.setText("Cidade");
        jLabelCidade.setEnabled(false);

        jTextCidade.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelRua)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextRua)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextCidade)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel35)
                                                .addGap(0, 195, Short.MAX_VALUE))
                                            .addComponent(jTextBairro))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUF)
                                            .addComponent(jComboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelnUM)
                                    .addComponent(jTextNum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelnUM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPainelGuia.addTab("Endereço", jPanel6);

        jLabel30.setText("Chegada");
        jLabel30.setEnabled(false);

        try {
            txtchegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtchegada.setEnabled(false);

        jLabel31.setText("Saida para Almoço");
        jLabel31.setEnabled(false);

        try {
            txtsaidaalmoco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtsaidaalmoco.setEnabled(false);

        try {
            txtsaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtsaida.setEnabled(false);

        jLabel32.setText("Volta do Almoço");
        jLabel32.setEnabled(false);

        try {
            txtvolta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtvolta.setEnabled(false);

        jLabel33.setText("Saida");
        jLabel33.setEnabled(false);

        try {
            jTextCarga.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCarga.setEnabled(false);

        jLabel6.setText("Carga Horaria");
        jLabel6.setEnabled(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setEnabled(false);

        jLabel7.setText("Turno");
        jLabel7.setEnabled(false);

        jCheckBox1.setText("Diurno");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setEnabled(false);

        jCheckBox2.setText("Noturno");
        jCheckBox2.setContentAreaFilled(false);
        jCheckBox2.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtchegada)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsaidaalmoco, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtvolta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(txtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtchegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsaidaalmoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        jPainelGuia.addTab("Horaios", jPanel4);

        combotransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Transporte Pessoal", "Transporte da Empresa", "Vale Transporte", "Outro" }));
        combotransporte.setEnabled(false);

        jLabel41.setText("Gratificação");
        jLabel41.setEnabled(false);

        try {
            txtgratificacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ####,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtgratificacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtgratificacao.setEnabled(false);

        jLabel42.setText("Valor da Hora Extra");
        jLabel42.setEnabled(false);

        try {
            txtvlrhr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ####,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtvlrhr.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtvlrhr.setEnabled(false);

        jLabel37.setText("Especialidade");
        jLabel37.setToolTipText("");
        jLabel37.setEnabled(false);

        jLabel40.setText("Transporte");
        jLabel40.setEnabled(false);

        jTextField3.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField3)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(combotransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgratificacao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addGap(0, 84, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel37)
                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtvlrhr, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combotransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgratificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvlrhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPainelGuia.addTab("Propriedades", jPanel5);

        jLabel8.setText("Usuario");
        jLabel8.setEnabled(false);

        jTextField4.setEnabled(false);

        jLabel9.setText("Senha");
        jLabel9.setEnabled(false);

        jPasswordField1.setEnabled(false);

        jSeparator2.setEnabled(false);

        jLabel10.setText("Nivel de Acesso");
        jLabel10.setEnabled(false);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("Nivel #")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setEnabled(false);

        jCheckBox3.setText("Administrador");
        jCheckBox3.setEnabled(false);

        jCheckBox5.setText("Recepcionista");
        jCheckBox5.setEnabled(false);

        jCheckBox6.setText("CPD");
        jCheckBox6.setEnabled(false);

        jCheckBox4.setText("TI");
        jCheckBox4.setEnabled(false);

        jCheckBox7.setText("Fiscal");
        jCheckBox7.setEnabled(false);

        jCheckBox8.setText("Gerente");
        jCheckBox8.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox3)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox6))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPainelGuia.addTab("Sistema", jPanel7);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPainelGuia.addTab("Mensagem", jPanel9);

        jLabelId.setText("ID");

        javax.swing.GroupLayout jPaneCadUserLayout = new javax.swing.GroupLayout(jPaneCadUser);
        jPaneCadUser.setLayout(jPaneCadUserLayout);
        jPaneCadUserLayout.setHorizontalGroup(
            jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                        .addComponent(jLabelDateNasc)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelIdent)
                        .addGap(52, 52, 52)
                        .addComponent(jLabelCPF)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPainelGuia)
                            .addGroup(jPaneCadUserLayout.createSequentialGroup()
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNumCal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCell))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelFixo)
                                    .addComponent(jTextNunFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                                        .addComponent(jLabelSalario)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextSalario)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneCadUserLayout.createSequentialGroup()
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboFuncao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtextPis, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPaneCadUserLayout.createSequentialGroup()
                                                .addComponent(jLabelPiss)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                                        .addComponent(jLabelFuncao)
                                        .addGap(138, 138, 138)))
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCartTrab)
                                    .addComponent(jTextCartTrab)
                                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboFilial, javax.swing.GroupLayout.Alignment.TRAILING, 0, 189, Short.MAX_VALUE)
                                            .addComponent(jLabelFilial)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneCadUserLayout.createSequentialGroup()
                                .addComponent(jDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextCPF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneCadUserLayout.createSequentialGroup()
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                                        .addComponent(jLabelId)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                                        .addComponent(jLabelNome)
                                        .addGap(260, 260, 260))
                                    .addComponent(jTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPaneCadUserLayout.setVerticalGroup(
            jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateNasc)
                    .addComponent(jLabelIdent)
                    .addComponent(jLabelCPF))
                .addGap(6, 6, 6)
                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneCadUserLayout.createSequentialGroup()
                        .addComponent(jDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneCadUserLayout.createSequentialGroup()
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelFixo)
                                    .addComponent(jLabelCell))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextNumCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNunFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneCadUserLayout.createSequentialGroup()
                                .addComponent(jLabelSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPiss)
                            .addComponent(jLabelCartTrab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtextPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCartTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFuncao)
                            .addComponent(jLabelFilial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPaneCadUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPainelGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);

        jButtonRelatorio.setText("Relatorio");
        jButtonRelatorio.setEnabled(false);

        jButtonLimpaTela.setText("Limpar tela");
        jButtonLimpaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpaTelaActionPerformed(evt);
            }
        });

        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcoesLayout = new javax.swing.GroupLayout(jPanelOpcoes);
        jPanelOpcoes.setLayout(jPanelOpcoesLayout);
        jPanelOpcoesLayout.setHorizontalGroup(
            jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcoesLayout.createSequentialGroup()
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelOpcoesLayout.setVerticalGroup(
            jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonRelatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFinalizar)
                    .addComponent(jButtonLimpaTela)
                    .addComponent(jButtonNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPaneFunc.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionarios"));

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Função", "Turno"
            }
        ));
        jScrollPane2.setViewportView(jTableFuncionarios);
        if (jTableFuncionarios.getColumnModel().getColumnCount() > 0) {
            jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTableFuncionarios.getColumnModel().getColumn(1).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(85);
            jTableFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPaneFuncLayout = new javax.swing.GroupLayout(jPaneFunc);
        jPaneFunc.setLayout(jPaneFuncLayout);
        jPaneFuncLayout.setHorizontalGroup(
            jPaneFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneFuncLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneFuncLayout.setVerticalGroup(
            jPaneFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneFuncLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelFiltros.setBorder(javax.swing.BorderFactory.createTitledBorder("Filstros"));

        jCheckBoxADM.setText("Administrador");

        jCheckBoxTI.setText("TI");

        jCheckBoxRecep.setText("Recepcionista");

        jCheckBoxCPD.setText("CPD");

        jCheckBoxFiscal.setText("Fiscal");

        jCheckBoxGerente.setText("Gerente");

        jCheckBoxDiurno.setText("Diurno");

        jCheckBoxDateNasc.setText("Data Nasc");

        jCheckBoxNoturno.setText("Noturno");

        jCheckBoxHoraChegada.setText("Hora Chegada");
        jCheckBoxHoraChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHoraChegadaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");

        jButtonLimpTela.setText("Limpar Pesquisa");

        javax.swing.GroupLayout jPanelFiltrosLayout = new javax.swing.GroupLayout(jPanelFiltros);
        jPanelFiltros.setLayout(jPanelFiltrosLayout);
        jPanelFiltrosLayout.setHorizontalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBoxRecep)
                        .addComponent(jCheckBoxADM))
                    .addComponent(jCheckBoxCPD, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBoxTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxFiscal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxGerente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBoxNoturno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxHoraChegada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxDiurno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDateNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpTela))
                .addContainerGap())
        );
        jPanelFiltrosLayout.setVerticalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                            .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBoxTI)
                                .addComponent(jCheckBoxADM))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBoxGerente)
                                .addComponent(jCheckBoxRecep))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBoxFiscal)
                                .addComponent(jCheckBoxCPD)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFiltrosLayout.createSequentialGroup()
                            .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBoxDateNasc)
                                .addComponent(jCheckBoxDiurno))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBoxNoturno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBoxHoraChegada)))
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonLimpTela))
                    .addComponent(jButtonPesquisar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPaneCadUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addComponent(jPaneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPaneFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPaneCadUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jButtonLimpaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaTelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpaTelaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String id = jTextID.getText();
        String nome = jTextNome.getText();
        String funcao = jComboFuncao.getSelectedItem().toString();
        String turno1 = jCheckBox1.getText();
        String turno2 = jCheckBox2.getText();
        DefaultTableModel val = (DefaultTableModel) jTableFuncionarios.getModel();
        val.addRow(new String[] {id,nome,funcao,turno1,turno2});
        limpaCampo();
        jTextID.requestFocus();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jCheckBoxHoraChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHoraChegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxHoraChegadaActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        ativaCampo();
        int ids = this.id = sequence++;
        jTextID.setText(Integer.toString(ids));


    }//GEN-LAST:event_jButtonNovoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combotransporte;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonLimpTela;
    private javax.swing.JButton jButtonLimpaTela;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBoxADM;
    private javax.swing.JCheckBox jCheckBoxCPD;
    private javax.swing.JCheckBox jCheckBoxDateNasc;
    private javax.swing.JCheckBox jCheckBoxDiurno;
    private javax.swing.JCheckBox jCheckBoxFiscal;
    private javax.swing.JCheckBox jCheckBoxGerente;
    private javax.swing.JCheckBox jCheckBoxHoraChegada;
    private javax.swing.JCheckBox jCheckBoxNoturno;
    private javax.swing.JCheckBox jCheckBoxRecep;
    private javax.swing.JCheckBox jCheckBoxTI;
    private javax.swing.JComboBox<String> jComboFilial;
    private javax.swing.JComboBox<String> jComboFuncao;
    private javax.swing.JComboBox<String> jComboUF;
    private com.toedter.calendar.JDateChooser jDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCartTrab;
    private javax.swing.JLabel jLabelCell;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDateNasc;
    private javax.swing.JLabel jLabelFilial;
    private javax.swing.JLabel jLabelFuncao;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdent;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPiss;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelTelFixo;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JLabel jLabelnUM;
    private javax.swing.JTabbedPane jPainelGuia;
    private javax.swing.JPanel jPaneCadUser;
    private javax.swing.JPanel jPaneFunc;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelFiltros;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelOpcoes;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JFormattedTextField jTextCPF;
    private javax.swing.JFormattedTextField jTextCarga;
    private javax.swing.JFormattedTextField jTextCartTrab;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextID;
    private javax.swing.JFormattedTextField jTextIdentidade;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNum;
    private javax.swing.JFormattedTextField jTextNumCal;
    private javax.swing.JFormattedTextField jTextNunFixo;
    private javax.swing.JTextField jTextRua;
    private javax.swing.JFormattedTextField jTextSalario;
    private javax.swing.JFormattedTextField jtextPis;
    private javax.swing.JFormattedTextField txtchegada;
    private javax.swing.JFormattedTextField txtgratificacao;
    private javax.swing.JFormattedTextField txtsaida;
    private javax.swing.JFormattedTextField txtsaidaalmoco;
    private javax.swing.JFormattedTextField txtvlrhr;
    private javax.swing.JFormattedTextField txtvolta;
    // End of variables declaration//GEN-END:variables
public void ativaCampo() {
            txtchegada.setEnabled(true);
        txtgratificacao.setEnabled(true);
        txtsaida.setEnabled(true);
        txtsaidaalmoco.setEnabled(true);
        txtvlrhr.setEnabled(true);
        txtvolta.setEnabled(true);
        jTextCarga.setEnabled(true);
        jTextArea1.setEnabled(true);
        jTextBairro.setEnabled(true);
        jTextCPF.setEnabled(true);
        jTextCartTrab.setEnabled(true);
        jTextCidade.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextID.setEnabled(true);
        jTextIdentidade.setEnabled(true);
        jTextNome.setEnabled(true);
        jTextNum.setEnabled(true);
        jTextNumCal.setEnabled(true);
        jTextNunFixo.setEnabled(true);
        jTextRua.setEnabled(true);
        jTextSalario.setEnabled(true);
        jtextPis.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jCheckBox8.setEnabled(true);
        jPainelGuia.setEnabled(true);
        jDataNasc.setEnabled(true);
        jPaneFunc.setEnabled(true);
        jPaneCadUser.setEnabled(true);
        jPanel4.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        jPanel9.setEnabled(true);
        jPaneFunc.setEnabled(true);
        jPasswordField1.setEnabled(true);
        jTextCarga.setEnabled(true);
        jLabelnUM.setEnabled(true);
        jLabel10.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabelCPF.setEnabled(true);
        jLabelCartTrab.setEnabled(true);
        jLabelCell.setEnabled(true);
        jLabelnUM.setEnabled(true);
        jLabelUF.setEnabled(true);
        jLabelTelFixo.setEnabled(true);
        jLabelSalario.setEnabled(true);
        jLabelRua.setEnabled(true);
        jLabelPiss.setEnabled(true);
        jLabelNome.setEnabled(true);
        jLabelIdent.setEnabled(true);
        jLabelId.setEnabled(true);
        jLabelFuncao.setEnabled(true);
        jLabelFilial.setEnabled(true);
        jLabelDateNasc.setEnabled(true);
        jLabelCidade.setEnabled(true);
        jComboFilial.setEnabled(true);
        jComboFuncao.setEnabled(true);
        jComboUF.setEnabled(true);
        combotransporte.setEnabled(true);
        jFormattedTextField1.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonFinalizar.setEnabled(true);
        jButtonLimpaTela.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonRelatorio.setEnabled(true);
        jButtonSalvar.setEnabled(true);

    }
public void limpaCampo() {
        txtchegada.setText("");
        txtgratificacao.setText("");
        txtsaida.setText("");
        txtsaidaalmoco.setText("");
        txtvlrhr.setText("");
        txtvolta.setText("");
        jTextCarga.setText("");
        jTextArea1.setText("");
        jTextBairro.setText("");
        jTextCPF.setText("");
        jTextCartTrab.setText("");
        jTextCidade.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextID.setText("");
        jTextIdentidade.setText("");
        jTextNome.setText("");
        jTextNum.setText("");
        jTextNumCal.setText("");
        jTextNunFixo.setText("");
        jTextRua.setText("");
        jTextSalario.setText("");
        jtextPis.setText("");
        jCheckBox1.setText("");
        jCheckBox2.setText("");
        jCheckBox3.setText("");
        jCheckBox4.setText("");
        jCheckBox5.setText("");
        jCheckBox6.setText("");
        jCheckBox7.setText("");
        jCheckBox8.setText("");
        jPasswordField1.setText("");
        jTextCarga.setText("");
        jLabelnUM.setText("");
        jLabel10.setText("");
        jLabel30.setText("");
        jLabel31.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel35.setText("");
        jLabel37.setText("");
        jLabel40.setText("");
        jLabel41.setText("");
        jLabel42.setText("");
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabelCPF.setText("");
        jLabelCartTrab.setText("");
        jLabelCell.setText("");
        jLabelnUM.setText("");
        jLabelUF.setText("");
        jLabelTelFixo.setText("");
        jLabelSalario.setText("");
        jLabelRua.setText("");
        jLabelPiss.setText("");
        jLabelNome.setText("");
        jLabelIdent.setText("");
        jLabelId.setText("");
        jLabelFuncao.setText("");
        jLabelFilial.setText("");
        jLabelDateNasc.setText("");
        jLabelCidade.setText("");
        jComboFilial.setSelectedItem(" ");
        jComboFuncao.setSelectedItem(" ");
        jComboUF.setSelectedItem(" ");
        combotransporte.setSelectedItem(" ");
        jFormattedTextField1.setText("");
        jButtonEditar.setText("");
        jButtonExcluir.setText("");
        jButtonFinalizar.setText("");
        jButtonLimpaTela.setText("");
        jButtonNovo.setText("");
        jButtonPesquisar.setText("");
        jButtonRelatorio.setText("");
        jButtonSalvar.setText("");
    }
}
