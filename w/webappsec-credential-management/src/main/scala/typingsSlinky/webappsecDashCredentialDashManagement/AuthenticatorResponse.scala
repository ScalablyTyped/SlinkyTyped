package typingsSlinky.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorresponse}
  */
trait AuthenticatorResponse extends js.Object {
  val clientDataJSON: scala.scalajs.js.typedarray.ArrayBuffer
}

object AuthenticatorResponse {
  @scala.inline
  def apply(clientDataJSON: scala.scalajs.js.typedarray.ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal(clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticatorResponse]
  }
}

