package ru.util.model;

public class Alien {
    private int id;
    private String name;
    private String tech;

    public int getId() {
        return id;
    }

    public void setId(int aid) {
        this.id = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien [aid = " + id + ", name = " + name + ", tech = " + tech + "]";
    }
}
