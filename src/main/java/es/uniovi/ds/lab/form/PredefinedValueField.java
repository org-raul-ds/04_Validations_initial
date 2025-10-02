package es.uniovi.ds.lab.form;

import java.io.*;

public class PredefinedValueField implements FormField {

    private String label;
    private String[] validValues;
    private String value;

    public PredefinedValueField(String label, String... validValues) {
        this.label = label;
        this.validValues = validValues;
    }

    public void requestInput() {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        boolean isValid;
        do {
            isValid = false;
            try {
                System.out.print(label + ": ");
                value = console.readLine();

                // Check if the entered text is among the allowed values
                for (String valor : validValues) {
                    if (value.equalsIgnoreCase(valor)) {
                        isValid = true;
                        break;
                    }
                }

            } catch (IOException ex) {
                System.out.println(ex);
            }

        } while (!isValid);
    }

    public String getValue() {
        return value;
    }

}
