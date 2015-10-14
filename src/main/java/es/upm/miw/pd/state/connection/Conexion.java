package es.upm.miw.pd.state.connection;

public class Conexion {
    private ConexionEstado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new Cerrado();
    }

    public Link getLink() {
        return this.link;
    }

    public void setEstado(ConexionEstado conexionEstado) {
        this.estado = conexionEstado;
    }

    public void abrir() {
        this.estado.abrir(this);

    }

    public Estado getEstado() {
        return this.estado.getEstado();
    }

    public void cerrar() {
        this.estado.cerrar(this);
    }

    public void parar() {
        this.estado.parar(this);
        
    }

    public void iniciar() {
        this.estado.iniciar(this);
    }

    public void enviar(String msg) {
        this.estado.enviar(this,msg);
    }

    public void recibir(int datos) {
        this.estado.recibir(this, datos);
        
    }

}
