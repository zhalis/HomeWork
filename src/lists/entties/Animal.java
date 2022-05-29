package lists.entties;

import lists.api.INickname;

public class Animal implements INickname {

    private final int age;
    private final String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getNick() {
        return this.nick;
    }
}
