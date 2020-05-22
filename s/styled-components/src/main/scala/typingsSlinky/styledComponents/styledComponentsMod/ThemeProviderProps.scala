package typingsSlinky.styledComponents.styledComponentsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var theme: T | (js.Function1[/* theme */ U, T])
}

object ThemeProviderProps {
  @scala.inline
  def apply[T, U](theme: T | (js.Function1[/* theme */ U, T]), children: TagMod[Any] = null): ThemeProviderProps[T, U] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T, U]]
  }
}

