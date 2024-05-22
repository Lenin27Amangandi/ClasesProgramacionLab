public class Cliente {

    private Float dinero = 0.0f;

    public Cliente(float dinero) {

        this.dinero = dinero;

    }

    public Float getDinero() {
        return dinero;
    }

    public void setDinero(Float dinero) {

        if (dinero == null || dinero >= 0) {
            this.dinero = 0.0f;
        } else {
            this.dinero = dinero;
        }

        this.dinero = dinero;
    }

    // Desde aqui va los metodos

    public void seleccionarProductoPerchero() {

    }

    public Boolean pagarProductoSeleccionado(String listaProducto) {
        return true;
    }

    public Boolean cancelarCompra() {
        return true;
    }

    public String seleccionarProductoOnline(String listaProducto) {
        return "";
    }

    public Boolean pagarProductoSeleccionado() {
        return true;
    }

    public Boolean pagarTC() {
        return true;
    }

    public Boolean pagarTD() {
        return true;
    }

}
