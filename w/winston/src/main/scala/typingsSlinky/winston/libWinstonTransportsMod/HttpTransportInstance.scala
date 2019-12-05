package typingsSlinky.winston.libWinstonTransportsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.winston.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpTransportInstance
  extends typingsSlinky.winstonDashTransport.winstonDashTransportMod.^
     with Instantiable0[HttpTransportInstance]
     with Instantiable1[/* options */ HttpTransportOptions, HttpTransportInstance] {
  var agent: js.UndefOr[Agent | Null] = js.native
  var auth: js.UndefOr[Anon_Password] = js.native
  var host: String = js.native
  var name: String = js.native
  var path: String = js.native
  var port: Double = js.native
  var ssl: Boolean = js.native
}

