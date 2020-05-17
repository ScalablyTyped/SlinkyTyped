package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knob extends js.Object {
  var knob: Validator[ArrayTypeKnob] = js.native
  var onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]] = js.native
}

object Knob {
  @scala.inline
  def apply(
    knob: Validator[ArrayTypeKnob],
    onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
  ): Knob = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knob]
  }
  @scala.inline
  implicit class KnobOps[Self <: Knob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: Validator[ArrayTypeKnob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

