package typingsSlinky.storybookAddonKnobs

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKnob extends js.Object {
  var knob: Validator[ArrayTypeKnob]
  var onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
}

object AnonKnob {
  @scala.inline
  def apply(
    knob: Validator[ArrayTypeKnob],
    onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
  ): AnonKnob = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKnob]
  }
}

