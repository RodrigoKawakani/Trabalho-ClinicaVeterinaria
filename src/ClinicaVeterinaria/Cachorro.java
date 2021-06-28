
package ClinicaVeterinaria;

public class Cachorro extends Animal {

	private static final long serialVersionUID = 1L;

        @Override
	public String alimentacao() {
		return "Ração e carne";
	}
    
        @Override
	public String cuidadosProprios() {
		return "Banho, tosa e passeio";
	}
        
	public Cachorro(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Cachorro";
	}
}
