package com.codebind;

import java.util.ArrayList;

public abstract class Stats {
    private String _name;
    private int _hp;
    private int _speed;
    private int _strength;
    private int _magic;
    private int _magic_armour;
    private int _physical_armour;
    private int _intel;
    private String _species;
    private String _type1;
    private String _type2;
    private int _size;

     ArrayList<Move> moveList = new ArrayList<Move>(); //beasts move list starts at 0

    public Stats(String name, String type1, String type2, String species, int hp, int speed, int strength, int magic, int magic_armour, int physical_armour, int intel, int size) {
        this._name = name;
        this._species = species;
        this._type1 = type1;
        this._type2 = type2;
        this._hp = hp;
        this._speed = speed;
        this._strength = strength;
        this._magic = magic;
        this._magic_armour = magic_armour;
        this._physical_armour = physical_armour;
        this._intel = intel;
        this._size = size;
    }

    public String name() {  //important
        return _name;
    }
    public int hp() {
        return _hp;
    }
    public int speed() {
        return _speed;
    }
    public int strength() {
        return _strength;
    }
    public int magic() { return _magic; }
    public int magic_armour() { return _magic_armour; }
    public int physical_armour() { return _physical_armour; }
    public int intel() { return _intel; }
    public String species() {
        return _species;
    }
    public String type1() {
        return _type1;
    }
    public String type2() {
        return _type2;
    }
    public int size() {
        return _size;
    }

    public Stats() {
        this._name = "Unnamed Beast";
    }

    /*====================================================
    ALL ELEMENTAL TYPES POSSIBLE
    - FIRE
    - WATER
    - ICE
    - ROCK
    - NECROTIC
    - MAGICAL
    - HOLY
    - DARK
    - RADIANT
    - NATURE
    - DEMONIC

    ALL PHYSICAL DAMAGE TYPES
    - ACID
    - BLUDGEONING
    - PIERCING
    - POISON
    - SLASHING
    - BURNING
    - COLD


    ALL ELEMENTAL DAMAGE TYPES
    - LIGHTNING
    - NECROTIC
    - PSYCHIC
    - RADIANT
    - DARK
    - HOLY
    ======================================================*/

}
