package controller;

import model.Livro;

public class Main {

	public static void main(String[] args) {
		SistemaBiblioteca sistema= new SistemaBiblioteca();

        Livro livro1 = new Livro("Java Programming", "John Smith", 2019, 3);
        Livro livro2 = new Livro("Introduction to Algorithms", "Thomas Cormen", 2009, 2);
        Livro livro3 = new Livro("Clean Code", "Robert Martin", 2008, 1);

        sistema.cadastrarLivro(livro1);
        sistema.cadastrarLivro(livro2);
        sistema.cadastrarLivro(livro3);

        List<Livro> resultados = sistema.pesquisarLivro("Java Programming");

        if (!resultados.isEmpty()) {
            for (Livro livro : resultados) {
                System.out.println("Livro encontrado: " + livro.getTitulo());
            }
        } else {
            System.out.println("Nenhum livro encontrado.");
        }

        sistema.realizarEmprestimo(livro1);
        sistema.realizarDevolucao(livro1);
    }
}
