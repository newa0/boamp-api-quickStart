package com.x.api.core;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * 
 * @author Emmanuel PESENTI
 *
 *         27 nov. 2016
 */
public class ServiceGet {
	private static Logger	log				= Logger.getLogger(ServiceGet.class);
	private static File		fileCach	= null;

	public static String execute(String urlGetter, String idAnnonce, String version, String outFrmt) {
		String result = "";
		log.warn("Retrieving Boamp.fr Data");
		Document doc = null;
		log.warn("Creating XML Reader");
		if (outFrmt.equals("xml")) {
			doc = getDocument(urlGetter);
			if (doc != null) {
				result = prettyPrintXml(doc);
			}
		}
		else {
			result = getJsonStream(urlGetter);
			log.info("json parser not implemented yet..");
		}
		return result;
	}

	public static final File getFileCach() {
		return fileCach;
	}

	public static final String file2String(String path, Charset encoding) {
		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(path));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return new String(encoded, encoding);
	}

	private static final Document getDocument(String url) {
		URLConnection conn = null;
		InputStream inputStream = null;
		Document document = null;
		DocumentBuilderFactory factory = null;
		try {
			conn = new URL(url).openConnection();
			conn.addRequestProperty("Accept", "application/xml");
			inputStream = conn.getInputStream();
			factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = factory.newDocumentBuilder();
			document = dBuilder.parse(inputStream);
			document.getDocumentElement().normalize();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		catch (SAXException e) {
			e.printStackTrace();
		}
		finally {
			IOUtils.closeQuietly(inputStream);
		}
		return document;
	}

	private static final String getJsonStream(String url) {
		String result = "";
		URLConnection conn = null;
		InputStream inputStream = null;
		try {
			conn = new URL(url).openConnection();
			conn.addRequestProperty("Accept", "application/json");
			inputStream = conn.getInputStream();
			result = IOUtils.toString(inputStream, Charset.forName("UTF-8"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			IOUtils.closeQuietly(inputStream);
		}
		return result;
	}

	public static final String prettyPrintXml(Node doc) {
		Transformer transformer;
		try {
			transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			// initialize StreamResult with File object to save to file
			StreamResult result = new StreamResult(new StringWriter());
			DOMSource source = new DOMSource(doc);
			transformer.transform(source, result);
			String xmlString = result.getWriter().toString();
			return xmlString;
		}
		catch (TransformerFactoryConfigurationError | TransformerException e1) {
			e1.printStackTrace();
		}
		return "";
	}
}
