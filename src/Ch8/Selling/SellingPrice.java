package Ch8.Selling;

class SellingPrice {
  final int amount;

  SellingPrice(final int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("price is not more than 0.");
    }
    this.amount = amount;
  }

  @Override
  public String toString() {
    return String.valueOf(amount);
  }
}
