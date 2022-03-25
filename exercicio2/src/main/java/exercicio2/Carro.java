package exercicio2;

public class Carro {
	private int id;
	private String nome;
	private String marca;
	private int ano;

	public Carro() {
		this.id = -1;
		this.nome = "";
		this.marca = "";
		this.ano = 0;
	}

	public Carro(int id, String nome, String marca, int ano) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", nome=" + nome + ", marca=" + marca + ", ano=" + ano + "]";
	}
}
