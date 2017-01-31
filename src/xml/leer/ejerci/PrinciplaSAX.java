package xml.leer.ejerci;

import java.io.FileInputStream;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import xml.leer.ejerci.ParserLibroXML;

public class PrinciplaSAX {
	
	public static void main(String[] args) throws Throwable {
		
		XMLReader reader = 
		XMLReaderFactory.createXMLReader();
		
		ParserLibroXML parserLibro = null;
		parserLibro = new ParserLibroXML();
		
		reader.setContentHandler(parserLibro);
		
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
	
		
		
	}

}
