
package reto3;



public class Reto3 {

    public static void main(String[] args) {
        String descripcionVendedor = "Una persona trabajadora con gran experiencia en servicio"
                + "al cliente";
        
        
        
        // Creación de un objeto de la clase vendedor 
        
        Vendedor vendedor = null;
        try {
            vendedor = new Vendedor(2023,"10337661941","lise"
                    ,"Calambas Madrid",24,5000000,descripcionVendedor);
        } catch (VendedorMenorDeEdadException ex) {
            System.err.println(ex.getMessage());
        } catch (AnioDeIngresoException ex) {
            System.err.println(ex.getMessage());
        }
        
        // Creación de objetos llantas y añadiendolos a una array LLantas
        Llanta[] llantas = new Llanta[4];
        for (int i = 0 ; i <4 ; i++){
            Llanta llanta = null;
            try {
                llanta = new Llanta("Pirelli","Nuevo-2017",3);
            } catch (PesoNegativoException ex) {
                System.err.println(ex.getMessage());
            }
            llantas[i]=llanta;
        }
        
        // Creación de objetos motor  
        
        Motor motor = null;
        try {
            motor = new Motor(800,"HONDA","Serie 1354-asd 2017",150,"Motor clasico" );
        } catch (PesoNegativoException ex) {
            System.err.println(ex.getMessage());
        }
        
        
        // Creación objeto Vehiculo 
        
        Vehiculo vehiculo = null;
        try {
            vehiculo = new Vehiculo(2017,"JW159E","HONDA","2017",1000,"Negro","Vehiculo"
                    + "para toda la familia",400000,vendedor,llantas,motor);
        } catch (KilometrajeNegativoException ex) {
           System.err.println(ex.getMessage());
        }
        
        
        
        // meta de ventas por año = 15000000
        // Se usa las ventas netas por año calculando las ventas / años trabajados
        String estadoVendedor= vendedor.resultadoVentas();
        double ventas = vendedor.getVentas();
        int añosTrabajados = 2022 - vendedor.getAnioIngreso();
        double ventasNetas = ventas/añosTrabajados;
        
        // Se califica al vendedor dependiendo de las ventas netas y
        //se añade al estado del vendedor
        if (ventasNetas == 0){
            estadoVendedor += " malo";
        }else if(ventasNetas > 0 && ventasNetas < 7500000){
            estadoVendedor += " Regular";
        }else if(ventasNetas >= 7500000  && ventasNetas < 15000000  ){
            estadoVendedor += " bueno";
            
        }else if ( ventasNetas >= 15000000){
            estadoVendedor += " excelente";
        } else {
            estadoVendedor += " No califica";
        }
        // Se muestra el estado final del vendedor según su año de ingreso y ventas 
        
        System.out.println("Vedndedor " + estadoVendedor);
        
       
        // Diferencia de antiguedad del auto de 5 años respecto al año de fabricación. 
        
        int añosVehicuulo = 2022 - vehiculo.getAnioFabricacion();
       
        String estadoVehiculo ="Auto ";
        
         if (añosVehicuulo == 0){
            estadoVehiculo += "Último modelo";
        }else if(añosVehicuulo > 0 && añosVehicuulo < 3){
            estadoVehiculo += "Nuevo";
        }else if(añosVehicuulo >= 3  && añosVehicuulo < 10  ){
            estadoVehiculo += "Intermedio";
            
        }else if ( añosVehicuulo >= 10){
            estadoVehiculo += " antiguo";
        } else {
            estadoVehiculo += " No califica";
        }
         
         // Se muestra el estado final del vehiculo 
         
          System.out.println(estadoVehiculo);
        
    }
    
}
