package com.codebind;

public abstract class MoveAttributes {

    private String _name;
    private Boolean _attack;
    private Boolean _buffDebuff;
    private int _time; //day = 1 or night = 2 doesn't matter = -1
    private int _damage;
    private String _damageType; //physical damage type, Refer to large comment in Class Stats
    private String _elementalType; //magical damage type, Refer to large comment in Class Stats
    private int _range; //if less than 10 feet is melee
    private int _accuracy;
    private int _cooldown; //make sure people can't spam moves

    public String name() {  //important
        return _name;
    }
    public boolean attack() {  //important
        return _attack;
    }
    public boolean buffDebuff() {  //important
        return _buffDebuff;
    }
    public int time() {  //important
        return _time;
    }
    public int damage() {  //important
        return _damage;
    }
    public String damageType() {  //important
        return _damageType;
    }
    public String elementalType() {  //important
        return _elementalType;
    }
    public int range() {  //important
        return _range;
    }
    public int accuracy() { return _accuracy; }
    public int cooldown() {
        return _cooldown;
    }

    public MoveAttributes(String name, boolean attack, boolean buffDebuff, int time, int damage, String damageType, String elementalType, int range, int accuracy, int cooldown) {

        this._name = name;
        this._attack = attack;
        this._buffDebuff = buffDebuff;
        this._time = time;
        this._damage = damage;
        this._damageType = damageType;
        this._elementalType = elementalType;
        this._range = range;
        this._accuracy = accuracy;
        this._cooldown = cooldown;

    }

}
