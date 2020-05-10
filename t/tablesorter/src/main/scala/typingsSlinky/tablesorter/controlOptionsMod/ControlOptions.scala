package typingsSlinky.tablesorter.controlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlOptions extends js.Object {
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.native
}

object ControlOptions {
  @scala.inline
  def apply(): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlOptions]
  }
  @scala.inline
  implicit class ControlOptionsOps[Self <: ControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(js.undefined)
        ret
    }
  }
  
}

