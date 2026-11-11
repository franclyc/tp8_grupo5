src/main/java/ar/edu/unju/escmi/tp8/collections/CollectionEmpresa.java



package ar.edu.unju.escmi.tp8.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp8.model.Empresa;

public abstract class CollectionEmpresa {

    public static List<Empresa> empresas = new ArrayList<Empresa>();

    public static void precargarEmpresas() {

        if (empresas.isEmpty()) {

            empresas.add(new Empresa(
                1,
                "Andes Tecnologia",
                25,
                "388-422-1001",
                "San Salvador de Jujuy"
            ));

            empresas.add(new Empresa(
                2,
                "Norte Construcciones",
                48,
                "388-422-1002",
                "Palpala, Jujuy"
            ));

            empresas.add(new Empresa(
                3,
                "Comercial del Valle",
                12,
                "388-422-1003",
                "Perico, Jujuy"
            ));

        }
    }
}

