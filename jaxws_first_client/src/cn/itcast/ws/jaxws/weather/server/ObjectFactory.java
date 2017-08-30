
package cn.itcast.ws.jaxws.weather.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.itcast.ws.jaxws.weather.server package. 
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

    private final static QName _QueryNameResponse_QNAME = new QName("http://server.weather.jaxws.ws.itcast.cn/", "queryNameResponse");
    private final static QName _QueryName_QNAME = new QName("http://server.weather.jaxws.ws.itcast.cn/", "queryName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.itcast.ws.jaxws.weather.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryNameResponse }
     * 
     */
    public QueryNameResponse createQueryNameResponse() {
        return new QueryNameResponse();
    }

    /**
     * Create an instance of {@link QueryName }
     * 
     */
    public QueryName createQueryName() {
        return new QueryName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.weather.jaxws.ws.itcast.cn/", name = "queryNameResponse")
    public JAXBElement<QueryNameResponse> createQueryNameResponse(QueryNameResponse value) {
        return new JAXBElement<QueryNameResponse>(_QueryNameResponse_QNAME, QueryNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.weather.jaxws.ws.itcast.cn/", name = "queryName")
    public JAXBElement<QueryName> createQueryName(QueryName value) {
        return new JAXBElement<QueryName>(_QueryName_QNAME, QueryName.class, null, value);
    }

}
