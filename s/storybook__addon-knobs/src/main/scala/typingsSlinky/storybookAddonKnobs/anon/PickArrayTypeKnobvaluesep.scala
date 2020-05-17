package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ArrayTypeKnob, 'value' | 'separator'> */
@js.native
trait PickArrayTypeKnobvaluesep extends js.Object {
  var separator: String = js.native
  var value: ArrayTypeKnobValue = js.native
}

object PickArrayTypeKnobvaluesep {
  @scala.inline
  def apply(separator: String, value: ArrayTypeKnobValue): PickArrayTypeKnobvaluesep = {
    val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickArrayTypeKnobvaluesep]
  }
  @scala.inline
  implicit class PickArrayTypeKnobvaluesepOps[Self <: PickArrayTypeKnobvaluesep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ArrayTypeKnobValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

