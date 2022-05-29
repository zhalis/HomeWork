package lists.entties;

import lists.api.INickname;

public class Person implements INickname {

    private final String nick;
    private final String password;

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getNick() {
        return this.nick;
    }
}
