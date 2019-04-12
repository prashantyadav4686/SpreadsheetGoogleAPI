package com.qait.ReadSpreadsheet;

import java.io.IOException;
import org.testng.annotations.Test;

public class SpreadsheetTest {
	GooglesheetAPI sheetAPI = new GooglesheetAPI();
   
	@Test()
	public void Test01_readData() throws IOException {
	  sheetAPI.getSpreadSheetRecords();
	
}
	@Test()
	public void whenWriteSheet_thenReadSheetOk() throws IOException {
		sheetAPI.writeSheet();
	}
}