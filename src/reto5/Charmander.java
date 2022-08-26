

package reto5;


public class Charmander extends Pokemon{

    public Charmander(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }
    
  
    
    @Override
    public String gritar(){
        return "Charmander!";
    }
    
        
    @Override
    public Pokemon evolucionar(){
        return new Charmeleon(this.nombre,this.nivel,this.salud);
    }

    

}
