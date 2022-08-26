
package reto5;


public class Charmeleon extends Pokemon{

    public Charmeleon(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }




    @Override
    public String gritar() {
        return "Charmeleon!";
    
}

    @Override
    public Pokemon evolucionar() {
        return new Charizard(this.nombre,this.nivel,this.salud);
    }
}