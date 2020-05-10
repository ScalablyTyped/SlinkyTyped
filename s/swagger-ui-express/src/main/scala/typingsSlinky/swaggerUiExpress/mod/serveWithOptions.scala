package typingsSlinky.swaggerUiExpress.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "serveWithOptions")
@js.native
object serveWithOptions extends js.Object {
  def apply(options: ServeStaticOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

