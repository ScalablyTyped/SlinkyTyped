package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.filesMod.DateTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.FileTypeKnob, 'value' | 'accept'> */
@js.native
trait PickFileTypeKnobvalueacce extends js.Object {
  var accept: String = js.native
  var value: DateTypeKnobValue = js.native
}

object PickFileTypeKnobvalueacce {
  @scala.inline
  def apply(accept: String, value: DateTypeKnobValue): PickFileTypeKnobvalueacce = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFileTypeKnobvalueacce]
  }
  @scala.inline
  implicit class PickFileTypeKnobvalueacceOps[Self <: PickFileTypeKnobvalueacce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: DateTypeKnobValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

