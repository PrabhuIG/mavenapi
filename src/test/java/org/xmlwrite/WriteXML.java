package org.xmlwrite;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteXML {
	
	public static void main(String[] args) throws Exception{
		xmlWrite1();
	}
	
	
	public static void xmlWrite() throws JAXBException {
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		
		Marshaller ms = jb.createMarshaller();
		
		File path=new File("C:\\Users\\Monster\\eclipse-workspace\\MavenAPI\\src\\test\\resources\\XML\\details.xml");
		
		Employee e = new Employee();
		e.setId(100);
		e.setName("PRABU IG");
		e.setEmail("prabhuig@yahoo.com");
		e.setPhno(9384494464l);
		
		ms.marshal(e,path);
			

	}
	public static void xmlWrite1() throws JAXBException {
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		
		Marshaller ms = jb.createMarshaller();
		
		File path=new File("C:\\Users\\Monster\\eclipse-workspace\\MavenAPI\\src\\test\\resources\\XML\\details1.xml");
		
		Employee e=new Employee();
	
		TempAdd tempAdd=new TempAdd();
		tempAdd.setStreet("Eswaran kovil street");
		tempAdd.setCity("PARAMAKUDI");
	
	PerAdd peradd=new PerAdd();
	peradd.setStreet("Sanitorium");
	peradd.setCity("Chennai");
	
	Address address=new Address();
	address.setTempAdd(tempAdd);
	address.setPerAdd(peradd);
	
	e.setAddress(address);
	ms.marshal(e,path);
	
	
}
}