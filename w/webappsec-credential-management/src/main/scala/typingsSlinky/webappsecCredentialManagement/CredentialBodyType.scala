package typingsSlinky.webappsecCredentialManagement

import org.scalajs.dom.raw.FormData
import typingsSlinky.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#typedefdef-credentialbodytype}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.FormData
  - typingsSlinky.std.URLSearchParams
*/
trait CredentialBodyType extends js.Object

object CredentialBodyType {
  @scala.inline
  implicit def apply(value: FormData): CredentialBodyType = value.asInstanceOf[CredentialBodyType]
  @scala.inline
  implicit def apply(value: URLSearchParams): CredentialBodyType = value.asInstanceOf[CredentialBodyType]
}

