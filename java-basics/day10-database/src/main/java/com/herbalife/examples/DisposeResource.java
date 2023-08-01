package com.herbalife.examples;

public class DisposeResource {
    public static void main(String[] args) throws Exception {
        MyResource myResource = new MyResource();
        myResource.cleanUp();

        DbResource dbResource = new DbResource();
        dbResource.close();

        try(DbResource dbResource1 = new DbResource()) {
            System.out.println(dbResource1);
            System.out.println("I am done with using DbResource");
        }
        System.out.println("End of main");

    }
}

class DbResource implements AutoCloseable {
    public DbResource() {
        System.out.println("DbResource created");
    }

    public void close() throws Exception {
        System.out.println("DbResource destroyed");
    }
}

class MyResource {
    public MyResource() {
        System.out.println("MyResource created");
    }
    public void cleanUp() {
        System.out.println("MyResource destroyed");
    }
}