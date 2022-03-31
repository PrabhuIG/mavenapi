package org.test;

import java.io.File;
import java.util.List;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXml {
	
	public static void main(String[] args) throws JAXBException  {
		xmlRead1();


	}
 


	private static void xmlRead1() throws JAXBException {
		
		// Create JAXB context
		JAXBContext jb = JAXBContext.newInstance(EmpDetails.class);
		
		//Create Unmarshaller
		Unmarshaller un = jb.createUnmarshaller();
		
		File path = new File("C:\\Users\\Monster\\eclipse-workspace\\MavenAPI\\src\\test\\resources\\XML\\employee.xml");
		
		Object ob = un.unmarshal(path);
		
		EmpDetails ed=(EmpDetails)ob;
		
		//Get employee details
		List<Employee1> emp = ed.getEmployee1();
		
		//Get first employee details
		Employee1 e1 = emp.get(0);
		System.out.println("Employee id....."+e1.getId());
		System.out.println("Employee name....."+e1.getName());
		System.out.println("Employee Phno......"+e1.getPhno());
		
		System.out.println("============Address==========");
		Address ad = e1.getAddress();
		System.out.println("Street........"+ad.getStreet());
		System.out.println("City........"+ad.getCity());
		System.out.println("State........"+ad.getState());
		
		System.out.println("============Mail============");
		Mail m = e1.getMail();
		System.out.println("Personal Mail........"+m.getPersonal());
		System.out.println("Official Mail........"+m.getOfficial());
		
		//Get all employee details
		System.out.println("");
		System.out.println("============Get all details============");
		
		
	for (int i = 0; i < emp.size(); i++) {
		Employee1 e = emp.get(i);
		System.out.println("");
		System.out.println("Employee id....."+e.getId());
		System.out.println("Employee name....."+e.getName());
		System.out.println("Employee Phno......"+e.getPhno());
		
		System.out.println("============Address==========");
		Address add = e1.getAddress();
		System.out.println("Street........"+add.getStreet());
		System.out.println("City........"+add.getCity());
		System.out.println("State........"+add.getState());
		
		System.out.println("============Mail============");
		Mail ml = e1.getMail();
		System.out.println("Personal Mail........"+ml.getPersonal());
		System.out.println("Official Mail........"+ml.getOfficial());
		
		
	
	
	
	}
		
		
		
		

	}

}
 