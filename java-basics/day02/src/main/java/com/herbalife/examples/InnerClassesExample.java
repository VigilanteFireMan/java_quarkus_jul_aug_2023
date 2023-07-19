package com.herbalife.examples;

public class InnerClassesExample {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        TV lg = new TV();
        TV.Remote lgRemote = lg.new Remote();
        lgRemote.increaseVolume();
        lgRemote.decreaseVolume();
    }
}

class TV {
    private int volume;

    class Remote {
        public void increaseVolume() {
            volume++;
        }

        public void decreaseVolume() {
            volume--;
        }
    }
}

class Outer {
    class Inner {

    }
}
