package typingsSlinky.uiGrid.mod.saveState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISavedScrollFocus extends js.Object {
  var colName: js.UndefOr[String] = js.native
  var focus: js.UndefOr[Boolean] = js.native
  var rowVal: js.UndefOr[IRowVal] = js.native
}

object ISavedScrollFocus {
  @scala.inline
  def apply(): ISavedScrollFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISavedScrollFocus]
  }
  @scala.inline
  implicit class ISavedScrollFocusOps[Self <: ISavedScrollFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colName")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withRowVal(value: IRowVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowVal")(js.undefined)
        ret
    }
  }
  
}

