package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITheme extends js.Object {
  /** The default background color */
  var background: js.UndefOr[String] = js.native
  /** ANSI black (eg. `\x1b[30m`) */
  var black: js.UndefOr[String] = js.native
  /** ANSI blue (eg. `\x1b[34m`) */
  var blue: js.UndefOr[String] = js.native
  /** ANSI bright black (eg. `\x1b[1;30m`) */
  var brightBlack: js.UndefOr[String] = js.native
  /** ANSI bright blue (eg. `\x1b[1;34m`) */
  var brightBlue: js.UndefOr[String] = js.native
  /** ANSI bright cyan (eg. `\x1b[1;36m`) */
  var brightCyan: js.UndefOr[String] = js.native
  /** ANSI bright green (eg. `\x1b[1;32m`) */
  var brightGreen: js.UndefOr[String] = js.native
  /** ANSI bright magenta (eg. `\x1b[1;35m`) */
  var brightMagenta: js.UndefOr[String] = js.native
  /** ANSI bright red (eg. `\x1b[1;31m`) */
  var brightRed: js.UndefOr[String] = js.native
  /** ANSI bright white (eg. `\x1b[1;37m`) */
  var brightWhite: js.UndefOr[String] = js.native
  /** ANSI bright yellow (eg. `\x1b[1;33m`) */
  var brightYellow: js.UndefOr[String] = js.native
  /** The cursor color */
  var cursor: js.UndefOr[String] = js.native
  /** The accent color of the cursor (fg color for a block cursor) */
  var cursorAccent: js.UndefOr[String] = js.native
  /** ANSI cyan (eg. `\x1b[36m`) */
  var cyan: js.UndefOr[String] = js.native
  /** The default foreground color */
  var foreground: js.UndefOr[String] = js.native
  /** ANSI green (eg. `\x1b[32m`) */
  var green: js.UndefOr[String] = js.native
  /** ANSI magenta (eg. `\x1b[35m`) */
  var magenta: js.UndefOr[String] = js.native
  /** ANSI red (eg. `\x1b[31m`) */
  var red: js.UndefOr[String] = js.native
  /** The selection background color (can be transparent) */
  var selection: js.UndefOr[String] = js.native
  /** ANSI white (eg. `\x1b[37m`) */
  var white: js.UndefOr[String] = js.native
  /** ANSI yellow (eg. `\x1b[33m`) */
  var yellow: js.UndefOr[String] = js.native
}

object ITheme {
  @scala.inline
  def apply(): ITheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITheme]
  }
  @scala.inline
  implicit class IThemeOps[Self <: ITheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(js.undefined)
        ret
    }
    @scala.inline
    def withBlue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightBlack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightBlack")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightBlue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightBlue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightBlue")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightCyan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightCyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightCyan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightCyan")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightGreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightGreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightGreen")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightMagenta(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightMagenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightMagenta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightMagenta")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightRed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightRed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightRed")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightWhite")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightYellow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightYellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightYellow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightYellow")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorAccent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorAccent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorAccent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorAccent")(js.undefined)
        ret
    }
    @scala.inline
    def withCyan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCyan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(js.undefined)
        ret
    }
    @scala.inline
    def withForeground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withMagenta(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagenta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(js.undefined)
        ret
    }
    @scala.inline
    def withYellow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYellow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(js.undefined)
        ret
    }
  }
  
}

