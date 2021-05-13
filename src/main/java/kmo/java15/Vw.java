package kmo.java15;

public non-sealed class Vw implements Car {

    private final String name;

    public Vw(final String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
