
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DNSInformation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNSInformation" type="{http://www.onvif.org/ver10/schema}DNSInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dnsInformation"
})
@XmlRootElement(name = "GetDNSResponse")
public class GetDNSResponse {

    @XmlElement(name = "DNSInformation", required = true)
    protected DNSInformation dnsInformation;

    /**
     * Gets the value of the dnsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DNSInformation }
     *     
     */
    public DNSInformation getDNSInformation() {
        return dnsInformation;
    }

    /**
     * Sets the value of the dnsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNSInformation }
     *     
     */
    public void setDNSInformation(DNSInformation value) {
        this.dnsInformation = value;
    }

}
