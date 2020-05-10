package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Record
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.local
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.page
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.remote
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPagination extends js.Object {
  /** Choose pagination method, "local" or "remote"	 */
  var pagination: js.UndefOr[remote | local] = js.native
  /** When using the addRow function on a paginated table, rows will be added relative to the current page (ie to the top or bottom of the current page), with overflowing rows being shifted onto the next page.
    If you would prefer rows to be added relative to the table (firs/last page) then you can use the paginationAddRow option. it can take one of two values:
    page - add rows relative to current page (default)
    table - add rows relative to the table */
  var paginationAddRow: js.UndefOr[table | page] = js.native
  /**  The number of pagination page buttons shown in the footer using the paginationButtonCount option. By default this has a value of 5.*/
  var paginationButtonCount: js.UndefOr[Double] = js.native
  /** Lookup list to link expected data feilds from the server to their function	* default* {
    "current_page":"current_page",
    "last_page":"last_page",
    "data":"data",
    }* *
    */
  var paginationDataReceived: js.UndefOr[Record[String, String]] = js.native
  /** Lookup list to link fields expected by the server to their function* default:* {
    "page":"page",
    "size":"size",
    "sorters":"sorters",
    "filters":"filters",
    }
    	 */
  var paginationDataSent: js.UndefOr[Record[String, String]] = js.native
  /**  By default the pagination controls are added to the footer of the table. If you wish the controls to be created in another element pass a DOM node or a CSS selector for that element to the paginationElement option.*/
  var paginationElement: js.UndefOr[HTMLElement | String] = js.native
  /** Specify that a specific page should be loaded when the table first load */
  var paginationInitialPage: js.UndefOr[Double] = js.native
  /** Set the number of rows in each page	 */
  var paginationSize: js.UndefOr[Double] = js.native
  /**  Setting this option to true will cause Tabulator to create a list of page size options, that are multiples of the current page size. In the example below, the list will have the values of 5, 10, 15 and 20.
    When using the page size selector like this, if you use the setPageSize function to set the page size to a value not in the list, the list will be regenerated using the new page size as the starting valuer	*/
  var paginationSizeSelector: js.UndefOr[`true` | js.Array[Double]] = js.native
}

object OptionsPagination {
  @scala.inline
  def apply(): OptionsPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPagination]
  }
  @scala.inline
  implicit class OptionsPaginationOps[Self <: OptionsPagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPagination(value: remote | local): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationAddRow(value: table | page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationAddRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationAddRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationAddRow")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationButtonCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationButtonCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationButtonCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationButtonCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationDataReceived(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationDataReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationDataReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationDataReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationDataSent(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationDataSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationDataSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationDataSent")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationElement(value: HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationElement")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationInitialPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationInitialPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationInitialPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationInitialPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationSizeSelector(value: `true` | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSizeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationSizeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSizeSelector")(js.undefined)
        ret
    }
  }
  
}

