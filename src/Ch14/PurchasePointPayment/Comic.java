package Ch14.PurchasePointPayment;

public class Comic {
  public ComicId id;
  public PurchasePoint currentPurchasePoint;

  Comic() {
    id = new ComicId();
    currentPurchasePoint = new PurchasePoint();
  }

  public boolean isDisabled() {
    return false;
  }

  @Override
  public String toString() {
    return id + ", " + currentPurchasePoint;
  }
}
