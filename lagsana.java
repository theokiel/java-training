public class lagsana{
  private static final int EXPECTED_MINUTES_IN_OVEN = 45;
  private static final int PREPARATION_TIME_PER_LAYER = 2;
 // TODO: define the 'expectedMinutesInOven()' method
  public int expectedMinutesInOven(){
    return EXPECTED_MINUTES_IN_OVEN;
  }
  // TODO: define the 'remainingMinutesInOven()' method
 public int remainingMinuteInOven(int minutesOven){
   return expectedMinutesInOven() - minutesOven;
 }
   // TODO: define the 'preparationTimeInMinutes()' method
   public int preparationTimeInMinutes(int layers){
     return layers * PREPARATION_TIME_PER_LAYER;
   }
 // TODO: define the 'totalTimeInMinutes()' method
   public int totalTimeInMinutes(int layers, int minutesOven){
    return preparationTimeInMinutes(layers) + minutesOven;
   }
   public static void main(String[] args){
    lagsana lagsana = new lagsana();
    System.out.print("expectedMinutesINOven" + lagsana.remainingMinuteInOven(1));
   }
}
