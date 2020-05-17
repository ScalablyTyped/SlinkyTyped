package typingsSlinky.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.virtualDom.VirtualDOM.VText
  - typingsSlinky.virtualDom.VirtualDOM.VNode
  - typingsSlinky.virtualDom.VirtualDOM.Widget
  - typingsSlinky.virtualDom.VirtualDOM.Thunk
*/
trait VTree extends VChild

object VTree {
  @scala.inline
  implicit def apply(value: Thunk): VTree = value.asInstanceOf[VTree]
  @scala.inline
  implicit def apply(value: VNode): VTree = value.asInstanceOf[VTree]
  @scala.inline
  implicit def apply(value: VText): VTree = value.asInstanceOf[VTree]
  @scala.inline
  implicit def apply(value: Widget): VTree = value.asInstanceOf[VTree]
}

