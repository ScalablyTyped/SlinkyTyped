package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
@js.native
trait ReadonlyArrayTypeProps extends js.Object {
  val knob: ArrayTypeKnob = js.native
  val onChange: js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue] = js.native
}

object ReadonlyArrayTypeProps {
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): ReadonlyArrayTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ReadonlyArrayTypeProps]
  }
  @scala.inline
  implicit class ReadonlyArrayTypePropsOps[Self <: ReadonlyArrayTypeProps] (val x: Self) extends AnyVal {
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
    def withOnChange(value: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

