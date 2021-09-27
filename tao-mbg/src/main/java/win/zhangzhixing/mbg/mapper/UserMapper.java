package win.zhangzhixing.mbg.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import win.zhangzhixing.mbg.model.User;

import java.util.List;

@Service
public interface UserMapper {
    @Select("select * from t_user")
    List<User> query();
}
