
public class ClassePrincipal {

	public static void main(String[] args) {
		
		//Instanciar objeto atleta = criar objeto
		Atleta obat_1 = new Atleta(1, "Mikael", 17, "Futebol");
		Atleta obat_2 = new Atleta(2, "Leticia", 17, "Hipismo");
		
		obat_1.mostrarInformacoes();
		obat_2.mostrarInformacoes();
	}

}
