
package reto5;


public abstract class Pokemon {
    protected String nombre; 
    protected char nivel;
    protected int salud;
    
    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract String gritar();

    public Pokemon(String nombre, char nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public char getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

     public void setNivel(byte nivel) throws NivelNegativoException {
        if (nivel <= 0) {
            throw new NivelNegativoException();
        } else {
            this.nivel = (char) nivel;
        }

    }

    public void setPuntajeSalud(int puntajeSalud) throws SaludNegativaException {
        if (puntajeSalud <= 0) {
            throw new SaludNegativaException();
        } else {
            this.salud = puntajeSalud;
        }
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    
}
