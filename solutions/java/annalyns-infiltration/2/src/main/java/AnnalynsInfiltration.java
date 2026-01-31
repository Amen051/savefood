class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake==false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake==true || archerIsAwake==true || prisonerIsAwake==true);
        }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (archerIsAwake==false && prisonerIsAwake ==true);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent==true && archerIsAwake==false)
        {
            return true;
        }else if(petDogIsPresent==false && canSignalPrisoner(archerIsAwake,prisonerIsAwake)==true && canFastAttack(knightIsAwake)==true)
        {
            return true;
        }else{
            return false;
        }
    }
}
