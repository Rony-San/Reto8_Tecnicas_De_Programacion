
package reto5;

public class Pokebola {
    private final String tamaño;
    private Pokemon pokemon;

    public Pokebola(String tamaño, Pokemon pokemon) {
        this.tamaño = tamaño;
        this.pokemon = pokemon;
    }

    public Pokebola(){
        this.tamaño = "pequeño";
        this.pokemon = null;
    }
    
    
    public String getTamaño() {
        return tamaño;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
}
