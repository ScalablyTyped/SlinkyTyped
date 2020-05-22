package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.federated
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webappsecCredentialManagement.PasswordCredential
  - typingsSlinky.webappsecCredentialManagement.FederatedCredential
  - typingsSlinky.webappsecCredentialManagement.PublicKeyCredential
*/
trait CredentialType extends js.Object

object CredentialType {
  @scala.inline
  def PasswordCredential(
    id: String,
    idName: String,
    passwordName: String,
    `type`: password,
    additionalData: CredentialBodyType = null,
    iconURL: String = null,
    name: String = null,
    password: String = null
  ): CredentialType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], idName = idName.asInstanceOf[js.Any], passwordName = passwordName.asInstanceOf[js.Any], additionalData = additionalData.asInstanceOf[js.Any], iconURL = iconURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialType]
  }
  @scala.inline
  def FederatedCredential(
    id: String,
    provider: String,
    `type`: federated,
    iconURL: String = null,
    name: String = null,
    protocol: String = null
  ): CredentialType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], iconURL = iconURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialType]
  }
  @scala.inline
  def PublicKeyCredential(
    id: String,
    rawId: js.typedarray.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: `public-key`
  ): CredentialType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialType]
  }
}

