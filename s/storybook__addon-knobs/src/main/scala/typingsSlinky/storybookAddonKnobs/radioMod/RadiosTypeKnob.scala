package typingsSlinky.storybookAddonKnobs.radioMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiosTypeKnob extends KnobControlConfig[RadiosTypeKnobValue] {
  var options: RadiosTypeOptionsProp[RadiosTypeKnobValue] = js.native
}

object RadiosTypeKnob {
  @scala.inline
  def apply(name: String, options: RadiosTypeOptionsProp[RadiosTypeKnobValue]): RadiosTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiosTypeKnob]
  }
  @scala.inline
  implicit class RadiosTypeKnobOps[Self <: RadiosTypeKnob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: RadiosTypeOptionsProp[RadiosTypeKnobValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

