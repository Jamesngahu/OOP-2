package Work_with_arrays;

public class ArrayChallenge {
    public static void main(String[]args){
        String[] orderIndexes ={"B103","C509","B101","C44","A902","A203","A202","G221"};

        for (String item: orderIndexes){
            if (item.startsWith("A")){
                System.out.println(item);
            }
        }
    }
}
