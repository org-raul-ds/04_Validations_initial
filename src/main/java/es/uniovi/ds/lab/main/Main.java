package es.uniovi.ds.lab.main;

import es.uniovi.ds.lab.form.*;

/**
 * IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones, asertos
 * y tests. Todos los elementos anteriores, que deberían hacerse en un programa real, se han omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

public class Main {

    public static void main(String[] args) {

        Form form = new Form();

        form.addField(new TextField("Name"));
        form.addField(new TextField("Surname"));
        form.addField(new NumericField("Phone"));
        form.addField(new PredefinedValueField("City", "Santander", "Valladolid", "Madrid"));

        form.requestData();
    }
}
