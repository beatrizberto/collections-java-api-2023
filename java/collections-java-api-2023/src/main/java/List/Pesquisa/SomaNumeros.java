package main.java.List.Pesquisa;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int sum = 0;
        for (int i : listaNumeros) {
            sum += i;
        }
        return sum;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = listaNumeros.get(0);
        for (int i = 1; i < listaNumeros.size(); i++) {
            int elementoAtual = listaNumeros.get(i);
            if (elementoAtual > maiorNumero) {
                maiorNumero = elementoAtual; // Atualiza o maior número se encontrarmos um maior
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = listaNumeros.get(0);
        for (int i = 1; i < listaNumeros.size(); i++) {
            int elementoAtual = listaNumeros.get(i);
            if (elementoAtual < menorNumero) {
                menorNumero = elementoAtual; // Atualiza o menor número se encontrarmos um menor
            }

        }
        return menorNumero;

    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }



    public static void main(String[] args) {
        SomaNumeros lista1 = new SomaNumeros();
        lista1.adicionarNumero(1);
        //lista1.adicionarNumero(2);
        lista1.adicionarNumero(4);
       // lista1.adicionarNumero(6);
      //  lista1.adicionarNumero(8);
        //lista1.adicionarNumero(22);

        lista1.exibirNumeros();
        System.out.println("Maior número: " + lista1.encontrarMaiorNumero());
        System.out.println("Menor número: " + lista1.encontrarMenorNumero());

        System.out.println("Soma: " + lista1.calcularSoma());





    }

}

