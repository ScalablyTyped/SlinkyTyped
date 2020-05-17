package typingsSlinky.styledTheming.mod

import typingsSlinky.styledComponents.styledComponentsMod.FlattenInterpolation
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.styledComponents.styledComponentsMod.FlattenInterpolation[
typingsSlinky.styledComponents.styledComponentsMod.ThemeProps[js.Any] | (typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps[js.Any, js.Any])]
*/
trait ThemeValueResult extends ThemeValue

object ThemeValueResult {
  @scala.inline
  implicit def apply(value: FlattenInterpolation[ThemeProps[js.Any] | (ThemedStyledProps[js.Any, js.Any])]): ThemeValueResult = value.asInstanceOf[ThemeValueResult]
  @scala.inline
  implicit def apply(value: String): ThemeValueResult = value.asInstanceOf[ThemeValueResult]
}

