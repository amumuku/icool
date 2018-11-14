package com.general.freight.dal.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author szy on 18/4/27.
 */
@Data
public class Brand implements Serializable {

    private Integer id;

    private String brandName;
}
