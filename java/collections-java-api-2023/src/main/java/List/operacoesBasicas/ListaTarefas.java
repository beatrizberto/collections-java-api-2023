package main.java.List.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
        //ao instanciar ListaTarefas, uma lista vazia é criada!
    }

    public void adicionarTarefa(String descricao) {

        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List <Tarefa> novaLista = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (!tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                novaLista.add(tarefa);
            }
            tarefaList = novaLista;
            //TODO: refazer o método usando iterator
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }


    public void obterDescricoesTarefas() {
        System.out.println(tarefaList.toString());
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");

        listaTarefas.removerTarefa("tarefa 1");

        System.out.println("O número total de tarefas na lista é " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }


}


