package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.landscape
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.tabulatorTables.Tabulator.DownloadPDF because var conflicts: documentProcessing. Inlined orientation, title, rowGroupStyles, rowCalcStyles, jsPDF, autoTable */ @js.native
trait DownloadOptions
  extends DownloadCSV
     with DownloadXLXS
     with DownloadHTML {
  var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ js.Any, _])] = js.native
  var jsPDF: js.UndefOr[js.Any] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var rowCalcStyles: js.UndefOr[js.Any] = js.native
  var rowGroupStyles: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[String] = js.native
}

object DownloadOptions {
  @scala.inline
  def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoTableFunction1(value: /* doc */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAutoTable(value: js.Object | (js.Function1[/* doc */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTable")(js.undefined)
        ret
    }
    @scala.inline
    def withJsPDF(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsPDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsPDF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsPDF")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCalcStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCalcStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCalcStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCalcStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroupStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

