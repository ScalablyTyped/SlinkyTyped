package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the appearance of a device picker. */
@js.native
trait DevicePickerAppearance extends js.Object {
  /** Gets and sets the accent color of the picker UI. */
  var accentColor: Color = js.native
  /** Gets and sets the background color of the picker UI. */
  var backgroundColor: Color = js.native
  /** Gets and sets the foreground color of the picker UI. */
  var foregroundColor: Color = js.native
  /** Gets and sets the accent color for a device that has been selected in the picker. */
  var selectedAccentColor: Color = js.native
  /** Gets and sets the background color for a device that is selected in the picker. */
  var selectedBackgroundColor: Color = js.native
  /** Gets and sets the foreground color for a device that is selected in the picker. */
  var selectedForegroundColor: Color = js.native
  /** Gets and sets the title for the picker UI. */
  var title: String = js.native
}

object DevicePickerAppearance {
  @scala.inline
  def apply(
    accentColor: Color,
    backgroundColor: Color,
    foregroundColor: Color,
    selectedAccentColor: Color,
    selectedBackgroundColor: Color,
    selectedForegroundColor: Color,
    title: String
  ): DevicePickerAppearance = {
    val __obj = js.Dynamic.literal(accentColor = accentColor.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], selectedAccentColor = selectedAccentColor.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedForegroundColor = selectedForegroundColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePickerAppearance]
  }
  @scala.inline
  implicit class DevicePickerAppearanceOps[Self <: DevicePickerAppearance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedAccentColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAccentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

