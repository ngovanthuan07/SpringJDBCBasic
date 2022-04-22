package springdemo;

import java.util.List;

public class HelloWorld {
    private String name;
    private Language lang;
    private List names;

    public HelloWorld(String name, Language l) {
        this.name = name;
        this.lang = l;
    }
    public HelloWorld() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.printf("Hello %s - Language: %s\n", this.name, this.lang.getLang());
        System.out.println(this.names);
    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }

    public List getNames() {
        return names;
    }

    public void setNames(List names) {
        this.names = names;
    }
}
