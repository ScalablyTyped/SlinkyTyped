package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  addGlobalClass  :boolean,   multipleSlots  :boolean}> */
@js.native
trait PartialaddGlobalClassbool extends js.Object {
  var addGlobalClass: js.UndefOr[Boolean] = js.native
  var multipleSlots: js.UndefOr[Boolean] = js.native
}

object PartialaddGlobalClassbool {
  @scala.inline
  def apply(): PartialaddGlobalClassbool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialaddGlobalClassbool]
  }
  @scala.inline
  implicit class PartialaddGlobalClassboolOps[Self <: PartialaddGlobalClassbool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddGlobalClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addGlobalClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddGlobalClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addGlobalClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleSlots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleSlots")(js.undefined)
        ret
    }
  }
  
}

