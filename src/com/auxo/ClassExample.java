package com.auxo;

import java.util.Scanner;

public class ClassExample {
    public static void main(String[] args) {
    car porsche=new car();
    car holde=new car();
        Scanner sc=new Scanner(System.in);
        String car=sc.next();

        //System.out.println("Model is"+porsche.getModel());
        porsche.setModel(car);
        System.out.println("Model is"+porsche.getModel());
    }

}

class car
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    public void setModel(String model)
    {
        String validModel=model.toLowerCase();
        System.out.println(validModel);
        if(validModel.equals("honda")||validModel.equals("tata")){
            this.model=model;
        }
        else {
            this.model = "unknown model";
        }
    }
     public String getModel(){
        return this.model;
     }
}
