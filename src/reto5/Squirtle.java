
package reto5;


public class Squirtle extends Pokemon{

    public Squirtle(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }
     


    
    @Override
    public String gritar(){
        return "Squirtle!";
    }
    
        
    @Override
    public Pokemon evolucionar(){
        return new Wartortle(this.nombre,this.nivel,this.salud);
    }
}
