package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.std.BufferSource
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.ble
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.internal
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.nfc
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.usb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
trait PublicKeyCredentialDescriptor extends js.Object {
  var id: BufferSource
  var transports: js.UndefOr[js.Array[usb | nfc | ble | internal]] = js.undefined
  var `type`: `public-key`
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(id: BufferSource, `type`: `public-key`, transports: js.Array[usb | nfc | ble | internal] = null): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
}

