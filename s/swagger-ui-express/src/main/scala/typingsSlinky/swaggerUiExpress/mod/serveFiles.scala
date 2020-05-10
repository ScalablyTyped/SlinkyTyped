package typingsSlinky.swaggerUiExpress.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "serveFiles")
@js.native
object serveFiles extends js.Object {
  def apply(): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(swaggerDoc: JsonObject): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(swaggerDoc: JsonObject, opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

