/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercearia;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class CompraGUI extends javax.swing.JPanel {
    //armazena temp, o produto com o código informado no ato da busca
    private Produto produtoSelecionado;
    private ModeloTabelaCompra carrinhoComprasTab;
    private double precoCompra;
    
    public CompraGUI() {
        initComponents();
        precoCompra = 0.0;
        meuInitComponents();
    }
    
    private void meuInitComponents(){
        this.carrinhoComprasTab = new ModeloTabelaCompra(this);
        
        //criar a conexao dos dados do obj da classecom a tabela GUI
        tabelaCarrinho.setModel(carrinhoComprasTab);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codTxt = new javax.swing.JTextField();
        nomeTxt = new javax.swing.JTextField();
        quantTxt = new javax.swing.JTextField();
        precoUnitTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        RemoverBtn = new javax.swing.JButton();
        FinalizarBtn = new javax.swing.JButton();
        EstoqueBtn = new javax.swing.JButton();
        addProdutoBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Preço Parc.");

        codTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        codTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codTxtKeyTyped(evt);
            }
        });

        nomeTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nomeTxt.setEnabled(false);

        quantTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quantTxt.setText("1");
        quantTxt.setEnabled(false);
        quantTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantTxtKeyReleased(evt);
            }
        });

        precoUnitTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        precoUnitTxt.setEnabled(false);

        tabelaCarrinho.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaCarrinho);

        RemoverBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RemoverBtn.setText("Remover");
        RemoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverBtnActionPerformed(evt);
            }
        });

        FinalizarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FinalizarBtn.setText("Finalizar");
        FinalizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarBtnActionPerformed(evt);
            }
        });

        EstoqueBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EstoqueBtn.setText("Estoque");

        addProdutoBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addProdutoBtn.setText("Add Produto");
        addProdutoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProdutoBtnMouseClicked(evt);
            }
        });
        addProdutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdutoBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Valor Total:R$");

        totalTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalTxt.setText("0,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addProdutoBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(codTxt)
                        .addComponent(nomeTxt)
                        .addComponent(precoUnitTxt)
                        .addComponent(quantTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(FinalizarBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RemoverBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(EstoqueBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precoUnitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RemoverBtn)
                        .addGap(143, 143, 143)
                        .addComponent(EstoqueBtn)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProdutoBtn)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(totalTxt)
                    .addComponent(FinalizarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codTxtKeyTyped
            
        if(evt.getKeyChar() == '\n'){


            //avaliando se existe informação no campo do código
            if(!codTxt.getText().isEmpty()){
                try{
                    //avaliamos se o dado informado é numérico
                    int cod = Integer.parseInt(codTxt.getText());

                    //efetuamos a busca do produto com o código informado na GUI
                    produtoSelecionado = FakeBancoDados.consultaProdutoCod(cod);

                    //avaliamos se existe o produto com o código informado
                    if(produtoSelecionado != null){
                        //atualizamos os campos com dados do produto
                        nomeTxt.setText(produtoSelecionado.getNome());
                        precoUnitTxt.setText(produtoSelecionado.getPreco()+"");
                        quantTxt.setEnabled(true);
                    }else{
                        //não cadastrado
                        JOptionPane.showMessageDialog(null, "Produto não cadastrado", "Código", JOptionPane.INFORMATION_MESSAGE);
                    }

                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "O código deve ser um valo numérico", "erro no cóodigo", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_codTxtKeyTyped

    private void quantTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantTxtKeyPressed
        //quando voce preciosa a tecla por tempo
    }//GEN-LAST:event_quantTxtKeyPressed

    private void quantTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantTxtKeyReleased
        
        //o operador do caixa vai informar uma nova quantidade
        //calcular o preço parcial desses produtos (lote)
        
        if(!quantTxt.getText().isEmpty()){
            try{
                int quantidade = Integer.parseInt(quantTxt.getText());

                double parc = produtoSelecionado.getPreco() * quantidade;
                precoUnitTxt.setText(String.format("%.2f", parc));
            }catch(NumberFormatException ex){
                precoUnitTxt.setText("N/A");
            }
        }else{
            //campo da quantidade sem informacao
            precoUnitTxt.setText("N/A");
            
        }
    }//GEN-LAST:event_quantTxtKeyReleased

    private void addProdutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdutoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProdutoBtnActionPerformed

    private void addProdutoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProdutoBtnMouseClicked
        
        if(produtoSelecionado != null && !precoUnitTxt.getText().equals("N/A")){
            //produto está apto a ser adicionado na tabela
            
            int quantidade = Integer.parseInt(quantTxt.getText());
            if(quantidade <= produtoSelecionado.getQuantidade()){
                Produto vendido = new Produto(produtoSelecionado.getCodigo(), produtoSelecionado.getNome(), produtoSelecionado.getPreco(), quantidade);
                
                //produtoSelecionado.setQuantidade(produtoSelecionado.getQuantidade() - quantidade);
                
                //aqui estamos atualizando o valor da compra do cliente
                precoCompra += produtoSelecionado.getPreco() * quantidade;
                totalTxt.setText(String.format("%.2f", precoCompra));
                
                //limpando as informações para que um produto seja selecionado
                codTxt.setText("");
                quantTxt.setText("1");
                precoUnitTxt.setText("");
                produtoSelecionado = null;
                quantTxt.setEnabled(false);
                nomeTxt.setText("");
                
                //add o produto vendido à tabela (carrinho)
                this.carrinhoComprasTab.addNovoProduto(vendido);
                tabelaCarrinho.updateUI();
            }else{
                //não tem a quantidade suficiente para concretizar a venda
                JOptionPane.showMessageDialog(null, "Não há quantidade suficiente para realizar a venda deste produto", "quantidade insuf.", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            //produto que não existe ou que a quantidade não condiz com o padrão esperado
            JOptionPane.showMessageDialog(null, "A quantidade de produtos informada deve ser um valor numérico", "erro de quantidade inválida", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addProdutoBtnMouseClicked

    private void RemoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverBtnActionPerformed
        int linha = tabelaCarrinho.getSelectedRow();
        
        if(linha >-1){
            //posso remover o produto
            int op = JOptionPane.showConfirmDialog(null, "Desejo remover o produto selecionado", "confirmação de exclusão", JOptionPane.YES_NO_OPTION);
            
            if(op == JOptionPane.YES_OPTION){
                //remover o produto e atualizar
                
                String senha = JOptionPane.showInputDialog(null, "Informe a senha do gerente", "operação restrita", JOptionPane.INFORMATION_MESSAGE);
                
                if(senha != null && senha.equals("ifmg")){
                        
                    carrinhoComprasTab.removeProdutoCarrinho(linha);
                    atualizaQuantidades();
                }
            }
        }else{
            //produto nao foi selecionado para remocao
            JOptionPane.showMessageDialog(null, "primeiro é preciso selecionar algum produto", "selecionar!!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_RemoverBtnActionPerformed
    private boolean verificaQuantidade(){
        Vector<Produto> produtos = carrinhoComprasTab.produtosCarrinho();
        
        for(int i = 0; i < produtos.size(); i++){
            Produto estoque = FakeBancoDados.consultaProdutoCod(produtos.get(i).getCodigo());
            if(produtos.get(i).getQuantidade() > estoque.getQuantidade()){
                JOptionPane.showMessageDialog(null, "A quantidade do produto: " +estoque.getNome() + " não é suficiente para realizar a venda", "Quantidade insuficiente", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        return true;
    }
    private void FinalizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarBtnActionPerformed
        // verificar se temos as quantidades dos produtos que estão sendo vendidos
        if(verificaQuantidade() == true){
            //atualizar o nosso banco de dados fake (memória ram)
            Vector<Produto> produtos = carrinhoComprasTab.produtosCarrinho();
            
            for(int i = 0; i < produtos.size(); i++){
                Produto estoque = FakeBancoDados.consultaProdutoCod(produtos.get(i).getCodigo());
                estoque.setQuantidade(estoque.getQuantidade() - produtos.get(i).getQuantidade());
            }
            
            //zerando o valor total para a próxima compra
            precoCompra = 0.0;
            totalTxt.setText("0.0");
        
            //remover os produtos do carrinho de compra (da compra finalizada)
            carrinhoComprasTab.limpaCarrinho();
            tabelaCarrinho.updateUI();
        }
        
    }//GEN-LAST:event_FinalizarBtnActionPerformed

    
    public void atualizaQuantidades(){
        //atualiza as informacoes da tabela
        tabelaCarrinho.updateUI();
        
        //atualizamos o valor da compra com os produtos do carrinho
        double preco = carrinhoComprasTab.calculaPrecoParcialCompra();
        
        totalTxt.setText(String.format("%.2f", preco));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EstoqueBtn;
    private javax.swing.JButton FinalizarBtn;
    private javax.swing.JButton RemoverBtn;
    private javax.swing.JButton addProdutoBtn;
    private javax.swing.JTextField codTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField precoUnitTxt;
    private javax.swing.JTextField quantTxt;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JLabel totalTxt;
    // End of variables declaration//GEN-END:variables
}
