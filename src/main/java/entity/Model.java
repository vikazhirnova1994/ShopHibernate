package entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Model implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    Model(){}

    Model(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
