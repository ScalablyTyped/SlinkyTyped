package typingsSlinky.snabbdom.hMod

import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.snabbdom.vnodeMod.VNode_
  - java.lang.String
  - scala.Double
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait VNodeChildElement extends js.Object

object VNodeChildElement {
  @scala.inline
  implicit def apply(value: Double): VNodeChildElement = value.asInstanceOf[VNodeChildElement]
  @scala.inline
  implicit def apply(value: Null): VNodeChildElement = value.asInstanceOf[VNodeChildElement]
  @scala.inline
  implicit def apply(value: String): VNodeChildElement = value.asInstanceOf[VNodeChildElement]
  @scala.inline
  implicit def apply(value: VNode_): VNodeChildElement = value.asInstanceOf[VNodeChildElement]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => VNodeChildElement): VNodeChildElement = value.asInstanceOf[VNodeChildElement]
}

