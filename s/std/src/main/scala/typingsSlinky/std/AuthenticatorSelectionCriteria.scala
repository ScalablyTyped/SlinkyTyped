package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticatorSelectionCriteria extends js.Object {
  var authenticatorAttachment: js.UndefOr[AuthenticatorAttachment] = js.native
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.native
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.native
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
    def withAuthenticatorAttachment(value: AuthenticatorAttachment): Self = {
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
    def withRequireResidentKey(value: scala.Boolean): Self = {
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
    def withUserVerification(value: UserVerificationRequirement): Self = {
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

