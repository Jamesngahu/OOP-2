package Work_with_arrays;
import java.util.Random;
public class Idgenerator {
    public static void main(String[]args){

        Random random= new Random();
        String[] numberIds= new String[5];

        for(int i=0;i<numberIds.length;i++){
            char prefix =(char)(random.nextInt(5)+'A');
            int number=random.nextInt(999)+1;
            String suffix =String.format("%03d",number);
            numberIds[i]=prefix + suffix;
        }
        for (String numberID:numberIds){
            System.out.println(numberID);
        }
    }
}
