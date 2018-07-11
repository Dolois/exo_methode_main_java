package exos_methode_main_java;

import java.io.Console;
import java.util.Arrays;

public class Exo14 {
 
    public static void main(String[] args) {
    	Console console = System.console();
 
    	if(console != null) {
    		char[] password = null;
    		try {   
    			password = console.readPassword("Please enter Password");
    			System.out.println("Password is " + new String(password));
    		} finally {
    			if(password != null) {
    				Arrays.fill(password, ' ');
    			}
    		}
    	} else {
    		throw new RuntimeException("No console, can't get password");
    	}  
    }
}
