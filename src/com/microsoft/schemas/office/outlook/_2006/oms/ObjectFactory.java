
package com.microsoft.schemas.office.outlook._2006.oms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.office.outlook._2006.oms package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _XmsData_QNAME = new QName("http://schemas.microsoft.com/office/Outlook/2006/OMS", "xmsData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.office.outlook._2006.oms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMmsSlides }
     * 
     */
    public TMmsSlides createTMmsSlides() {
        return new TMmsSlides();
    }

    /**
     * Create an instance of {@link TXmsBody }
     * 
     */
    public TXmsBody createTXmsBody() {
        return new TXmsBody();
    }

    /**
     * Create an instance of {@link TMeta }
     * 
     */
    public TMeta createTMeta() {
        return new TMeta();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link GetServiceInfo }
     * 
     */
    public GetServiceInfo createGetServiceInfo() {
        return new GetServiceInfo();
    }

    /**
     * Create an instance of {@link TLayout }
     * 
     */
    public TLayout createTLayout() {
        return new TLayout();
    }

    /**
     * Create an instance of {@link TTo }
     * 
     */
    public TTo createTTo() {
        return new TTo();
    }

    /**
     * Create an instance of {@link THeader }
     * 
     */
    public THeader createTHeader() {
        return new THeader();
    }

    /**
     * Create an instance of {@link TText }
     * 
     */
    public TText createTText() {
        return new TText();
    }

    /**
     * Create an instance of {@link TXmsData }
     * 
     */
    public TXmsData createTXmsData() {
        return new TXmsData();
    }

    /**
     * Create an instance of {@link DeliverXms }
     * 
     */
    public DeliverXms createDeliverXms() {
        return new DeliverXms();
    }

    /**
     * Create an instance of {@link TImg }
     * 
     */
    public TImg createTImg() {
        return new TImg();
    }

    /**
     * Create an instance of {@link SendXmsResponse }
     * 
     */
    public SendXmsResponse createSendXmsResponse() {
        return new SendXmsResponse();
    }

    /**
     * Create an instance of {@link TXmsHeader }
     * 
     */
    public TXmsHeader createTXmsHeader() {
        return new TXmsHeader();
    }

    /**
     * Create an instance of {@link SendXms }
     * 
     */
    public SendXms createSendXms() {
        return new SendXms();
    }

    /**
     * Create an instance of {@link UserInfoResponse }
     * 
     */
    public UserInfoResponse createUserInfoResponse() {
        return new UserInfoResponse();
    }

    /**
     * Create an instance of {@link GetServiceInfoResponse }
     * 
     */
    public GetServiceInfoResponse createGetServiceInfoResponse() {
        return new GetServiceInfoResponse();
    }

    /**
     * Create an instance of {@link DeliverXmsResponse }
     * 
     */
    public DeliverXmsResponse createDeliverXmsResponse() {
        return new DeliverXmsResponse();
    }

    /**
     * Create an instance of {@link TAudio }
     * 
     */
    public TAudio createTAudio() {
        return new TAudio();
    }

    /**
     * Create an instance of {@link TRootLayout }
     * 
     */
    public TRootLayout createTRootLayout() {
        return new TRootLayout();
    }

    /**
     * Create an instance of {@link TPar }
     * 
     */
    public TPar createTPar() {
        return new TPar();
    }

    /**
     * Create an instance of {@link TRegion }
     * 
     */
    public TRegion createTRegion() {
        return new TRegion();
    }

    /**
     * Create an instance of {@link TBody }
     * 
     */
    public TBody createTBody() {
        return new TBody();
    }

    /**
     * Create an instance of {@link TUser }
     * 
     */
    public TUser createTUser() {
        return new TUser();
    }

    /**
     * Create an instance of {@link TContent }
     * 
     */
    public TContent createTContent() {
        return new TContent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TXmsData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/office/Outlook/2006/OMS", name = "xmsData")
    public JAXBElement<TXmsData> createXmsData(TXmsData value) {
        return new JAXBElement<TXmsData>(_XmsData_QNAME, TXmsData.class, null, value);
    }

}
