package com.training.ioassignment.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.training.ioassignment.FileAsssignment;

public class FileAsssignmentTest {

	@Test
	public void testWhetherFileExitOrNot() {
	    assertEquals(true,FileAsssignment.isfileExistOrNot("C:\\Users\\pripawar\\Downloads\\new.txt"));
	}
    
	@Test
	public void testWhetherFileExitOrNotWhenFileIsNotExit() {
	    assertEquals(false,FileAsssignment.isfileExistOrNot("C:\\Users\\pripawar\\Downloads\\dew.txt"));
	}
	
	@Test
	public void testCountOfLinesInFile() throws IOException {
		int expected=6;
	    assertEquals(expected,FileAsssignment.countLinesInTheFile("C:\\Users\\pripawar\\Downloads\\new.txt"));
	}
	
	@Test
	public void testCountOfWordsInFile() throws IOException {
		int expected=18;
		assertEquals(expected,FileAsssignment.countWordsInTheFile("C:\\Users\\pripawar\\Downloads\\new.txt"));
	}
	
	@Test
	public void testGrepImplementationInJava() throws IOException {
		String expected="The given word is present for 2 Times in the file at line  4 6 Asha is my motherAsha is my mother";
		assertEquals(expected,FileAsssignment.grepImplementationInJava("C:\\Users\\pripawar\\Downloads\\new.txt", "Asha"));

	}
}
