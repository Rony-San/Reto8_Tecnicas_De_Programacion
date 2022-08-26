
package reto5;


public class Pikachu extends Pokemon{

    public Pikachu(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }


    
    @Override
    public String gritar(){
        return "Pikachu!";
    }
    
        
    @Override
    public Pokemon evolucionar(){
        return new Raichu(this.nombre,this.nivel,this.salud);
    }
}
