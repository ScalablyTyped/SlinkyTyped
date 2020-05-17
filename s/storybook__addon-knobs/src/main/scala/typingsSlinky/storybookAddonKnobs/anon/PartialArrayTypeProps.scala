package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
@js.native
trait PartialArrayTypeProps extends js.Object {
  var knob: js.UndefOr[ArrayTypeKnob] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]] = js.native
}

object PartialArrayTypeProps {
  @scala.inline
  def apply(): PartialArrayTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArrayTypeProps]
  }
  @scala.inline
  implicit class PartialArrayTypePropsOps[Self <: PartialArrayTypeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: ArrayTypeKnob): Self = {
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
    def withOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = {
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

