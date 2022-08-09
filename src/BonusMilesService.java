public class BonusMilesService {
    public static int calculate(int cost) {
        int result;
        int bonusMile = 20;
        if (cost >= 20) {
            result = cost/bonusMile;
        } else {
            result = 0;
        }
        return result;
    }
}
