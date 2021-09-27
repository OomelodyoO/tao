package win.zhangzhixing.data.exception;

import win.zhangzhixing.common.exception.ExceptionMessage;

import java.io.Serializable;

public class DataException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -7089250147964468807L;
    private String code;
    private String message;
    private Throwable cause;

    public DataException(String code) {
        super();
        this.code = code;
    }

    public DataException(String code, String message) {
        super();
        this.message = message;
        this.code = code;
    }

    public DataException(ExceptionMessage exceptionMessage) {
        this(exceptionMessage, null, new String[]{});
    }

    public DataException(ExceptionMessage exceptionMessage, String... strings) {
        this(exceptionMessage, null, strings);
    }

    public DataException(ExceptionMessage exceptionMessage, Throwable cause, String... strings) {
        this.code = exceptionMessage.getCode();
        this.message = String.format(exceptionMessage.getMessage(), strings);
        this.cause = cause;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }
}
