package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReadXMLExample{
	public static void main(String[] args) throws FileNotFoundException, DocumentException {
	  File file = new File("./ObjectRepo.xml");
	  FileInputStream fis = new FileInputStream(file);
	  SAXReader saxreader =  new SAXReader();
	  Document doc = saxreader.read(fis);
	  String sourceID = doc.selectSingleNode("//Bus_Search/source").getText();
	  System.out.println(sourceID);
	  
	  
	}
		
	
}