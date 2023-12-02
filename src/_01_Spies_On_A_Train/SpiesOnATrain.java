package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	
    	for(int i = 0; i<clues.length; i++) {
    		System.out.println(clues[i]);
    		

    	}
    	
    	
    		ArrayList<String> leads = new ArrayList<String>();
    		Node<TrainCar> current= train.getHead();
    		for(int i = 0; i<train.size()-1; i++) {
    			
    			String testimony = current.getValue().questionPassenger();
    			System.out.println(current.getValue().questionPassenger());
    			
    			int startName = testimony.indexOf("I saw") + 6;
    			
    			String evidence = testimony.substring(startName);
    			String[] list = evidence.split(evidence);
    			String suspectName = list[0];
    			
    			
    			
    			
    			
    		for(int x = 0; x<clues.length; x++) {	
    			
    			
    			
    		if(current.getValue().questionPassenger().contains(clues[x])){
    			leads.add(current.getValue().toString());
    		}
    			
    		}
    		
    		current = current.getNext();
    		
    		
    	
    	}
    	
    	
    	
        return "";

    }

}
