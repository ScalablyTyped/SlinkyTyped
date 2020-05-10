package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadCSV extends js.Object {
  /** If you need the output CSV to include a byte order mark (BOM) to ensure that output with UTF-8 characters can be correctly interpereted across didfferent applications, you should set the bom option to true */
  var bom: js.UndefOr[Boolean] = js.native
  /** By default CSV files are created using a comma (,) delimiter. If you need to change this for any reason the you can pass the options object with a delimiter property to the download function which will then use this delimiter instead of the comma. */
  var delimiter: js.UndefOr[String] = js.native
}

object DownloadCSV {
  @scala.inline
  def apply(): DownloadCSV = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadCSV]
  }
  @scala.inline
  implicit class DownloadCSVOps[Self <: DownloadCSV] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
  }
  
}

