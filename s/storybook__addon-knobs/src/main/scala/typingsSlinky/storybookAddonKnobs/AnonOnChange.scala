package typingsSlinky.storybookAddonKnobs

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnChange extends js.Object {
  var knob: Validator[KnobControlConfig[String]] = js.native
  var onChange: Validator[js.Function1[/* value */ String, String]] = js.native
}

object AnonOnChange {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[String]],
    onChange: Validator[js.Function1[/* value */ String, String]]
  ): AnonOnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnChange]
  }
  @scala.inline
  implicit class AnonOnChangeOps[Self <: AnonOnChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: Validator[KnobControlConfig[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: Validator[js.Function1[/* value */ String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

