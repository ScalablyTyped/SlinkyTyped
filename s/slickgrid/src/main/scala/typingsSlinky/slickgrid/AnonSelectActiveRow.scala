package typingsSlinky.slickgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectActiveRow extends js.Object {
  var selectActiveRow: Boolean = js.native
}

object AnonSelectActiveRow {
  @scala.inline
  def apply(selectActiveRow: Boolean): AnonSelectActiveRow = {
    val __obj = js.Dynamic.literal(selectActiveRow = selectActiveRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectActiveRow]
  }
  @scala.inline
  implicit class AnonSelectActiveRowOps[Self <: AnonSelectActiveRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectActiveRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectActiveRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

