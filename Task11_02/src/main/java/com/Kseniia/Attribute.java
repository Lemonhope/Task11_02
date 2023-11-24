package com.Kseniia;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Attribute {

    private String thisAtt;
    private String value;

    Attribute() {}
    public Attribute(String thisAtt, String value) {
        this.thisAtt = thisAtt;
        this.value = value;
    }

    @XmlAttribute(name="size")
    public String getThisAtt() { return thisAtt; }
    public void setThisAtt(String thisAtt) { this.thisAtt = thisAtt; }
    @XmlValue
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public String toString() {
        return "Attribute{" +
                "size='" + thisAtt + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
