package hibernate.Pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_goods", schema = "orders", catalog = "orders")
public class OrderGoodsEntity {
    private int orderId;
    private int goodId;
    private Integer count;
    private String name;
    private int id;


    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "good_id", nullable = false)
    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    @Basic
    @Column(name = "count", nullable = true)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderGoodsEntity that = (OrderGoodsEntity) o;
        return orderId == that.orderId &&
                goodId == that.goodId &&
                id == that.id &&
                Objects.equals(count, that.count) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, goodId, count, name, id);
    }
}
