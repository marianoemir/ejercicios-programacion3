public class MainMuseo {
    public static void main(String[] args) {
        Museo museo = new Museo("Museo Nacional de Bellas Artes");

        Artista frida = new Artista("Frida Kahlo", "06/07/1907", "13/07/1954", "Mexico", "siglo XX", "surrealismo",
                "Pintora mexicana conocida por sus autorretratos");
        Artista rodin = new Artista("Auguste Rodin", "12/11/1840", "17/11/1917", "Francia", "siglo XIX", "realismo",
                "Escultor frances, considerado el padre de la escultura moderna");

        // coleccion externa con la que el museo intercambia obras
        Coleccion louvre = new Coleccion("Coleccion Louvre", "museo", "Museo de arte en Paris", "Paris, Francia", "01-4020-5050", "Jean Dupont");

        // objeto 1: es pintura Y esta en la coleccion permanente (los 2 ejes a la vez, son independientes)
        ObjetoArte obj1 = new ObjetoArte(1, "Autorretrato", frida);
        obj1.setTipoDetalle(new PinturaDetalle("oleo", "lienzo", "surrealista"));
        obj1.setPertenenciaDetalle(new Permanente("10/03/1995", 500000, true));
        obj1.setOrigen("Mexico", "mexicana", "siglo XX");
        museo.agregarObjeto(obj1);

        // objeto 2: es escultura y esta en prestamo de la coleccion del Louvre
        ObjetoArte obj2 = new ObjetoArte(2, "El Pensador (replica)", rodin);
        obj2.setTipoDetalle(new EsculturaDetalle("bronce", 1.8, 200, "realista"));
        obj2.setPertenenciaDetalle(new Prestamo(louvre, "01/01/2024", "01/01/2025"));
        obj2.setOrigen("Francia", "francesa", "siglo XIX");
        museo.agregarObjeto(obj2);

        // objeto 3: es "otro" tipo y es permanente
        ObjetoArte obj3 = new ObjetoArte(3, "Vasija ceremonial", null);
        obj3.setTipoDetalle(new OtroDetalle("ceramica ceremonial"));
        obj3.setPertenenciaDetalle(new Permanente("05/05/2000", 15000, false));
        obj3.setOrigen("Peru", "inca", "precolombino");
        museo.agregarObjeto(obj3);

        Exposicion expo = new Exposicion("Arte Latinoamericano", "01/06/2026", "01/09/2026");
        expo.agregarObjeto(obj1);
        expo.agregarObjeto(obj3);
        museo.agregarExposicion(expo);

        System.out.println("=== Coleccion del " + museo.nombre + " ===");
        for (ObjetoArte o : museo.coleccion) {
            System.out.println(o);
        }

        System.out.println("\nObjetos en prestamo:");
        for (ObjetoArte o : museo.getObjetosEnPrestamo()) {
            System.out.println("- " + o.titulo);
        }

        // demostrando que los 2 ejes son independientes (ortogonales): reasigno el eje tipo
        // y el eje pertenencia no se toca
        System.out.println("\nobj1 es pintura y permanente a la vez? " + (obj1.esPintura() && obj1.esPermanente()));
        obj1.setTipoDetalle(new EsculturaDetalle("yeso", 0.5, 3, "moderno"));
        System.out.println("despues de cambiar el tipo, obj1 sigue siendo permanente? " + obj1.esPermanente());

        System.out.println("\nExposicion '" + expo.nombre + "' tiene " + expo.objetos.size() + " objetos");
    }
}
