import java.util.ArrayList;

public class Troco {
    public static void main(String[] args) {
        PerfomanceTester pt = PerfomanceTester.getInstance();
        pt.addTest("Troco guloso");

        int[] m1 = {100,25,10,5,1};
        pt.start("Troco guloso");
        System.out.println(pTroco(m1, 289, pt));
        pt.end();

        System.out.println(pt.getReport("Troco guloso"));
    }

    public static ArrayList<Integer> pTroco( int[] moedas, int v, PerfomanceTester pt){
        ArrayList<Integer> result = new ArrayList<>();
        while(v!=0){
            for(Integer m: moedas){
                pt.countIter();
                if(v-m>=0){
                    v = v-m;
                    result.add(m);
                    break;
                }
            }
        }
        return result; 
    }

    

}