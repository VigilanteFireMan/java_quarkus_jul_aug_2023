package com.herbalife.examples;

public final class Manager extends Employee {
    private int level;

    //public Manager(int id, String name, int level) : base(id, name)
    public Manager(int id, String name, int level) {
        super(id, name);
        this.level = level;
    }

    //Cannot be overridden. similar to sealed
    public final void work(int hours) {
        super.work(hours);
        System.out.println("Manager %s is working %d hours".formatted(this.getName(), hours));
    }

    public int getLevel() {
        return level;
    }
}
