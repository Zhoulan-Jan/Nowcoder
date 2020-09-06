public class $1 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] res = new boolean[n];
        for (int i = 0; i < p.length; i++) {
            res[i] = s.contains(p[i]);
        }
        return res;
    }
    
}
