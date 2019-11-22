package com.training.ioassignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class MyClassSerilization{
	

	public static void main(String[] args) throws IOException 
    {   
    	MyClass cs,cs1,cs2,cs3,cs4;
    	
    	cs=new MyClass(1,"gulab");
    	cs1=new MyClass(2,"Jai");
    	cs2=new MyClass(3,"mogra");
    	cs3=new MyClass(4,"chameli");
    	cs4=new MyClass(5,"champa");
    	
    	ArrayList<MyClass> list=new ArrayList<MyClass>();
        list.add(cs);
        list.add(cs1);
        list.add(cs2);
        list.add(cs3);
        list.add(cs4);
        
        String filename = "file1.txt"; 
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(list); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(FileNotFoundException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
    }

}
