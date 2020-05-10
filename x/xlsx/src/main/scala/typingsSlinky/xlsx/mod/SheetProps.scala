package typingsSlinky.xlsx.mod

import typingsSlinky.xlsx.xlsxNumbers.`0`
import typingsSlinky.xlsx.xlsxNumbers.`1`
import typingsSlinky.xlsx.xlsxNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetProps extends js.Object {
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.native
  /** Sheet Visibility (0=Visible 1=Hidden 2=VeryHidden) */
  var Hidden: js.UndefOr[`0` | `1` | `2`] = js.native
}

object SheetProps {
  @scala.inline
  def apply(): SheetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetProps]
  }
  @scala.inline
  implicit class SheetPropsOps[Self <: SheetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hidden")(js.undefined)
        ret
    }
  }
  
}

