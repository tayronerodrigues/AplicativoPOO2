/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controlador.Controlador;
import Modelo.Funcionario;
import Modelo.ItemPedido;
import Modelo.Mesa;
import Modelo.Pedido;
import Modelo.Produto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class JanelaPrincipal extends javax.swing.JFrame {
    JanelaLogin jLogin;
    SelecionarProduto selProd;
    CadastroFuncionario cFuncionario;
    JanelaAltSenha jASenha;
    CadastroProduto cProduto;
    Funcionario funLogado = null;
    Produto prodSelecionado;
    Controlador control;
    int qtdMesas;
    
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        control = new Controlador();
        setLocationRelativeTo(null);
        statusJanela(-1);
        jLogin = new JanelaLogin(this, true);
        cFuncionario = new CadastroFuncionario(this, true);
        jASenha = new JanelaAltSenha(this, true);
        cProduto = new CadastroProduto(this, true);
        selProd = new SelecionarProduto(this, true);
        txtnMesas.setText("10");
        qtdMesas = 10;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFecharConta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbMesOcup = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        btnPagamento = new javax.swing.JButton();
        pnlAddItem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnPesqProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        spnMesa = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spnQtd = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnMesas = new javax.swing.JTextField();
        btnOkMesas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnLogin = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        mnCadastro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        mnRelatorio = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gourmet Max");
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pnlFecharConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Fechar Conta"));

        jLabel4.setText("Mesa");

        cmbMesOcup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMesOcupItemStateChanged(evt);
            }
        });

        jLabel5.setText("Valor R$");

        txtValorTotal.setEditable(false);
        txtValorTotal.setText(" 0,00");

        jLabel6.setText("Forma de Pagamento");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", " " }));

        btnPagamento.setText("Realizar Pagamento");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFecharContaLayout = new javax.swing.GroupLayout(pnlFecharConta);
        pnlFecharConta.setLayout(pnlFecharContaLayout);
        pnlFecharContaLayout.setHorizontalGroup(
            pnlFecharContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFecharContaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFecharContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFecharContaLayout.createSequentialGroup()
                        .addGroup(pnlFecharContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFecharContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlFecharContaLayout.createSequentialGroup()
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cmbMesOcup, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pnlFecharContaLayout.setVerticalGroup(
            pnlFecharContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFecharContaLayout.createSequentialGroup()
                .addGroup(pnlFecharContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbMesOcup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFecharContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlAddItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Item"));

        jLabel1.setText("Produto");

        btnPesqProduto.setText("...");
        btnPesqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor R$");

        txtValor.setEditable(false);
        txtValor.setText(" 0,00");

        jLabel3.setText("Mesa");

        btnAddItem.setText("Adicionar Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        spnMesa.setModel(new javax.swing.SpinnerNumberModel(1, 0, 50, 1));

        jLabel9.setText("Quantidade:");

        spnQtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        javax.swing.GroupLayout pnlAddItemLayout = new javax.swing.GroupLayout(pnlAddItem);
        pnlAddItem.setLayout(pnlAddItemLayout);
        pnlAddItemLayout.setHorizontalGroup(
            pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnlAddItemLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlAddItemLayout.createSequentialGroup()
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddItemLayout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        pnlAddItemLayout.setVerticalGroup(
            pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddItemLayout.createSequentialGroup()
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(spnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnAddItem)
                        .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))))
        );

        jLabel7.setText("Usuario Logado:");

        lblUsuario.setText("Usuario");

        jLabel8.setText("Numero total de mesas:");

        btnOkMesas.setText("Ok");
        btnOkMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkMesasActionPerformed(evt);
            }
        });

        mnLogin.setText("Login");

        jMenuItem5.setText("Logar/Mudar usuário");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnLogin.add(jMenuItem5);

        jMenuItem10.setText("Desconectar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        mnLogin.add(jMenuItem10);

        jMenuItem11.setText("Trocar Senha");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        mnLogin.add(jMenuItem11);

        jMenuBar1.add(mnLogin);

        mnCadastro.setText("Cadastro");

        jMenuItem1.setText("Funcionario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnCadastro.add(jMenuItem1);

        jMenuItem2.setText("Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnCadastro.add(jMenuItem2);

        jMenuItem8.setText("Categoria");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnCadastro.add(jMenuItem8);

        jMenuBar1.add(mnCadastro);

        mnRelatorio.setText("Relatórios");

        jMenuItem3.setText("Listar Clientes");
        mnRelatorio.add(jMenuItem3);

        jMenuItem4.setText("Listar Produtos");
        mnRelatorio.add(jMenuItem4);

        jMenuItem9.setText("Listar Categorias");
        mnRelatorio.add(jMenuItem9);

        jMenuBar1.add(mnRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOkMesas)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlFecharConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFecharConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblUsuario)
                    .addComponent(jLabel8)
                    .addComponent(txtnMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkMesas)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        cFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if ( jLogin.getUsuarioLogado() == null){
            if (funLogado == null)
                statusJanela(-1); //por padrão essa numero deve ser "-1"
            else
                statusJanela(funLogado.getTipoFuncionario());
        } else {
            funLogado = jLogin.getUsuarioLogado();
            statusJanela(funLogado.getTipoFuncionario());
        }
        carregarComboMesas();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if(funLogado == null){
            JOptionPane.showMessageDialog(rootPane, "Nenhum Funcionario Logado");   
        } else {
            jASenha.setVisible(true);
            if(!(jASenha.novaSenha().equals(""))){
                funLogado.setSenhaFuncionario(jASenha.novaSenha);
                control.alterarFuncionario(funLogado);
                jASenha.limparCampos();
            }
        }

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        funLogado = null;
        statusJanela(-1);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        cProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnOkMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkMesasActionPerformed
        String msgErro = "";
        int nMesas = 0;
        try {
            nMesas = Integer.parseInt(txtnMesas.getText());
            if(nMesas > 50){
                msgErro = msgErro + "numero deve ser menor que 50";
            }
        } catch (NumberFormatException nfe) {
            msgErro = msgErro + "Esse campo aceita apenas números\n";
        }
        
        if("".equals(msgErro)){
            cadastrarMesas(nMesas);
        }
        carregarComboMesas();
    }//GEN-LAST:event_btnOkMesasActionPerformed

    private void btnPesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdutoActionPerformed
        prodSelecionado = null;
        selProd.setVisible(true);
        prodSelecionado = selProd.getProdutoSelecionado();
        if(prodSelecionado != null){
            txtProduto.setText(prodSelecionado.getNomeProduto());
            txtValor.setText(String.valueOf(prodSelecionado.getPrecoVendaProduto()));
        } else {
            txtProduto.setText("");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnPesqProdutoActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if(prodSelecionado != null){
            Pedido ped = control.buscarPedidoPorMesa((int) spnMesa.getValue());
            if(ped != null){
                ItemPedido item = new ItemPedido(ped, prodSelecionado, (prodSelecionado.getPrecoVendaProduto()*((int) spnQtd.getValue())), ((int) spnQtd.getValue()));
                control.inserirItemPedido(item);
                ped.setValorTotalPedido(item.getPrecoItemPedido());
                control.alterarPedido(ped);
            } else {
                Mesa mesa = control.buscarMesa((int) spnMesa.getValue());//busca a mesa no banco para deixar na memoria
                Pedido novo = new Pedido(funLogado, mesa, 0.00, Calendar.getInstance().getTime(), "aberto", Calendar.getInstance().getTime(), null);
                control.inserirPedido(novo);
                ItemPedido item = new ItemPedido(novo, prodSelecionado, (prodSelecionado.getPrecoVendaProduto()*((int) spnQtd.getValue())), ((int) spnQtd.getValue()));
                control.inserirItemPedido(item);
                novo.setValorTotalPedido(item.getPrecoItemPedido());
                control.alterarPedido(novo);
            }
            txtValor.setText("");
            txtProduto.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto");
        }
        carregarComboMesas();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        List<Pedido> ped = carregarPedidosAbertos();
        Mesa mesa = (Mesa) cmbMesOcup.getSelectedItem();
        for (Pedido ped1 : ped) {
            if (ped1.getMesa().toString().equals(mesa.toString())) {
                ped1.setStatusPedido("fechado");
                ped1.setHorarioFechamentoPedido(Calendar.getInstance().getTime());
                control.alterarPedido(ped1);
                carregarComboMesas();
            }
        }
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void cmbMesOcupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMesOcupItemStateChanged
        List<Pedido> ped = carregarPedidosAbertos();
        Mesa mesa = (Mesa) cmbMesOcup.getSelectedItem();
        for (Pedido ped1 : ped) {
            if (ped1.getMesa().toString().equals(mesa.toString())) {
                txtValorTotal.setText(String.valueOf(ped1.getValorTotalPedido()));
            }
        }
    }//GEN-LAST:event_cmbMesOcupItemStateChanged
    
    public List<Pedido> carregarPedidosAbertos(){
        return control.listarPedidosAbertos();
    }
    
    public void carregarComboMesas(){
        List ped = carregarPedidosAbertos();
        ArrayList<Mesa> mesas = new ArrayList();
        Iterator<Pedido> itped = ped.iterator();
        
        while(itped.hasNext()){
            mesas.add(itped.next().getMesa());
        }
        
        if (mesas != null) {
            cmbMesOcup.setModel(new DefaultComboBoxModel(mesas.toArray()));
        } else {
            cmbMesOcup.setModel(new DefaultComboBoxModel());
        }
    }
    
    public void cadastrarMesas(int nMesas){
        List<Mesa> lstMesas = control.listarMesas();
        if (nMesas <= lstMesas.size()){
            qtdMesas = nMesas;
        } else {
            qtdMesas = nMesas;
            for(int i = 1; i < (nMesas - lstMesas.size());i++){
                control.inserirMesa(new Mesa());
            }
            txtnMesas.setText(String.valueOf(nMesas));
            
        }
    }    
    
    public void statusJanela(int status){
        switch(status){
            case 0:
                mnRelatorio.setVisible(false);
                mnCadastro.setVisible(false);
                pnlFecharConta.setVisible(true);;
                pnlAddItem.setVisible(true);
                lblUsuario.setText(funLogado.getNomeFuncionario());
                btnOkMesas.setVisible(false);
                txtnMesas.setEditable(false);
                break;    
            case 1:
                mnCadastro.setVisible(true);
                pnlFecharConta.setVisible(true);;
                pnlAddItem.setVisible(true);    
                mnRelatorio.setVisible(true);
                lblUsuario.setText(funLogado.getNomeFuncionario());
                txtnMesas.setEditable(true);
                btnOkMesas.setVisible(true);
                carregarComboMesas();
                break;
            default:
                mnCadastro.setVisible(false);
                pnlFecharConta.setVisible(false);
                pnlAddItem.setVisible(false);    
                mnRelatorio.setVisible(false);
                lblUsuario.setText("Nenhum");
                btnOkMesas.setVisible(false);
                txtnMesas.setEditable(false);
                carregarComboMesas();
                break;
        }
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnOkMesas;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnPesqProduto;
    private javax.swing.JComboBox cmbMesOcup;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnLogin;
    private javax.swing.JMenu mnRelatorio;
    private javax.swing.JPanel pnlAddItem;
    private javax.swing.JPanel pnlFecharConta;
    private javax.swing.JSpinner spnMesa;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtnMesas;
    // End of variables declaration//GEN-END:variables
}