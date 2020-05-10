package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHideLabel extends js.Object {
  var callback: ButtonTypeOnClickProp = js.native
  var hideLabel: `true` = js.native
}

object AnonHideLabel {
  @scala.inline
  def apply(callback: /* knob */ ButtonTypeKnob => js.Any, hideLabel: `true`): AnonHideLabel = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), hideLabel = hideLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHideLabel]
  }
  @scala.inline
  implicit class AnonHideLabelOps[Self <: AnonHideLabel] (val x: Self) extends AnyVal {
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

