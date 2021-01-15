package cn.x.springcloud.order.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author xqa
 * @since 2021/1/15
 */
@Data
public class OrderVO {
    private Long id;
    private Date orderTime;
}
