package np.com.kapilkoju.nepse.data

import akka.http.scaladsl.server.HttpApp

object WebServer extends HttpApp with Routes {
}

object NepseDataApp extends App {
  WebServer.startServer("localhost", 8080)
}