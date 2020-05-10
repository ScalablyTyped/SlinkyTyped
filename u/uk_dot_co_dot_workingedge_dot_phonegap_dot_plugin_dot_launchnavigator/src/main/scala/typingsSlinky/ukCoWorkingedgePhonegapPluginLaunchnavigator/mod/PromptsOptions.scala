package typingsSlinky.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptsOptions extends js.Object {
  /**
    * text to display in the native prompt body asking user whether to remember their choice.
    * Defaults to "Use the same app for navigating next time?" if not specified.
    */
  var bodyText: js.UndefOr[String] = js.native
  /**
    * a function to pass the user's decision whether to remember their choice of app.
    * This will be passed a single boolean value indicating the user's decision.
    * @param rememberChoice
    */
  var callback: js.UndefOr[js.Function1[/* rememberChoice */ Boolean, Unit]] = js.native
  /**
    * text to display in the native prompt header asking user whether to remember their choice.
    * Defaults to "Remember your choice?" if not specified.
    */
  var headerText: js.UndefOr[String] = js.native
  /**
    * text to display for the No button.
    * Defaults to "No" if not specified.
    */
  var noButtonText: js.UndefOr[String] = js.native
  /**
    * text to display for the Yes button.
    * Defaults to "Yes" if not specified.
    */
  var yesButtonText: js.UndefOr[String] = js.native
}

object PromptsOptions {
  @scala.inline
  def apply(): PromptsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptsOptions]
  }
  @scala.inline
  implicit class PromptsOptionsOps[Self <: PromptsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyText")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: /* rememberChoice */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withNoButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withYesButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yesButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYesButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yesButtonText")(js.undefined)
        ret
    }
  }
  
}

