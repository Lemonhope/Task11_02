package com.Kseniia;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        XMLAddress xml=new XMLAddress();
        xml.add(new Address(new Attribute("big", "Kyiv"), "Vyshgorodska", 103));
        xml.add(new Address(new Attribute("med","Vynica"), "Sheva", 99));
        try {
            // Створюємо файл
            File file = new File("myxml.xml");
            // Викликаємо статичний метод JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLAddress.class);
            // Повертає об'єкт класу Marshaller, щоб трансформувати об'єкт
            Marshaller mar = jaxbContext.createMarshaller();

            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Записуємо у файл, marshal(з пам'яті, у файл)
            mar.marshal(xml, file);
            mar.marshal(xml, System.out);

            // Зчитуємо з файлу
            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            xml = (XMLAddress) unmar.unmarshal(file);
            System.out.println(xml);
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}
