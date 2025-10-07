package es.uniovi.ds.lab.main;

import es.uniovi.ds.lab.form.*;

/**
 * IMPORTANT: The code provided for this exercise is the minimum necessary to understand
 * the task and should NEVER be taken as an example of proper use of exceptions, assertions,
 * and tests. All of the above elements, which should be present in a real program, have been
 * intentionally omitted to simplify the exercise.
 */

public class Main {

    public static void main(String[] args) {

        Form form = new Form();

        form.addField(new TextField("Name"));
        form.addField(new TextField("Surname"));
        form.addField(new NumericField("Phone"));
        form.addField(new PredefinedValuesField("City", "Santander", "Valladolid", "Madrid"));

        form.requestInput();
    }
}
