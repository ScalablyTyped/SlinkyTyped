package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkSheet
  extends Sheet
     with WSSpec {
  /** AutoFilter info */
  @JSName("!autofilter")
  var Exclamationmarkautofilter: js.UndefOr[AutoFilterInfo] = js.native
  /** Column Info */
  @JSName("!cols")
  var Exclamationmarkcols: js.UndefOr[js.Array[ColInfo]] = js.native
  /** Merge Ranges */
  @JSName("!merges")
  var Exclamationmarkmerges: js.UndefOr[js.Array[Range]] = js.native
  /** Worksheet Protection info */
  @JSName("!protect")
  var Exclamationmarkprotect: js.UndefOr[ProtectInfo] = js.native
  /** Row Info */
  @JSName("!rows")
  var Exclamationmarkrows: js.UndefOr[js.Array[RowInfo]] = js.native
}

object WorkSheet {
  @scala.inline
  def apply(): WorkSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkSheet]
  }
  @scala.inline
  implicit class WorkSheetOps[Self <: WorkSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclamationmarkautofilter(value: AutoFilterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!autofilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkautofilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!autofilter")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarkcols(value: js.Array[ColInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkcols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!cols")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarkmerges(value: js.Array[Range]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!merges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkmerges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!merges")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarkprotect(value: ProtectInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!protect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkprotect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!protect")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarkrows(value: js.Array[RowInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!rows")(js.undefined)
        ret
    }
  }
  
}

