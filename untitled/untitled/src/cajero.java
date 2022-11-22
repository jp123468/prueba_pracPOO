public class cajero {
    //Atributos
     int contra;
    private double cantidad;

    //Constructor
    public cajero(int contra) {
        this(contra, 0); //Sobrecarga
         }

    public cajero(int contra, double cantidad) {
        this.contra = contra;
        //SI la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }
    // Metodos

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public double getCantidad() {
    return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Ingresa dinero en la cuenta mediante el cajero,
     * solo si es positivo la cantidad
     *
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    /**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
     * en cero
     *
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    /**
     * Devuelve el estado del objeto
     *
     * @return
     */
    @Override
    public String toString() {
        return "El titular con la clave: " + contra + " tiene " + cantidad + " euros en la cuenta";
    }
}





