package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadXLXS extends js.Object {
  var documentProcessing: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
  /** The sheet name must be a valid Excel sheet name, and cannot include any of the following characters \, /, *, [, ], :,  */
  var sheetName: js.UndefOr[String] = js.native
}

object DownloadXLXS {
  @scala.inline
  def apply(): DownloadXLXS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadXLXS]
  }
  @scala.inline
  implicit class DownloadXLXSOps[Self <: DownloadXLXS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentProcessing(value: /* input */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentProcessing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDocumentProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(js.undefined)
        ret
    }
  }
  
}

