package typingsSlinky.shrinkRay.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMiddleware extends js.Object {
  @JSName("filter")
  var filter_Original: FilterFunction = js.native
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary] = js.native
  def filter(req: Request_[ParamsDictionary], res: Response_): Boolean = js.native
}

