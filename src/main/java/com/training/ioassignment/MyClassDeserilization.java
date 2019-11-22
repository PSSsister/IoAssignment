package com.training.ioassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MyClassDeserilization {


	public static void main(String[] args) throws IOException, ClassNotFoundException {
   //     ArrayList<MyClass> list=new ArrayList<MyClass>();
        String filename = "C:\\Users\\pripawar\\Desktop\\Junitprogram\\IoAssignment\\file1.txt";
       // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
           
            System.out.println(in.readObject()); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
           
            
        }        
        catch(IOException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
  
	}
	}
