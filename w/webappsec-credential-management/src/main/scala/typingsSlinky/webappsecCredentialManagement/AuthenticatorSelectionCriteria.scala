package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.`cross-platform`
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.discouraged
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.platform
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.preferred
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticatorAttachment(value: platform | `cross-platform`): Self = this.set("authenticatorAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticatorAttachment: Self = this.set("authenticatorAttachment", js.undefined)
    
    @scala.inline
    def setRequireResidentKey(value: Boolean): Self = this.set("requireResidentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireResidentKey: Self = this.set("requireResidentKey", js.undefined)
    
    @scala.inline
    def setUserVerification(value: required | preferred | discouraged): Self = this.set("userVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVerification: Self = this.set("userVerification", js.undefined)
  }
}
