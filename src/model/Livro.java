package model;

public class Livro {

	private String autor, titulo;
	private int numeroDeCopias, anoDePublicacao;
	
	public Livro(String titulo, String autor, int anoDePublicacao, int numeroDeCopias) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.numeroDeCopias = numeroDeCopias;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public int getNumeroDeCopias() {
		return numeroDeCopias;
	}

	public void setNumeroDeCopias(int numeroDeCopias) {
		this.numeroDeCopias = numeroDeCopias;
	}

}
