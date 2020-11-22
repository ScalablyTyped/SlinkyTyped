package typingsSlinky.serveStatic.mod

import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.serveStatic.anon.Typeofm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHandlerConstructor[R /* <: ServerResponse */] extends js.Object {
  
  def apply(root: String): RequestHandler[R] = js.native
  def apply(root: String, options: ServeStaticOptions[R]): RequestHandler[R] = js.native
  
  var mime: Typeofm = js.native
}
