package win.zhangzhixing.data.controller;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/data")
public class DataController {
    @GetMapping(value = "/index")
    public String index() {
        return RandomStringUtils.random(6, "abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ23456789");
    }
}
