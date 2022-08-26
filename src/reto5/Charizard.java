

package reto5;


public class Charizard extends Pokemon{

    public Charizard(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }


    
 

    
    @Override
    public String gritar(){
        return "Charizard!!";
    }
    
        
    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    

}
