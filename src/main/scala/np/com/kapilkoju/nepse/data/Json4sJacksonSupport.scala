package np.com.kapilkoju.nepse.data

import de.heikoseeberger.akkahttpjson4s.Json4sSupport
import org.json4s.{DefaultFormats, jackson}

trait Json4sJacksonSupport extends Json4sSupport {

  implicit val serialization = jackson.Serialization
  implicit val formats = DefaultFormats

  implicit val prettyPrint = Json4sSupport.ShouldWritePretty.True

}