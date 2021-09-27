package win.zhangzhixing.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData<T> implements Serializable {
    private static final long serialVersionUID = 4044146187117774404L;
    public static final Integer SUCCESS = 200;
    public static final Integer FAILED = 500;
    private Integer status;
    private T data;
    private String errorCode;
    private String errorMsg;

    public static <T> ResponseData<T> success(T data) {
        return new ResponseData<T>(SUCCESS, data, "", "");
    }

    public static <T> ResponseData<T> failed(String errorCode, String errorMsg) {
        return new ResponseData<T>(FAILED, null, errorCode, errorMsg);
    }
}
