import java.util.Arrays;

/**
 * 法一：1.排序后，数组中间的数字就是该红包金额，
 *      2.遍历数组统计该数字的次数是否满足要求
 * 法二：最优解
 */
public class $3 {
    //法一
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int res = gifts[n/2];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (gifts[i] == res) {
                cnt++;
            }
        }

        return cnt >= n/2 ? res : 0;
    }

    //法二
    public int getValue2(int[] gifts, int n) {
        int tmp = 0;
        int cnt = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (cnt == 0) {
                tmp = gifts[i];
                cnt = 1;
            } else {
                if (tmp == gifts[i]) {
                    cnt++;
                } else {
                    cnt--;
                }
            }
        }

        int len = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] == tmp) {
                len++;
            }
        }
        return len >= n/2 ? tmp : 0;
    }
}
