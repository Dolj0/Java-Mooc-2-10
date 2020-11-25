

public class Checker {
    private String string;
    
    public boolean isDayOfWeek(String string){
        this.string = string;
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean allVowels(String string){
        this.string = string;
        if (string.matches("[aeiou]+")){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean timeOfDay(String string){
        this.string = string;
        char[] ch = string.toCharArray();
        if (ch.length>1){
            
        
        if (ch[1]==':'){
            return false;
        } else {
            
            if (string.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
                return true;
            } else {
                return false;
            }
            
        }
        } else {
            return false;
        }
        
       
    }

}
