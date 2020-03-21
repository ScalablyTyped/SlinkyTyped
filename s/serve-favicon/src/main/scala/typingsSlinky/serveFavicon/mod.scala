package typingsSlinky.serveFavicon

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-favicon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Node.js middleware for serving a favicon.
    */
  def apply(path: String): RequestHandler[ParamsDictionary] = js.native
  def apply(path: String, options: AnonMaxAge): RequestHandler[ParamsDictionary] = js.native
  def apply(path: Buffer): RequestHandler[ParamsDictionary] = js.native
  def apply(path: Buffer, options: AnonMaxAge): RequestHandler[ParamsDictionary] = js.native
}

