package usoIncorrectoErroresCompilacion.conflictoMetodosInterfaces;

public interface Nadador {
    default void despegar() {
        System.out.println("Nadador despega.");
    }
}
