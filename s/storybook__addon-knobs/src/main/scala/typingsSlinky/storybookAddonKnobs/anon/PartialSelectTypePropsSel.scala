package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnob
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
@js.native
trait PartialSelectTypePropsSel extends js.Object {
  var knob: js.UndefOr[SelectTypeKnob[SelectTypeKnobValue]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]] = js.native
}

object PartialSelectTypePropsSel {
  @scala.inline
  def apply(): PartialSelectTypePropsSel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectTypePropsSel]
  }
  @scala.inline
  implicit class PartialSelectTypePropsSelOps[Self <: PartialSelectTypePropsSel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: SelectTypeKnob[SelectTypeKnobValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ SelectTypeKnobValue => SelectTypeKnobValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
  }
  
}

