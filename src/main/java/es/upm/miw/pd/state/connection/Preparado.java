package es.upm.miw.pd.state.connection;

public class Preparado extends ConexionEstado {

    public Preparado() {
        super(Estado.PREPARADO);
    }

    public void abrir(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    public void cerrar(Conexion conexion) {
        conexion.setEstado(new Cerrado());
    }

    public void iniciar(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    public void enviar(Conexion conexion) {
        conexion.setEstado(new Esperando());
    }

    public void parar(Conexion conexion) {
        conexion.setEstado(new Parado());
    }

    public void recibir(Conexion conexion,int estado) {
        throw new UnsupportedOperationException("Acción erronea");
    }
}
