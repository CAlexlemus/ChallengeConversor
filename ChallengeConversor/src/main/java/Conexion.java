
public class Conexion {
    private double cantidad;
    private int valor1, valor2;
    private String mensaje;
    private double resultado;

    
    public Conexion() {
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String convertQaD(){
    if(valor1 == 0){
        mensaje = (cantidad + " Quetzales son: " + Math.round((cantidad * 0.13)) + " Dólres");
    }
    return mensaje;
    }
    
    public String convertDaQ(){
    if(valor2 == 0){
    mensaje = (cantidad + " Dólares a Quetzales son " + Math.round(cantidad * 7.81));
    }
     return mensaje;
    }
    
    
    public String convertQaE(){
    if(valor1 == 1){
        mensaje = (cantidad + " Quetzales son: " + Math.round((cantidad * 0.12)) + " Euros");
    }
    return mensaje;
    }
    
    public String convertEaQ(){
        if(valor2==1){
        mensaje = (cantidad + " Euros a Quetzales son: " + Math.round(cantidad * 8.60));
        }
        return mensaje;
    }
  
    public String convertQaL(){
    if(valor1 == 2){
        mensaje = (cantidad + " Quetzales son: " + Math.round((cantidad * 0.10)) + " Libras Esterlinas");
    }
    return mensaje;
    }
    
    public String convertLaQ(){
    if(valor2 == 2){
    mensaje = (cantidad + " Libras Esterlinas a Quetzales son " + Math.round(cantidad * 9.86));
    }
    return mensaje;
    }
    
    public String convertQaY(){
    if(valor1 == 3){
        mensaje = (cantidad + " Quetzales son: " + Math.round((cantidad * 17.31)) + " Yen Japoneses ");
    }
    return mensaje;
    }
    
    public String convertYaQ(){
    if(valor2 == 3){
    mensaje =(cantidad + " Yen Japoneses a Quetzales son " + Math.round(cantidad * 0.058));
    }
    return mensaje;
    }
    
    public String convertQaW(){
    if(valor1 == 4){
        mensaje = (cantidad + " Quetzales son: " + Math.round((cantidad * 169.79)) + " Won Surcoreanos ");
    }
    return mensaje;
    }
    
    public String convertWaQ(){
    if(valor2 == 4){
        mensaje = (cantidad + "Won a Quetzales son " + Math.round(cantidad *0.0059));
    }
    return mensaje;
    }
}
