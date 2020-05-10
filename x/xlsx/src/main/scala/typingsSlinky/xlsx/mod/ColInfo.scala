package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColInfo extends js.Object {
  /** Excel's "Max Digit Width" unit, always integral */
  var MDW: js.UndefOr[Double] = js.native
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[Boolean] = js.native
  /** width in "characters" */
  var wch: js.UndefOr[Double] = js.native
  /* --- column width --- */
  /** width in Excel's "Max Digit Width", width*256 is integral */
  var width: js.UndefOr[Double] = js.native
  /** width in screen pixels */
  var wpx: js.UndefOr[Double] = js.native
}

object ColInfo {
  @scala.inline
  def apply(): ColInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColInfo]
  }
  @scala.inline
  implicit class ColInfoOps[Self <: ColInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMDW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MDW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMDW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MDW")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withWch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wch")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWpx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wpx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWpx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wpx")(js.undefined)
        ret
    }
  }
  
}

