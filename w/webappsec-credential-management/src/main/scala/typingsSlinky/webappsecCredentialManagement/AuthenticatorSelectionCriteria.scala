package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.`cross-platform`
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.discouraged
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.platform
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.preferred
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-authenticatorselectioncriteria}
  */
trait AuthenticatorSelectionCriteria extends js.Object {
  var authenticatorAttachment: js.UndefOr[platform | `cross-platform`] = js.undefined
  var requireResidentKey: js.UndefOr[Boolean] = js.undefined
  var userVerification: js.UndefOr[required | preferred | discouraged] = js.undefined
}

object AuthenticatorSelectionCriteria {
  @scala.inline
  def apply(
    authenticatorAttachment: platform | `cross-platform` = null,
    requireResidentKey: js.UndefOr[Boolean] = js.undefined,
    userVerification: required | preferred | discouraged = null
  ): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (authenticatorAttachment != null) __obj.updateDynamic("authenticatorAttachment")(authenticatorAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(requireResidentKey)) __obj.updateDynamic("requireResidentKey")(requireResidentKey.get.asInstanceOf[js.Any])
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
}

