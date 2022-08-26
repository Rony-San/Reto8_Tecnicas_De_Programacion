
package reto5;

public class Wartortle extends Pokemon {

    public Wartortle(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }
   
    
    @Override
    public String gritar(){
        return "Wartortle!";
    }
         
    @Override
    public Pokemon evolucionar(){
        return new Blastoise(this.nombre,this.nivel,this.salud);
    }
    
  
}
