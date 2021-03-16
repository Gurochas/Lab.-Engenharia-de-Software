package edu.curso;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String dataag;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataag() {
		return dataag;
	}

	public void setDataag(String dataag) {
		this.dataag = dataag;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", dataag=" + dataag + "]";
	}
	
}
