package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vk.OpenAPI.NumericBoolean
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommunityMessagesOptions extends js.Object {
  var buttonType: js.UndefOr[String] = js.native
  var disableButtonTooltip: js.UndefOr[`1`] = js.native
  var disableExpandChatSound: js.UndefOr[`1`] = js.native
  var disableNewMessagesSound: js.UndefOr[`1`] = js.native
  var disableTitleChange: js.UndefOr[`1`] = js.native
  var expandTimeout: js.UndefOr[Double] = js.native
  var expanded: js.UndefOr[`1`] = js.native
  var onCanNotWrite: js.UndefOr[js.Function1[/* reason */ OnCanNotWriteReason, Unit]] = js.native
  var tooltipButtonText: js.UndefOr[String] = js.native
  var welcomeScreen: js.UndefOr[NumericBoolean] = js.native
  var widgetPosition: js.UndefOr[String] = js.native
}

object CommunityMessagesOptions {
  @scala.inline
  def apply(): CommunityMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunityMessagesOptions]
  }
  @scala.inline
  implicit class CommunityMessagesOptionsOps[Self <: CommunityMessagesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableButtonTooltip(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableButtonTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableButtonTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableButtonTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableExpandChatSound(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExpandChatSound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableExpandChatSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExpandChatSound")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNewMessagesSound(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNewMessagesSound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNewMessagesSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNewMessagesSound")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTitleChange(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTitleChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTitleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTitleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanNotWrite(value: /* reason */ OnCanNotWriteReason => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanNotWrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanNotWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanNotWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withWelcomeScreen(value: NumericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWelcomeScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgetPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetPosition")(js.undefined)
        ret
    }
  }
  
}

