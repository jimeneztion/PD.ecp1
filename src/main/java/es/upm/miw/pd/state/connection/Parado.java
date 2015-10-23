package es.upm.miw.pd.state.connection;

public class Parado extends ConexionEstado {

    public Parado() {
        super(Estado.PARADO);
    }

    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void iniciar(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void parar(Conexion conexion) {
        conexion.setEstado(new Parado());
    }

    public void recibir(Conexion conexion, int estado) {
        throw new UnsupportedOperationException("Acción erronea");
    }

}
