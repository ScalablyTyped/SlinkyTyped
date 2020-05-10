package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.both
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.cell
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.collapse
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.fitColumns
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.fitData
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.fitDataFill
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.fitDataStretch
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.group
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.header
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.hide
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsColumns extends js.Object {
  /**
    * If you set the autoColumns option to true, every time data is loaded into the table through the data option or through the setData function, Tabulator will examine the first row of the data and build columns to match that data.
    */
  var autoColumns: js.UndefOr[Boolean] = js.native
  /** By default column calculations are shown at the top and bottom of the table, unless row grouping is enabled, in which case they are shown at the top and bottom of each group.
    The columnCalcs option lets you decided where the calculations should be displayed, it can take one of four values:
    true - show calcs at top and bottom of the table, unless grouped, then show in groups (boolean, default)
    both - show calcs at top and bottom of the table and show in groups
    table - show calcs at top and bottom of the table only
    group - show calcs in groups only */
  var columnCalcs: js.UndefOr[Boolean | both | table | group] = js.native
  /** multiple or single column sorting */
  var columnHeaderSortMulti: js.UndefOr[Boolean] = js.native
  /** You can use the columnHeaderVertAlign option to set how the text in your column headers should be vertically  */
  var columnHeaderVertAlign: js.UndefOr[VerticalAlign] = js.native
  /** It is possible to set a minimum column width to prevent resizing columns from becoming too small.
    This can be set globally, by setting the columnMinWidth option to the column width when you create your Tabulator.
    This option can be overridden on a per column basis by setting the minWidth property on the column definition. */
  var columnMinWidth: js.UndefOr[Double] = js.native
  /** The columnMoved callback will be triggered when a column has been successfuly moved. */
  var columnMoved: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* columns */ js.Array[_], Unit]] = js.native
  var columnResized: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.native
  /** The columnTitleChanged callback is triggered whenever a user edits a column title when the editableTitle parameter has been enabled in the column definition array. */
  var columnTitleChanged: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.native
  /** The columnVisibilityChanged callback is triggered whenever a column changes between hidden and visible states. */
  var columnVisibilityChanged: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* visible */ Boolean, Unit]] = js.native
  /** The column definitions are provided to Tabluator in the columns property of the table constructor object and should take the format of an array of objects, with each object representing the configuration of one column. */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  /** The default placeholder text used for input elements can be set using the headerFilterPlaceholder option in the table definition */
  var headerFilterPlaceholder: js.UndefOr[String] = js.native
  /** The headerSort option can now be set in the table options to affect all columns as well as in column definitions. */
  var headerSort: js.UndefOr[Boolean] = js.native
  /** The headerSortTristate option can now be set in the table options to affect all columns as well as in column definitions.*/
  var headerSortTristate: js.UndefOr[Boolean] = js.native
  /**By setting the headerVisible option to false you can hide the column headers and present the table as a simple list if needed. */
  var headerVisible: js.UndefOr[Boolean] = js.native
  /** By default Tabulator will use the fitData layout mode, which will resize the tables columns to fit the data held in each column, unless you specify a width or minWidth in the column constructor. If the width of all columns exceeds the width of the containing element, a scroll bar will appear. */
  var layout: js.UndefOr[fitData | fitColumns | fitDataFill | fitDataStretch] = js.native
  /** To keep the layout of the columns consistent, once the column widths have been set on the first data load (either from the data property in the constructor or the setData function) they will not be changed when new data is loaded.
    If you would prefer that the column widths adjust to the data each time you load it into the table you can set the layoutColumnsOnNewData property to true. */
  var layoutColumnsOnNewData: js.UndefOr[Boolean] = js.native
  /** To allow the user to move columns along the table, set the movableColumns parameter in the options: */
  var movableColumns: js.UndefOr[Boolean] = js.native
  /** If you need to use the . character as part of your field name, you can change the separator to any other character using the nestedFieldSeparator option
    * Set to false to disable nested data parsing
    */
  var nestedFieldSeparator: js.UndefOr[String | Boolean] = js.native
  /**If you don't want to show a particular column in the print table you can set the print property in its column definition object to false */
  var print: js.UndefOr[Boolean] = js.native
  /** By default it is possible to manually resize columns by dragging the borders of the column in both the column headers and the cells of the column.
    If you want to alter this behaviour you can use the resizableColumns to choose where the resize handles are available.  */
  var resizableColumns: js.UndefOr[`true` | `false` | header | cell] = js.native
  /** Responsive layout will automatically hide/show columns to fit the width of the Tabulator element. This allows for clean rendering of tables on smaller mobile devices, showing important data while avoiding horizontal scroll bars. You can enable responsive layouts using the responsiveLayout option.
    There are two responsive layout modes available:
    hide - hide columns that no longer fit in the table
    collapse - collapse columns that no longer fit on the table into a list under the row
    Hide Extra Columns
    By default, columns will be hidden from right to left as the width of the table decreases. You can choose exactlyhow columns are hidden using the responsive property in the column definition object.
    When responsive layout is enabled, all columns are given a default responsive value of 1. The higher you set this value the sooner that column will be hidden as the table width decreases. If two columns have the same responsive value then they are hidden from right to left (as defined in the column definition array, ignoring user moving of the columns). If you set the value to 0 then the column will never be hidden regardless of how narrow the table gets. */
  var responsiveLayout: js.UndefOr[Boolean | hide | collapse] = js.native
  /** If you set the responsiveLayout option to collapse the values from hidden columns will be displayed in a title/value list under the row.
    In this mode an object containing the title of each hidden column and its value is generated and then used to generate a list displayed in a div .tabulator-responsive-collapse under the row data.
    The inbuilt collapse formatter creates a table to neatly display the hidden columns. If you would like to format the data in your own way you can use the responsiveLayoutCollapseFormatter, it take an object of the column values as an argument and must return the HTML content of the div.
    This function should return an empty string if there is no data to display. */
  var responsiveLayoutCollapseFormatter: js.UndefOr[js.Function1[/* data */ js.Array[_], _]] = js.native
  /** Collapsed lists are displayed to the user by default, if you would prefer they start closed so the user can open them you can use the responsiveLayoutCollapseStartOpen option */
  var responsiveLayoutCollapseStartOpen: js.UndefOr[Boolean] = js.native
  /** By default any formatter set on the column is applied to the value that will appear in the list. while this works for most formatters it can cause issues with the progress formatter which relies on being inside a cell.
    If you would like to disable column formatting in the collapsed list, you can use the responsiveLayoutCollapseUseFormatters option: */
  var responsiveLayoutCollapseUseFormatters: js.UndefOr[Boolean] = js.native
  /** The default option for triggering a ScrollTo on a visible element can be set using the scrollToColumnIfVisible option. It can take a boolean value:
    true - scroll to column, even if it is visible (default)
    false - scroll to column, unless it is currently visible, then don't move */
  var scrollToColumnIfVisible: js.UndefOr[Boolean] = js.native
  /** The default ScrollTo position can be set using the scrollToColumnPosition option. It can take one of three possible values:
    left - position column with its left edge at the left of the table (default)
    center - position column with its left edge in the center of the table
    right - position column with its right edge at the right of the table */
  var scrollToColumnPosition: js.UndefOr[ScrollToColumnPosition] = js.native
  /** Header tooltips can be set globally using the tooltipsHeader options parameter */
  var tooltipsHeader: js.UndefOr[Boolean] = js.native
}

object OptionsColumns {
  @scala.inline
  def apply(): OptionsColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsColumns]
  }
  @scala.inline
  implicit class OptionsColumnsOps[Self <: OptionsColumns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnCalcs(value: Boolean | both | table | group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCalcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCalcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCalcs")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderSortMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderSortMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderSortMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderSortMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderVertAlign(value: VerticalAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderVertAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderVertAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderVertAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnMoved(value: (/* column */ ColumnComponent, /* columns */ js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMoved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnMoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMoved")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResized(value: /* column */ ColumnComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResized")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTitleChanged(value: /* column */ ColumnComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitleChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnTitleChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitleChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnVisibilityChanged(value: (/* column */ ColumnComponent, /* visible */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnVisibilityChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnVisibilityChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnVisibilityChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSort")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderSortTristate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSortTristate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderSortTristate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSortTristate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: fitData | fitColumns | fitDataFill | fitDataStretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutColumnsOnNewData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutColumnsOnNewData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutColumnsOnNewData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutColumnsOnNewData")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedFieldSeparator(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedFieldSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedFieldSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedFieldSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withResizableColumns(value: `true` | `false` | header | cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveLayout(value: Boolean | hide | collapse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveLayoutCollapseFormatter(value: /* data */ js.Array[_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayoutCollapseFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResponsiveLayoutCollapseFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayoutCollapseFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveLayoutCollapseStartOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayoutCollapseStartOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveLayoutCollapseStartOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayoutCollapseStartOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveLayoutCollapseUseFormatters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayoutCollapseUseFormatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveLayoutCollapseUseFormatters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveLayoutCollapseUseFormatters")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToColumnIfVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumnIfVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToColumnIfVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumnIfVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToColumnPosition(value: ScrollToColumnPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumnPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToColumnPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumnPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipsHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipsHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipsHeader")(js.undefined)
        ret
    }
  }
  
}

