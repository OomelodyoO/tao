package win.zhangzhixing.mbg.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -622230743265275000L;
    private String id;
    private String username;
    private String password;
    private String mobile;
    private Date createTime;
    private Integer status;
}
