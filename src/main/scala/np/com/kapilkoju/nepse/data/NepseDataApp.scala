package np.com.kapilkoju.nepse.data

object NepseDataApp extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "NEPSE Data"
}
