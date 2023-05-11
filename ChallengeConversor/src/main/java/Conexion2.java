
public class Conexion2 {
    private double cantidad;
    private String mensaje;
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public String converCaF(){
    if(valor == 0){
        mensaje = (cantidad + " Grados Celsius son: "+ cantidad*32+" Grados Fahrenheit");
    }
    return mensaje;
    }
    
    public String converCaK(){
    if(valor ==1){
    mensaje = (cantidad + " Grados Celsius son: "+ (cantidad * 273.15) + " Grados Kelvin");
    }
    return mensaje;
    }
    
    public String converFaC(){
    if(valor == 2){
     mensaje = (cantidad + " Grados Fahrenheit son: "+ ((cantidad -32)/1.8) + " Grados Celsius");
    }
    return mensaje;
    }
    
    public String converFak(){
    if(valor == 3){
     mensaje = (cantidad + " Grados Fahrenheit son: "+ (((cantidad -32)/1.8)+(273.15))+ " Grados Kelvin");
    }
    return mensaje;
    }
    
    public String converKaC(){
    if(valor == 4){
     mensaje = (cantidad + " Grados Kelvin son: "+ (cantidad -273.15)+ " Grados Celsius");
    }
    return mensaje;
    }
    
    public String converkaF(){
    if(valor == 5){
     mensaje = (cantidad + " Grados Kelvin son: "+ (((cantidad -273.15)*1.8)+(32))+ " Grados Fahrenheit");
    }
    return mensaje;
    }
    
    
    
    
    
    
    
    
    
    
}
