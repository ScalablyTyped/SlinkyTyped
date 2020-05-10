package typingsSlinky.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSelectionOptions extends js.Object {
  /**
    * (Android only) native picker theme. Specify using `actionsheet.ANDROID_THEMES` constants.
    * Default `actionsheet.ANDROID_THEMES.THEME_HOLO_LIGHT`
    */
  var androidTheme: js.UndefOr[Double] = js.native
  /**
    * Callback to invoke when the user selects an app in the native picker.
    * A single string argument is passed which is the app what was selected defined as a `launchnavigator.APP` constant.
    */
  var callback: js.UndefOr[js.Function1[/* app */ String, Unit]] = js.native
  /**
    * text to display for the cancel button in the native picker which enables user to select which navigation app to launch.
    * Defaults to "Cancel" if not specified.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  /**
    * text to display in the native picker which enables user to select which navigation app to launch.
    * Defaults to "Select app for navigation" if not specified.
    */
  var dialogHeaderText: js.UndefOr[String] = js.native
  /**
    * List of apps, defined as `launchnavigator.APP` constants, which should be displayed in the picker if the app is available.
    * This can be used to restrict which apps are displayed, even if they are installed.
    * By default, all available apps will be displayed.
    */
  var list: js.UndefOr[js.Array[String]] = js.native
  /**
    * options related to whether to remember user choice of app for next time, instead of asking again for user choice.
    */
  var rememberChoice: js.UndefOr[RememberChoiceOptions] = js.native
}

object AppSelectionOptions {
  @scala.inline
  def apply(): AppSelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSelectionOptions]
  }
  @scala.inline
  implicit class AppSelectionOptionsOps[Self <: AppSelectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidTheme(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: /* app */ String => Unit): Self = {
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
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogHeaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogHeaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withRememberChoice(value: RememberChoiceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberChoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRememberChoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberChoice")(js.undefined)
        ret
    }
  }
  
}

