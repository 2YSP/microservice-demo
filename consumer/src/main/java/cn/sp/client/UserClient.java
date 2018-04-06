package cn.sp.client;

import cn.sp.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 2YSP on 2018/4/6.
 */
@FeignClient(name = "provider")
public interface UserClient {

    @RequestMapping(value = "user",method = RequestMethod.GET)
    User getUser();
}
