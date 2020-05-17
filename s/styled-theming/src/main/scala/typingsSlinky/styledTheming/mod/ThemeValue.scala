package typingsSlinky.styledTheming.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styledTheming.mod.ThemeValueFn
  - typingsSlinky.styledTheming.mod.ThemeValueResult
*/
trait ThemeValue extends js.Object

object ThemeValue {
  @scala.inline
  implicit def apply(value: ThemeValueFn): ThemeValue = value.asInstanceOf[ThemeValue]
  @scala.inline
  implicit def apply(value: ThemeValueResult): ThemeValue = value.asInstanceOf[ThemeValue]
}

