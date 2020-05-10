package typingsSlinky.xlsx.mod

import typingsSlinky.xlsx.xlsxStrings.array
import typingsSlinky.xlsx.xlsxStrings.base64
import typingsSlinky.xlsx.xlsxStrings.binary
import typingsSlinky.xlsx.xlsxStrings.buffer
import typingsSlinky.xlsx.xlsxStrings.file
import typingsSlinky.xlsx.xlsxStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsingOptions extends CommonOptions {
  /**
    * If true, parse calculation chains
    * @default false
    */
  var bookDeps: js.UndefOr[Boolean] = js.native
  /**
    * If true, add raw files to book object
    * @default false
    */
  var bookFiles: js.UndefOr[Boolean] = js.native
  /**
    * If true, only parse enough to get book metadata
    * @default false
    */
  var bookProps: js.UndefOr[Boolean] = js.native
  /**
    * If true, only parse enough to get the sheet names
    * @default false
    */
  var bookSheets: js.UndefOr[Boolean] = js.native
  /**
    * Save formulae to the .f field
    * @default true
    */
  var cellFormula: js.UndefOr[Boolean] = js.native
  /**
    * Parse rich text and save HTML to the .h field
    * @default true
    */
  var cellHTML: js.UndefOr[Boolean] = js.native
  /**
    * Save number format string to the .z field
    * @default false
    */
  var cellNF: js.UndefOr[Boolean] = js.native
  /**
    * Generate formatted text to the .w field
    * @default true
    */
  var cellText: js.UndefOr[Boolean] = js.native
  /** Default codepage */
  var codepage: js.UndefOr[Double] = js.native
  /** Override default date format (code 14) */
  var dateNF: js.UndefOr[String] = js.native
  var dense: js.UndefOr[Boolean] = js.native
  /* If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.native
  /** If specified, only parse the specified sheets or sheet names */
  var sheets: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  /** Input data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array | string] = js.native
}

object ParsingOptions {
  @scala.inline
  def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  @scala.inline
  implicit class ParsingOptionsOps[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookDeps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookDeps")(js.undefined)
        ret
    }
    @scala.inline
    def withBookFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withBookProps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookProps")(js.undefined)
        ret
    }
    @scala.inline
    def withBookSheets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookSheets")(js.undefined)
        ret
    }
    @scala.inline
    def withCellFormula(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormula")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withCellNF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellNF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellNF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellNF")(js.undefined)
        ret
    }
    @scala.inline
    def withCellText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(js.undefined)
        ret
    }
    @scala.inline
    def withCodepage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodepage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepage")(js.undefined)
        ret
    }
    @scala.inline
    def withDateNF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateNF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateNF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateNF")(js.undefined)
        ret
    }
    @scala.inline
    def withDense(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(js.undefined)
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
    @scala.inline
    def withSheets(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: base64 | binary | buffer | file | array | string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

