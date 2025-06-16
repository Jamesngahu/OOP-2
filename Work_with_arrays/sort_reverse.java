package Work_with_arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_reverse {
    public static void main(String[]args){
        String[] pallets={"B07","D03","C06","A01"};

        System.out.println("Sorted ...");
        Arrays.sort(pallets);
        for (String pallet:pallets){
            System.out.println("--" + pallet);
        }

        System.out.println("\nReversed...");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for (String pallet:palletList){
            System.out.println("--" + pallet);
        }
    }
}
