
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while(true){
            int i = Integer.valueOf(scanner.nextLine());
            if (i<0){
                break;
            }
            inputs.add(i);
        }
        
        ArrayList<Integer> num = inputs.stream()
                .filter(s -> s>=1)
                .filter(i -> i<=5)
                .collect(Collectors.toCollection(ArrayList::new));

        for(int i =0; i<num.size();i++){
            System.out.println(num.get(i));
        }
    }
}
