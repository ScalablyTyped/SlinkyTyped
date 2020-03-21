package typingsSlinky.steamLogin.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-login", "enforceLogin")
@js.native
object enforceLogin extends js.Object {
  def apply(redirect: String): RequestHandler[ParamsDictionary] = js.native
}

