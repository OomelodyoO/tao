package win.zhangzhixing.mbg.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_user")
public class User implements Serializable {
    private static final long serialVersionUID = -622230743265275000L;
    @Id
    private String id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String mobile;
    @Column
    private Date createTime;
    @Column
    private Integer status;
}
