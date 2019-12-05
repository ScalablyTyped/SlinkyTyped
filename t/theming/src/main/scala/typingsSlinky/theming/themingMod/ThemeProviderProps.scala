package typingsSlinky.theming.themingMod

import slinky.core.TagMod
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[Theme] extends js.Object {
  var children: TagMod[Any]
  var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])
}

object ThemeProviderProps {
  @scala.inline
  def apply[Theme](
    children: TagMod[Any],
    theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])
  ): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
}

