package com.training.ioassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileAsssignment  {
	
	
    public static boolean isfileExistOrNot(String path)
	{
	   File file=new File(path);
	      if(file.exists())
	      {
	    	  return true;
	      }
		return false;
	}
	
  public static int countLinesInTheFile(String path) throws IOException
  {
	  BufferedReader reader = new BufferedReader(new FileReader(path));
	  int lines = 0;
	  while (reader.readLine() != null) 
		  lines++;
	  reader.close();
	  return lines;
	
	  
  }
  public static int countWordsInTheFile(String path) throws IOException
  {
      File f1=new File(path); 
      String[] words=null;    
      int wc=0;     
      FileReader fr = new FileReader(f1);    
      BufferedReader br = new BufferedReader(fr);  
      String s;
      
      while((s=br.readLine())!=null)    
      {
         words=s.split(" ");  
         wc=wc+words.length;   
      }
      fr.close();
      //System.out.println("Number of words in the file:" +wc);
      return wc;
   }
  
  public static String grepImplementationInJava(String path,String search) throws IOException
  {
	  File f1=new File(path); 
      String[] words=null;  
      FileReader fr = new FileReader(f1);  
      BufferedReader br = new BufferedReader(fr); 
      String s;     
       
      int count=0; 
      int lines = 0;
      String line="";
      String temp="";
      while((s=br.readLine())!=null)   
      {
    	  lines++;
         words=s.split(" ");  
          for (String word : words) 
          {
                 if (word.equals(search))  
                 {
                   count++; 
                   line=line.concat(String.valueOf(lines));
                   temp=temp+s;
                   
                 }
          }
      }
      if(count!=0)  
      {
         
         return "The given word is present for "+count+ " Times in the file at line "+FileAsssignment.splitDigit(line)+temp;
      }
      else
      {
         return "The given word is not present in the file";
      }
	      
  }
  
  public static String  splitDigit(String line) {
	 
	 String string=" ";
	  for(int i=0;i<line.length();i++) {
		  
		 string=string+ line.charAt(i)+" ";
	  }
	  return string;
	 
		
	}

  
    public static void main(String[] args) throws IOException {
		
		System.out.println(FileAsssignment.grepImplementationInJava("C:\\Users\\pripawar\\Downloads\\new.txt", "Asha"));
	}

  }
  
 


