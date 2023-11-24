package Task11_02;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XMLAddress {
    @XmlElement(name = "address")
    private List<Address> addressList = new ArrayList<>();

    public void add(Address address) {
        addressList.add(address);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(addressList.toArray());
    }
}
