package np.com.kapilkoju.nepse.data

case class TodaysPrice(company: String,
                       noOfTransactions: Int,
                       maxPrice: BigDecimal,
                       minPrice: BigDecimal,
                       closingPrice: BigDecimal,
                       tradedShares: Int,
                       amount: BigDecimal,
                       previousClosingPrice: BigDecimal,
                       difference: BigDecimal)