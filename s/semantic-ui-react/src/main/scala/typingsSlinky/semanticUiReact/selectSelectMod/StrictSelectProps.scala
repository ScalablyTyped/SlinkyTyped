package typingsSlinky.semanticUiReact.selectSelectMod

import typingsSlinky.semanticUiReact.dropdownDropdownMod.StrictDropdownProps
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictSelectProps extends StrictDropdownProps {
  /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
  @JSName("options")
  var options_StrictSelectProps: js.Array[DropdownItemProps] = js.native
}

object StrictSelectProps {
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): StrictSelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSelectProps]
  }
  @scala.inline
  implicit class StrictSelectPropsOps[Self <: StrictSelectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[DropdownItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

