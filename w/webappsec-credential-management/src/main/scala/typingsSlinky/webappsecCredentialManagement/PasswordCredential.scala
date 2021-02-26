package typingsSlinky.webappsecCredentialManagement

import org.scalajs.dom.raw.FormData
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
  */
@js.native
trait PasswordCredential
  extends SiteBoundCredential
     with CredentialType {
  
  /**
    * If the developer wishes to specify additional data to insert into the
    * request body when submitting the credential information to a remote
    * endpoint, they can do so by assigning a FormData or URLSearchParams
    * object to this attribute. The credential information will be
    * mixed into the object to produce the body. The value is {@code null}
    * unless otherwise specified.
    */
  var additionalData: CredentialBodyType | Null = js.native
  
  /**
    * Represents the name which will be used for the ID field when submitting
    * the PasswordCredential to a remote endpoint via {@code fetch()}. It
    * defaults to "username", but can be overridden by a developer to match
    * whatever the backend service expects.
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-idname}
    */
  var idName: String = js.native
  
  /**
    * The plain-text password. Returned for implementation of the 08/04/2017
    * Working Draft of Credential Management, not returned before this.
    *
    * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
    */
  val password: js.UndefOr[String] = js.native
  
  /**
    * Represents the name which will be used for the ID field when submitting
    * the PasswordCredential to a remote endpoint via fetch(). It defaults to
    * "password", but can be overridden by a developer to match whatever the
    * backend service expects.
    *
    * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordname}
    */
  var passwordName: String = js.native
  
  @JSName("type")
  val type_PasswordCredential: typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.password = js.native
}
object PasswordCredential {
  
  @scala.inline
  def apply(id: String, idName: String, passwordName: String, `type`: password): PasswordCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], idName = idName.asInstanceOf[js.Any], passwordName = passwordName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredential]
  }
  
  @scala.inline
  implicit class PasswordCredentialMutableBuilder[Self <: PasswordCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalData(value: CredentialBodyType): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataFormData(value: FormData): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataNull: Self = StObject.set(x, "additionalData", null)
    
    @scala.inline
    def setIdName(value: String): Self = StObject.set(x, "idName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordName(value: String): Self = StObject.set(x, "passwordName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setType(value: password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
