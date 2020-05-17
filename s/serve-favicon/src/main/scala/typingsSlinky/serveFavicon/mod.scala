package typingsSlinky.serveFavicon

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.Buffer
import typingsSlinky.serveFavicon.anon.MaxAge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-favicon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Node.js middleware for serving a favicon.
    */
  def apply(path: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(path: String, options: MaxAge): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(path: Buffer): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(path: Buffer, options: MaxAge): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

