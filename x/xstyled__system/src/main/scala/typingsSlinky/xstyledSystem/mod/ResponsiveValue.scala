package typingsSlinky.xstyledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - org.scalablytyped.runtime.StringDictionary[T]
*/
trait ResponsiveValue[T] extends js.Object

object ResponsiveValue {
  @scala.inline
  implicit def apply[T](value: StringDictionary[T]): ResponsiveValue[T] = value.asInstanceOf[ResponsiveValue[T]]
  @scala.inline
  implicit def apply[T](value: T): ResponsiveValue[T] = value.asInstanceOf[ResponsiveValue[T]]
}

