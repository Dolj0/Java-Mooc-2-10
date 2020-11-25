/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Literacy implements Comparable<Literacy>{
    private String country;
    private int year;
    private String gender;
    private double literacy;
    
    public Literacy (String country, int year, String gender, double literacy){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacy = literacy;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public double getLiteracy(){
        return this.literacy;
    }
    
    @Override
    public String toString(){
        return this.getCountry()+" ("+this.getYear()+"), "+this.getGender()+", "+this.getLiteracy();
    }

    @Override
    public int compareTo(Literacy o) {
        if (this.literacy == o.getLiteracy()){
            return 0;
        } else if (this.literacy > o.getLiteracy()){
            return 1;
        } else {
            return -1;
        }
    }
    
}
