package es.upm.miw.pd.state.connection;

public abstract class ConexionEstado {

    private Estado estado;

    public ConexionEstado(Estado estado) {
        super();
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public abstract void abrir(Conexion conexion);

    public abstract void cerrar(Conexion conexion);

    public abstract void iniciar(Conexion conexion);

    public abstract void enviar(Conexion conexion);

    public abstract void parar(Conexion conexion);

    public abstract void recibir(Conexion conexion,int datos);

}
