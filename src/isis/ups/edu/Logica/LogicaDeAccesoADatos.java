/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isis.ups.edu.Logica;

import isis.ups.edu.Datos.Persona;
import java.sql.SQLException;

/**
 *
 * @author Antony
 */
public class LogicaDeAccesoADatos {
    
    
    public void ingresarPersona(int id, String Nombres, String Apellidos, String Telefono, 
            String Celular, String Cedula,
            String Sexo, String Direccion, String Ciudad,
            String Email, String Observaciones, String accion) throws SQLException{
        
    ObjetodeAccesoaDatos con=new ObjetodeAccesoaDatos();    
        Persona p=new Persona();
        
        p.setId(id);
        p.setNombres(Nombres);
        p.setApellidos(Apellidos);
        p.setTelefono(Telefono);
        p.setCelular(Celular);
        p.setCedula(Cedula);
        p.setSexo(Sexo);
        p.setDireccion(Direccion);
        p.setCiudad(Ciudad);
        p.setEmail(Email);
        p.setObservaciones(Observaciones);
       
        con.ingresar(p, accion);
    }  
    
}
