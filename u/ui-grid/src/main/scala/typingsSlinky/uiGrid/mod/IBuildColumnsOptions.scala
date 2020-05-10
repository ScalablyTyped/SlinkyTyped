package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuildColumnsOptions extends js.Object {
  var orderByColumnDefs: js.UndefOr[Boolean] = js.native
}

object IBuildColumnsOptions {
  @scala.inline
  def apply(): IBuildColumnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBuildColumnsOptions]
  }
  @scala.inline
  implicit class IBuildColumnsOptionsOps[Self <: IBuildColumnsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrderByColumnDefs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByColumnDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderByColumnDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByColumnDefs")(js.undefined)
        ret
    }
  }
  
}

