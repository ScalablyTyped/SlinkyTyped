package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.tabris.mod.WidgetCollection[T]
  - js.Array[T | typingsSlinky.tabris.mod.WidgetCollection[T]]
  - js.UndefOr[scala.Nothing]
*/
trait JSXChildren[T /* <: Widget */] extends js.Object

object JSXChildren {
  @scala.inline
  implicit def apply[T](value: js.Array[T | WidgetCollection[T]]): JSXChildren[T] = value.asInstanceOf[JSXChildren[T]]
  @scala.inline
  implicit def apply[T](value: T): JSXChildren[T] = value.asInstanceOf[JSXChildren[T]]
  @scala.inline
  implicit def apply[T](value: WidgetCollection[T]): JSXChildren[T] = value.asInstanceOf[JSXChildren[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => JSXChildren[T]): JSXChildren[T] = value.asInstanceOf[JSXChildren[T]]
}

