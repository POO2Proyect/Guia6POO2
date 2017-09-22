package sv.edu.udb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author avelar
 */
public class test {
    public static void main(String[] args) {
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses=sesFact.openSession();
        Transaction tra=ses.beginTransaction();
        
        Datosempleados datos=new Datosempleados();
        datos.setNombres("Laura");
        datos.setApellido("Ramirez");
        datos.setEdad(23);
        datos.setTelefono("22202222");
        datos.setDireccion("Mi casa");
        
        ses.save(datos);
        tra.commit();
    }
    
}
