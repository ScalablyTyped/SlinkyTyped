package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Any
  - scala.Double
*/
trait ThemeValue[K /* <: /* keyof ThemeType */ String */, ThemeType, TVal] extends js.Object

object ThemeValue {
  @scala.inline
  implicit def apply[K, ThemeType, TVal](value: js.Any): ThemeValue[K, ThemeType, TVal] = value.asInstanceOf[ThemeValue[K, ThemeType, TVal]]
  @scala.inline
  implicit def apply[K, ThemeType, TVal](value: Double): ThemeValue[K, ThemeType, TVal] = value.asInstanceOf[ThemeValue[K, ThemeType, TVal]]
}

