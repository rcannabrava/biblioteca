package model;

import java.util.ArrayList;
import java.util.List;

class SistemaBiblioteca {

	private List<Livro> livros;
	
	public SistemaBiblioteca() {
		livros = new ArrayList<>();
	}

	public void cadastrarLivro(Livro livro) {
		livros.add(livro);
	}

	public List<Livro> pesquisarLivro(String termo) {
		List<Livro> resultados = new ArrayList<>();

		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(termo) || livro.getAutor().equalsIgnoreCase(termo)) {
				resultados.add(livro);
			}
		}

		return resultados;
	}

	 public void realizarEmprestimo(Livro livro) {
	        if (livro.getNumeroDeCopias() > 0) {
	            livro.setNumeroDeCopias(livro.getNumeroDeCopias() - 1);
	            System.out.println("Empréstimo realizado com sucesso!");
	        } else {
	            System.out.println("Não há cópias disponíveis deste livro.");
	        }
	    }

	    public void realizarDevolucao(Livro livro) {
	        livro.setNumeroDeCopias(livro.getNumeroDeCopias() + 1);
	        System.out.println("Devolução realizada com sucesso!");
	    }
	}
