package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectInfo extends _WSKeys {
  /**
    * Filter
    * @default: false
    */
  var autoFilter: js.UndefOr[Boolean] = js.native
  /**
    * Delete columns
    * @default: false
    */
  var deleteColumns: js.UndefOr[Boolean] = js.native
  /**
    * Delete rows
    * @default: false
    */
  var deleteRows: js.UndefOr[Boolean] = js.native
  /**
    * Format cells
    * @default: false
    */
  var formatCells: js.UndefOr[Boolean] = js.native
  /**
    * Format columns
    * @default: false
    */
  var formatColumns: js.UndefOr[Boolean] = js.native
  /**
    * Format rows
    * @default: false
    */
  var formatRows: js.UndefOr[Boolean] = js.native
  /**
    * Insert columns
    * @default: false
    */
  var insertColumns: js.UndefOr[Boolean] = js.native
  /**
    * Insert hyperlinks
    * @default: false
    */
  var insertHyperlinks: js.UndefOr[Boolean] = js.native
  /**
    * Insert rows
    * @default: false
    */
  var insertRows: js.UndefOr[Boolean] = js.native
  /**
    * Edit objects
    * @default: true
    */
  var objects: js.UndefOr[Boolean] = js.native
  /**
    * The password for formats that support password-protected sheets
    * (XLSX/XLSB/XLS). The writer uses the XOR obfuscation method.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Use PivotTable reports
    * @default: false
    */
  var pivotTables: js.UndefOr[Boolean] = js.native
  /**
    * Edit scenarios
    * @default: true
    */
  var scenarios: js.UndefOr[Boolean] = js.native
  /**
    * Select locked cells
    * @default: true
    */
  var selectLockedCells: js.UndefOr[Boolean] = js.native
  /**
    * Select unlocked cells
    * @default: true
    */
  var selectUnlockedCells: js.UndefOr[Boolean] = js.native
  /**
    * Sort
    * @default: false
    */
  var sort: js.UndefOr[Boolean] = js.native
}

object ProtectInfo {
  @scala.inline
  def apply(): ProtectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectInfo]
  }
  @scala.inline
  implicit class ProtectInfoOps[Self <: ProtectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRows")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCells")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRows")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertHyperlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertHyperlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHyperlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRows")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(js.undefined)
        ret
    }
    @scala.inline
    def withScenarios(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScenarios: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarios")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectLockedCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectLockedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectLockedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectLockedCells")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectUnlockedCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectUnlockedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectUnlockedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectUnlockedCells")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

