package spring.demo.validation.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import spring.demo.validation.valid.ValidUserIdInDB;

import java.util.Date;

@Data
@Table("TB_ORDER")
@ValidUserIdInDB
public class Order {
    @Id
    private Long id;
    @Column("USER_ID")
    private Long userId;
    @Column("ORDER_TIME")
    private Date orderTime;
}
