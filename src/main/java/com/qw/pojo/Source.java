package com.qw.pojo;

import java.io.Serializable;

/**
 * @Package: com.qw.pojo
 * @ClassName: Source
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/24 17:18
 */
public class Source implements Serializable {
    private static final long serialVersionUID = 8493253244345767503L;

    private String fruit;

    private String sugar;

    private String size;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
