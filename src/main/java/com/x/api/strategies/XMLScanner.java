package com.x.api.strategies;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XMLScanner {
	public static String				tmpFolder			= System.getProperty("java.io.tmpdir");
	public static final String	SCHEMA_SCHEMA	= "http://www.w3.org/2001/XMLSchema";
	public String								schema				= "";
	//
	///
	private Validator						validator			= null;

	public XMLScanner(File schemaToApply) {
		schema = schemaToApply.getName();
		SchemaFactory factory = SchemaFactory.newInstance(SCHEMA_SCHEMA);
		try {
			InputSource sourceentree = new InputSource(new FileInputStream(schemaToApply));
			SAXSource sourceXSD = new SAXSource(sourceentree);
			Schema schema = factory.newSchema(sourceXSD);
			validator = schema.newValidator();
		}
		catch (IOException e) {
			System.out.println("\tIOException : " + e.getMessage());
		}
		catch (SAXException e) {
			System.out.println("\tSAXException : " + e.getMessage());
		}
	}

	public XMLScanner(URL urlSchemaToApply) {
		schema = urlSchemaToApply.getFile();
		SchemaFactory factory = SchemaFactory.newInstance(SCHEMA_SCHEMA);
		try {
			Schema schema = factory.newSchema(urlSchemaToApply);
			validator = schema.newValidator();
		}
		catch (SAXException e) {
			System.out.println("\tSAXException : " + e.getMessage());
		}
	}

	public void scanMany(File folderToCheck) throws SAXException, IOException {
		File[] list = folderToCheck.listFiles();
		for (int i = 0; i < list.length; i++) {
			File annonce = list[i];
			scan(annonce);
		}
	}

	public void scanMany(File[] filesToCheck) throws SAXException, IOException {
		for (int i = 0; i < filesToCheck.length; i++) {
			File annonce = filesToCheck[i];
			scan(annonce);
		}
	}

	public void scanMany(List<File> filesToCheck) throws SAXException, IOException {
		for (Iterator<File> iterator = filesToCheck.iterator(); iterator.hasNext();) {
			File annonce = iterator.next();
			scan(annonce);
		}
	}

	public void scan(File xmlFileToCheck) throws SAXException, IOException {
		final List<SAXParseException> exceptions = new LinkedList<SAXParseException>();
		validator.setErrorHandler(new MyErrorHandler(exceptions));
		validator.validate(new StreamSource(xmlFileToCheck));
		if (exceptions.size() > 0) {
			Iterator<SAXParseException> it = exceptions.iterator();
			while (it.hasNext()) {
				SAXParseException se = it.next();
				System.out.println(se.toString());
			}
			throw new SAXException("\tNon conformité sur l'annonce : " + xmlFileToCheck.getName());
		}
		else {
			System.out.printf("%s conforme.\n", xmlFileToCheck.getName());
		}
	}

	public void scan(InputStream stream) throws SAXException, IOException {
		final List<SAXParseException> exceptions = new LinkedList<SAXParseException>();
		validator.setErrorHandler(new MyErrorHandler(exceptions));
		validator.validate(new StreamSource(stream));
		if (exceptions.size() > 0) {
			Iterator<SAXParseException> it = exceptions.iterator();
			while (it.hasNext()) {
				SAXParseException se = it.next();
				System.out.println(se.toString());
			}
			throw new SAXException("\tNon conformité sur l'annonce : ");
		}
		else {
			System.out.printf("conforme a %s ...\n", schema);
		}
	}

	private class MyErrorHandler implements ErrorHandler {
		private List<SAXParseException> exceptions = null;

		public MyErrorHandler(List<SAXParseException> exceptions) {
			super();
			this.exceptions = exceptions;
		}

		@Override
		public void warning(SAXParseException exception) throws SAXException {
			exceptions.add(exception);
		}

		@Override
		public void fatalError(SAXParseException exception) throws SAXException {
			exceptions.add(exception);
		}

		@Override
		public void error(SAXParseException exception) throws SAXException {
			exceptions.add(exception);
		}
	}
}
