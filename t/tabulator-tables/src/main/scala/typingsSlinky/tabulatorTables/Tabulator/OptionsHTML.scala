package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsHTML extends js.Object {
  var htmlOutputConfig: js.UndefOr[AddditionalExportOptions] = js.native
  /**By Default when a page is printed that includes a Tabulator it will be rendered on the page exactly as the table is drawn. While this ise useful in most cases, some users prefer tohave more controll over the print output, for example showing all rows of the table, instead of just those visible with the current position of the scroll bar.
    Tabulator provides a print styling mode that will replace the Tabulator with an HTML table for the printout giving you much more control over the look and feel of the table for the print out., to enable this mode, set the printAsHtml option to true in the table constructor. 
    
    This will replace the table (in print outs only) with a simple HTML table with the class tabulator-print-table that you can use to style the table in any way you like.
    It also has the benifit that because it is an HTML table, if it corsses a page break your browser will uatomatically add the column headers in at the top of the next page.
    */
  var printAsHtml: js.UndefOr[Boolean] = js.native
  /**The HTML table will contain column header groups, row groups, and column calculations.
    You can choose to remove any of these from the output data by setting the values in the printConfig option in the table definition */
  var printConfig: js.UndefOr[AddditionalExportOptions] = js.native
  /**You can use the printFooter table setup option to define a footer to be displayed when the table is printed. */
  var printFooter: js.UndefOr[StandardStringParam] = js.native
  /**The printFormatter table setup option allows you to carry out any manipulation of the print output before it is displayed to the user for printing*/
  var printFormatter: js.UndefOr[js.Function2[/* tableHolderElement */ js.Any, /* tableElement */ js.Any, _]] = js.native
  /**You can use the printHeader table setup option to define a header to be displayed when the table is printed. */
  var printHeader: js.UndefOr[StandardStringParam] = js.native
  /**By default, only the rows currently visible in the Tabulator will be added to the HTML table. For custom row ranges it is also possible to pass a function into the printRowRange option that should return an array of Row Components */
  var printRowRange: js.UndefOr[RowRangeLookup | js.Function0[js.Array[RowComponent]]] = js.native
  /**If you want your printed table to be styled to match your Tabulator you can set the printCopyStyle to true, this will copy key layout styling to the printed table */
  var printStyled: js.UndefOr[Boolean] = js.native
}

object OptionsHTML {
  @scala.inline
  def apply(): OptionsHTML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHTML]
  }
  @scala.inline
  implicit class OptionsHTMLOps[Self <: OptionsHTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlOutputConfig(value: AddditionalExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlOutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlOutputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintAsHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printAsHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintAsHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printAsHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintConfig(value: AddditionalExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintFooterHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintFooterFunction0(value: () => String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintFooter(value: StandardStringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintFormatter(value: (/* tableHolderElement */ js.Any, /* tableElement */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrintFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintHeaderHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintHeaderFunction0(value: () => String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintHeader(value: StandardStringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintRowRangeFunction0(value: () => js.Array[RowComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printRowRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintRowRange(value: RowRangeLookup | js.Function0[js.Array[RowComponent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printRowRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintRowRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printRowRange")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintStyled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printStyled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintStyled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printStyled")(js.undefined)
        ret
    }
  }
  
}

