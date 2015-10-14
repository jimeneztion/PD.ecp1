package es.upm.miw.pd.state.connection;

public class Esperando extends ConexionEstado {

    public Esperando() {
        super(Estado.ESPERANDO);
    }

    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void enviar(Conexion conexion,String msg) {
        conexion.getLink().enviar(msg);
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción erronea");
    }

    public void recibir(Conexion conexion, int datos) {
        if (datos == 0)
            conexion.setEstado(new Preparado());
        else
            conexion.setEstado(new Cerrado());
    }

}
