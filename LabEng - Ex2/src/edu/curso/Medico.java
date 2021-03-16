package edu.curso;

public class Medico {
	
	private String crm;
	private String nome;
	private String especialidade;
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nome=" + nome + ", especialidade=" + especialidade + "]";
	}
	
	
}
