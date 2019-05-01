package com.guo.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 *  @Controller + @ResponseBody = @RestController
 */

@RestController
//@RequestMapping("/haha")
public class HelloController {

/*    @Value("${minMoney}")
    private BigDecimal minMoney;

    @Value("${description}")
    private String description;*/

    @Autowired
    private LimitConfig limitConfig;

    //@GetMapping("/hello")
    //@GetMapping("/hello/say")
    //@RequestMapping("/hello")
    @PostMapping("/hello")
    //@GetMapping({"/hello","/hi"})
    //@RequestMapping(value="/hello",method = RequestMethod.GET)
    //@ResponseBody
    public String say(@RequestParam(value = "id", required = false,defaultValue = "0") Integer myId){
//        return "说明"+limitConfig.getDescription();
//        return "index";
        return "id: "+myId;
    }
}
