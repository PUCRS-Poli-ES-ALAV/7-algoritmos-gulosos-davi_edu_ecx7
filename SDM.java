import java.util.ArrayList;

public class SDM {
    public static void main(String[] args) {
        int[] s = {0,4,6,13,4,2,6,7,9,1,3,9};
        int[] f = {0,8,7,14,5,4,9,10,11,6,13,12};
        int[] sr = {0,2,4,1,6,4,6,7,9,9,3,13};
        int[] fr = {0,4,5,6,7,8,9,10,11,12,13,14};

        double[] s2 = {0,2,4,1,6,4,6,7,9,9,3,13};
        double[] f2 = {0,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(fSDMguloso(sr, fr, 10));
        System.out.println(fSDMGuloso2(s2, f2, 10));
    }

    public static ArrayList<ArrayList<Integer>> fSDMguloso(int s[], int f[], int n){
        ArrayList<ArrayList<Integer>> X =  new ArrayList<>();
        int i = 1;
        int k = 1;
        while(i <= n){
            ArrayList<Integer> r =  new ArrayList<>();
            r.add(s[i]);r.add(f[i]);
            X.add(r);
            k = i+1;
            while (k <= n && s[k] < f[i]){
                 k = k+1;
            }
            i = k;
        }
        return X;
    }

    public static ArrayList<ArrayList<Double>> fSDMGuloso2(double[] s, double[] f, int n){
        f[0] = Double.NEGATIVE_INFINITY;
        ArrayList<ArrayList<Double>> X =  new ArrayList<>();
        int i = 0;
        for(int k =1; k<= n; k++){
            if(s[k]>f[i]){
                ArrayList<Double> r =  new ArrayList<>();
                r.add(s[k]);r.add(f[k]);
                X.add(r);
                i = k;
            }
        }
        return X;
    }
}
