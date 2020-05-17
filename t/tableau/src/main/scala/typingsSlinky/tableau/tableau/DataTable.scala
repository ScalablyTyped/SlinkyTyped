package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTable extends js.Object {
  /** The column information, including the name, data type, and index. */
  def getColumns(): js.Array[Column] = js.native
  /**
    * A two-dimensional array of data without the sheet or column metadata.
    * The first array index is the row index and the second array index is the column index.
    */
  def getData(): js.Array[_] = js.native
  /** Whether the data is summary data or underlying data. Returns true for summary data. */
  def getIsSummaryData(): Boolean = js.native
  /** Either "Underlying Data Table" or "Summary Data Table". */
  def getName(): String = js.native
  /** The number of rows in the returned data. */
  def getTotalRowCount(): Double = js.native
}

object DataTable {
  @scala.inline
  def apply(
    getColumns: () => js.Array[Column],
    getData: () => js.Array[_],
    getIsSummaryData: () => Boolean,
    getName: () => String,
    getTotalRowCount: () => Double
  ): DataTable = {
    val __obj = js.Dynamic.literal(getColumns = js.Any.fromFunction0(getColumns), getData = js.Any.fromFunction0(getData), getIsSummaryData = js.Any.fromFunction0(getIsSummaryData), getName = js.Any.fromFunction0(getName), getTotalRowCount = js.Any.fromFunction0(getTotalRowCount))
    __obj.asInstanceOf[DataTable]
  }
  @scala.inline
  implicit class DataTableOps[Self <: DataTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColumns(value: () => js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetData(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsSummaryData(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsSummaryData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTotalRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalRowCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

