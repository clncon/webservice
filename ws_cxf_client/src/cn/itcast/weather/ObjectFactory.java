
package cn.itcast.weather;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.itcast.weather package. 
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

    private final static QName _QueryWeatherList_QNAME = new QName("http://weather.itcast.cn/", "queryWeatherList");
    private final static QName _QueryWeatherListResponse_QNAME = new QName("http://weather.itcast.cn/", "queryWeatherListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.itcast.weather
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryWeatherList }
     * 
     */
    public QueryWeatherList createQueryWeatherList() {
        return new QueryWeatherList();
    }

    /**
     * Create an instance of {@link QueryWeatherListResponse }
     * 
     */
    public QueryWeatherListResponse createQueryWeatherListResponse() {
        return new QueryWeatherListResponse();
    }

    /**
     * Create an instance of {@link WeatherModel }
     * 
     */
    public WeatherModel createWeatherModel() {
        return new WeatherModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryWeatherList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather.itcast.cn/", name = "queryWeatherList")
    public JAXBElement<QueryWeatherList> createQueryWeatherList(QueryWeatherList value) {
        return new JAXBElement<QueryWeatherList>(_QueryWeatherList_QNAME, QueryWeatherList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryWeatherListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather.itcast.cn/", name = "queryWeatherListResponse")
    public JAXBElement<QueryWeatherListResponse> createQueryWeatherListResponse(QueryWeatherListResponse value) {
        return new JAXBElement<QueryWeatherListResponse>(_QueryWeatherListResponse_QNAME, QueryWeatherListResponse.class, null, value);
    }

}
