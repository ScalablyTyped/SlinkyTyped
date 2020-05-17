package typingsSlinky.ws.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CertMeta represents the accepted types for certificate & key data.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[typingsSlinky.node.Buffer | java.lang.String]
  - typingsSlinky.node.Buffer
*/
trait CertMeta extends js.Object

object CertMeta {
  @scala.inline
  implicit def apply(value: js.Array[Buffer | String]): CertMeta = value.asInstanceOf[CertMeta]
  @scala.inline
  implicit def apply(value: Buffer): CertMeta = value.asInstanceOf[CertMeta]
  @scala.inline
  implicit def apply(value: String): CertMeta = value.asInstanceOf[CertMeta]
}

