package List.OperacoesBasicas;

public class Item {

    // atributos
    private String nome;
    private double preco;
    private int quantidade;
    
    public Item( String item, double preco, int quantidade){
        this.nome = item;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome(){
        return nome;
        
    }

    public double getPreco(){
        return preco;
    
    }

    public int getQuantidade(){
        return quantidade;
    }
    

    @Override
    public String toString(){
        return "Item{" +
                    "nome='" + nome + '\'' +
                    ", preco=" + preco +
                    ", quant=" + quantidade +
                    '}';

     }
    
}
