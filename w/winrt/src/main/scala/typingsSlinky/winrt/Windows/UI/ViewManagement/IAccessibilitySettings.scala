package typingsSlinky.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessibilitySettings extends js.Object {
  var highContrast: Boolean = js.native
  var highContrastScheme: String = js.native
  var onhighcontrastchanged: js.Any = js.native
}

object IAccessibilitySettings {
  @scala.inline
  def apply(highContrast: Boolean, highContrastScheme: String, onhighcontrastchanged: js.Any): IAccessibilitySettings = {
    val __obj = js.Dynamic.literal(highContrast = highContrast.asInstanceOf[js.Any], highContrastScheme = highContrastScheme.asInstanceOf[js.Any], onhighcontrastchanged = onhighcontrastchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessibilitySettings]
  }
  @scala.inline
  implicit class IAccessibilitySettingsOps[Self <: IAccessibilitySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighContrast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighContrastScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrastScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnhighcontrastchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhighcontrastchanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

