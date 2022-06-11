package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Orders {
@Id
    private String oId;
    private String date;
    private double cost;
@ManyToOne
private Customer customer;

@OneToMany(mappedBy = "orderId")
private List<OrderDetail> orderDetailList = new ArrayList<>();

    public Orders() {
    }

    public Orders(String oId, String date, double cost) {
        this.oId = oId;
        this.date = date;
        this.cost = cost;
    }

    public Orders(String oId, String date, double cost, Customer customer) {
        this.oId = oId;
        this.date = date;
        this.cost = cost;
        this.customer = customer;
    }

    public Orders(String oId, String date, double cost, Customer customer, List<OrderDetail> orderDetailList) {
        this.oId = oId;
        this.date = date;
        this.cost = cost;
        this.customer = customer;
        this.orderDetailList = orderDetailList;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oId='" + oId + '\'' +
                ", date='" + date + '\'' +
                ", cost='" + cost + '\'' +
                ", customer=" + customer +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
