package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "webhook")
@js.native
object webhook extends js.Object {
  
  def apply(): MiddlewareFunction = js.native
  def apply(authToken: String): MiddlewareFunction = js.native
  def apply(authToken: String, options: WebhookOptions): MiddlewareFunction = js.native
  def apply(options: WebhookOptions): MiddlewareFunction = js.native
}
