package typingsSlinky.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.webgme.GmeCommon.Buffer
  - js.Array[typingsSlinky.webgme.GmeCommon.Buffer]
*/
trait Payload extends js.Object

object Payload {
  @scala.inline
  implicit def apply(value: js.Array[Buffer] | Buffer): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: String): Payload = value.asInstanceOf[Payload]
}

