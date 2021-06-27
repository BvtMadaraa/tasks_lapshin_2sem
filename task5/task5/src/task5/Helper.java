package task5;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class Helper extends TimeZone {
    final static int[] getCharset(String word) {
        int[] charset = new int[127];
        for (char c : word.toCharArray()) charset[c]++;
        return charset;
    }

    final static Integer[] splitNumber(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        while (n > 0) {
            res.add(n % 10);
            n /= 10;
        }
        return res.toArray(new Integer[res.size()]);
    }

    @Override
    public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
        return 0;
    }

    @Override
    public void setRawOffset(int offsetMillis) {

    }

    @Override
    public int getRawOffset() {
        return 0;
    }

    @Override
    public boolean useDaylightTime() {
        return false;
    }

    @Override
    public boolean inDaylightTime(Date date) {
        return false;
    }
}
