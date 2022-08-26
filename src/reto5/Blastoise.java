
package reto5;


public class Blastoise extends Pokemon{

    public Blastoise(String nombre, char nivel, int salud) {
        super(nombre, nivel, salud);
    }

    
    @Override
    public String gritar(){
        return "Blastoise!";
    }
         
    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }
    
}
