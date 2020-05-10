package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeOptionsProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.RadiosTypeKnob, 'value' | 'options'> */
@js.native
trait PickRadiosTypeKnobvalueop extends js.Object {
  var options: RadiosTypeOptionsProp[RadiosTypeKnobValue] = js.native
  var value: RadiosTypeKnobValue = js.native
}

object PickRadiosTypeKnobvalueop {
  @scala.inline
  def apply(options: RadiosTypeOptionsProp[RadiosTypeKnobValue]): PickRadiosTypeKnobvalueop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRadiosTypeKnobvalueop]
  }
  @scala.inline
  implicit class PickRadiosTypeKnobvalueopOps[Self <: PickRadiosTypeKnobvalueop] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withValue(value: RadiosTypeKnobValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

