package Beans;

import Service.OrderService;
import WS.Dws;
import WS.DwsService;
import hibernate.Pojo.OrderEntity;
import hibernate.Pojo.OrderGoodsEntity;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlDataTable;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
public class OrdersController implements Serializable{



    public String curDate;



    public ArrayList<OrderGoodsEntity> goods;
    public OrderGoodsEntity good;
    public ArrayList<OrderEntity> orders;
    public static OrderEntity order;

    public static OrderService orderService = new OrderService();

    private HtmlDataTable htmlDT;




    public ArrayList<OrderEntity> getOrders(){
        ArrayList<OrderEntity> orders = orderService.getOrders();
        return orders;
    }

    public void getGoodByID(){
        order = (OrderEntity) htmlDT.getRowData();
        this.setGoods(orderService.getGoodsByOrder(order.getId()));
    }

    public void getCurentDate (){
        Dws service = new DwsService().getDwsPort();
        this.setCurDate(service.getCurDate());
    }


    public ArrayList<OrderGoodsEntity> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<OrderGoodsEntity> goods) {
        this.goods = goods;
    }

    public OrderGoodsEntity getGood() {
        return good;
    }

    public void setGood(OrderGoodsEntity good) {
        this.good = good;
    }

    public HtmlDataTable getHtmlDT() {
        return htmlDT;
    }

    public void setHtmlDT(HtmlDataTable htmlDT) {
        this.htmlDT = htmlDT;
    }
    public String getCurDate() {
        return curDate;
    }

    public void setCurDate(String cureDate) {
        this.curDate = cureDate;
    }
}
