package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.alphanum
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.array
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.boolean
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.clipboard
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.data
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.date
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetime
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.download
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.edit
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.exists
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.flip
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.number
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.string
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinition
  extends ColumnLayout
     with CellCallbacks
     with _ColumnLookup {
  /**  Accessors are used to alter data as it is extracted from the table, through commands, the clipboard, or download.
    You can set accessors on a per column basis using the accessor option in the column definition object.*/
  var accessor: js.UndefOr[CustomAccessor] = js.native
  /** only called when data is being copied into the clipboard. */
  var accessorClipboard: js.UndefOr[CustomAccessor] = js.native
  /**  additional parameters you can pass to the accessorClipboard*/
  var accessorClipboardParams: js.UndefOr[CustomAccessorParams] = js.native
  /** only called when data is being converted into a downloadable file. */
  var accessorDownload: js.UndefOr[CustomAccessor] = js.native
  /** additional parameters you can pass to the accessorDownload */
  var accessorDownloadParams: js.UndefOr[CustomAccessorParams] = js.native
  /**You can use the accessorHtmlOutput and accessorHtmlOutputParams options on a column definition to alter the value of data in a column before the html is generated. */
  var accessorHtmlOutput: js.UndefOr[CustomAccessor] = js.native
  var accessorHtmlOutputParams: js.UndefOr[CustomAccessorParams] = js.native
  /**  Each accessor function has its own matching params option, for example accessorDownload has accessorDownloadParams.*/
  var accessorParams: js.UndefOr[CustomAccessorParams] = js.native
  /**You can use the accessorPrint and accessorPrintParams options on a column definition to alter the value of data in a column before it is printed */
  var accessorPrint: js.UndefOr[CustomAccessor] = js.native
  var accessorPrintParams: js.UndefOr[CustomAccessorParams] = js.native
  var bottomCalc: js.UndefOr[ColumnCalc] = js.native
  var bottomCalcFormatter: js.UndefOr[Formatter] = js.native
  /**  additional parameters you can pass to the bottomCalcFormatter function */
  var bottomCalcFormatterParams: js.UndefOr[FormatterParams] = js.native
  var bottomCalcParams: js.UndefOr[ColumnCalcParams] = js.native
  /** If you don't want to show a particular column in the clipboard output you can set the clipboard property in its column definition object to false */
  var clipboard: js.UndefOr[Boolean] = js.native
  /** A column can be a "group" of columns (Example: group header column -> Measurements, grouped column -> Length, Width, Height) */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  /**You can add a right click context menu to any columns cells by passing an array of menu items to the contextMenu option in that columns definition. */
  var contextMenu: js.UndefOr[js.Array[MenuObject | MenuSeparator]] = js.native
  /** sets css classes on header and cells in this column. (value should be a string containing space separated class names) */
  var cssClass: js.UndefOr[String] = js.native
  /** show or hide column in downloaded data */
  var download: js.UndefOr[Boolean] = js.native
  /** set custom title for column in download */
  var downloadTitle: js.UndefOr[String] = js.native
  /**  There are some circumstances where you may want to block editibility of a cell for one reason or another. To meet this need you can use the editable option. This lets you set a callback that is executed before the editor is built, if this callback returns true the editor is added, if it returns false the edit is aborted and the cell remains a non editable cell. The function is passed one parameter, the CellComponent of the cell about to be edited. You can also pass a boolean value instead of a function to this property.*/
  var editable: js.UndefOr[Boolean | (js.Function1[/* cell */ CellComponent, Boolean])] = js.native
  /** allows the user to edit the header titles */
  var editableTitle: js.UndefOr[Boolean] = js.native
  /** When a user clicks on an editable column the will be able to edit the value for that cell.
    By default Tabulator will use an editor that matches the current formatter for that cell. if you wish to specify a specific editor, you can set them per column using the editor option in the column definition. Passing a value of true to this option will result in Tabulator applying the editor that best matches the columns formatter, if present.
    You can pass an optional additional parameter with the editor, editorParams that should contain an object with additional information for configuring the editor. */
  var editor: js.UndefOr[Editor] = js.native
  /** additional parameters you can pass to the editor   */
  var editorParams: js.UndefOr[EditorParams] = js.native
  /**  set how you would like the data to be formatted*/
  var formatter: js.UndefOr[Formatter] = js.native
  /**When copying to the clipboard you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterClipboard column definition option. You can use the formatterClipboardParams to pass in any additional params to the formatter */
  var formatterClipboard: js.UndefOr[Formatter | `false`] = js.native
  var formatterClipboardParams: js.UndefOr[FormatterParams] = js.native
  /**When the getHtml function is called you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterHtmlOutput column definition option */
  var formatterHtmlOutput: js.UndefOr[Formatter | `false`] = js.native
  var formatterHtmlOutputParams: js.UndefOr[FormatterParams] = js.native
  /**  You can pass an optional additional parameter with the formatter, formatterParams that should contain an object with additional information for configuring the formatter.*/
  var formatterParams: js.UndefOr[FormatterParams] = js.native
  /**When printing you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterPrint column definition option. You can use the formatterPrintParams to pass in any additional params to the formatter */
  var formatterPrint: js.UndefOr[Formatter | `false`] = js.native
  var formatterPrintParams: js.UndefOr[FormatterParams] = js.native
  /** You can freeze the position of columns on the left and right of the table using the frozen property in the column definition array. This will keep the column still when the table is scrolled horizontally. */
  var frozen: js.UndefOr[Boolean] = js.native
  /**   callback for when user clicks on the header for this column*/
  var headerClick: js.UndefOr[ColumnEventCallback] = js.native
  /** callback for when user right clicks on the header for this column  */
  var headerContext: js.UndefOr[ColumnEventCallback] = js.native
  /**You can add a right click context menu to any column by passing an array of menu items to the headerContextMenu option in that columns definition. */
  var headerContextMenu: js.UndefOr[js.Array[MenuObject | MenuSeparator]] = js.native
  /**  callback for when user double clicks on the header for this column */
  var headerDblClick: js.UndefOr[ColumnEventCallback] = js.native
  /** callback for when user double taps on a header for this column, triggered in touch displays when a user taps the same header twice in under 300ms */
  var headerDblTap: js.UndefOr[ColumnEventCallback] = js.native
  /**  filtering of columns from elements in the header */
  var headerFilter: js.UndefOr[Editor] = js.native
  /**  function to check when the header filter is empty */
  var headerFilterEmptyCheck: js.UndefOr[ValueBooleanCallback] = js.native
  /**  By default Tabulator will try and match the comparison type to the type of element used for the header filter.
    Standard input elements will use the "like" filter, this allows for the matches to be displayed as the user types.
    For all other element types (select boxes, check boxes, input elements of type number) an "=" filter type is used.
    If you want to specify the type of filter used you can pass it to the headerFilterFunc option in the column definition object. This will take any of the standard filters outlined above or a custom function*/
  var headerFilterFunc: js.UndefOr[
    FilterType | (js.Function4[
      /* headerValue */ js.Any, 
      /* rowValue */ js.Any, 
      /* rowdata */ js.Any, 
      /* filterparams */ js.Any, 
      Boolean
    ])
  ] = js.native
  /**  additional parameters object passed to the headerFilterFunc function  */
  var headerFilterFuncParams: js.UndefOr[js.Any] = js.native
  /** disable live filtering of the table  */
  var headerFilterLiveFilter: js.UndefOr[Boolean] = js.native
  /** additional parameters you can pass to the header filter */
  var headerFilterParams: js.UndefOr[EditorParams] = js.native
  /**  placeholder text for the header filter */
  var headerFilterPlaceholder: js.UndefOr[String] = js.native
  /**You can add a menu to any column by passing an array of menu items to the headerMenu option in that columns definition. */
  var headerMenu: js.UndefOr[js.Array[MenuObject | MenuSeparator]] = js.native
  // Column Header
  /** By default all columns in a table are sortable by clicking on the column header, if you want to disable this behaviour, set the headerSort property to false in the column definition array: */
  var headerSort: js.UndefOr[Boolean] = js.native
  /** set the starting sort direction when a user first clicks on a header */
  var headerSortStartingDir: js.UndefOr[SortDirection] = js.native
  /** allow tristate toggling of column header sort direction */
  var headerSortTristate: js.UndefOr[Boolean] = js.native
  /**  callback for when user taps on a header for this column, triggered in touch displays. */
  var headerTap: js.UndefOr[ColumnEventCallback] = js.native
  /** callback for when user taps and holds on a header for this column, triggered in touch displays when a user taps and holds the same header for 1 second. */
  var headerTapHold: js.UndefOr[ColumnEventCallback] = js.native
  /** sets the on hover tooltip for the column header* * The tooltip headerTooltip can take three different types of value
    boolean - a value of false disables the tooltip, a value of true sets the tooltip of the column header to its title value.
    string - a string that will be displayed for the tooltip.
    function - a callback function that returns the string for the column header*
    */
  var headerTooltip: js.UndefOr[Boolean | String | (js.Function1[/* column */ ColumnComponent, String])] = js.native
  /** change the orientation of the column header to vertical* * The headerVertical property can take one of three values:
    false - vertical columns disabled (default value)
    true - vertical columns enabled
    "flip" - vertical columns enabled, with text direction flipped by 180 degrees*
    */
  var headerVertical: js.UndefOr[Boolean | flip] = js.native
  /** When the getHtml function is called, hide the column from the output. */
  var hideInHtml: js.UndefOr[Boolean] = js.native
  /**If you want to set the horizontal alignment on a column by column basis, */
  var hozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
  /** Show/Hide a particular column in the HTML output*/
  var htmlOutput: js.UndefOr[Boolean] = js.native
  /** sets the minimum width of this column, this should be set in pixels (this takes priority over the global option of columnMinWidth) */
  var minWidth: js.UndefOr[Double] = js.native
  /** Mutators are used to alter data as it is parsed into Tabulator. For example if you wanted to convert a numeric column into a boolean based on its value, before the data is used to build the table.
    You can set mutators on a per column basis using the mutator option in the column definition object.
    You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator. */
  var mutator: js.UndefOr[CustomMutator] = js.native
  /** only called when data is changed via a user editing a cell. */
  var mutatorClipboard: js.UndefOr[CustomMutator] = js.native
  var mutatorClipboardParams: js.UndefOr[CustomMutatorParams] = js.native
  /**  only called when data is loaded via a command {eg. setData). */
  var mutatorData: js.UndefOr[CustomMutator] = js.native
  var mutatorDataParams: js.UndefOr[CustomMutatorParams] = js.native
  /** only called when data is changed via a user editing a cell. */
  var mutatorEdit: js.UndefOr[CustomMutator] = js.native
  var mutatorEditParams: js.UndefOr[CustomMutatorParams] = js.native
  /** You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator. */
  var mutatorParams: js.UndefOr[CustomMutatorParams] = js.native
  /** set whether column can be resized by user dragging its edges */
  var resizable: js.UndefOr[Boolean] = js.native
  /** an integer to determine when the column should be hidden in responsive mode */
  var responsive: js.UndefOr[Double] = js.native
  /** sets the column as a row handle, allowing it to be used to drag movable rows. */
  var rowHandle: js.UndefOr[Boolean] = js.native
  // Data Manipulation
  /**  By default Tabulator will attempt to guess which sorter should be applied to a column based on the data contained in the first row. It can determine sorters for strings, numbers, alphanumeric sequences and booleans, anything else will be treated as a string.
  To specify a sorter to be used on a column use the sorter property in the columns definition object
  You can pass an optional additional property with sorter, sorterParams that should contain an object with additional information for configuring the sorter*/
  var sorter: js.UndefOr[
    string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* aRow */ RowComponent, 
      /* bRow */ RowComponent, 
      /* column */ ColumnComponent, 
      /* dir */ SortDirection, 
      /* sorterParams */ js.Object, 
      Double
    ])
  ] = js.native
  /** If you want to dynamically generate the sorterParams at the time the sort is called you can pass a function into the property that should return the params object. */
  var sorterParams: js.UndefOr[ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction] = js.native
  /**  formatter function for header title */
  var titleFormatter: js.UndefOr[Formatter] = js.native
  /** additional parameters you can pass to the header title formatter */
  var titleFormatterParams: js.UndefOr[FormatterParams] = js.native
  /** sets the on hover tooltip for each cell in this column * * The tooltip parameter can take three different types of value
    boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
    string - a string that will be displayed for all cells in the matching column/table.
    function - a callback function that returns the string for the cell
    * Note: setting a tooltip value on a column will override the global setting.
    */
  var tooltip: js.UndefOr[String | GlobalTooltipOption] = js.native
  /**  the column calculation to be displayed at the top of this column(see Column Calculations for more details) */
  var topCalc: js.UndefOr[ColumnCalc] = js.native
  /** formatter for the topCalc calculation cell  */
  var topCalcFormatter: js.UndefOr[Formatter] = js.native
  /**  additional parameters you can pass to the topCalcFormatter function */
  var topCalcFormatterParams: js.UndefOr[FormatterParams] = js.native
  /** additional parameters you can pass to the topCalc calculation function (see Column Calculations for more details) */
  var topCalcParams: js.UndefOr[ColumnCalcParams] = js.native
  /** Validators are used to ensure that any user input into your editable cells matches your requirements.
    Validators can be applied by using the validator property in a columns definition object (see Define Columns for more details). */
  var validator: js.UndefOr[
    StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator
  ] = js.native
  /** alter the row height to fit the contents of the cell instead of hiding overflow */
  var variableHeight: js.UndefOr[Boolean] = js.native
  /**If you want to set the vertical alignment on a column by column basis */
  var vertAlign: js.UndefOr[VerticalAlign] = js.native
  /** The widthGrow property should be used on columns without a width property set. The value is used to work out what fraction of the available will be allocated to the column. The value should be set to a number greater than 0, by default any columns with no width set have a widthGrow value of 1 */
  var widthGrow: js.UndefOr[Double] = js.native
  /** The widthShrink property should be used on columns with a width property set. The value is used to work out how to shrink columns with a fixed width when the table is too narrow to fit in all the columns. The value should be set to a number greater than 0, by default columns with a width set have a widthShrink value of 0, meaning they will not be shrunk if the table gets too narrow, and may cause the horizontal scrollbar to appear. */
  var widthShrink: js.UndefOr[Double] = js.native
}

object ColumnDefinition {
  @scala.inline
  def apply(title: String): ColumnDefinition = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
  @scala.inline
  implicit class ColumnDefinitionOps[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessor(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAccessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorClipboard(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorClipboard")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAccessorClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorClipboardParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorClipboardParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAccessorClipboardParams(value: CustomAccessorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorClipboardParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorClipboardParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorClipboardParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorDownload(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorDownload")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAccessorDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorDownloadParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorDownloadParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAccessorDownloadParams(value: CustomAccessorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorDownloadParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorDownloadParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorDownloadParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorHtmlOutput(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorHtmlOutput")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAccessorHtmlOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorHtmlOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorHtmlOutputParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorHtmlOutputParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAccessorHtmlOutputParams(value: CustomAccessorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorHtmlOutputParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorHtmlOutputParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorHtmlOutputParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAccessorParams(value: CustomAccessorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorPrint(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorPrint")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAccessorPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessorPrintParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorPrintParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAccessorPrintParams(value: CustomAccessorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorPrintParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorPrintParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorPrintParams")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomCalcFunction3(
      value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalc")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBottomCalc(value: ColumnCalc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomCalc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalc")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcFormatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBottomCalcFormatter(value: Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomCalcFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcFormatterParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBottomCalcFormatterParams(value: FormatterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcFormatterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomCalcFormatterParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcFormatterParams")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcParams")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBottomCalcParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCalcParams")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(js.undefined)
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
    def withContextMenu(value: js.Array[MenuObject | MenuSeparator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableFunction1(value: /* cell */ CellComponent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEditable(value: Boolean | (js.Function1[/* cell */ CellComponent, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditableTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withEditor(value: Editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEditorParams(value: EditorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatter(value: Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterClipboardFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClipboard")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatterClipboard(value: Formatter | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterClipboardParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClipboardParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatterClipboardParams(value: FormatterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClipboardParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterClipboardParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterClipboardParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterHtmlOutputFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterHtmlOutput")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatterHtmlOutput(value: Formatter | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterHtmlOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterHtmlOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterHtmlOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterHtmlOutputParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterHtmlOutputParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatterHtmlOutputParams(value: FormatterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterHtmlOutputParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterHtmlOutputParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterHtmlOutputParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatterParams(value: FormatterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterPrintFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterPrint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatterPrint(value: Formatter | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterPrintParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterPrintParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatterPrintParams(value: FormatterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterPrintParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterPrintParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterPrintParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClick(value: (/* e */ js.Any, /* column */ ColumnComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderContext(value: (/* e */ js.Any, /* column */ ColumnComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContext")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderContextMenu(value: js.Array[MenuObject | MenuSeparator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderDblClick(value: (/* e */ js.Any, /* column */ ColumnComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerDblClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderDblTap(value: (/* e */ js.Any, /* column */ ColumnComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerDblTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderDblTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerDblTap")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withHeaderFilter(value: Editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterEmptyCheck(value: /* value */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterEmptyCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderFilterEmptyCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterEmptyCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterFuncFunction4(
      value: (/* headerValue */ js.Any, /* rowValue */ js.Any, /* rowdata */ js.Any, /* filterparams */ js.Any) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterFunc")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHeaderFilterFunc(
      value: FilterType | (js.Function4[
          /* headerValue */ js.Any, 
          /* rowValue */ js.Any, 
          /* rowdata */ js.Any, 
          /* filterparams */ js.Any, 
          Boolean
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilterFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterFuncParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterFuncParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilterFuncParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterFuncParams")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterLiveFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterLiveFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilterLiveFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterLiveFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderFilterParams(value: EditorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilterParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterParams")(js.undefined)
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
    def withHeaderMenu(value: js.Array[MenuObject | MenuSeparator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMenu")(js.undefined)
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
    def withHeaderSortStartingDir(value: SortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSortStartingDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderSortStartingDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSortStartingDir")(js.undefined)
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
    def withHeaderTap(value: (/* e */ js.Any, /* column */ ColumnComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTap")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTapHold(value: (/* e */ js.Any, /* column */ ColumnComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTapHold")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderTapHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTapHold")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTooltipFunction1(value: /* column */ ColumnComponent => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderTooltip(value: Boolean | String | (js.Function1[/* column */ ColumnComponent, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderVertical(value: Boolean | flip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withHideInHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideInHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideInHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideInHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withHozAlign(value: ColumnDefinitionAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hozAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHozAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hozAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMutator(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutator")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutMutator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutator")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatorClipboard(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorClipboard")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutMutatorClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatorClipboardParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorClipboardParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMutatorClipboardParams(value: CustomMutatorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorClipboardParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutatorClipboardParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorClipboardParams")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatorData(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorData")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutMutatorData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorData")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatorDataParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorDataParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMutatorDataParams(value: CustomMutatorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorDataParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutatorDataParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorDataParams")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatorEdit(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorEdit")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutMutatorEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatorEditParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorEditParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMutatorEditParams(value: CustomMutatorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorEditParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutatorEditParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorEditParams")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatorParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorParams")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMutatorParams(value: CustomMutatorParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutatorParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorParams")(js.undefined)
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
    def withResponsive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withSorterFunction7(
      value: (/* a */ js.Any, /* b */ js.Any, /* aRow */ RowComponent, /* bRow */ RowComponent, /* column */ ColumnComponent, /* dir */ SortDirection, /* sorterParams */ js.Object) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withSorter(
      value: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
          /* a */ js.Any, 
          /* b */ js.Any, 
          /* aRow */ RowComponent, 
          /* bRow */ RowComponent, 
          /* column */ ColumnComponent, 
          /* dir */ SortDirection, 
          /* sorterParams */ js.Object, 
          Double
        ])
    ): Self = {
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
    def withSorterParamsFunction2(value: (/* column */ ColumnComponent, /* dir */ SortDirection) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorterParams")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSorterParams(value: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorterParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorterParams")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTitleFormatter(value: Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatterParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitleFormatterParams(value: FormatterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFormatterParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatterParams")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipFunction1(value: /* cell */ CellComponent => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltip(value: String | GlobalTooltipOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTopCalcFunction3(
      value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalc")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTopCalc(value: ColumnCalc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopCalc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalc")(js.undefined)
        ret
    }
    @scala.inline
    def withTopCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcFormatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTopCalcFormatter(value: Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopCalcFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTopCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcFormatterParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTopCalcFormatterParams(value: FormatterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcFormatterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopCalcFormatterParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcFormatterParams")(js.undefined)
        ret
    }
    @scala.inline
    def withTopCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcParams")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTopCalcParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCalcParams")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(value: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVertAlign(value: VerticalAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthGrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthGrow")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthShrink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthShrink")(js.undefined)
        ret
    }
  }
  
}

