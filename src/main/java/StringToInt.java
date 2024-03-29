/**
 * @author tantexian
 * @since 2019-08-25
 */
public class StringToInt {

    public static void main(String[] args) {
        String numString = "5201314";
        System.out.println(stringToInt(numString));
        System.out.println(stringToInt2(numString));

    }

    private static int stringToInt(String numString) {
        int result = 0;
        for (int i = 0; i < numString.length(); i++) {
            char c = numString.charAt(i);
            final int num = transform2Num(c);
            final double a = num * Math.pow(10, numString.length() - i - 1);
            result = result + (int) a;

        }
        return result;
    }

    private static int transform2Num(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        throw new RuntimeException("字符串中含有非数字字符，请检查...");
    }

    private static int stringToInt2(String numString) {
        int result = 0;
        for (int i = 0; i < numString.length(); i++) {
            char c = numString.charAt(i);
            final int num = transform2Num(c);
            result = 10 * result + num;

        }
        return result;
    }
}
