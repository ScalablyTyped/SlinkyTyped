package typingsSlinky.winrtUwp.Windows.UI.ViewManagement

import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the title bar of an app. */
@js.native
trait ApplicationViewTitleBar extends js.Object {
  /** Gets or sets the color of the title bar background. */
  var backgroundColor: Color = js.native
  /** Gets or sets the background color of the title bar buttons. */
  var buttonBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of the title bar buttons. */
  var buttonForegroundColor: Color = js.native
  /** Gets or sets the background color of a title bar button when the pointer is over it. */
  var buttonHoverBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of a title bar button when the pointer is over it. */
  var buttonHoverForegroundColor: Color = js.native
  /** Gets or sets the background color of a title bar button when it's inactive. */
  var buttonInactiveBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of a title bar button when it's inactive. */
  var buttonInactiveForegroundColor: Color = js.native
  /** Gets or sets the background color of a title bar button when it's pressed. */
  var buttonPressedBackgroundColor: Color = js.native
  /** Gets or sets the foreground color of a title bar button when it's pressed. */
  var buttonPressedForegroundColor: Color = js.native
  /** Gets or sets the color of the title bar foreground. */
  var foregroundColor: Color = js.native
  /** Gets or sets the color of the title bar background when it's inactive. */
  var inactiveBackgroundColor: Color = js.native
  /** Gets or sets the color of the title bar foreground when it's inactive. */
  var inactiveForegroundColor: Color = js.native
}

object ApplicationViewTitleBar {
  @scala.inline
  def apply(
    backgroundColor: Color,
    buttonBackgroundColor: Color,
    buttonForegroundColor: Color,
    buttonHoverBackgroundColor: Color,
    buttonHoverForegroundColor: Color,
    buttonInactiveBackgroundColor: Color,
    buttonInactiveForegroundColor: Color,
    buttonPressedBackgroundColor: Color,
    buttonPressedForegroundColor: Color,
    foregroundColor: Color,
    inactiveBackgroundColor: Color,
    inactiveForegroundColor: Color
  ): ApplicationViewTitleBar = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], buttonHoverBackgroundColor = buttonHoverBackgroundColor.asInstanceOf[js.Any], buttonHoverForegroundColor = buttonHoverForegroundColor.asInstanceOf[js.Any], buttonInactiveBackgroundColor = buttonInactiveBackgroundColor.asInstanceOf[js.Any], buttonInactiveForegroundColor = buttonInactiveForegroundColor.asInstanceOf[js.Any], buttonPressedBackgroundColor = buttonPressedBackgroundColor.asInstanceOf[js.Any], buttonPressedForegroundColor = buttonPressedForegroundColor.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveForegroundColor = inactiveForegroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewTitleBar]
  }
  @scala.inline
  implicit class ApplicationViewTitleBarOps[Self <: ApplicationViewTitleBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonHoverBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonHoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonHoverForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonHoverForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonInactiveBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonInactiveBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonInactiveForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonInactiveForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonPressedBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressedBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonPressedForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressedForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

