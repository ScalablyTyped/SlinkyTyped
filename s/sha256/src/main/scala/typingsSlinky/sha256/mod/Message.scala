package typingsSlinky.sha256.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - js.Array[scala.Double]
*/
trait Message extends js.Object

object Message {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: Buffer): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: String): Message = value.asInstanceOf[Message]
}

