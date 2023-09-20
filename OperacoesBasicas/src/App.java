import List.OperacoesBasicas.CarrinhoDeCompra;
import List.OperacoesBasicas.ListaTarefas;

public class App {
    public static void main(String[] args) throws Exception {
      
        ListaTarefas listatarefa = new ListaTarefas();

        System.out.println("o número total de de itens na lista é: " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        listatarefa.adicionarTarefa("Tarefa 3");
        listatarefa.adicionarTarefa("Tarefa 3");
        listatarefa.adicionarTarefa("Tarefa 4");
         System.out.println("o número total de de itens na lista é: " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.removerTarefa("Tarefa 3");
         System.out.println("o número total de de itens na lista é: " + listatarefa.obterNumeroTotalTarefas());


        listatarefa.obterDescricoesTarefas(); 

        //Criando uma instância de carrinho de compra
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

         //Adicionando itens ao carrinho
        carrinhoDeCompra.adicionarItem("Lápis", 2d, 5);
        carrinhoDeCompra.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompra.adicionarItem("Borracha", 2d, 2);
    

        //Exibindo os itens do carrinho
        carrinhoDeCompra.exibirItens();

        //Calculando e exibindo valor total da compra
        System.out.println("O valor total da compre é =" + carrinhoDeCompra.calcularValorTotal());
    }
}
