package win.zhangzhixing.data.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import win.zhangzhixing.common.api.PageData;
import win.zhangzhixing.common.api.ResponseData;
import win.zhangzhixing.mbg.mapper.UserMapper;
import win.zhangzhixing.mbg.model.User;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping(value = "/{id}")
    public ResponseData<User> get(@PathVariable String id) {
        return ResponseData.success(userMapper.selectByPrimaryKey(id));
    }

    @GetMapping
    public ResponseData<PageData<User>> query(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int size
    ) {
        PageHelper.startPage(page, size);
        PageInfo<User> pageInfo = new PageInfo<User>(userMapper.selectAll());
        return ResponseData.success(
                new PageData<User>(
                        pageInfo.getTotal(),
                        pageInfo.getPages(),
                        pageInfo.getPageNum(),
                        pageInfo.getPageSize(),
                        pageInfo.getList()
                )
        );
    }
}
