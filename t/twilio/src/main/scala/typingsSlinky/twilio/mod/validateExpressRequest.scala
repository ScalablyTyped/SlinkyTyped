package typingsSlinky.twilio.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "validateExpressRequest")
@js.native
object validateExpressRequest extends js.Object {
  
  def apply(request: Request_[ParamsDictionary, _, _, Query], authToken: String): Boolean = js.native
  def apply(
    request: Request_[ParamsDictionary, _, _, Query],
    authToken: String,
    options: WebhookExpressOptions
  ): Boolean = js.native
}
