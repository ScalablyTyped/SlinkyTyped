package typingsSlinky.streamChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.streamChain.mod.Stream
  - typingsSlinky.streamChain.mod.TransformFunction
*/
trait StreamItem extends js.Object

object StreamItem {
  @scala.inline
  implicit def apply(value: Stream): StreamItem = value.asInstanceOf[StreamItem]
  @scala.inline
  implicit def apply(value: TransformFunction): StreamItem = value.asInstanceOf[StreamItem]
}

