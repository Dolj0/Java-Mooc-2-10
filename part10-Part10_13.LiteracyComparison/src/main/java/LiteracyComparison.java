


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String file = "literacy.csv";
        List<Literacy> readFile = new ArrayList<>();
        readFile = readLit(file);
        
        readFile.stream().sorted().forEach(m -> System.out.println(m));
        
        }
    
    public static List<Literacy> readLit(String file){
        List<Literacy> listLitReturn = new ArrayList<>();
        List<String> listLit = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(file))
                    .forEach(line -> listLit.add(line));
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        for (int i=0; i<listLit.size();i++){
            String string = listLit.get(i);
            String[] pieces = string.split(",");
            
            String gender = pieces[2];
            String genderCut ="";
            if (gender.equals(" male (%)")){
                genderCut = "male";
            } else if (gender.equals(" female (%)")){
                genderCut = "female";
            } else {
                genderCut = "error";
            }
            listLitReturn.add(new Literacy(pieces[3], Integer.valueOf(pieces[4]), genderCut, Double.valueOf(pieces[5])));
        }
        return listLitReturn;
    }
    
    
}
