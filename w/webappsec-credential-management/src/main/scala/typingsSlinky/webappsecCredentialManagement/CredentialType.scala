package typingsSlinky.webappsecCredentialManagement

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
  implicit def apply(value: FederatedCredential): CredentialType = value.asInstanceOf[CredentialType]
  @scala.inline
  implicit def apply(value: PasswordCredential): CredentialType = value.asInstanceOf[CredentialType]
  @scala.inline
  implicit def apply(value: PublicKeyCredential): CredentialType = value.asInstanceOf[CredentialType]
}

