
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of formats for the reason for an in repair status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InRepairStatusReason4Choice", propOrder = {
    "noSpcfdRsn",
    "rsnDtls"
})
public class InRepairStatusReason4Choice {

    @XmlElement(name = "NoSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noSpcfdRsn;
    @XmlElement(name = "RsnDtls")
    protected List<InRepairStatusReason4> rsnDtls;

    /**
     * Gets the value of the noSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoSpcfdRsn() {
        return noSpcfdRsn;
    }

    /**
     * Sets the value of the noSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public InRepairStatusReason4Choice setNoSpcfdRsn(NoReasonCode value) {
        this.noSpcfdRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InRepairStatusReason4 }
     * 
     * 
     */
    public List<InRepairStatusReason4> getRsnDtls() {
        if (rsnDtls == null) {
            rsnDtls = new ArrayList<InRepairStatusReason4>();
        }
        return this.rsnDtls;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the rsnDtls list.
     * @see #getRsnDtls()
     * 
     */
    public InRepairStatusReason4Choice addRsnDtls(InRepairStatusReason4 rsnDtls) {
        getRsnDtls().add(rsnDtls);
        return this;
    }

}