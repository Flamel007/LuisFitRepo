
public class Treinador extends Pessoa {
	
	String especialidade;
	
	public Treinador(int idPar, String nomePar, int idadePar, String especialidadePar){
		super(idPar, nomePar, idadePar);
		
		this.especialidade = especialidadePar;
	}
	
	public String getTreinador() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidadePar) {
		this.especialidade = especialidadePar;
	}
	
	
	
	
}
