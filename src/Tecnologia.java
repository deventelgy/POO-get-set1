public class Tecnologia {
    public String nombre;
    public String color;
    public double precio;
    public double peso;

    public Tecnologia(String _nombre, String _color, double _precio, double _peso){
        nombre = _nombre;
        color = _color;
        precio = _precio;
        peso = _peso;
    }

    public String getNombre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }
    public double getPrecio(){
        return precio;
    }
    public double getPeso(){
        return peso;
    }
    public void setNombre(String _nombre){
        nombre = _nombre;
    }
    public void setColor(String _color){
        color = _color;
    }
    public void setPrecio(double _precio){
        precio = _precio;
    }
    public void setPeso(double _peso){
        peso = _peso;
    }

    public boolean adicional(double incremento){
        boolean aumento = true;
        if(peso>4 && compruebaNombre()){
            precio = precio+incremento;
            aumento = true;
        }
        return aumento;
    }
    private boolean compruebaNombre(){
        if(nombre.equals("Tv")){
            return true;
        }else{
            return false;
        }
    }
}
