package com.codebind;

public abstract class Stats {
    private String _name;
    private int _HP;
    private int _SPEED;
    private int _STRENGTH;
    private int _MAGIC;
    private int _MAGIC_ARMOUR;
    private int _PHYSICAL_ARMOUR;
    private int _INTEL;
    private String _SPECIES;
    private String _TYPE1;
    private String _TYPE2;
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
        return _STRENGTH;
    }
    public int MAGIC() { return _MAGIC; }
    public int MAGIC_ARMOUR() { return _MAGIC_ARMOUR; }
    public int PHYSICAL_ARMOUR() { return _PHYSICAL_ARMOUR; }
    public int INTEL() {
        return _INTEL;
    }
    public String SPECIES() {
        return _SPECIES;
    }
    public String TYPE1() {
        return _TYPE1;
    }
    public String TYPE2() {
        return _TYPE2;
    }
    public int SIZE() {
        return _SIZE;
    }

    public Stats() {
        this._name = "Unnamed Beast";
    }

    /*====================================================
    ALL ELEMENTAL TYPES POSSIBLE
    - FIRE
    - WATER
    - AIR
    - ROCK
    - NECROTIC
    - MAGICAL
    - HOLY
    - DARK
    - RADIANT

    ALL DAMAGE TYPES
    - ACID
    - BLUDGEONING
    - FIRE
    - LIGHTNING
    - NECROTIC
    - PIERCING
    - POISON
    - PSYCHIC
    - RADIANT
    - SLASHING

    ======================================================*/
    public Stats(String name, String TYPE1, String TYPE2, String SPECIES, int HP, int SPEED, int STRENGTH, int MAGIC, int MAGIC_ARMOUR, int PHYSICAL_ARMOUR, int INTEL, int SIZE) {
        this._name = name;
        this._SPECIES = SPECIES;
        this._TYPE1 = TYPE1;
        this._TYPE2 = TYPE2;
        this._HP = HP;
        this._SPEED = SPEED;
        this._STRENGTH = STRENGTH;
        this._MAGIC = MAGIC;
        this._MAGIC_ARMOUR = MAGIC_ARMOUR;
        this._PHYSICAL_ARMOUR = PHYSICAL_ARMOUR;
        this._INTEL = INTEL;
        this._SIZE = SIZE;
    }
}
