package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
trait PublicKeyCredential
  extends Credential
     with CredentialType {
  val rawId: scala.scalajs.js.typedarray.ArrayBuffer
  val response: AuthenticatorResponse
  @JSName("type")
  val type_PublicKeyCredential: `public-key`
}

object PublicKeyCredential {
  @scala.inline
  def apply(
    id: String,
    rawId: scala.scalajs.js.typedarray.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: `public-key`
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
}

