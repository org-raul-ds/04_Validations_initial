package es.uniovi.ds.lab.form;

import java.io.*;

public class TextField implements FormField {

    private String label;
    private String value;

    public TextField(String label) {
        this.label = label;
    }

    public void requestInput() {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        boolean isValid;
        do {
            isValid = true;
            try {
                System.out.print(label + ": ");
                value = console.readLine();

                // Check if the entered text is made up of letters
                for (char ch : value.toCharArray()) {
                    if (!Character.isLetter(ch)) {
                        isValid = false;
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
