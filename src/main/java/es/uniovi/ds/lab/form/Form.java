package es.uniovi.ds.lab.form;

import java.util.*;

public class Form {

    private List<FormField> fields = new ArrayList<>();

    public void addField(FormField field) {
        fields.add(field);
    }

    public void requestData() {
        for (FormField field : fields) {
            field.requestInput();
            System.out.println(field.getValue());
        }
    }

}
