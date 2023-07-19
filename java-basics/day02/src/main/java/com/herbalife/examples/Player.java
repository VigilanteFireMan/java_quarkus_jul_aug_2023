package com.herbalife.examples;

public class Player {
    public int id;
    //package-friendly
    String name; //NOT RECOMMENDED
    //package-friendly + from derived classes in any package
    protected long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
