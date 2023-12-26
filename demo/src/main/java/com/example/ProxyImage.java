package com.example;

public class ProxyImage implements MyImage{

    private RealImage realImage;
    public String filename;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display(){
        if (realImage == null){
           RealImage realImage = new RealImage(filename);
           realImage.display();
        }
        realImage.display();
    }
}
