package typingsSlinky.theming.mod

import slinky.core.TagMod
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProviderProps[Theme] extends js.Object {
  var children: TagMod[Any] = js.native
  var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]]) = js.native
}

object ThemeProviderProps {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
  @scala.inline
  implicit class ThemeProviderPropsOps[Self[theme] <: ThemeProviderProps[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withThemeFunction1(value: /* outerTheme */ Theme => NonNullable[Theme]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTheme(value: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

