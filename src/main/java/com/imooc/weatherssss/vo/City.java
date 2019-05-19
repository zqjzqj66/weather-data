package com.imooc.weatherssss.vo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Description:
 *
 * @author 周启江
 * @ClassName: City
 * @date 2019/5/17 8:06
 */
@Data
public class City {

    private String cityId;

    private String cityName;

    private String cityCode;

    private String province;

}
