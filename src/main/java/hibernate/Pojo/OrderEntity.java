package hibernate.Pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "orders", catalog = "orders")
public class OrderEntity {
    private int id;
    private String customer;
    private String adress;
    private Double summ;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customer", nullable = false, length = 200)
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "adress", nullable = true, length = 200)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "summ", nullable = true, precision = 0)
    public Double getSumm() {
        return summ;
    }

    public void setSumm(Double summ) {
        this.summ = summ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return id == that.id &&
                Objects.equals(customer, that.customer) &&
                Objects.equals(adress, that.adress) &&
                Objects.equals(summ, that.summ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, adress, summ);
    }
}
