package com.samplecompany.sampleproject.basefunctions;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class BaseSteps extends PageObject {

    @Managed
    WebDriver driver;

    @Page
    BasePage basePage;

    public void login() {

        driver.get(loginURL());

    }

    private String loginURL() {
        String loginURL = "";
        String profile = "sampleproject";
        try {
            File fXmlFile = new File("src/test/resources/config/profiles.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Profile");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    if (eElement.getElementsByTagName("Name")
                            .item(0).getTextContent().equalsIgnoreCase(profile)) {
                        loginURL = eElement.getElementsByTagName("URL")
                                .item(0).getTextContent();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loginURL;
    }

}

