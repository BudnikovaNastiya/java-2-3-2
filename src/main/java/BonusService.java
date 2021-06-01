public class BonusService {
  public long calculateService(long amount, boolean registered) {
    long percent = registered ? 3 : 1;
    long bonus = amount * percent / 100 / 100;
    long limit = 500;
    if (bonus > limit) {
      bonus = limit;
    }
    return bonus;
  }
}
