package typingsSlinky.storybookAddonKnobs

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnFieldClick extends js.Object {
  var knobs: Validator[js.Array[KnobStoreKnob]] = js.native
  var onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]] = js.native
  var onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]] = js.native
}

object AnonOnFieldClick {
  @scala.inline
  def apply(
    knobs: Validator[js.Array[KnobStoreKnob]],
    onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]],
    onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
  ): AnonOnFieldClick = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.asInstanceOf[js.Any], onFieldClick = onFieldClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnFieldClick]
  }
  @scala.inline
  implicit class AnonOnFieldClickOps[Self <: AnonOnFieldClick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnobs(value: Validator[js.Array[KnobStoreKnob]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFieldChange(value: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFieldClick(value: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

