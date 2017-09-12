package np.com.kapilkoju.nepse.data

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

trait Routes extends Json4sJacksonSupport {

  val routes: Route =
    path("todaysprice") {
      get {
        // TODO: This seems blocking. http://doc.akka.io/docs/akka-http/current/scala/http/handling-blocking-operations-in-akka-http-routes.html
        complete(TodaysPriceService.getTodaysPrices)
      }
    }
}