package usoIncorrectoErroresCompilacion.conflictoMetodosInterfaces;

public interface Volador {
    default void despegar() {
        System.out.println("Volador despega.");
    }
}
