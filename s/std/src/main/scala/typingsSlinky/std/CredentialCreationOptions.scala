package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialCreationOptions extends js.Object {
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.undefined
  var signal: js.UndefOr[org.scalajs.dom.experimental.AbortSignal] = js.undefined
}

object CredentialCreationOptions {
  @scala.inline
  def apply(
    publicKey: PublicKeyCredentialCreationOptions = null,
    signal: org.scalajs.dom.experimental.AbortSignal = null
  ): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialCreationOptions]
  }
}

