package domain;

import config.HibernateConfig;
import entity.Product;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateConfig.getSessionFactory().openSession();
      //  Transaction transaction = session.beginTransaction();

        List<Object> products = null;

        try {
            session.getTransaction().begin();
            String sql = "SELECT * FROM product";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(Product.class);
            products = query.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
            HibernateConfig.shutdown();
           // sessionFactory.close();
        }
    }
}
