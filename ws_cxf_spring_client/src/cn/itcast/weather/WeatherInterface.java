package cn.itcast.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-08-28T20:39:00.501+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://weather.itcast.cn/", name = "weatherInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherInterface {

    @WebMethod
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://weather.itcast.cn/", className = "cn.itcast.weather.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://weather.itcast.cn/", className = "cn.itcast.weather.QueryWeatherResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cn.itcast.weather.WeatherModel> queryWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
