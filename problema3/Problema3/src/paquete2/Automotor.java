package paquete2;

public class Automotor {
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automotor(){
        cedulaDuenio = "11025689314";
        marcaVehiculo = "Mercedez";
        anioFabricacion = 2001;
        valorVehiculo = 2569.69;
    }
    
    public Automotor(String ced, String marVeh, int anioFab, double valVeh){
        cedulaDuenio = ced;
        marcaVehiculo = marVeh;
        anioFabricacion = anioFab;
        valorVehiculo = valVeh;
    }
    
    public void establecerCedulaDuenio(String x){
        cedulaDuenio = x;
    }
    
    public void establecerMarcaVehiculo(String x){
        marcaVehiculo = x;
    }
    
    public void establecerAnioFabricacion(int x){
        anioFabricacion = x;
    }
    
    public void establecerValorVehiculo(double x){
        valorVehiculo = x;
    }
    
    public void calcularValorMatricula(){
        valorMatricula = (valorVehiculo*0.00002) * anioFabricacion;
    }
    
    public String obtenerCedulaDuenio(){
        return cedulaDuenio;
    }
    
    public String obtenerMarcaVehiculo(){
        return marcaVehiculo;
    }
    
    public int obtenerAnioFabricacion(){
        return anioFabricacion;
    }
    
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Características del Vehículo\n"
                + "Cedula del Dueño: %s\nMarca del Vehículo: %s\n"
                + "Año de  Fabricación: %d\nValor del Vehículo: %.2f\n"
                + "Valor de la Matrícula: %.2f\n\n",cedulaDuenio
                ,marcaVehiculo,anioFabricacion,valorVehiculo
                ,valorMatricula);
        return cadena;
    }
    
}
