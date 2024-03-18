package TestCases;

import java.io.IOException;
import java.util.Properties;

import utils.ReadProperties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		ReadProperties read = new ReadProperties();
		Properties obj = read.readProperties();
		String username = obj.getProperty("UserName");
		String company = obj.getProperty("Company");
        String doj = obj.getProperty("DOJ");
        System.out.println("Printing properties  ");
        System.out.println("UserName  " +username);
        System.out.println("Company  " +company);
        System.out.println("DOJ  " +doj);
	}

}
