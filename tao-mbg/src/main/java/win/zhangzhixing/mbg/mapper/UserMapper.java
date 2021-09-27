package win.zhangzhixing.mbg.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import win.zhangzhixing.mbg.model.User;

import java.util.List;

@Repository
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
    @Select("select * from t_user")
    List<User> query();
}
