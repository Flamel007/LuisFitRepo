
public class Pessoa {
	int id;
	String nome;
	int idade;
	
	public Pessoa(int idPar, String nomePar, int idadePar){
		this.id = idPar;
		this.nome = nomePar;
		this.idade = idadePar; }
	
	public int PegarId(){
		return id;
	}
	
	public String PegarNome(){
		return nome;
	}
	
	public int PegarIdade(){
		return idade;
	}
	
	public void AlterarId(int idPar){
		this.id = idPar;
	}
	
	public void AlterarNome(String nomePar){
		this.nome = nomePar;
	}
	
	public void AlterarIdade(int idadePar){
		this.idade = idadePar;
	}
	
	public void exibirInfo(){
		
	}

}
