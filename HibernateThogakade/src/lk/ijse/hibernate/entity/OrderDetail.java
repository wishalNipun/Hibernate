package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private
    String orderDetailId;
    @ManyToOne
    private Orders orderId;

    @ManyToOne
    private Item itemCode;
    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(String orderDetailId, Orders orderId, Item itemCode, int qty) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    public Item getItemCode() {
        return itemCode;
    }

    public void setItemCode(Item itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailId='" + orderDetailId + '\'' +
                ", orderId=" + orderId +
                ", itemCode=" + itemCode +
                ", qty='" + qty + '\'' +
                '}';
    }
}
