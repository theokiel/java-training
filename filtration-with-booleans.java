class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
      return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        return archerIsAwake || knightIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
   //     throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
       // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
  return (!knightIsAwake && !archerIsAwake && (petDogIsPresent || prisonerIsAwake)) || (petDogIsPresent && !archerIsAwake);
        // even the knight is awake, and archer is sleep, dog is present and prisoner is awake, pet is present and archer is asleep to even the knight is awake, i could be true to freed.
    }
  //  knightIsAwake || archerIsAwake && !prisonerIsAwake;
}
