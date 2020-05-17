package typingsSlinky.vue.vnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vue.vnodeMod.VNodeChildrenArrayContents
  - js.Array[typingsSlinky.vue.vnodeMod.ScopedSlot]
  - java.lang.String
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait VNodeChildren extends js.Object

object VNodeChildren {
  @scala.inline
  implicit def apply(value: js.Array[ScopedSlot]): VNodeChildren = value.asInstanceOf[VNodeChildren]
  @scala.inline
  implicit def apply(value: Boolean): VNodeChildren = value.asInstanceOf[VNodeChildren]
  @scala.inline
  implicit def apply(value: Null): VNodeChildren = value.asInstanceOf[VNodeChildren]
  @scala.inline
  implicit def apply(value: String): VNodeChildren = value.asInstanceOf[VNodeChildren]
  @scala.inline
  implicit def apply(value: VNodeChildrenArrayContents): VNodeChildren = value.asInstanceOf[VNodeChildren]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => VNodeChildren): VNodeChildren = value.asInstanceOf[VNodeChildren]
}

