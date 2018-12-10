/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isis.ups.edu.Datos;

/**
 *
 * @author Antony
 */
public class correo {

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    String usuarioCorreo, nombreArchivo, contrasena, rutaArchivo, destino, Asunto, mensaje;

    public correo() {

    }

    public correo(String usuarioCorreo, String nombreArchivo, String contrasena, String rutaArchivo, String destino, String asunto, String mensaje) {
        this.usuarioCorreo = usuarioCorreo;
        this.nombreArchivo = nombreArchivo;
        this.contrasena = contrasena;
        this.rutaArchivo = rutaArchivo;
        this.destino = destino;
        this.Asunto = asunto;
        this.mensaje = mensaje;

    }
}
