package typingsSlinky.statsdClient

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.statsdClient.mod.ExpressMiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetExpressMiddleware extends js.Object {
  def getExpressMiddleware(): RequestHandler[ParamsDictionary] = js.native
  def getExpressMiddleware(prefix: String): RequestHandler[ParamsDictionary] = js.native
  def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary] = js.native
}

