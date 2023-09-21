package main.java.List.operacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {

        this.itemList = new ArrayList<>();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        Iterator<Item> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
            }

        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itemList) {
            double valorParcial = item.getPreco() * item.getQuantidade();
            valorTotal += valorParcial;
        }
        return valorTotal;

    }


    public void exibirItens() {
        System.out.println(getItemList().toString());

    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2, 5);
        carrinhoDeCompras.adicionarItem("Caneta", 5, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 8, 10);

        carrinhoDeCompras.removerItem("Lápis");


        carrinhoDeCompras.exibirItens();
        System.out.println();
        System.out.println("Valor total: R$" + carrinhoDeCompras.calcularValorTotal());

    }

}

