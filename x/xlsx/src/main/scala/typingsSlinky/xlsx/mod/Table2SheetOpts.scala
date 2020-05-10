package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /** If true, hidden rows and cells will not be parsed */
  var display: js.UndefOr[Boolean] = js.native
  /* If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.native
}

object Table2SheetOpts {
  @scala.inline
  def apply(): Table2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table2SheetOpts]
  }
  @scala.inline
  implicit class Table2SheetOptsOps[Self <: Table2SheetOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetRows")(js.undefined)
        ret
    }
  }
  
}

