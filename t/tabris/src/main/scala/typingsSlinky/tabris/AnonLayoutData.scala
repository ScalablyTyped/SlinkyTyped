package typingsSlinky.tabris

import typingsSlinky.tabris.mod.LayoutDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLayoutData extends js.Object {
  var layoutData: js.UndefOr[LayoutDataValue] = js.native
}

object AnonLayoutData {
  @scala.inline
  def apply(): AnonLayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLayoutData]
  }
  @scala.inline
  implicit class AnonLayoutDataOps[Self <: AnonLayoutData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutData(value: LayoutDataValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutData")(js.undefined)
        ret
    }
  }
  
}

