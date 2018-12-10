/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isis.ups.edu.Logica;

import isis.ups.edu.Datos.ConexionBD;
import isis.ups.edu.Datos.Persona;
import isis.ups.edu.Datos.correo;
import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Antony
 */
public class ObjetodeAccesoaDatos {

    public void ingresar(Persona p, String accion) throws SQLException {
        String query = "";

        ConexionBD con = new ConexionBD();
        if (accion.equals("ingresar")) {

            query = "insert into USUARIOS () values('" + p.getId() + "','" + p.getNombres() + "',"
                    + "'" + p.getApellidos() + "','" + p.getTelefono() + "','" + p.getCelular() + "','" + p.getCedula() + "','" + p.getSexo() + "','" + p.getDireccion() + "','" + p.getCiudad() + "','" + p.getEmail() + "','" + p.getObservaciones() + "')";
            System.out.println("" + query);
        } else if (accion.equals("actualizar")) {
            query = "update USUARIOS set id='" + p.getId() + "',Nombres=" + "'" + p.getNombres() + "',Apellidos=" + "'" + p.getApellidos() + "',Telefono='" + p.getTelefono() + "',Celular='" + p.getCelular() + "',Cedula='" + p.getCedula() + "',Sexo='" + p.getSexo() + "',Direccion='" + p.getDireccion() + "',Ciudad='" + p.getCiudad() + "',Email='" + p.getEmail() + "',Observaciones='" + p.getObservaciones() + "' where"
                    + " id='" + p.getId() + "'";

            System.out.println(query);

        } else if (accion.equals("borrar")) {
            query = "delete from USUARIOS where Id= '" + p.getId() + "'";

        }
        Connection res = con.getConnection();
        Statement s = res.createStatement();
        s.execute(query);

        // con.Desconectar();
    }

    public Persona buscarUsuario(String id) throws SQLException {
        ConexionBD con = new ConexionBD();
        String query = "select * from USUARIOS where id='" + id + "'";

        Persona p = new Persona();
        Connection res = con.getConnection();
        Statement s = res.createStatement();
        ResultSet rs = s.executeQuery(query);
        //Extact result from ResultSet rs
        while (rs.next()) {
            p.setId(rs.getInt("Id"));
            p.setNombres(rs.getString("Nombres"));
            p.setApellidos(rs.getString("Apellidos"));
            p.setTelefono(rs.getString("Telefono"));
            p.setCelular(rs.getString("Celular"));
            p.setCedula(rs.getString("Cedula"));
            p.setSexo(rs.getString("Sexo"));
            p.setDireccion(rs.getString("Direccion"));
            p.setCiudad(rs.getString("Ciudad"));
            p.setEmail(rs.getString("Email"));
            p.setObservaciones(rs.getString("Observaciones"));
        }

        return p;
    }

    /**
     * Este Metodo obtiene el codigo de usuarios en funcion de los que ya
     * existen
     *
     * @param usu
     * @return
     * @throws SQLException
     */
    public int obtenerCodigo(String usu) throws SQLException {

        ConexionBD con = new ConexionBD();
        String query = "select max(id) from USUARIOS";
        int max = 0;
        Connection res = con.getConnection();
        Statement s = res.createStatement();
        ResultSet rs = s.executeQuery(query);
        while (rs.next()) {
            max = rs.getInt("MAX(id)");
        }
        return max;
    }

    public ArrayList ListarUsuario() {
        ArrayList lista = new ArrayList();

        try {

            ConexionBD con = new ConexionBD();
            ResultSet r = null;
            String query = "";
            query = "SELECT * FROM USUARIOS ";
            Connection res = con.getConnection();
            Statement s = res.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Persona p = new Persona();
                p.setId(rs.getInt("Id"));
                p.setNombres(rs.getString("Nombres"));
                p.setApellidos(rs.getString("Apellidos"));
                p.setTelefono(rs.getString("Telefono"));
                p.setCelular(rs.getString("Celular"));
                p.setCedula(rs.getString("Cedula"));
                p.setSexo(rs.getString("Sexo"));
                p.setDireccion(rs.getString("Direccion"));
                p.setCiudad(rs.getString("Ciudad"));
                p.setEmail(rs.getString("Email"));
                p.setObservaciones(rs.getString("Observaciones"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
        return lista;
    }

    /**
     * Este metodo llama al procedimiento almacenado en la base de datos
     *
     * @return
     * @throws SQLException
     */
    public int LlamarProcedimineto() throws SQLException {

        ConexionBD con = new ConexionBD();
        Connection res = con.getConnection();
        PreparedStatement sc = con.getConnection().prepareStatement("{call ContarProductos()}");
        CallableStatement cStmt = res.prepareCall("{call ContarProductos()}");
        String cantidad = "";
        cStmt.execute();
        sc.execute();
        ResultSet rs = sc.getResultSet();
        if (rs.next()) {
            cantidad = rs.getString(1);
            System.out.println("Cantidad Productos   " + cantidad);
        }

        return Integer.parseInt(cantidad);
    }

    /**
     * Este metodo realiza el envio del correo al servicio directo
     *
     * @param c
     * @return
     */
    public boolean enviarCorreo(correo c) {
        try {
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
            p.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
            p.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
            p.put("mail.smtp.user", c.getUsuarioCorreo());
            p.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
            Session s = Session.getDefaultInstance(p, null);
            BodyPart text = new MimeBodyPart();
            text.setText(c.getMensaje());
            BodyPart adjunto = new MimeBodyPart();
            if (!c.getRutaArchivo().equals("")) {
                adjunto.setDataHandler(new DataHandler(new FileDataSource(c.getRutaArchivo())));
                adjunto.setFileName(c.getNombreArchivo());
            }
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(text);
            if (!c.getRutaArchivo().equals("")) {
                m.addBodyPart(adjunto);
            }
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(c.getUsuarioCorreo()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getDestino()));
            mensaje.setSubject(c.getAsunto());
            mensaje.setContent(m);
            Transport t = s.getTransport("smtp");
            t.connect(c.getUsuarioCorreo(), c.getContrasena());
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error..... " + e);
            return false;

        }
    }
}
