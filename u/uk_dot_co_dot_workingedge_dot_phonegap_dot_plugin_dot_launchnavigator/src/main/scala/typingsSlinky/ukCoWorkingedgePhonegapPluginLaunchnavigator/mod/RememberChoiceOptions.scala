package typingsSlinky.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RememberChoiceOptions extends js.Object {
  /**
    * whether to remember user choice of app for next time, instead of asking again for user choice.
    * `"prompt"` - Prompt user to decide whether to remember choice.
    *  - Default value if unspecified.
    *  - If `promptFn` is defined, this will be used for user confirmation.
    *  - Otherwise (by default), a native dialog will be displayed to ask user.
    * `false` - Do not remember user choice.
    * `true` - Remember user choice.
    */
  var enabled: js.UndefOr[Boolean | String] = js.native
  /**
    * options related to the default dialog prompt used to ask the user whether to remember their choice of app.
    */
  var prompt: js.UndefOr[PromptsOptions] = js.native
  /**
    * a function which asks the user whether to remember their choice of app.
    * If this is defined, then the default dialog prompt will not be shown, allowing for a custom UI for asking the user.
    * This will be passed a callback function which should be invoked with a single boolean argument which indicates the user's decision to remember their choice.
    * @param callback
    */
  var promptFn: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* rememberChoice */ Boolean, Unit], Unit]
  ] = js.native
}

object RememberChoiceOptions {
  @scala.inline
  def apply(): RememberChoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RememberChoiceOptions]
  }
  @scala.inline
  implicit class RememberChoiceOptionsOps[Self <: RememberChoiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: PromptsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptFn(value: /* callback */ js.Function1[/* rememberChoice */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPromptFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptFn")(js.undefined)
        ret
    }
  }
  
}

