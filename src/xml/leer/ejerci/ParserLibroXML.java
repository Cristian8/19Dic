package xml.leer.ejerci;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibroXML extends DefaultHandler {
	private Libro libro;
	private String valor_actual;
	private List<Libro> lista_libros;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("INICIO DEL DOCUMENTO");
		this.lista_libros = new ArrayList<Libro>();
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("FIN DEL DOCUMENTO");
		
		listarLibros(lista_libros);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("StartElement = " + localName);
		if (localName.equals("libro")) {
			String valor_isbn = attributes.getValue("isbn");
			this.libro = new Libro();
			this.libro.setIsbn(valor_isbn);
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("EndElement = " + localName);
		
		if (localName.equals("titulo"))
		{	
			libro.setTitulo(valor_actual);
		} else if (localName.equals("autor"))
		{
			libro.setAutor(valor_actual);
		} else if (localName.equals("anyo")) 
		{
			libro.setAnyo(valor_actual);
		} else if (localName.equals("editorial"))
		{
			System.out.println("\n\n"+libro.getTitulo()+"\n\n");
			libro.setEditorial(valor_actual);
			lista_libros.add(libro);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("Start =" + start);
		System.out.println("Length =" + length);
		String str = new String(ch, start, length);
		System.out.println("String =" + str);
		valor_actual = str;

	}
	
	public static void listarLibros(List<Libro> lista2){
		
		for(Libro libro: lista2)
		{
			System.out.println("Nombre libro: "+ libro.getTitulo());
			System.out.println("ISBN: " + libro.getIsbn());
			System.out.println("Nombre autor: "+ libro.getAutor());
			System.out.println("Año: " + libro.getAnyo());
			System.out.println("Nombre editorial: "+ libro.getEditorial());
			System.out.println();
		}
	}
}
