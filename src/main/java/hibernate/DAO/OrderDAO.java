package hibernate.DAO;

import hibernate.Pojo.OrderEntity;
import hibernate.Pojo.OrderGoodsEntity;

import java.util.ArrayList;

public interface OrderDAO {
    public ArrayList<OrderEntity> getOrders();
    public ArrayList<OrderGoodsEntity> getGoodsByOrder(int id);
}
