package np.com.kapilkoju.nepse.data

import org.scalatest._

class NepseDataAppSpec extends FlatSpec with Matchers {
  "Greeting" should "say NEPSE Data" in {
    NepseDataApp.greeting shouldEqual "NEPSE Data"
  }
}
