package ch.juventus.javafx.baelding;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {

    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleBooleanProperty isEmployed;

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public boolean isEmployed() {
        return isEmployed.get();
    }

    public SimpleBooleanProperty isEmployedProperty() {
        return isEmployed;
    }
}
