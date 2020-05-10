package typingsSlinky.shrinkRay.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMiddleware extends js.Object {
  @JSName("filter")
  var filter_Original: FilterFunction = js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def filter(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Boolean = js.native
}

