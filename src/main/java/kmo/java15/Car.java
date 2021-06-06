package kmo.java15;

sealed interface Car permits Audi, Vw {
    String name();
}