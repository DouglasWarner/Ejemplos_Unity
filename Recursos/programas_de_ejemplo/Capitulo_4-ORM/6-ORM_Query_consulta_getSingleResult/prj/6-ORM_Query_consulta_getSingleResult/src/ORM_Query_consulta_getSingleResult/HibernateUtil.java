<<<<<<< HEAD
package ORM_Query_consulta_getSingleResult;

//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author carlos
 */
public class HibernateUtil {

  private static final SessionFactory sessionFactory;
  
  static {
    try {
      // Create the SessionFactory from standard (hibernate.cfg.xml) 
      // config file.
//      sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
      sessionFactory = new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) {
      // Log the exception. 
      System.err.println("Initial SessionFactory creation failed." + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }
  
  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}
=======
package ORM_Query_consulta_getSingleResult;

//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author carlos
 */
public class HibernateUtil {

  private static final SessionFactory sessionFactory;
  
  static {
    try {
      // Create the SessionFactory from standard (hibernate.cfg.xml) 
      // config file.
//      sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
      sessionFactory = new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) {
      // Log the exception. 
      System.err.println("Initial SessionFactory creation failed." + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }
  
  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}
>>>>>>> origin/master
