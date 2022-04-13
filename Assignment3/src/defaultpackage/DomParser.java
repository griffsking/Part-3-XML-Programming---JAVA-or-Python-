package defaultpackage;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;

public class DomParser {
	
	public static void main(String argv[]) {
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	try {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("assignment3.xml"));
		document.getDocumentElement().normalize();
		NodeList nList = document.getElementsByTagName("root");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				System.out.println("Street : "  + eElement.getElementsByTagName("street").item(0).getTextContent());
				System.out.println("City : "  + eElement.getElementsByTagName("city").item(0).getTextContent());
				System.out.println("State : "  + eElement.getElementsByTagName("state").item(0).getTextContent());
				System.out.println("Zip : "    + eElement.getElementsByTagName("zip").item(0).getTextContent());
				System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
				System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
				System.out.println("Phone : "    + eElement.getElementsByTagName("phone").item(0).getTextContent());
				System.out.println("Month : "  + eElement.getElementsByTagName("month").item(0).getTextContent());
				System.out.println("Day : "    + eElement.getElementsByTagName("day").item(0).getTextContent());
				System.out.println("Year : "    + eElement.getElementsByTagName("year").item(0).getTextContent());
				System.out.println("Gender : "  + eElement.getElementsByTagName("gender").item(0).getTextContent());
				System.out.println("Eye Color : "  + eElement.getElementsByTagName("eyeColor").item(0).getTextContent());
			}
		}
	}
	catch (ParserConfigurationException e) {
		e.printStackTrace();
	}
	catch (SAXException e) {
		e.printStackTrace();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	}
}

