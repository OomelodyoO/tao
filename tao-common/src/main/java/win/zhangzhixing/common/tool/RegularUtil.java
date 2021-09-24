package win.zhangzhixing.common.tool;

import java.util.regex.Pattern;

public class RegularUtil {
    /**
     * 纯数字表达式
     */
    private static final String NUMBERS_PATTERN = "^([0-9]\\d*)$";
    /**
     * 纯字母表达式
     */
    private static final String LETTERS_PATTERN = "^[a-zA-Z]+$";

    /**
     * 匹配函数
     *
     * @param regex
     * @param input
     * @return
     */
    private static boolean match(String regex, String input) {
        return Pattern.matches(regex, input);
    }

    public static boolean checkNumbersPattern(String str) {
        return match(NUMBERS_PATTERN, str);
    }

    public static boolean checkLettersPattern(String str) {
        return match(LETTERS_PATTERN, str);
    }
}
