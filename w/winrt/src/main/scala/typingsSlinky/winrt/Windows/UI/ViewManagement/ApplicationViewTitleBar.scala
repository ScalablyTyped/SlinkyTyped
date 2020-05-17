package typingsSlinky.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationViewTitleBar extends js.Object {
  /**
    * Gets or sets the color of the title bar background.
    **/
  var backgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the background color of the title bar buttons.
    **/
  var buttonBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the foreground color of the title bar buttons.
    **/
  var buttonForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the background color of a title bar button when the pointer is over it.
    **/
  var buttonHoverBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the foreground color of a title bar button when the pointer is over it.
    **/
  var buttonHoverForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the background color of a title bar button when it's inactive.
    **/
  var buttonInactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the foreground color of a title bar button when it's inactive.
    **/
  var buttonInactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the background color of a title bar button when it's pressed.
    **/
  var buttonPressedBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the foreground color of a title bar button when it's pressed.
    **/
  var buttonPressedForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the color of the title bar foreground.
    **/
  var foregroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the color of the title bar background when it's inactive.
    **/
  var inactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  /**
    * Gets or sets the color of the title bar foreground when it's inactive.
    **/
  var inactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
}

object ApplicationViewTitleBar {
  @scala.inline
  def apply(
    backgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonHoverBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonHoverForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonInactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonInactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonPressedBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    buttonPressedForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    foregroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    inactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any,
    inactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
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
    def withBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonHoverBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonHoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonHoverForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonHoverForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonInactiveBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonInactiveBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonInactiveForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonInactiveForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonPressedBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressedBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonPressedForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressedForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveForegroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

