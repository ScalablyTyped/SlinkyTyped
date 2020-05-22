package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatorResponse extends js.Object {
  val clientDataJSON: js.typedarray.ArrayBuffer
}

object AuthenticatorResponse {
  @scala.inline
  def apply(clientDataJSON: js.typedarray.ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal(clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorResponse]
  }
}

