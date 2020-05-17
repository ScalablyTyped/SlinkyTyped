package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
@js.native
trait PartialBooleanTypeProps extends js.Object {
  var knob: js.UndefOr[BooleanTypeKnob] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]] = js.native
}

object PartialBooleanTypeProps {
  @scala.inline
  def apply(): PartialBooleanTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBooleanTypeProps]
  }
  @scala.inline
  implicit class PartialBooleanTypePropsOps[Self <: PartialBooleanTypeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: BooleanTypeKnob): Self = {
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
    def withOnChange(value: /* value */ BooleanTypeKnobValue => BooleanTypeKnobValue): Self = {
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

