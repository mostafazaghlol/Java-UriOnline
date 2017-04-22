import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Main {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder bulidr=factory.newDocumentBuilder();
			org.w3c.dom.Document doc=bulidr.parse("http://services.explorecalifornia.org/pox/tours.php");
			NodeList list=doc.getElementsByTagName("description");
			
			System.out.println(list.getLength());
			for(int i=0;i<list.getLength();i++){
			Element item=(Element)list.item(i);
			System.out.println(item.getFirstChild().getNodeValue());
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

}
