package xpay


class XpayToPayDAdapter(xp : Xpay) extends PayD {
  
  def getCustCardNo: String = xp.getCreditCardNo

  def setCustCardNo(custCardNo: String) = xp.setCreditCardNo(custCardNo)

  def getCardOwnerName: String  = xp.getCustomerName

  def setCardOwnerName(cardOwnerName: String) = xp.setCustomerName(cardOwnerName)

  def getCardExpMonthDate: String = xp.getCardExpMonth

  def setCardExpMonthDate(cardExpMonthDate: String) = xp.setCardExpMonth(cardExpMonthDate)

  def getCVVNo: Integer = xp.getCardCVVNo

  def setCVVNo(cVVNo: Integer) = xp.setCardCVVNo(cVVNo.asInstanceOf[Short])

  def getTotalAmount: Double = xp.getAmount

  def setTotalAmount(totalAmount: Double) = xp.setAmount(totalAmount)

  
}