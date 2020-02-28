import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingWithQueue {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Queue<Male> Nam = new LinkedList();
        Queue<Female> Nu = new LinkedList();

        Female female1 = new Female();
        Female female2 = new Female();
        Female female3 = new Female();
        Male male1 = new Male();
        Male male2 = new Male();
        Male male3 = new Male();
        arrayList.add(female1);
        arrayList.add(female2);
        arrayList.add(female3);
        arrayList.add(male1);
        arrayList.add(male2);
        arrayList.add(male3);

        for (int i=0; i<arrayList.size();i++){
            if (arrayList.get(i) instanceof Female){
                Nu.add((Female) arrayList.get(i));
            }

            if (arrayList.get(i) instanceof Male){
                Nam.add((Male) arrayList.get(i));
            }
        }

        ArrayList<Student> oput = new ArrayList();
        while (!Nu.isEmpty()){
            oput.add(Nu.remove());
        }
        while (!Nam.isEmpty()){
            oput.add(Nam.remove());
        }

        System.out.println(oput);
    }
}
