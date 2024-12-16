package com.codeewithathul;

public class Cricketer {

    private  int jerseyname;

    private  String name;

    private int run;

    public Cricketer(){
    super();
   }

    public Cricketer(int jerseyname, String name, int run) {
      System.out.println("object");

        this.jerseyname = jerseyname;
        this.name = name;
        this.run = run;
    }

    public int getJerseyname() {
        return jerseyname;
    }

    public void setJerseyname(int jerseyname) {
        this.jerseyname = jerseyname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "jerseyname=" + jerseyname +
                ", name='" + name + '\'' +
                ", run=" + run +
                '}';
    }

    public  void  display(){

        System.out.println("jerseyname= "+jerseyname);
        System.out.println("name="+name);
        System.out.println("run="+run);
    }

}
