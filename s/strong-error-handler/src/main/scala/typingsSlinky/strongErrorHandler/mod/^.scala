package typingsSlinky.strongErrorHandler.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.strongErrorHandler.mod.StrongErrorHandler.options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strong-error-handler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /***
    * Create a new strong error middleware funciton using the given options.
    * @param options
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

