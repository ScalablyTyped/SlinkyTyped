package typingsSlinky.tablesorter.pagerDataPartMod

import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerDataPart[TElement] extends js.Object {
  /**
    * The number of filtered rows.
    */
  var filteredRows: js.UndefOr[Double] = js.native
  /**
    * The column-names of the table.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The output to display in the output-area.
    *
    * Following portions of text are substituted:
    *
    * | Tag                | Replacement                                  |
    * |--------------------|----------------------------------------------|
    * | `{size}`           | The current page size.                       |
    * | `{page}`           | The current page.                            |
    * | `{page:input}`     | The page inputted by the user.               |
    * | `{totalPages}`     | The total amount of pages.                   |
    * | `{filteredPages}`  | The filtered number of pages.                |
    * | `{startRow}`       | The number of the first row being displayed. |
    * | `{startRow:input}` | The start-row inputted by the user.          |
    * | `{endRow}`         | The number of the last row being displayed.  |
    * | `{filteredRows}`   | The amount of filtered rows.                 |
    * | `{totalRows}`      | The total amount of rows.                    |
    */
  var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.native
  /**
    * The data to show.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]] | JQuery[HTMLElement]] = js.native
  /**
    * The number of total rows.
    */
  var total: Double = js.native
}

object PagerDataPart {
  @scala.inline
  def apply[TElement](total: Double): PagerDataPart[TElement] = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerDataPart[TElement]]
  }
  @scala.inline
  implicit class PagerDataPartOps[Self[telement] <: PagerDataPart[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withTotal(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredRows(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFunction2(value: (TElement, /* pager */ js.Any) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOutput(value: String | PagerOutputProcessor[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[_]] | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

