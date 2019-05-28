package ch.juventus.sockets;

import java.io.Serializable;

public class Request implements Serializable {

    private Command command;

    private Object payload;

    public Request(Command command, Object payload) {
        this.command = command;
        this.payload = payload;
    }

    public Command getCommand() {
        return command;
    }

    public Person getPerson() {
        if (isBodyPerson()) {
            return (Person) payload;
        } else {
            return null;
        }
    }

    public String getLastName() {
        if (isBodyString()) {
            return (String) payload;
        } else {
            return null;
        }
    }

    public boolean isBodyString() {
        return payload instanceof String;
    }

    public boolean isBodyPerson() {
        return payload instanceof Person;
    }

    public static enum Command {
        ADD,
        REMOVE,
        GET_BY_NAME,
        QUIT;
    }
}
