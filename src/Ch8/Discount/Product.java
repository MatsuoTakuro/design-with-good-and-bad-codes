package Ch8.Discount;

// 商品
class Product {
  private static int latestId = 0;
  final int id;
  final String name;
  final RegularPrice price;
  boolean canRegularDiscount = true;
  boolean canSummerDiscount = true;

  Product(final String name, final int amount) {
    if (name.isEmpty()) throw new IllegalArgumentException();
    final RegularPrice regularPrice = new RegularPrice(amount);

    this.id = newId();
    this.name = name;
    this.price = regularPrice;
  }

  int price() {
    return price.amount;
  }

  @Override
  public String toString() {
    return id + ": " + name;
  }

  private int newId() {
    int newId = latestId;
    latestId++;
    return newId;
  }
}
