package typingsSlinky.themeUi.mod

import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeUIContext extends js.Object {
  var colorMode: String = js.native
  var setColorMode: Dispatch[SetStateAction[String]] = js.native
  var theme: Theme = js.native
}

object ThemeUIContext {
  @scala.inline
  def apply(colorMode: String, setColorMode: SetStateAction[String] => Unit, theme: Theme): ThemeUIContext = {
    val __obj = js.Dynamic.literal(colorMode = colorMode.asInstanceOf[js.Any], setColorMode = js.Any.fromFunction1(setColorMode), theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeUIContext]
  }
  @scala.inline
  implicit class ThemeUIContextOps[Self <: ThemeUIContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetColorMode(value: SetStateAction[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColorMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

