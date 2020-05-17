package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobValidator extends js.Object {
  var knob: Validator[NumberTypeKnob] = js.native
  var onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]] = js.native
}

object KnobValidator {
  @scala.inline
  def apply(
    knob: Validator[NumberTypeKnob],
    onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
  ): KnobValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobValidator]
  }
  @scala.inline
  implicit class KnobValidatorOps[Self <: KnobValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: Validator[NumberTypeKnob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: Validator[js.Function1[/* value */ Double | Null, Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

