package typingsSlinky.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkBook extends js.Object {
  /** Custom workbook Properties */
  var Custprops: js.UndefOr[js.Object] = js.native
  /** Standard workbook Properties */
  var Props: js.UndefOr[FullProperties] = js.native
  /** Ordered list of the sheet names in the workbook */
  var SheetNames: js.Array[String] = js.native
  /**
    * A dictionary of the worksheets in the workbook.
    * Use SheetNames to reference these.
    */
  var Sheets: StringDictionary[WorkSheet] = js.native
  var Workbook: js.UndefOr[WBProps] = js.native
  var vbaraw: js.UndefOr[js.Any] = js.native
}

object WorkBook {
  @scala.inline
  def apply(SheetNames: js.Array[String], Sheets: StringDictionary[WorkSheet]): WorkBook = {
    val __obj = js.Dynamic.literal(SheetNames = SheetNames.asInstanceOf[js.Any], Sheets = Sheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkBook]
  }
  @scala.inline
  implicit class WorkBookOps[Self <: WorkBook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSheetNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SheetNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheets(value: StringDictionary[WorkSheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustprops(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Custprops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustprops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Custprops")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: FullProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Props")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkbook(value: WBProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workbook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkbook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workbook")(js.undefined)
        ret
    }
    @scala.inline
    def withVbaraw(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vbaraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVbaraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vbaraw")(js.undefined)
        ret
    }
  }
  
}

