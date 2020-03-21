package typingsSlinky.yog2Kernel.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.IRouter
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends IRouter {
  def action(actionName: String): RequestHandler[ParamsDictionary] | ActionObject = js.native
  def wrapAsync(fn: js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, _]): RequestHandler[ParamsDictionary] = js.native
}

