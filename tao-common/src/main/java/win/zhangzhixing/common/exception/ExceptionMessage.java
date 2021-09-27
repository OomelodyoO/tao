package win.zhangzhixing.common.exception;

import java.io.Serializable;

public class ExceptionMessage implements Serializable {
    private static final long serialVersionUID = -7912234387563297197L;

    private String code;
    private String message;

    public ExceptionMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ExceptionMessage{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
