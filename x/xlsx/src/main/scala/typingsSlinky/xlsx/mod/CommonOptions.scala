package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  /**
    * If true, throw errors when features are not understood
    * @default false
    */
  var WTF: js.UndefOr[Boolean] = js.native
  /**
    * When reading a file with VBA macros, expose CFB blob to `vbaraw` field
    * When writing BIFF8/XLSB/XLSM, reseat `vbaraw` and export to file
    * @default false
    */
  var bookVBA: js.UndefOr[Boolean] = js.native
  /**
    * When reading a file, store dates as type d (default is n)
    * When writing XLSX/XLSM file, use native date (default uses date codes)
    * @default false
    */
  var cellDates: js.UndefOr[Boolean] = js.native
  /**
    * When reading a file, save style/theme info to the .s field
    * When writing a file, export style/theme info
    * @default false
    */
  var cellStyles: js.UndefOr[Boolean] = js.native
  /**
    * If defined and file is encrypted, use password
    * @default ''
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Create cell objects for stub cells
    * @default false
    */
  var sheetStubs: js.UndefOr[Boolean] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWTF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WTF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWTF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WTF")(js.undefined)
        ret
    }
    @scala.inline
    def withBookVBA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookVBA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookVBA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookVBA")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDates")(js.undefined)
        ret
    }
    @scala.inline
    def withCellStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyles")(js.undefined)
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
    def withSheetStubs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetStubs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetStubs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetStubs")(js.undefined)
        ret
    }
  }
  
}

