package typingsSlinky.theming.anon

import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeNonNullable[Theme] extends js.Object {
  var theme: NonNullable[Theme] = js.native
}

object ThemeNonNullable {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme]): ThemeNonNullable[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeNonNullable[Theme]]
  }
  @scala.inline
  implicit class ThemeNonNullableOps[Self[theme] <: ThemeNonNullable[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withTheme(value: NonNullable[Theme]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

