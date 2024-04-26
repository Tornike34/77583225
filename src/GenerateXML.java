import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class GenerateXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();


            Element rootElement = document.createElement("employees");
            document.appendChild(rootElement);

            createEmployee(document,rootElement,"Tokss");
            createEmployee(document,rootElement,"Tokss27");


            TransformerFactory transformerFactory =TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source =new DOMSource(document);
            StreamResult result = new StreamResult(new File("Employee.xml"));

            transformer.transform(source,result);


        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createEmployee(Document document, Element rootElement, String name) {

        Element employeeElement = document.createElement("employee");
        rootElement.appendChild(employeeElement);

        Element nameElement = document.createElement("name");
        nameElement.appendChild(document.createTextNode(name));
        rootElement.appendChild(nameElement);


        Element emailElement = document.createElement("email");
        emailElement.appendChild(document.createTextNode(name+"@btu.edu.ge"));
        rootElement.appendChild(emailElement);


    }
}
