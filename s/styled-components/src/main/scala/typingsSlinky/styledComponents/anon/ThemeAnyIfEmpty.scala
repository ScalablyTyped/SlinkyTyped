package typingsSlinky.styledComponents.anon

import typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeAnyIfEmpty extends js.Object {
  var theme: js.UndefOr[AnyIfEmpty[DefaultTheme]] = js.undefined
}

object ThemeAnyIfEmpty {
  @scala.inline
  def apply(theme: AnyIfEmpty[DefaultTheme] = null): ThemeAnyIfEmpty = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeAnyIfEmpty]
  }
}

