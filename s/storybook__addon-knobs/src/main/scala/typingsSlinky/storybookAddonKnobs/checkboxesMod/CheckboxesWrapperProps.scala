package typingsSlinky.storybookAddonKnobs.checkboxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxesWrapperProps extends js.Object {
  var isInline: Boolean = js.native
}

object CheckboxesWrapperProps {
  @scala.inline
  def apply(isInline: Boolean): CheckboxesWrapperProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxesWrapperProps]
  }
  @scala.inline
  implicit class CheckboxesWrapperPropsOps[Self <: CheckboxesWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

