package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;


/*Sempre que for criado um objeto do tipo lista de tarefa terá um atributo
tarefaList com um array vazio */
public class ListaTarefas{

    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    //Metodo adidionarTarefa
    public void adicionarTarefa (String descricao){
      tarefaList.add (new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
       
        /*Criada uma lista vazia com o nome tarefasParaRemover
        Sera adicionado nessa lista a descricao da tarefa para verificar dentro  do FOR se a mesma
        Existe dentro Lista, caso exista será adicionada dentro da lista tarefasParaRemover*/
        
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        
        for(Tarefa t: tarefaList) {
           /*Se a descricao for igual ao do metodo removerTarefas */
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        //Agora chamamos a lista original tarefaList e utilizamos o removeAll, para remover tudo que estiver
        //dentro de tarefasParaRemover
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
       return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);

        
    }
}
   