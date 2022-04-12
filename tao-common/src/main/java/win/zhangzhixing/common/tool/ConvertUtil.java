package win.zhangzhixing.common.tool;

public class ConvertUtil {
    private static final char r[] = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'
    };

    public static String phoneToRandomString(String phone) {
        return (longToRandomString(Long.parseLong(phone), 8, '='));
    }

    public static String phoneToRandomString(String phone, Character placeholder) {
        return (longToRandomString(Long.parseLong(phone), 8, placeholder));
    }

    private static String longToRandomString(Long value, int length, Character placeholder) {
        if (new String(r).contains(placeholder.toString())) {
            throw new RuntimeException("占位符已被字典使用！");
        }
        char[] chars = new char[length];
        char[] sort = new char[length];
        while (value / r.length > 0) {
            int index = ((Long) (value % r.length)).intValue();
            chars[--length] = r[index];
            value = value / r.length;
        }
        chars[--length] = r[value.intValue()];
        for (int i = 0; i < sort.length; i++) {
            try {
                sort[i] = chars[length++];
            } catch (IndexOutOfBoundsException ex) {
                sort[i] = placeholder;
            }
        }
        return new String(sort);
    }
}
