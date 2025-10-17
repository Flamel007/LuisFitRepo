
public class Atleta extends Pessoa{
	
	String modalidade;
	
	public Atleta(int id, String nome, int idade, String modalidade){
		super(id, nome, idade);
		
		this.modalidade =  modalidade;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidadePar) {
		this.modalidade = modalidadePar;
	}
		
	}

