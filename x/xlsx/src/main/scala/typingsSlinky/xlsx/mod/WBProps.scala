package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WBProps extends js.Object {
  /** Defined Names */
  var Names: js.UndefOr[js.Array[DefinedName]] = js.native
  /** Sheet Properties */
  var Sheets: js.UndefOr[js.Array[SheetProps]] = js.native
  /** Workbook Views */
  var Views: js.UndefOr[js.Array[WBView]] = js.native
  /** Other Workbook Properties */
  var WBProps: js.UndefOr[WorkbookProperties] = js.native
}

object WBProps {
  @scala.inline
  def apply(): WBProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WBProps]
  }
  @scala.inline
  implicit class WBPropsOps[Self <: WBProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: js.Array[DefinedName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
        ret
    }
    @scala.inline
    def withSheets(value: js.Array[SheetProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sheets")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Array[WBView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Views")(js.undefined)
        ret
    }
    @scala.inline
    def withWBProps(value: WorkbookProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WBProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWBProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WBProps")(js.undefined)
        ret
    }
  }
  
}

