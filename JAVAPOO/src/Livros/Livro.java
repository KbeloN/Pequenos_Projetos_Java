package Livros;

import javax.swing.JOptionPane;

public abstract class Livro {

    protected String nome;
    protected String distribuidora;
    protected String dataLancamento;
    protected double valor;
    protected int quantidade;
    protected static int DESCONTO = 20;

    public void setNome() {
        this.nome = JOptionPane.showInputDialog(null, "Qual o nome do livro?");
    }

    public String getNome() {
        return this.nome;
    }

    public void setDistribuidora() {
        this.distribuidora = JOptionPane.showInputDialog(null, "Qual foi a distribuidora?");
    }

    public String getDistribuidora() {
        return this.distribuidora;
    }

    public void setDataLancamento() {
        this.dataLancamento = JOptionPane.showInputDialog(null, "Qual foi a data de lancamento?");
    }

    public String getDataLancamento() {
        return this.dataLancamento;
    }

    public void setValor() {
        int novoValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o valor do livro?"));
        this.valor = novoValor - (novoValor * DESCONTO) / 100;
    }

    public double getValor() {
        return this.valor;
    }
    
    public void setQuantidade(){
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos deste livro tem no estoque?"));
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }

    public void cadastrarLivro() {
        this.setNome();
        this.setDistribuidora();
        this.setDataLancamento();
        this.setValor();
        this.setQuantidade();
    }

    public static void alterarDesconto() {
        DESCONTO = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o novo desconto em porcentagem?"));
    }

}
