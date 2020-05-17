package typingsSlinky.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T | scala.Null]
*/
trait ResponsiveStyleValue[T] extends js.Object

object ResponsiveStyleValue {
  @scala.inline
  implicit def apply[T](value: js.Array[T | Null]): ResponsiveStyleValue[T] = value.asInstanceOf[ResponsiveStyleValue[T]]
  @scala.inline
  implicit def apply[T](value: T): ResponsiveStyleValue[T] = value.asInstanceOf[ResponsiveStyleValue[T]]
}

