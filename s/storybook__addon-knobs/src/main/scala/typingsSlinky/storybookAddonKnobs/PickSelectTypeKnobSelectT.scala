package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeOptionsProp
import typingsSlinky.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.SelectTypeKnob<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>, 'value' | 'options'> & {  selectV2  :true} */
@js.native
trait PickSelectTypeKnobSelectT extends js.Object {
  var options: SelectTypeOptionsProp[SelectTypeKnobValue] = js.native
  var selectV2: `true` = js.native
  var value: SelectTypeKnobValue = js.native
}

object PickSelectTypeKnobSelectT {
  @scala.inline
  def apply(options: SelectTypeOptionsProp[SelectTypeKnobValue], selectV2: `true`): PickSelectTypeKnobSelectT = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], selectV2 = selectV2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSelectTypeKnobSelectT]
  }
  @scala.inline
  implicit class PickSelectTypeKnobSelectTOps[Self <: PickSelectTypeKnobSelectT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: SelectTypeOptionsProp[SelectTypeKnobValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectV2(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectV2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: SelectTypeKnobValue): Self = {
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

