package typingsSlinky.tablesorter.tablesorterHeadingMod

import typingsSlinky.tablesorter.columnFilterMod.ColumnFilter
import typingsSlinky.tablesorter.emptySortingMod.EmptySorting
import typingsSlinky.tablesorter.sortOrderMod.SortOrder
import typingsSlinky.tablesorter.stringSortingMod.StringSorting
import typingsSlinky.tablesorter.tablesorterConfigBaseMod.TablesorterConfigBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesorterHeading extends TablesorterConfigBase {
  /**
    * The sorting to apply for empty cells.
    */
  var empty: js.UndefOr[EmptySorting] = js.native
  /**
    * The filter-concept for the column.
    */
  var filter: js.UndefOr[ColumnFilter] = js.native
  /**
    * The locked sort-order of the heading.
    */
  var lockedOrder: js.UndefOr[SortOrder] = js.native
  /**
    * Either the name of the parser to use for text-extraction or a value indicating whether text-extraction is enabled.
    */
  var parser: js.UndefOr[String | Boolean] = js.native
  /**
    * A value indicating whether the column should be resizable.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * Either the name of the parser to use for sorting or a value indicating whether sorting is enabled.
    */
  var sorter: js.UndefOr[String | Boolean] = js.native
  /**
    * The sorting to apply for text-cells.
    */
  var string: js.UndefOr[StringSorting] = js.native
}

object TablesorterHeading {
  @scala.inline
  def apply(): TablesorterHeading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesorterHeading]
  }
  @scala.inline
  implicit class TablesorterHeadingOps[Self <: TablesorterHeading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmpty(value: EmptySorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: ColumnFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLockedOrder(value: SortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSorter(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: StringSorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

