package com.codebind;


public class MoveCreator {

    public static void create() {

        App.globalMoveIndex.add(null);

        /**Common attacks that most of the beasts share.**/
        var slash = new Move("Slash", true, false, -1, 25, "Slashing", "None", 5, 90, 0);
        App.globalMoveIndex.add(slash);
        var bite = new Move("Bite", true, false, -1, 25, "Piercing", "None", 5, 90, 0);
        App.globalMoveIndex.add(bite);
        var bash = new Move("Bash", true, false, -1, 25, "Bludgeoning", "None", 5, 90, 0);
        App.globalMoveIndex.add(bash);

        /**Unique attacks for different beasts**/

        /**Dragon Breath attacks**/
        //scald special for blue dragon
        var scald = new Move("Scald", true, false, -1, 70, "Burning", "None", 100, 70, 1);
        App.globalMoveIndex.add(scald);

        //fireBreath special for red dragon
        var fireBreath = new Move("Fire Breath", true, false, -1, 80, "Burning", "None", 100, 70, 2);
        App.globalMoveIndex.add(fireBreath);

        //Ice Breath special for white dragon
        var iceBreath = new Move("Ice Breath", true, false, -1, 90, "Cold", "None", 100, 60, 2);
        App.globalMoveIndex.add(iceBreath);

        //Retribution special for holy type beasts
        var retribution = new Move("Retribution", true, false, -1, 120, "None", "Holy", 100, 65, 3);
        App.globalMoveIndex.add(retribution);

        //Blood Thirster
        var bloodThirster = new Move("Blood Thirster", true, false, -1 ,100, "Slashing", "None", 5, 90, 3);
        App.globalMoveIndex.add(bloodThirster);
    }
}
