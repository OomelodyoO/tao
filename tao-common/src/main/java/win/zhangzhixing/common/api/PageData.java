package win.zhangzhixing.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageData<T> implements Serializable {
    private static final long serialVersionUID = -818293850120597747L;
    private Long total;
    private Integer pages;
    private Integer pageNum;
    private Integer pageSize;
    private List<T> list;
}
