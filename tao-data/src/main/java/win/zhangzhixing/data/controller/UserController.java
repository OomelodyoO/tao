package win.zhangzhixing.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.zhangzhixing.common.api.ResponseData;
import win.zhangzhixing.data.exception.DataErrorMessage;
import win.zhangzhixing.data.exception.DataException;
import win.zhangzhixing.mbg.mapper.UserMapper;
import win.zhangzhixing.mbg.model.User;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping
    public ResponseData<List<User>> index() {
        final User user = userMapper.selectByPrimaryKey(1);
        return ResponseData.success(userMapper.query());
    }

    @GetMapping(value = "/error")
    public ResponseData<List<User>> error() {
        throw new DataException(DataErrorMessage.UN_KNOWN_EXCEPTION);
    }
}
