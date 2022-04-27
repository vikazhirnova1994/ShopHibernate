package entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order")
public class Order extends Model{


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="product_id", referencedColumnName = "id")
    private Product product;

    @Column(name = "count")
    private int count;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "status")
    private boolean status;

    Order(){
        super();
    }
    Order(Long id){
        super(id);
    }
}
