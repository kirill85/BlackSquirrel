package org.roleplay.blacksquirrel;

import javax.enterprise.context.*;
import javax.inject.Named;

/**
 *
 * @author kirill
 */
@Named(value = "ItemBean")
@RequestScoped
public class ItemBean {
    private String name;
    private Double price;
    private String cathegory;
    private byte[] photo;
    public ItemBean() {
        name = "";
        cathegory = "";
        price = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals(""))
            this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price > 0)
            this.price = price;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }
    
}
