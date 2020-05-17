package typingsSlinky.socketIoParser.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Blob
*/
trait EncodedPacket extends js.Object

object EncodedPacket {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): EncodedPacket = value.asInstanceOf[EncodedPacket]
  @scala.inline
  implicit def apply(value: Blob): EncodedPacket = value.asInstanceOf[EncodedPacket]
  @scala.inline
  implicit def apply(value: Buffer): EncodedPacket = value.asInstanceOf[EncodedPacket]
  @scala.inline
  implicit def apply(value: String): EncodedPacket = value.asInstanceOf[EncodedPacket]
}

