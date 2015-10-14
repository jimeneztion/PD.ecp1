package es.upm.miw.pd.state.connection;

public class Cerrado extends ConexionEstado {

    public Cerrado() {
        super(Estado.CERRADO);
    }

    public void abrir(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    public void cerrar(Conexion conexion) {
        conexion.setEstado(new Cerrado());
    }

    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void enviar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void recibir(Conexion conexion,int estado) {
        throw new UnsupportedOperationException("Acción erronea");
    }

}
