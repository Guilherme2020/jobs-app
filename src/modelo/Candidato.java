package modelo;

public class Candidato {
	
	private String nomeCandidato;
	private String emailCandidato;
	private String miniApresentacaoCandidato;
	private Object curriculoCandidato;
	
	public void candidatarvaga(Vaga vaga){
		
		vaga.ReceberCandidato(this);
	}

	
	
	
	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getEmailcandidato() {
		return emailCandidato;
	}

	public void setEmailCandidato(String emailCandidato) {
		this.emailCandidato = emailCandidato;
	}

	public String getMiniApresentacaoCandidato() {
		return miniApresentacaoCandidato;
	}

	public void setMiniApresentacaoCandidato(String miniApresentacaoCandidato) {
		this.miniApresentacaoCandidato = miniApresentacaoCandidato;
	}

	public Object getCurriculoCandidato() {
		return curriculoCandidato;
	}

	public void setCurriculoCandidato(Object curriculoCandidato) {
		this.curriculoCandidato = curriculoCandidato;
	}




}
