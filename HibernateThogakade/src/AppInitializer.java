import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.entity.OrderDetail;
import lk.ijse.hibernate.entity.Orders;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class AppInitializer {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Customer c1 = new Customer();
        c1.setId("C001");
        c1.setAddress("Moragalla");
        c1.setName("Wishal");

        Item i1 = new Item();
        i1.setCode("I001");
        i1.setDescription("Cocacola");
        i1.setUnitPrice(150.00);
        i1.setQtyOnHand(200);

        Item i2 = new Item();
        i2.setCode("I002");
        i2.setDescription("Cream Soda");
        i2.setUnitPrice(150.00);
        i2.setQtyOnHand(200);

     //   session.save(c1);
     //   session.save(i1);
     //   session.save(i2);
        Orders o1 = new Orders();
        o1.setoId("O001");
        o1.setDate(String.valueOf(LocalDate.now()));
        o1.setCost(300.00);
        o1.setCustomer(c1);

        //session.save(o1);



        OrderDetail od1 = new OrderDetail();
        od1.setOrderDetailId("OD001");
        od1.setQty(1);
        od1.setItemCode(i1);
        od1.setOrderId(o1);
        od1.setQty(1);

        OrderDetail od2 = new OrderDetail();
        od2.setOrderDetailId("OD002");
        od2.setQty(1);
        od2.setItemCode(i2);
        od2.setOrderId(o1);
        od2.setQty(1);

        i1.getOrderDetailList().add(od1);
        i2.getOrderDetailList().add(od2);

        session.save(od1);
        session.save(od2);




        transaction.commit();
        session.close();
    }
}
