package typingsSlinky.steamLogin.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steam-login", "middleware")
@js.native
object middleware extends js.Object {
  
  def apply(opts: MiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
