package pockemonGo;

public class Charmander extends Pokemon implements Evolucionador{

	private int potenciaFuegoCola;
	
	public Charmander(String nombre) {
		super(nombre);
		potenciaFuegoCola = 100;
	}

	@Override
	public int getTipo() {
		
		return Pokemon.POKEMON_FUEGO;
	}

	@Override
	public int ataque() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int defensa() {
		// TODO Auto-generated method stub
		return 40;
	}
	
	public Pokemons evolucion() {
			
			return Evolucionador.Pokemons.CHARMELEON;
		}

}
