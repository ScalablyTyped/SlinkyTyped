package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions[T /* <: SlickData */] extends js.Object {
  var addNewRowCssClass: js.UndefOr[String] = js.native
  var alwaysAllowHorizontalScroll: js.UndefOr[Boolean] = js.native
  var alwaysShowVerticalScroll: js.UndefOr[Boolean] = js.native
  /**
  		* Delay after which cell editor is loaded. Ignored unless asyncEditorLoading is true.
  		**/
  var asyncEditorLoadDelay: js.UndefOr[Double] = js.native
  /**
  		* Makes cell editors load asynchronously after a small delay. This greatly increases keyboard navigation speed.
  		**/
  var asyncEditorLoading: js.UndefOr[Boolean] = js.native
  var asyncPostRenderCleanupDelay: js.UndefOr[Double] = js.native
  /**
  		*
  		**/
  var asyncPostRenderDelay: js.UndefOr[Double] = js.native
  /**
  		* Cell will not automatically go into edit mode when selected.
  		**/
  var autoEdit: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
  		* A CSS class to apply to flashing cells via flashCell().
  		**/
  var cellFlashingCssClass: js.UndefOr[String] = js.native
  /**
  		* A CSS class to apply to cells highlighted via setHighlightedCells().
  		**/
  var cellHighlightCssClass: js.UndefOr[String] = js.native
  var createFooterRow: js.UndefOr[Boolean] = js.native
  var createPreHeaderPanel: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var dataItemColumnValueExtractor: js.UndefOr[js.Function2[/* item */ js.Any, /* columnDef */ js.Any, _]] = js.native
  /**
  		*
  		**/
  var defaultColumnWidth: js.UndefOr[Double] = js.native
  /**
  		*
  		**/
  var defaultFormatter: js.UndefOr[Formatter[T]] = js.native
  var doPaging: js.UndefOr[Boolean] = js.native
  /**
  		* Not listed as a default under options in slick.grid.js
  		**/
  var editCommandHandler: js.UndefOr[js.Any] = js.native
  /**
  		*
  		**/
  var editable: js.UndefOr[Boolean] = js.native
  var editorCellNavOnLRKeys: js.UndefOr[Boolean] = js.native
   // queueAndExecuteCommand
  /**
  		* A factory object responsible to creating an editor for a given cell. Must implement getEditor(column).
  		**/
  var editorFactory: js.UndefOr[EditorFactory] = js.native
  /**
  		* A Slick.EditorLock instance to use for controlling concurrent data edits.
  		**/
  var editorLock: js.UndefOr[EditorLock[T]] = js.native
  var emulatePagingWhenScrolling: js.UndefOr[Boolean] = js.native
  /**
  		* If true, a blank row will be displayed at the bottom - typing values in that row will add a new one. Must subscribe to onAddNewRow to save values.
  		**/
  var enableAddRow: js.UndefOr[Boolean] = js.native
  /**
  		* If true, async post rendering will occur and asyncPostRender delegates on columns will be called.
  		**/
  var enableAsyncPostRender: js.UndefOr[Boolean] = js.native
  var enableAsyncPostRenderCleanup: js.UndefOr[Boolean] = js.native
  /**
  		* Appears to enable cell virtualisation for optimised speed with large datasets
  		**/
  var enableCellNavigation: js.UndefOr[Boolean] = js.native
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableCellRangeSelection: js.UndefOr[js.Any] = js.native
  /**
  		*
  		**/
  var enableColumnReorder: js.UndefOr[Boolean] = js.native
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableRowReordering: js.UndefOr[js.Any] = js.native
  /**
  		*
  		**/
  var enableTextSelectionOnCells: js.UndefOr[Boolean] = js.native
  /**
  		* @see Example: Explicit Initialization
  		**/
  var explicitInitialization: js.UndefOr[Boolean] = js.native
  var footerRowHeight: js.UndefOr[Double] = js.native
  /**
  		* Force column sizes to fit into the container (preventing horizontal scrolling). Effectively sets column width to be 1/Number of Columns which on small containers may not be desirable
  		**/
  var forceFitColumns: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var forceSyncScrolling: js.UndefOr[Boolean] = js.native
  /**
  		* A factory object responsible to creating a formatter for a given cell. Must implement getFormatter(column).
  		**/
  var formatterFactory: js.UndefOr[FormatterFactory[T]] = js.native
  var frozenBottom: js.UndefOr[Boolean] = js.native
  var frozenColumn: js.UndefOr[Double] = js.native
  var frozenRow: js.UndefOr[Double] = js.native
  /**
  		* Will expand the table row divs to the full width of the container, table cell divs will remain aligned to the left
  		**/
  var fullWidthRows: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var headerRowHeight: js.UndefOr[Double] = js.native
  /**
  		*
  		**/
  var leaveSpaceForNewRows: js.UndefOr[Boolean] = js.native
  var minRowBuffer: js.UndefOr[Double] = js.native
  /**
  		* @see Example: Multi-Column Sort
  		**/
  var multiColumnSort: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var multiSelect: js.UndefOr[Boolean] = js.native
  var numberedMultiColumnSort: js.UndefOr[Boolean] = js.native
  var preHeaderPanelHeight: js.UndefOr[Double] = js.native
  var preserveCopiedSelectionOnPaste: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var rowHeight: js.UndefOr[Double] = js.native
  /**
  		*
  		**/
  var selectedCellCssClass: js.UndefOr[String] = js.native
  var showCellSelection: js.UndefOr[Boolean] = js.native
  var showFooterRow: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var showHeaderRow: js.UndefOr[Boolean] = js.native
  var showPreHeaderPanel: js.UndefOr[Boolean] = js.native
  var showTopPanel: js.UndefOr[Boolean] = js.native
  var sortColNumberInSeparateSpan: js.UndefOr[Boolean] = js.native
  var suppressActiveCellChangeOnEdit: js.UndefOr[Boolean] = js.native
  /**
  		* If true, the column being resized will change its width as the mouse is dragging the resize handle. If false, the column will resize after mouse drag ends.
  		**/
  var syncColumnCellResize: js.UndefOr[Boolean] = js.native
  /**
  		*
  		**/
  var topPanelHeight: js.UndefOr[Double] = js.native
  var tristateMultiColumnSort: js.UndefOr[Boolean] = js.native
  var viewportClass: js.UndefOr[String] = js.native
}

object GridOptions {
  @scala.inline
  def apply[T](): GridOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions[T]]
  }
  @scala.inline
  implicit class GridOptionsOps[Self[t] <: GridOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddNewRowCssClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNewRowCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddNewRowCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNewRowCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysAllowHorizontalScroll(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAllowHorizontalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysAllowHorizontalScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAllowHorizontalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysShowVerticalScroll(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowVerticalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowVerticalScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowVerticalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncEditorLoadDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncEditorLoadDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncEditorLoadDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncEditorLoadDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncEditorLoading(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncEditorLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncEditorLoading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncEditorLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncPostRenderCleanupDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPostRenderCleanupDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncPostRenderCleanupDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPostRenderCleanupDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncPostRenderDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPostRenderDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncPostRenderDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPostRenderDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoEdit(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEdit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellFlashingCssClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFlashingCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellFlashingCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFlashingCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHighlightCssClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHighlightCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHighlightCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHighlightCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFooterRow(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFooterRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFooterRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFooterRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatePreHeaderPanel(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPreHeaderPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatePreHeaderPanel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPreHeaderPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withDataItemColumnValueExtractor(value: (/* item */ js.Any, /* columnDef */ js.Any) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataItemColumnValueExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataItemColumnValueExtractor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataItemColumnValueExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColumnWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutDefaultFormatter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withDoPaging(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoPaging: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withEditCommandHandler(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCommandHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditCommandHandler: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCommandHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorCellNavOnLRKeys(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorCellNavOnLRKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorCellNavOnLRKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorCellNavOnLRKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorFactory(value: EditorFactory): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorFactory: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorLock(value: EditorLock[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorLock: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorLock")(js.undefined)
        ret
    }
    @scala.inline
    def withEmulatePagingWhenScrolling(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulatePagingWhenScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmulatePagingWhenScrolling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulatePagingWhenScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAddRow(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAddRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAddRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAddRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAsyncPostRender(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsyncPostRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAsyncPostRender: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsyncPostRender")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAsyncPostRenderCleanup(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsyncPostRenderCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAsyncPostRenderCleanup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsyncPostRenderCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellNavigation(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellNavigation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellRangeSelection(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellRangeSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellRangeSelection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellRangeSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnReorder(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnReorder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowReordering(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowReordering: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTextSelectionOnCells(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextSelectionOnCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTextSelectionOnCells: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextSelectionOnCells")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitInitialization(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitInitialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitInitialization: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitInitialization")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRowHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterRowHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFitColumns(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFitColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFitColumns: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFitColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSyncScrolling(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSyncScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSyncScrolling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSyncScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterFactory(value: FormatterFactory[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterFactory: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenBottom(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenBottom: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenColumn(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenColumn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenRow(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenRow")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidthRows(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidthRows: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidthRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveSpaceForNewRows(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveSpaceForNewRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaveSpaceForNewRows: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveSpaceForNewRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRowBuffer(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRowBuffer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiColumnSort(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiColumnSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberedMultiColumnSort(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberedMultiColumnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberedMultiColumnSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberedMultiColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withPreHeaderPanelHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preHeaderPanelHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreHeaderPanelHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preHeaderPanelHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveCopiedSelectionOnPaste(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveCopiedSelectionOnPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveCopiedSelectionOnPaste: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveCopiedSelectionOnPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedCellCssClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCellCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCellSelection(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCellSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCellSelection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCellSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooterRow(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooterRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooterRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooterRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaderRow(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaderRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreHeaderPanel(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreHeaderPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreHeaderPanel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreHeaderPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTopPanel(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTopPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTopPanel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTopPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColNumberInSeparateSpan(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColNumberInSeparateSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColNumberInSeparateSpan: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColNumberInSeparateSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressActiveCellChangeOnEdit(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressActiveCellChangeOnEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressActiveCellChangeOnEdit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressActiveCellChangeOnEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncColumnCellResize(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncColumnCellResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncColumnCellResize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncColumnCellResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTopPanelHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topPanelHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopPanelHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topPanelHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTristateMultiColumnSort(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tristateMultiColumnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTristateMultiColumnSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tristateMultiColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportClass")(js.undefined)
        ret
    }
  }
  
}

