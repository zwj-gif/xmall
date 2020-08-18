package cn.exrick.common.pojo;

import java.io.Serializable;

/**
 * @author Exrickx
 */
public class City implements Serializable {

    String city;

    String district;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
