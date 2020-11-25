
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
  
    
    
    public Hand(){
        this.hand = new ArrayList<Card>();
   
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        Iterator<Card> iterator = hand.iterator();
        
        while (iterator.hasNext()){
            Card nextInList = iterator.next();
            System.out.println(nextInList);
        }
    }
    
    public void sort(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        
        Collections.sort(hand, comparator);
    }
    
    public int totVal(){
        int totVal = 0;
        for(int i=0; i<hand.size();i++){
            totVal = totVal + hand.get(i).getValue();
        }
        return totVal;
    }

    public int compareTo(Hand o) {
        if (totVal() == o.totVal()){
            return 0;
        } else if (totVal() > o.totVal()){
            return 1;
        } else {
            return -1;
        }
    }
    
    public void sortBySuit(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        
        Collections.sort(hand, comparator);
        
    }
    
    
    
    
    
    
    
    
}
