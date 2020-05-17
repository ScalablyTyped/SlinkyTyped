package typingsSlinky.streamtest.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
*/
trait Chunk extends js.Object

object Chunk {
  @scala.inline
  implicit def apply(value: Buffer): Chunk = value.asInstanceOf[Chunk]
  @scala.inline
  implicit def apply(value: String): Chunk = value.asInstanceOf[Chunk]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Chunk = value.asInstanceOf[Chunk]
}

