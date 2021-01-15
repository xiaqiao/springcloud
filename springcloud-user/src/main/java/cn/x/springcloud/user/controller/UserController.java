package cn.x.springcloud.user.controller;

import cn.x.springcloud.user.bean.ResponseResult;
import cn.x.springcloud.user.dto.UserVO;
import cn.x.springcloud.user.feign.OrderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xqa
 * @since 2021/1/15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @GetMapping("/{id}")
    public ResponseResult user(@PathVariable Integer id) {
        UserVO userVO = new UserVO();
        userVO.setId(id);
        userVO.setName("name" + id);
        userVO.setOrderList(orderFeignClient.orderByUser(id).getData());
        return ResponseResult.success(userVO);
    }

}
