package typingsSlinky.streamChain.mod

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.streamMod.Readable
  - typingsSlinky.node.streamMod.Writable
  - typingsSlinky.node.streamMod.Duplex
  - typingsSlinky.node.streamMod.Transform
*/
trait Stream extends StreamItem

object Stream {
  @scala.inline
  implicit def apply(value: Duplex): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: Readable): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: Transform): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: Writable): Stream = value.asInstanceOf[Stream]
}

