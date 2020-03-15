package com.pjqdyd.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {
    @Id
    //@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_item_id")
    private Long orderItemId;

    private static final long serialVersionUID = 1L;
}