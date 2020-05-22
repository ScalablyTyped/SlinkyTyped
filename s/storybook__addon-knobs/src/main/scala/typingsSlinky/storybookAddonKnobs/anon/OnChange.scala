package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChange extends js.Object {
  var knob: Validator[KnobControlConfig[String]]
  var onChange: Validator[js.Function1[/* value */ String, String]]
}

object OnChange {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[String]],
    onChange: Validator[js.Function1[/* value */ String, String]]
  ): OnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
}

