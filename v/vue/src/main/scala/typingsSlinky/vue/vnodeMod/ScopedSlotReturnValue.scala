package typingsSlinky.vue.vnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vue.vnodeMod.VNode
  - java.lang.String
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.vue.vnodeMod.ScopedSlotReturnArray
*/
trait ScopedSlotReturnValue extends js.Object

object ScopedSlotReturnValue {
  @scala.inline
  implicit def apply(value: Boolean): ScopedSlotReturnValue = value.asInstanceOf[ScopedSlotReturnValue]
  @scala.inline
  implicit def apply(value: Null): ScopedSlotReturnValue = value.asInstanceOf[ScopedSlotReturnValue]
  @scala.inline
  implicit def apply(value: ScopedSlotReturnArray): ScopedSlotReturnValue = value.asInstanceOf[ScopedSlotReturnValue]
  @scala.inline
  implicit def apply(value: String): ScopedSlotReturnValue = value.asInstanceOf[ScopedSlotReturnValue]
  @scala.inline
  implicit def apply(value: VNode): ScopedSlotReturnValue = value.asInstanceOf[ScopedSlotReturnValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ScopedSlotReturnValue): ScopedSlotReturnValue = value.asInstanceOf[ScopedSlotReturnValue]
}

