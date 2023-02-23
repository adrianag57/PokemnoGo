package start;

import gimnasio.Gimnasio;
import pockemonGo.Charmander;
import pockemonGo.Pikachu;
import pockemonGo.Pokemon;
import pockemonGo.Squirtle;
import robot.Robot;

public class Start {

	public static void main(String[] args) {
		
		Pikachu pickachu = new Pikachu("Pika");
		Robot doraemon = new Robot();
		
		Gimnasio goFit = new Gimnasio();
		goFit.batalla(pickachu, doraemon);


		Pokemon[] miColeccion = new Pokemon[3];
		miColeccion[0] = new Pikachu("Pika");
		miColeccion[1] = new Charmander("Char");
		miColeccion[2] = new Squirtle("Quir");

		for(Pokemon pokemon: miColeccion) {
			
			// nombre del pokemon
			System.out.println(pokemon.getNombre());
			// tipo del pokemon
			
			switch(pokemon.getTipo()) {
			
				case Pokemon.POKEMON_ELECTRICO: System.out.println("electrico"); break;
				case Pokemon.POKEMON_FUEGO: System.out.println("fuego"); break;
				case Pokemon.POKEMON_AGUA: System.out.println("agua"); break;
			}
		}
		
	}

}
