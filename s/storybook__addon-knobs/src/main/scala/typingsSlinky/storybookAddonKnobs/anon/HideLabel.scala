package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HideLabel extends js.Object {
  var callback: ButtonTypeOnClickProp = js.native
  var hideLabel: `true` = js.native
}

object HideLabel {
  @scala.inline
  def apply(callback: /* knob */ ButtonTypeKnob => js.Any, hideLabel: `true`): HideLabel = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), hideLabel = hideLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideLabel]
  }
  @scala.inline
  implicit class HideLabelOps[Self <: HideLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* knob */ ButtonTypeKnob => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideLabel(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

