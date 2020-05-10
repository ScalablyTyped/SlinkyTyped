package typingsSlinky.xterm.mod

import typingsSlinky.xterm.xtermStrings.alt
import typingsSlinky.xterm.xtermStrings.bar
import typingsSlinky.xterm.xtermStrings.block
import typingsSlinky.xterm.xtermStrings.ctrl
import typingsSlinky.xterm.xtermStrings.none
import typingsSlinky.xterm.xtermStrings.shift
import typingsSlinky.xterm.xtermStrings.sound
import typingsSlinky.xterm.xtermStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITerminalOptions extends js.Object {
  /**
    * Whether background should support non-opaque color. It must be set before
    * executing the `Terminal.open()` method and can't be changed later without
    * executing it again. Note that enabling this can negatively impact
    * performance.
    */
  var allowTransparency: js.UndefOr[Boolean] = js.native
  /**
    * A data uri of the sound to use for the bell when `bellStyle = 'sound'`.
    */
  var bellSound: js.UndefOr[String] = js.native
  /**
    * The type of the bell notification the terminal will use.
    */
  var bellStyle: js.UndefOr[none | sound] = js.native
  /**
    * The number of columns in the terminal.
    */
  var cols: js.UndefOr[Double] = js.native
  /**
    * When enabled the cursor will be set to the beginning of the next line
    * with every new line. This is equivalent to sending '\r\n' for each '\n'.
    * Normally the termios settings of the underlying PTY deals with the
    * translation of '\n' to '\r\n' and this setting should not be used. If you
    * deal with data from a non-PTY related source, this settings might be
    * useful.
    */
  var convertEol: js.UndefOr[Boolean] = js.native
  /**
    * Whether the cursor blinks.
    */
  var cursorBlink: js.UndefOr[Boolean] = js.native
  /**
    * The style of the cursor.
    */
  var cursorStyle: js.UndefOr[block | underline | bar] = js.native
  /**
    * The width of the cursor in CSS pixels when `cursorStyle` is set to 'bar'.
    */
  var cursorWidth: js.UndefOr[Double] = js.native
  /**
    * Whether input should be disabled.
    */
  var disableStdin: js.UndefOr[Boolean] = js.native
  /**
    * Whether to draw bold text in bright colors. The default is true.
    */
  var drawBoldTextInBrightColors: js.UndefOr[Boolean] = js.native
  /**
    * The modifier key hold to multiply scroll speed.
    */
  var fastScrollModifier: js.UndefOr[alt | ctrl | shift] = js.native
  /**
    * The scroll speed multiplier used for fast scrolling.
    */
  var fastScrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * The font family used to render text.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The font size used to render text.
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * The font weight used to render non-bold text.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  /**
    * The font weight used to render bold text.
    */
  var fontWeightBold: js.UndefOr[FontWeight] = js.native
  /**
    * The spacing in whole pixels between characters..
    */
  var letterSpacing: js.UndefOr[Double] = js.native
  /**
    * The line height used to render text.
    */
  var lineHeight: js.UndefOr[Double] = js.native
  /**
    * What log level to use, this will log for all levels below and including
    * what is set:
    *
    * 1. debug
    * 2. info (default)
    * 3. warn
    * 4. error
    * 5. off
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * Whether holding a modifier key will force normal selection behavior,
    * regardless of whether the terminal is in mouse events mode. This will
    * also prevent mouse events from being emitted by the terminal. For
    * example, this allows you to use xterm.js' regular selection inside tmux
    * with mouse mode enabled.
    */
  var macOptionClickForcesSelection: js.UndefOr[Boolean] = js.native
  /**
    * Whether to treat option as the meta key.
    */
  var macOptionIsMeta: js.UndefOr[Boolean] = js.native
  /**
    * The minimum contrast ratio for text in the terminal, setting this will
    * change the foreground color dynamically depending on whether the contrast
    * ratio is met. Example values:
    *
    * - 1: The default, do nothing.
    * - 4.5: Minimum for WCAG AA compliance.
    * - 7: Minimum for WCAG AAA compliance.
    * - 21: White on black or black on white.
    */
  var minimumContrastRatio: js.UndefOr[Double] = js.native
  /**
    * The type of renderer to use, this allows using the fallback DOM renderer
    * when canvas is too slow for the environment. The following features do
    * not work when the DOM renderer is used:
    *
    * - Letter spacing
    * - Cursor blink
    */
  var rendererType: js.UndefOr[RendererType] = js.native
  /**
    * Whether to select the word under the cursor on right click, this is
    * standard behavior in a lot of macOS applications.
    */
  var rightClickSelectsWord: js.UndefOr[Boolean] = js.native
  /**
    * The number of rows in the terminal.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Whether screen reader support is enabled. When on this will expose
    * supporting elements in the DOM to support NVDA on Windows and VoiceOver
    * on macOS.
    */
  var screenReaderMode: js.UndefOr[Boolean] = js.native
  /**
    * The scrolling speed multiplier used for adjusting normal scrolling speed.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * The amount of scrollback in the terminal. Scrollback is the amount of
    * rows that are retained when lines are scrolled beyond the initial
    * viewport.
    */
  var scrollback: js.UndefOr[Double] = js.native
  /**
    * The size of tab stops in the terminal.
    */
  var tabStopWidth: js.UndefOr[Double] = js.native
  /**
    * The color theme of the terminal.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Enable various window manipulation and report features.
    * All features are disabled by default for security reasons.
    */
  var windowOptions: js.UndefOr[IWindowOptions] = js.native
  /**
    * Whether "Windows mode" is enabled. Because Windows backends winpty and
    * conpty operate by doing line wrapping on their side, xterm.js does not
    * have access to wrapped lines. When Windows mode is enabled the following
    * changes will be in effect:
    *
    * - Reflow is disabled.
    * - Lines are assumed to be wrapped if the last character of the line is
    *   not whitespace.
    */
  var windowsMode: js.UndefOr[Boolean] = js.native
  /**
    * A string containing all characters that are considered word separated by the
    * double click to select work logic.
    */
  var wordSeparator: js.UndefOr[String] = js.native
}

object ITerminalOptions {
  @scala.inline
  def apply(): ITerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITerminalOptions]
  }
  @scala.inline
  implicit class ITerminalOptionsOps[Self <: ITerminalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTransparency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTransparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTransparency")(js.undefined)
        ret
    }
    @scala.inline
    def withBellSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellSound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBellSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellSound")(js.undefined)
        ret
    }
    @scala.inline
    def withBellStyle(value: none | sound): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBellStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertEol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertEol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertEol")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorBlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorBlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorBlink")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorStyle(value: block | underline | bar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStdin")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawBoldTextInBrightColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBoldTextInBrightColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBoldTextInBrightColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBoldTextInBrightColors")(js.undefined)
        ret
    }
    @scala.inline
    def withFastScrollModifier(value: alt | ctrl | shift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastScrollModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastScrollModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastScrollModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withFastScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeightBold(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeightBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightBold")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMacOptionClickForcesSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOptionClickForcesSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacOptionClickForcesSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOptionClickForcesSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withMacOptionIsMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOptionIsMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacOptionIsMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOptionIsMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumContrastRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumContrastRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumContrastRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumContrastRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRendererType(value: RendererType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendererType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererType")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClickSelectsWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClickSelectsWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightClickSelectsWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClickSelectsWord")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollback(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(js.undefined)
        ret
    }
    @scala.inline
    def withTabStopWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStopWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabStopWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStopWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowOptions(value: IWindowOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWordSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparator")(js.undefined)
        ret
    }
  }
  
}

