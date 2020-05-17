package typingsSlinky.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALL extends js.Object {
  var ALL: String = js.native
  var COLUMN: String = js.native
  var EDIT: String = js.native
  var OPTIONS: String = js.native
  var ROW: String = js.native
}

object ALL {
  @scala.inline
  def apply(ALL: String, COLUMN: String, EDIT: String, OPTIONS: String, ROW: String): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], COLUMN = COLUMN.asInstanceOf[js.Any], EDIT = EDIT.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], ROW = ROW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  @scala.inline
  implicit class ALLOps[Self <: ALL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOLUMN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COLUMN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEDIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPTIONS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROW(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

