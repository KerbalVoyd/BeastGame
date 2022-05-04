package com.codebind;

public abstract class Stats {
    private String _name;
    private int _HP;
    private int _SPEED;
    private int _POWER;
    private int _ARMOUR;
    private int _TYPE;
    private int _SIZE;

    public String name() {  //important
        return _name;
    }
    public int HP() {
        return _HP;
    }
    public int SPEED() {
        return _SPEED;
    }
    public int POWER() {
        return _POWER;
    }
    public int ARMOUR() {
        return _ARMOUR;
    }
    public int TYPE() {
        return _TYPE;
    }
    public int SIZE() {
        return _SIZE;
    }

    public Stats() {
        this._name = "some animal name";
    }

    public Stats(String name, int HP, int SPEED, int POWER, int ARMOUR, int TYPE, int SIZE) {
        this._name = name;
        this._HP = HP;
        this._ARMOUR = ARMOUR;
        this._POWER = POWER;
        this._SPEED = SPEED;
        this._TYPE = TYPE;
        this._SIZE = SIZE;
    }
}
