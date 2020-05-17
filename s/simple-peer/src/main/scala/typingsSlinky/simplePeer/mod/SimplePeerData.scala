package typingsSlinky.simplePeer.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.simplePeer.mod.TypedArray
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Blob
*/
trait SimplePeerData extends js.Object

object SimplePeerData {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): SimplePeerData = value.asInstanceOf[SimplePeerData]
  @scala.inline
  implicit def apply(value: Blob): SimplePeerData = value.asInstanceOf[SimplePeerData]
  @scala.inline
  implicit def apply(value: Buffer): SimplePeerData = value.asInstanceOf[SimplePeerData]
  @scala.inline
  implicit def apply(value: String): SimplePeerData = value.asInstanceOf[SimplePeerData]
  @scala.inline
  implicit def apply(value: TypedArray): SimplePeerData = value.asInstanceOf[SimplePeerData]
}

