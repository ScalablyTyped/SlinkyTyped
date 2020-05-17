package typingsSlinky.write.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: Buffer): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: String): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Data = value.asInstanceOf[Data]
}

