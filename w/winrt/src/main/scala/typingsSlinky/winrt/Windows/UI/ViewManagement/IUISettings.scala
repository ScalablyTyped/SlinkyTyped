package typingsSlinky.winrt.Windows.UI.ViewManagement

import typingsSlinky.winrt.Windows.Foundation.Size
import typingsSlinky.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUISettings extends js.Object {
  var animationsEnabled: Boolean = js.native
  var caretBlinkRate: Double = js.native
  var caretBrowsingEnabled: Boolean = js.native
  var caretWidth: Double = js.native
  var cursorSize: Size = js.native
  var doubleClickTime: Double = js.native
  var handPreference: HandPreference = js.native
  var messageDuration: Double = js.native
  var mouseHoverTime: Double = js.native
  var scrollBarArrowSize: Size = js.native
  var scrollBarSize: Size = js.native
  var scrollBarThumbBoxSize: Size = js.native
  def uIElementColor(desiredElement: UIElementType): Color = js.native
}

object IUISettings {
  @scala.inline
  def apply(
    animationsEnabled: Boolean,
    caretBlinkRate: Double,
    caretBrowsingEnabled: Boolean,
    caretWidth: Double,
    cursorSize: Size,
    doubleClickTime: Double,
    handPreference: HandPreference,
    messageDuration: Double,
    mouseHoverTime: Double,
    scrollBarArrowSize: Size,
    scrollBarSize: Size,
    scrollBarThumbBoxSize: Size,
    uIElementColor: UIElementType => Color
  ): IUISettings = {
    val __obj = js.Dynamic.literal(animationsEnabled = animationsEnabled.asInstanceOf[js.Any], caretBlinkRate = caretBlinkRate.asInstanceOf[js.Any], caretBrowsingEnabled = caretBrowsingEnabled.asInstanceOf[js.Any], caretWidth = caretWidth.asInstanceOf[js.Any], cursorSize = cursorSize.asInstanceOf[js.Any], doubleClickTime = doubleClickTime.asInstanceOf[js.Any], handPreference = handPreference.asInstanceOf[js.Any], messageDuration = messageDuration.asInstanceOf[js.Any], mouseHoverTime = mouseHoverTime.asInstanceOf[js.Any], scrollBarArrowSize = scrollBarArrowSize.asInstanceOf[js.Any], scrollBarSize = scrollBarSize.asInstanceOf[js.Any], scrollBarThumbBoxSize = scrollBarThumbBoxSize.asInstanceOf[js.Any], uIElementColor = js.Any.fromFunction1(uIElementColor))
    __obj.asInstanceOf[IUISettings]
  }
  @scala.inline
  implicit class IUISettingsOps[Self <: IUISettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretBlinkRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretBlinkRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretBrowsingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretBrowsingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubleClickTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandPreference(value: HandPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseHoverTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseHoverTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollBarArrowSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBarArrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollBarSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollBarThumbBoxSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBarThumbBoxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUIElementColor(value: UIElementType => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uIElementColor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

