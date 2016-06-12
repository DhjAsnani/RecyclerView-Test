package com.example.gohan.recyclesview;

/**
 * Created by Freeware Sys on 6/12/2016.
 */
public class ListProvider {

    private int image_id;
    private String name,capital;
    public ListProvider(int image_id,String name,String capital){
        this.setImage_id(image_id);
        this.setCapital(capital);
        this.setName(name);
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
