package win.zhangzhixing.data.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import win.zhangzhixing.common.api.ResponseData;
import win.zhangzhixing.data.exception.DataErrorMessage;
import win.zhangzhixing.data.exception.DataException;

@RestControllerAdvice
@Slf4j
public class DataExceptionHandler {
    @ExceptionHandler(Exception.class)
    protected ResponseData undefinedExceptionHandler(Exception ex) {
        StringBuffer stringBuffer = new StringBuffer(ex.toString() + "\n");
        StackTraceElement[] messages = ex.getStackTrace();
        int length = messages.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append("\t" + messages[i].toString() + "\n");
        }
        log.error("data未收录错误：\n" + stringBuffer);
        return ResponseData.failed(DataErrorMessage.UN_KNOWN_EXCEPTION.getCode(), DataErrorMessage.UN_KNOWN_EXCEPTION.getMessage());
    }

    @ExceptionHandler(value = {DataException.class})
    protected ResponseData memberExceptionHandler(DataException ex) {
        return ResponseData.failed(ex.getCode(), ex.getMessage());
    }
}
