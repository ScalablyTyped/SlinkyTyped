package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddditionalExportOptions extends js.Object {
  var columnCalcs: js.UndefOr[Boolean] = js.native
  var columnGroups: js.UndefOr[Boolean] = js.native
  var columnHeaders: js.UndefOr[Boolean] = js.native
  var dataTree: js.UndefOr[Boolean] = js.native
  /**Show only raw unformatted cell values in the clipboard output */
  var formatCells: js.UndefOr[Boolean] = js.native
  var rowGroups: js.UndefOr[Boolean] = js.native
}

object AddditionalExportOptions {
  @scala.inline
  def apply(): AddditionalExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddditionalExportOptions]
  }
  @scala.inline
  implicit class AddditionalExportOptionsOps[Self <: AddditionalExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnCalcs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCalcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCalcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCalcs")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTree")(js.undefined)
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
    def withRowGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroups")(js.undefined)
        ret
    }
  }
  
}

