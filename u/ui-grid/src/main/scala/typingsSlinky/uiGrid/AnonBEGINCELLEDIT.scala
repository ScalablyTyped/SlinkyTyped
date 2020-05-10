package typingsSlinky.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBEGINCELLEDIT extends js.Object {
  var BEGIN_CELL_EDIT: String = js.native
  var CANCEL_CELL_EDIT: String = js.native
  var END_CELL_EDIT: String = js.native
}

object AnonBEGINCELLEDIT {
  @scala.inline
  def apply(BEGIN_CELL_EDIT: String, CANCEL_CELL_EDIT: String, END_CELL_EDIT: String): AnonBEGINCELLEDIT = {
    val __obj = js.Dynamic.literal(BEGIN_CELL_EDIT = BEGIN_CELL_EDIT.asInstanceOf[js.Any], CANCEL_CELL_EDIT = CANCEL_CELL_EDIT.asInstanceOf[js.Any], END_CELL_EDIT = END_CELL_EDIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBEGINCELLEDIT]
  }
  @scala.inline
  implicit class AnonBEGINCELLEDITOps[Self <: AnonBEGINCELLEDIT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBEGIN_CELL_EDIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BEGIN_CELL_EDIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCANCEL_CELL_EDIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL_CELL_EDIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEND_CELL_EDIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("END_CELL_EDIT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

