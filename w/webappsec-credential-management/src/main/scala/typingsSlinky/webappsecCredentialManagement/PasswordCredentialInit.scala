package typingsSlinky.webappsecCredentialManagement

import org.scalajs.dom.raw.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#typedefdef-passwordcredentialinit}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webappsecCredentialManagement.PasswordCredentialData
  - typingsSlinky.std.HTMLFormElement
*/
trait PasswordCredentialInit extends js.Object

object PasswordCredentialInit {
  @scala.inline
  implicit def apply(value: HTMLFormElement): PasswordCredentialInit = value.asInstanceOf[PasswordCredentialInit]
  @scala.inline
  implicit def apply(value: PasswordCredentialData): PasswordCredentialInit = value.asInstanceOf[PasswordCredentialInit]
}

