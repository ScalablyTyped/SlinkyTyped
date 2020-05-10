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
@js.native
trait AuthenticatorSelectionCriteria extends js.Object {
  var authenticatorAttachment: js.UndefOr[platform | `cross-platform`] = js.native
  var requireResidentKey: js.UndefOr[Boolean] = js.native
  var userVerification: js.UndefOr[required | preferred | discouraged] = js.native
}

object AuthenticatorSelectionCriteria {
  @scala.inline
  def apply(): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
  @scala.inline
  implicit class AuthenticatorSelectionCriteriaOps[Self <: AuthenticatorSelectionCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticatorAttachment(value: platform | `cross-platform`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatorAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticatorAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatorAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireResidentKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResidentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireResidentKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResidentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVerification(value: required | preferred | discouraged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVerification")(js.undefined)
        ret
    }
  }
  
}

