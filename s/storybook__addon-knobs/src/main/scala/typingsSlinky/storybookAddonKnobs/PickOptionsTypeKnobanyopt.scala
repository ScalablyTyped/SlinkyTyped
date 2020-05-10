package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsKnobOptions
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeOptionsProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.OptionsTypeKnob<any>, 'options' | 'value' | 'optionsObj'> */
@js.native
trait PickOptionsTypeKnobanyopt extends js.Object {
  var options: OptionsTypeOptionsProp[_] = js.native
  var optionsObj: OptionsKnobOptions = js.native
  var value: js.Any = js.native
}

object PickOptionsTypeKnobanyopt {
  @scala.inline
  def apply(options: OptionsTypeOptionsProp[_], optionsObj: OptionsKnobOptions, value: js.Any): PickOptionsTypeKnobanyopt = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickOptionsTypeKnobanyopt]
  }
  @scala.inline
  implicit class PickOptionsTypeKnobanyoptOps[Self <: PickOptionsTypeKnobanyopt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: OptionsTypeOptionsProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsObj(value: OptionsKnobOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

