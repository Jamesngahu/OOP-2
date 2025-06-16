package Work_with_arrays;
import java.util.Arrays;

public class array_clearing {
    public static void main(String[]args){
        String[] pallets ={"C11","D07","B13","A01"};

        System.out.println();

        System.out.println("Before:"+pallets[0].toLowerCase());
        Arrays.fill(pallets,0,1,null);

        if(pallets[0]!=null){
            System.out.println("After:"+pallets[0].toLowerCase());
        }
        else {
            System.out.println("After:null");
        }

        System.out.println("Clearing 1...count:"+pallets.length);
        for (String pallet:pallets){
            System.out.println("--"+pallet);
        }
    }
}
