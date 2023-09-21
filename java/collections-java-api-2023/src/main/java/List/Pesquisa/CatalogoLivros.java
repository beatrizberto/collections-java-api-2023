package main.java.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;


    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        this.listaLivros.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> resultadoPesquisaAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    resultadoPesquisaAutor.add(livro);
                }
            }
        } else {
            System.out.println("O catálogo está vazio!");
        }

        return resultadoPesquisaAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> resultadoPesquisaIntervaloAnos = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                resultadoPesquisaIntervaloAnos.add(livro);
            }

        }
        return resultadoPesquisaIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro resultadoPesquisaPorTitulo = null;
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                resultadoPesquisaPorTitulo = livro;
                break;
            }
        }

        return resultadoPesquisaPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("Titulo1", "Fulano", 2023);
        catalogoLivros.adicionarLivros("Titulo2", "Ciclano", 2023);
        catalogoLivros.adicionarLivros("Titulo2", "Beltrano", 2020);

        //System.out.println("Catálogo completo: " + catalogoLivros.getListaLivros());



        System.out.println(catalogoLivros.pesquisarPorAutor("zezinho"));




    }

}
