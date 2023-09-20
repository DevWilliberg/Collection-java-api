package List.OperacoesBasicas;

public class Tarefa {

    //atributo
    private String descricao;
    
    //construtor, recebe o paramentro descricao
    public Tarefa(String descricao){
        this.descricao = descricao;
    }   
    
    //já que o atributo é privado, o GET entra para retorna o valor da descrição
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString(){
        return  descricao;
    }
}
  

