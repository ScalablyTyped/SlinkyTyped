package typingsSlinky.atStorybookAddonDashKnobs

import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import typingsSlinky.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Knob extends js.Object {
  var knob: Validator[ArrayTypeKnob]
  var onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
}

object Anon_Knob {
  @scala.inline
  def apply(
    knob: Validator[ArrayTypeKnob],
    onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
  ): Anon_Knob = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Knob]
  }
}

