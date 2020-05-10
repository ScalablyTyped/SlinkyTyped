package typingsSlinky.tablesorter.pagerMemoryMod

import typingsSlinky.tablesorter.sortDefinitionMod.SortDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerMemory extends js.Object {
  /**
    * The currently applied filters.
    */
  var currentFilters: js.Array[String] = js.native
  /**
    * The page-number.
    */
  var page: Double = js.native
  /**
    * The size of a page.
    */
  var size: Double = js.native
  /**
    * The sorting.
    */
  var sortList: js.Array[SortDefinition] = js.native
  /**
    * The total amount of rows.
    */
  var totalRows: Double = js.native
}

object PagerMemory {
  @scala.inline
  def apply(
    currentFilters: js.Array[String],
    page: Double,
    size: Double,
    sortList: js.Array[SortDefinition],
    totalRows: Double
  ): PagerMemory = {
    val __obj = js.Dynamic.literal(currentFilters = currentFilters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sortList = sortList.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerMemory]
  }
  @scala.inline
  implicit class PagerMemoryOps[Self <: PagerMemory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortList(value: js.Array[SortDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

