package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.federated
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webappsecCredentialManagement.PasswordCredential
  - typingsSlinky.webappsecCredentialManagement.FederatedCredential
  - typingsSlinky.webappsecCredentialManagement.PublicKeyCredential
*/
trait CredentialType extends StObject
object CredentialType {
  
  @scala.inline
  def FederatedCredential(id: String, provider: String, `type`: federated): typingsSlinky.webappsecCredentialManagement.FederatedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webappsecCredentialManagement.FederatedCredential]
  }
  
  @scala.inline
  def PasswordCredential(id: String, idName: String, passwordName: String, `type`: password): typingsSlinky.webappsecCredentialManagement.PasswordCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], idName = idName.asInstanceOf[js.Any], passwordName = passwordName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webappsecCredentialManagement.PasswordCredential]
  }
  
  @scala.inline
  def PublicKeyCredential(
    id: String,
    rawId: js.typedarray.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: `public-key`
  ): typingsSlinky.webappsecCredentialManagement.PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webappsecCredentialManagement.PublicKeyCredential]
  }
}
