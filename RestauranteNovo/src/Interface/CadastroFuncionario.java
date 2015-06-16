/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controlador.Controlador;
import Modelo.Funcionario;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Rafael
 */
public class CadastroFuncionario extends javax.swing.JDialog {
    Controlador control;
    PesqFuncionario pFuncionario;
    
    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); 
        control = new Controlador();
        pFuncionario = new PesqFuncionario(parent, true);
        rbComum.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoConta = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbComum = new javax.swing.JRadioButton();
        rbAdm = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEnder = new javax.swing.JTextArea();
        txtEndereco = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionario");
        setType(java.awt.Window.Type.UTILITY);

        jLabel2.setText("Nome*");

        jLabel3.setText("CPF*");

        jLabel4.setText("Login*");

        jLabel6.setText("Função");

        jLabel7.setText("Senha*");

        lblFoto.setBackground(new java.awt.Color(255, 255, 255));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("Foto");
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFoto.setPreferredSize(new java.awt.Dimension(60, 80));
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo da Conta"));

        tipoConta.add(rbComum);
        rbComum.setText("Comum");
        rbComum.setDisplayedMnemonicIndex(0);

        tipoConta.add(rbAdm);
        rbAdm.setText("Administrador");
        rbAdm.setDisplayedMnemonicIndex(1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbComum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAdm)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbComum)
                    .addComponent(rbAdm)))
        );

        jLabel8.setText("Tel*");

        jLabel9.setText("Cel");

        txtEnder.setColumns(20);
        txtEnder.setRows(5);
        jScrollPane1.setViewportView(txtEnder);

        txtEndereco.setText("Ender");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(txtEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFuncao)
                            .addComponent(txtTel)
                            .addComponent(txtCel)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLogin)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnAlterar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String login = txtLogin.getText();
        String senha = txtSenha.getText();
        int tipo;
        if (rbAdm.isSelected()){
            tipo = 1;
        } else {
            tipo = 0;
        }
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String funcao = txtFuncao.getText();
        String tel = txtTel.getText();
        String cel = txtCel.getText();
        String end = txtEndereco.getText(); 

        String msgErro = "";
        msgErro = validarCampo(nome, senha, login, cpf, tel, funcao, end, cel);
        msgErro = validarLogin(login);
        
        if("".equals(msgErro)){
            control.inserirFuncionario(nome, funcao, tipo, senha, lblFoto.getIcon(), login, cpf, tel, end, cel);
            int opcao = JOptionPane.showConfirmDialog(rootPane, "Funcionario inserido com suceso, deseja cadastrar outro?", "titulo", YES_NO_OPTION);
            if (opcao == 0){//resposta == sim
                limparCampos();
            } else if (opcao == 1){//resposta nao
                limparCampos();
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, msgErro);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        JFileChooser janelaArq = new JFileChooser();
        if (janelaArq.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File foto = janelaArq.getSelectedFile();
            mostrarFoto(new ImageIcon(foto.toString()));
        }
    }//GEN-LAST:event_lblFotoMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pFuncionario.setVisible(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String login = txtLogin.getText();
        String senha = txtSenha.getText();
        int tipo;
        if (rbAdm.isSelected()){
            tipo = 1;
        } else {
            tipo = 0;
        }
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String funcao = txtFuncao.getText();
        String tel = txtTel.getText();
        String cel = txtCel.getText();
        String end = txtEndereco.getText(); 
        
        String msgErro;
        msgErro = validarCampo(nome, senha, login, cpf, tel, funcao, end, cel);
        
        if("".equals(msgErro)){
            Funcionario fun = control.buscarFuncionarioLogin(login);
            byte[] bFile = control.IconToBytes(lblFoto.getIcon());
            fun.setCelularFuncionario(cel);
            fun.setCpfFuncionario(cpf);
            fun.setEnderecoFuncionario(end);
            fun.setFotoFuncionario(bFile);
            fun.setFuncaoFuncionario(funcao);
            fun.setNomeFuncionario(nome);
            fun.setSenhaFuncionario(senha);
            fun.setTelefoneFuncionario(tel);
            fun.setTipoFuncionario(tipo);
            control.alterarFuncionario(fun);
            int opcao = JOptionPane.showConfirmDialog(rootPane, "Usuario "+ login + " alterado com suceso, deseja cadastrar/alterar outro?", "titulo", YES_NO_OPTION);
            if (opcao == 0){//resposta == sim
                limparCampos();
            } else if (opcao == 1){//resposta nao
                limparCampos();
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, msgErro);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    public void limparCampos(){
        txtLogin.setText("");
        txtSenha.setText("");
        rbComum.setSelected(true);
        rbAdm.setSelected(false);
        txtNome.setText("");
        txtCPF.setText("");
        txtFuncao.setText("");
        txtTel.setText("");
        txtCel.setText("");
        txtEndereco.setText("");
        lblFoto.setIcon(null);
        lblFoto.setText("Foto");
    }
    
    public void mostrarFoto(ImageIcon imagem){
        imagem.setImage(imagem.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
        lblFoto.setText("");
        lblFoto.setIcon(imagem);        
    }
    
    public String validarLogin(String login){
        String msgErro = "";
        if (control.buscarFuncionarioLogin(login) != null){
            msgErro = msgErro + "Já existe um usuário com o login informado";
        }
        return msgErro;
    }
    
    public String validarCampo(String nome, String senha, String login, String cpf, String telefone, String funcao, String endereco, String celular){
        String msgErro = "";
        if ("".equals(nome)){
            msgErro = msgErro + "campo Nome vazio \n";
        }
        if (nome.length() > 50){
            msgErro = msgErro + "campo nome deve ser menor que 50 letras \n";
        }

        if (funcao.length() > 45){
            msgErro = msgErro + "campo funcao deve ser menor que 45 letras \n";
        }
        
        if ("".equals(senha)){
            msgErro = msgErro + "campo senha vazio \n";
        }
        if (senha.length() > 45){
            msgErro = msgErro + "campo senha deve ser menor que 45 letras \n";
        }

        if ("".equals(login)){
            msgErro = msgErro + "campo login vazio \n";
        }
        if (login.length() > 8){
            msgErro = msgErro + "campo login deve ser menor que 8 letras \n";
        }

        if ("".equals(cpf)){
            msgErro = msgErro + "campo cpf vazio \n";
        }
        if (cpf.length() > 11){
            msgErro = msgErro + "campo cpf deve ser menor que 11 letras \n";
        }

        if ("".equals(telefone)){
            msgErro = msgErro + "campo telefone vazio \n";
        }
        if (telefone.length() > 10){
            msgErro = msgErro + "campo telefone deve ser menor que 10 letras \n";
        }

        if (endereco.length() > 200){
            msgErro = msgErro + "campo endereco deve ser menor que 200 letras \n";
        }

        if (celular.length() > 11){
            msgErro = msgErro + "campo deve ser menor que 11 letras \n";
        }
        return msgErro;
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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroFuncionario dialog = new CadastroFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JRadioButton rbAdm;
    private javax.swing.JRadioButton rbComum;
    private javax.swing.ButtonGroup tipoConta;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextArea txtEnder;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}