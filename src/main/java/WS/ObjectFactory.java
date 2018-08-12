
package WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS package. 
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

    private final static QName _GetCurDate_QNAME = new QName("http://WebService/", "getCurDate");
    private final static QName _GetCurDateResponse_QNAME = new QName("http://WebService/", "getCurDateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurDateResponse }
     * 
     */
    public GetCurDateResponse createGetCurDateResponse() {
        return new GetCurDateResponse();
    }

    /**
     * Create an instance of {@link GetCurDate }
     * 
     */
    public GetCurDate createGetCurDate() {
        return new GetCurDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getCurDate")
    public JAXBElement<GetCurDate> createGetCurDate(GetCurDate value) {
        return new JAXBElement<GetCurDate>(_GetCurDate_QNAME, GetCurDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getCurDateResponse")
    public JAXBElement<GetCurDateResponse> createGetCurDateResponse(GetCurDateResponse value) {
        return new JAXBElement<GetCurDateResponse>(_GetCurDateResponse_QNAME, GetCurDateResponse.class, null, value);
    }

}
