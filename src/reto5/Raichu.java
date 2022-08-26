
package reto5;

public class Raichu extends Pokemon {

    public Raichu(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }



    
    @Override
    public String gritar(){
        return "Raichu!";
    }
    
        
    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }
}
