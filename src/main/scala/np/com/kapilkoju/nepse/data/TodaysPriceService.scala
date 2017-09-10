package np.com.kapilkoju.nepse.data

import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL._

import scala.io.Source

object TodaysPriceService {

  def getTodaysPrices: List[TodaysPrice] = {

    val priceTableHtml = Source.fromURL("http://www.nepalstock.com/todaysprice/export").mkString

    val priceTable = JsoupBrowser().parseString(priceTableHtml)
    val priceRows = (priceTable >> elementList("tr")).tail

    val prices = priceRows >> texts("td")

    prices.map(_.toList)
      .map(priceInfo =>
        TodaysPrice(
          priceInfo.head,
          priceInfo(1).toInt,
          BigDecimal(priceInfo(2)),
          BigDecimal(priceInfo(3)),
          BigDecimal(priceInfo(4)),
          BigDecimal(priceInfo(5)).toInt,
          BigDecimal(priceInfo(6)),
          BigDecimal(priceInfo(7)),
          BigDecimal(priceInfo(8))))
  }
}
