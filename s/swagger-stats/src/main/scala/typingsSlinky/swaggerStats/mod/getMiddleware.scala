package typingsSlinky.swaggerStats.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-stats", "getMiddleware")
@js.native
object getMiddleware extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(opts: SWStats): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

