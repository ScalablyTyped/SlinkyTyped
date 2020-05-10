package typingsSlinky.virtualKeyboard.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardOptions extends js.Object {
  var acceptValid: js.UndefOr[Boolean] = js.native
  var accepted: js.UndefOr[kbEventHandler] = js.native
  var alwaysOpen: js.UndefOr[Boolean] = js.native
  var appendLocally: js.UndefOr[Boolean] = js.native
  var appendTo: js.UndefOr[String | js.Object] = js.native
  var autoAccept: js.UndefOr[Boolean] = js.native
  var autoAcceptOnEsc: js.UndefOr[Boolean] = js.native
  var autoAcceptOnValid: js.UndefOr[Boolean] = js.native
  var beforeClose: js.UndefOr[kbEventHandler] = js.native
  var beforeInsert: js.UndefOr[kbEventHandler] = js.native
  var beforeVisible: js.UndefOr[kbEventHandler] = js.native
  var buildKey: js.UndefOr[kbEventHandler] = js.native
  var cancelClose: js.UndefOr[Boolean] = js.native
  var canceled: js.UndefOr[kbEventHandler] = js.native
  var caretToEnd: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[kbEventHandler] = js.native
  var `class`: js.UndefOr[String] = js.native
  var closeByClickEvent: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var comboRegex: js.UndefOr[js.RegExp] = js.native
  var combos: js.UndefOr[js.Object] = js.native
  var css: js.UndefOr[js.Object] = js.native
  var customLayout: js.UndefOr[CustomLayout] = js.native
  var display: js.UndefOr[js.Object] = js.native
  var enterMod: js.UndefOr[String] = js.native
  var enterNavigation: js.UndefOr[Boolean] = js.native
  var hidden: js.UndefOr[kbEventHandler] = js.native
  var ignoreEsc: js.UndefOr[Boolean] = js.native
  var initialFocus: js.UndefOr[Boolean] = js.native
  var initialized: js.UndefOr[kbEventHandler] = js.native
  var keyBinding: js.UndefOr[String] = js.native
  var language: js.UndefOr[String | js.Array[String]] = js.native
  var layout: js.UndefOr[String] = js.native
  var lockInput: js.UndefOr[Boolean] = js.native
  var maxInsert: js.UndefOr[Boolean] = js.native
  var maxLength: js.UndefOr[Boolean | Double] = js.native
  var noFocus: js.UndefOr[Boolean] = js.native
  var openOn: js.UndefOr[String] = js.native
  var position: js.UndefOr[Boolean | js.Object] = js.native
  var preventPaste: js.UndefOr[String] = js.native
  var repeatDelay: js.UndefOr[Double] = js.native
  var repeatRate: js.UndefOr[Double] = js.native
  var reposition: js.UndefOr[Boolean] = js.native
  var resetDefault: js.UndefOr[Boolean] = js.native
  var restrictInclude: js.UndefOr[String] = js.native
  var restrictInput: js.UndefOr[Boolean] = js.native
  var restricted: js.UndefOr[kbEventHandler] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var scrollAdjustment: js.UndefOr[Double | String] = js.native
  var stayOpen: js.UndefOr[Boolean] = js.native
  var stickyShift: js.UndefOr[Boolean] = js.native
  var stopAtEnd: js.UndefOr[Boolean] = js.native
  var switchInput: js.UndefOr[kbEventHandler] = js.native
  var tabNavigation: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
  var updateOnChange: js.UndefOr[Boolean] = js.native
  var useCombos: js.UndefOr[Boolean] = js.native
  var usePreview: js.UndefOr[Boolean] = js.native
  var useWheel: js.UndefOr[Boolean] = js.native
  var userClosed: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[kbEventHandler] = js.native
  var visible: js.UndefOr[kbEventHandler] = js.native
  var wheelMessage: js.UndefOr[String] = js.native
}

object KeyboardOptions {
  @scala.inline
  def apply(`type`: String): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardOptions]
  }
  @scala.inline
  implicit class KeyboardOptionsOps[Self <: KeyboardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptValid")(js.undefined)
        ret
    }
    @scala.inline
    def withAccepted(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendLocally(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLocally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendLocally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLocally")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAccept(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAccept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAcceptOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAcceptOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAcceptOnValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptOnValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAcceptOnValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptOnValid")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeClose(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInsert(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeVisible(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeVisible")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildKey(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBuildKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelClose")(js.undefined)
        ret
    }
    @scala.inline
    def withCanceled(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretToEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretToEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretToEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretToEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseByClickEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByClickEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseByClickEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeByClickEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withComboRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comboRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComboRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comboRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withCombos(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combos")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLayout(value: CustomLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterMod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterMod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMod")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialized(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBinding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLockInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withNoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOn")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventPaste(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatRate")(js.undefined)
        ret
    }
    @scala.inline
    def withReposition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(js.undefined)
        ret
    }
    @scala.inline
    def withResetDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictInclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictInclude")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictInput")(js.undefined)
        ret
    }
    @scala.inline
    def withRestricted(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollAdjustment(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAdjustment")(js.undefined)
        ret
    }
    @scala.inline
    def withStayOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStayOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyShift")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAtEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopAtEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchInput(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchInput")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSwitchInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchInput")(js.undefined)
        ret
    }
    @scala.inline
    def withTabNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCombos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCombos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCombos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCombos")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePreview")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withUserClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(
      value: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelMessage")(js.undefined)
        ret
    }
  }
  
}

