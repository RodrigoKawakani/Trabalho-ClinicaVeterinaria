
package ClinicaVeterinaria;

public class Passaro extends Animal {

	private static final long serialVersionUID = 1L;

        @Override
	public String alimentacao() {
		return "Alpiste e frutas";
	}
    
        @Override
	public String cuidadosProprios() {
		return "Abrigo e estímulos";
	}
        
	public Passaro (String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Pássaro";
	}
}
