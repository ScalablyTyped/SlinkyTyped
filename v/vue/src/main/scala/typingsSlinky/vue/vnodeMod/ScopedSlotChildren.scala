package typingsSlinky.vue.vnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.vue.vnodeMod.VNode]
  - js.UndefOr[scala.Nothing]
*/
trait ScopedSlotChildren extends js.Object

object ScopedSlotChildren {
  @scala.inline
  implicit def apply(value: js.Array[VNode]): ScopedSlotChildren = value.asInstanceOf[ScopedSlotChildren]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ScopedSlotChildren): ScopedSlotChildren = value.asInstanceOf[ScopedSlotChildren]
}

