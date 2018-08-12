package Service;

import hibernate.DAO.OrderDAOImpl;
import hibernate.Pojo.OrderEntity;
import hibernate.Pojo.OrderGoodsEntity;

import java.util.ArrayList;

public class OrderService {

    private OrderDAOImpl orderDAO = new OrderDAOImpl();

    public OrderService(){};

    public ArrayList<OrderEntity> getOrders(){
        return orderDAO.getOrders();
    }

    public ArrayList<OrderGoodsEntity> getGoodsByOrder(int id){
        return orderDAO.getGoodsByOrder(id);
    }
}
