package hibernate.DAO;

import hibernate.Pojo.OrderEntity;
import hibernate.Pojo.OrderGoodsEntity;
import hibernate.Utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {

    private Session session;
    private static Transaction transaction;


    @Override
    public ArrayList<OrderEntity> getOrders() {
        ArrayList<OrderEntity> orders = new ArrayList<>();
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();

            transaction = session.beginTransaction();
            orders = (ArrayList<OrderEntity>) session.createQuery("From OrderEntity").list();
            orders.forEach(o -> System.out.println("order: " + o));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transaction.getStatus().equals(TransactionStatus.ACTIVE))
                transaction.commit();
        }
        return orders;
    }

    @Override
    public ArrayList<OrderGoodsEntity> getGoodsByOrder(int id) {
        ArrayList<OrderGoodsEntity> goods = new ArrayList<>();
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            goods = (ArrayList<OrderGoodsEntity>) session.createQuery("from OrderGoodsEntity where orderId= :orderId").
                    setParameter("orderId", id).list();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transaction.getStatus().equals(TransactionStatus.ACTIVE))
                transaction.commit();
        }
        return goods;
    }
}
