package cn.x.springcloud.order.controller;

import cn.x.springcloud.order.bean.ResponseResult;
import cn.x.springcloud.order.dto.OrderVO;
import cn.x.springcloud.order.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xqa
 * @since 2021/1/15
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
//    @HystrixCommand(fallbackMethod = "orderFallback")
    public ResponseResult userOrder(@PathVariable Integer id) {
        List<OrderVO> list = new ArrayList<>();

        int i = 0;
        while (i++ < 5) {
            OrderVO orderVO = new OrderVO();
            orderVO.setId(id * 1000L + i);
            orderVO.setOrderTime(new Date());
            list.add(orderVO);
        }
        return ResponseResult.success(list);
    }

//    public ResponseResult orderFallback() {
//        return new ResponseResult();
//    }

}
