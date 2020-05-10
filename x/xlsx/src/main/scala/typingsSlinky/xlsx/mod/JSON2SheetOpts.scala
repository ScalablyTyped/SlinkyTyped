package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /** Use specified column order */
  var header: js.UndefOr[js.Array[String]] = js.native
  /** Skip header row in generated sheet */
  var skipHeader: js.UndefOr[Boolean] = js.native
}

object JSON2SheetOpts {
  @scala.inline
  def apply(): JSON2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSON2SheetOpts]
  }
  @scala.inline
  implicit class JSON2SheetOptsOps[Self <: JSON2SheetOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHeader")(js.undefined)
        ret
    }
  }
  
}

