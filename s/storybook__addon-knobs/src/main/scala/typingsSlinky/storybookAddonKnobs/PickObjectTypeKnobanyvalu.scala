package typingsSlinky.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
@js.native
trait PickObjectTypeKnobanyvalu extends js.Object {
  var value: js.Any = js.native
}

object PickObjectTypeKnobanyvalu {
  @scala.inline
  def apply(value: js.Any): PickObjectTypeKnobanyvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickObjectTypeKnobanyvalu]
  }
  @scala.inline
  implicit class PickObjectTypeKnobanyvaluOps[Self <: PickObjectTypeKnobanyvalu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

