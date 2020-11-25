
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> returnNum = new ArrayList<>();
       
        
        ArrayList<Integer> divTwo = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        for (int i =0;i<divTwo.size();i++){
            returnNum.add(divTwo.get(i));
        }
        
        ArrayList<Integer> divThree = numbers.stream()
                .filter(i -> i % 3 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        for (int i =0;i<divThree.size();i++){
            returnNum.add(divThree.get(i));
        }
        
        ArrayList<Integer> divFive = numbers.stream()
                .filter(i -> i % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        for (int i =0;i<divFive.size();i++){
            returnNum.add(divFive.get(i));
        }
        
        
        
        return returnNum;
    }

}
