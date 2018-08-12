package hibernate.Utils;

import hibernate.Pojo.OrderEntity;
import hibernate.Pojo.OrderGoodsEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory(){

        if (sessionFactory==null){
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(OrderEntity.class);
                configuration.addAnnotatedClass(OrderGoodsEntity.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }


}
