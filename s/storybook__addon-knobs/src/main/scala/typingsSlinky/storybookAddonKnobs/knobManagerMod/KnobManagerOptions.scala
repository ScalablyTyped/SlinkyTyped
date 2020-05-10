package typingsSlinky.storybookAddonKnobs.knobManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobManagerOptions extends js.Object {
  var disableDebounce: js.UndefOr[Boolean] = js.native
  var escapeHTML: js.UndefOr[Boolean] = js.native
}

object KnobManagerOptions {
  @scala.inline
  def apply(): KnobManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnobManagerOptions]
  }
  @scala.inline
  implicit class KnobManagerOptionsOps[Self <: KnobManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableDebounce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDebounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDebounce")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHTML")(js.undefined)
        ret
    }
  }
  
}

