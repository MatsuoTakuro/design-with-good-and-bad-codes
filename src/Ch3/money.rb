class Money
  def initialize(amount, currency)
    raise ArgumentError('amount is not more than 0.') if amount.negative?
    raise ArgumentError('currency is not designated correctly.') if currency.blank?

    @amount = amount
    @currency = currency
    freeze
  end

  def add(other)
    raise ArgumentError('currecy units are different.') if @currency != other.currency

    added = @amount + other.amount
    Money.new(added, @currency)
  end
end
