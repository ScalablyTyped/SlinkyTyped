package typingsSlinky.uiGrid.mod

import typingsSlinky.angular.mod.IAngularEvent
import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridInstanceOf[TEntity] extends StObject {
  
  /**
    * adds a row header column to the grid
    * @param {IColumnDef} colDef The column definition
    * @param {number} order Number that indicates where the column should be placed in the grid.
    * @param {boolean} stopColumnBuild Prevents the buildColumn callback from being triggered. This is useful to improve performance of the grid during initial load.
    */
  def addRowHeaderColumn(colDef: IColumnDefOf[TEntity]): Unit = js.native
  def addRowHeaderColumn(colDef: IColumnDefOf[TEntity], order: js.UndefOr[scala.Nothing], stopColumnBuild: Boolean): Unit = js.native
  def addRowHeaderColumn(colDef: IColumnDefOf[TEntity], order: Double): Unit = js.native
  def addRowHeaderColumn(colDef: IColumnDefOf[TEntity], order: Double, stopColumnBuild: Boolean): Unit = js.native
  
  /**
    * reference to the application scope (the parent scope of the ui-grid element). Assigned in ui-grid controller
    * use gridOptions.appScopeProvider to override the default assignment of $scope.$parent with any reference
    */
  var appScope: js.UndefOr[IScope] = js.native
  
  /**
    * uses the first row of data to assign colDef.type for any types not defined.
    */
  def assignTypes(): Unit = js.native
  
  /**
    * Populates columnDefs from the provided data
    * @param {IRowBuilder} rowBuilder function to be called
    */
  def buildColumnDefsFromData(rowBuilder: IRowBuilder[TEntity]): Unit = js.native
  
  /**
    * creates GridColumn objects from the columnDefinition.
    * Calls each registered columnBuilder to further process the column
    * @param {IBuildColumnsOptions} options An object containing options to use when building columns
    *        * orderByColumnDefs: defaults to false.  When true, buildColumns will order existing columns
    *        according to the order within the column definitions
    * @returns {ng.IPromise} A promise to load any needed column resources
    */
  def buildColumns(options: IBuildColumnsOptions): IPromise[_] = js.native
  
  /**
    * calls each styleComputation function
    */
  def buildStyles(): Unit = js.native
  
  /**
    * Calls the callbacks based on the type of data change that has occurred.
    * Always calls the ALL callbacks, calls the ROW, EDIT, COLUMN and OPTIONS callbacks
    * if the event type is matching, or if the type is ALL.
    * @param {number} type the type of event that occurred - one of the uiGridConstants.dataChange values
    *        (ALL, ROW, EDIT, COLUMN, OPTIONS
    */
  def callDataChangeCallbacks(`type`: Double): Unit = js.native
  
  /**
    * Clears all filters and optionally refreshes the visible rows.
    * @param {boolean} [refreshRows=true] Refresh the rows?
    * @param {boolean} [clearConditions=true] Clear conditions?
    * @param {boolean} [clearFlags=true] Clear flags?
    * @returns {ng.IPromise<any>} If refreshRows is true, returns a promise of the rows refreshing
    */
  def clearAllFilters(refreshRows: Boolean, clearConditions: Boolean, clearFlags: Boolean): IPromise[_] = js.native
  
  /**
    * returns the total column footer height
    */
  var columnFooterHeight: js.UndefOr[Double] = js.native
  
  /**
    * refreshes the grid when a column refresh is notified, which triggers handling of the visible flag.
    * This is called on uiGridConstants.dataChange.COLUMN, and is registered as a dataChangeCallback in grid.js
    * @param {string} name column name
    */
  def columnRefreshCallback(name: String): Unit = js.native
  
  /**
    * returns an array of columns in the grid
    */
  var columns: js.Array[IGridColumn] = js.native
  
  /**
    * creates the left render container if it doesn't already exist
    */
  def createLeftContainer(): Unit = js.native
  
  /**
    * creates the right render container if it doesn't already exist
    */
  def createRightContainer(): Unit = js.native
  
  /**
    * sets isScrollingHorizontally to true and sets it to false in a debounced function
    */
  def flagScrollingHorizontally(): Unit = js.native
  
  /**
    * sets isScrollingVertically to true and sets it to false in a debounced function
    */
  def flagScrollingVertically(): Unit = js.native
  
  /**
    * returns the total footer height gridFooter + columnFooter
    */
  var footerHeight: js.UndefOr[Double] = js.native
  
  /**
    * Gets the displayed value of a cell after applying any the cellFilter
    * @param {IGridRow} row Row to access
    * @param {IGridColumn} col Column to access
    * @returns {string} Cell display value
    */
  def getCellDisplayValue(row: IGridRowOf[TEntity], col: IGridColumnOf[TEntity]): String = js.native
  
  /**
    * Gets the displayed value of a cell
    * @param {IGridRow} row Row to access
    * @param {IGridColumn} col Column to access
    * @returns {any} Cell value
    */
  def getCellValue(row: IGridRowOf[TEntity], col: IGridColumnOf[TEntity]): js.Any = js.native
  
  /**
    * returns a grid colDef for the column name
    * @param {string} name Column name
    * @returns {IColumnDef} The column definition
    */
  def getColDef(name: String): IColumnDefOf[TEntity] = js.native
  
  /**
    * returns a grid column by name
    * @param {string} name Column name
    * @returns {IGridColumn} The column
    */
  def getColumn(name: String): IGridColumnOf[TEntity] = js.native
  
  /**
    * Return the columns that the grid is currently being sorted by
    * @returns {Array<IGridColumn>} the columns that the grid is currently being sorted by
    */
  def getColumnSorting(): js.Array[IGridColumnOf[TEntity]] = js.native
  
  /**
    * Returns the $parse-able accessor for a column within its $scope
    * @param {IGridColumn} col Column object
    * @returns {string} $parse-able accessor for a column within its $scope
    */
  def getGridQualifiedColField(col: IGridColumnOf[TEntity]): String = js.native
  
  /**
    * returns all columns except for rowHeader columns
    * @returns {Array<IGridColumn>} All data columns
    */
  def getOnlyDataColumns(): js.Array[IGridColumnOf[TEntity]] = js.native
  
  /**
    * returns the GridRow that contains the rowEntity
    * @param {TEntity} rowEntity the gridOptionms.data array element instance
    * @param {Array<IGridRow>} rows The rows to look in.  if not provided then it looks in grid.rows
    */
  def getRow(rowEntity: TEntity): IGridRowOf[TEntity] = js.native
  def getRow(rowEntity: TEntity, rows: js.Array[IGridRowOf[TEntity]]): IGridRowOf[TEntity] = js.native
  
  /**
    * returns or sets grid height in pixels
    */
  var gridHeight: js.UndefOr[Double] = js.native
  
  /**
    * Triggered when the browser window resizes; automatically resizes the grid
    * @param {ng.IAngularEvent} $event Resize event
    */
  def handleWindowResize($event: IAngularEvent): Unit = js.native
  
  /**
    * returns true if leftContainer exists
    * @returns {boolean} container exists?
    */
  def hasLeftContainer(): Boolean = js.native
  
  /**
    * returns true if leftContainer has columns
    * @returns {boolean} container has columns
    */
  def hasLeftContainerColumns(): Boolean = js.native
  
  /**
    * returns true if rightContainer exists
    * @returns {boolean} container exists?
    */
  def hasRightContainer(): Boolean = js.native
  
  /**
    * returns true if rightContainer has columns
    * @returns {boolean} container has columns
    */
  def hasRightContainerColumns(): Boolean = js.native
  
  var id: Double = js.native
  
  /**
    * Is grid right to left
    * @returns {boolean} true if grid is RTL
    */
  def isRTL(): Boolean = js.native
  
  /**
    * Checks if column is a row header
    * @param {IGridColumn} column The column
    * @returns {boolean} true if the column is a row header
    */
  def isRowHeaderColumn(column: IGridColumnOf[TEntity]): Boolean = js.native
  
  /**
    * set to true when Grid is scrolling horizontally. Set to false via debounced method
    */
  var isScrollingHorizontally: js.UndefOr[Boolean] = js.native
  
  /**
    * set to true when Grid is scrolling vertically. Set to false via debounced method
    */
  var isScrollingVertically: js.UndefOr[Boolean] = js.native
  
  /**
    * creates or removes GridRow objects from the newRawData array.  Calls each registered
    * rowBuilder to further process the row
    *
    * This method aims to achieve three things:
    * 1. the resulting rows array is in the same order as the newRawData, we'll call
    * rowsProcessors immediately after to sort the data anyway
    * 2. if we have row hashing available, we try to use the rowHash to find the row
    * 3. no memory leaks - rows that are no longer in newRawData need to be garbage collected
    *
    * The basic logic flow makes use of the newRawData, oldRows and oldHash, and creates
    * the newRows and newHash
    *
    * Rows are identified using the hashKey if configured.  If not configured, then rows
    * are identified using the gridOptions.rowEquality function
    * @param {Array<TEntity>} newRawData The new grid data
    * @return {ng.IPromise<any>} Promise which resolves when the rows have been created or removed
    */
  def modifyRows(newRawData: js.Array[TEntity]): IPromise[_] = js.native
  
  /**
    * Notify the grid that a data or config change has occurred,
    * where that change isn't something the grid was otherwise noticing.  This
    * might be particularly relevant where you've changed values within the data
    * and you'd like cell classes to be re-evaluated, or changed config within
    * the columnDef and you'd like headerCellClasses to be re-evaluated.
    * @param {string} type one of the uiGridConstants.dataChange values [ALL, ROW, EDIT, COLUMN], which tells
    * us which refreshes to fire
    */
  def notifyDataChange(`type`: String): Unit = js.native
  
  /**
    * precompiles all cell templates
    */
  def precompileCellTemplates(): Unit = js.native
  
  /**
    * processes all RowBuilders for the gridRow
    * @param {IGridRow} gridRow reference to gridRow
    * @returns {IGridRow} the gridRow with all additional behavior added
    */
  def processRowBuilders(gridRow: IGridRowOf[TEntity]): IGridRowOf[TEntity] = js.native
  
  /**
    * calls the row processors, specifically
    * intended to reset the sorting when an edit is called,
    * registered as a dataChangeCallback on uiGridConstants.dataChange.EDIT
    * @param {string} name column name
    */
  def processRowsCallback(name: String): Unit = js.native
  
  /**
    * queues a grid refresh, a way of debouncing all the refreshes we might otherwise issue
    */
  def queueGridRefresh(): Unit = js.native
  
  /**
    * queues a grid refreshCanvas, a way of debouncing all the refreshes we might otherwise issue
    */
  def queueRefresh(): Unit = js.native
  
  /**
    * Redraw the rows and columns based on our current scroll position
    * @param {boolean} [rowsAdded] Optional to indicate rows are added and the scroll percentage must be
    *        recalculated
    */
  def redrawCanvas(): Unit = js.native
  def redrawCanvas(rowsAdded: Boolean): Unit = js.native
  
  /**
    * Refresh the rendered grid on screen.
    * The refresh method re-runs both the columnProcessors and the
    * rowProcessors, as well as calling refreshCanvas to update all
    * the grid sizing.  In general you should prefer to use queueGridRefresh
    * instead, which is basically a debounced version of refresh.
    *
    * If you only want to resize the grid, not regenerate all the rows
    * and columns, you should consider directly calling refreshCanvas instead.
    * @param {boolean} rowsAltered Optional flag for refreshing when the number of rows has changed
    */
  def refresh(): Unit = js.native
  def refresh(rowsAltered: Boolean): Unit = js.native
  
  /**
    * Builds all styles and recalculates much of the grid sizing
    * @param {boolean} buildStyles optional parameter.  Use TBD
    * @returns {ng.IPromise<any>} promise that is resolved when the canvas
    *          has been refreshed
    */
  def refreshCanvas(): IPromise[_] = js.native
  def refreshCanvas(buildStyles: Boolean): IPromise[_] = js.native
  
  /**
    * Refresh the rendered rows on screen?  Note: not functional at present
    * @returns {ng.IPromise<any>} promise that is resolved when render completes?
    */
  def refreshRows(): IPromise[_] = js.native
  
  /**
    * When the build creates columns from column definitions, the columnbuilders will be called to add
    * additional properties to the column.
    * @param {IColumnBuilder} columnBuilder function to be called
    */
  def registerColumnBuilder(columnBuilder: IColumnBuilder[TEntity]): Unit = js.native
  
  /**
    * Register a "columns processor" function. When the columns are updated,
    * the grid calls each registered "columns processor", which has a chance
    * to alter the set of columns, as long as the count is not modified.
    * @param {IColumnProcessor} columnProcessor column processor function, which
    *        is run in the context of the grid (i.e. this for the function will be the grid), and
    *        which must return an updated renderedColumnsToProcess which can be passed to the next processor
    *        in the chain
    * @param {number} priority the priority of this processor.  In general we try to do them in 100s to leave room
    * for other people to inject columns processors at intermediate priorities.
    * Lower priority columnsProcessors run earlier.priority
    */
  def registerColumnsProcessor(columnProcessor: IColumnProcessor[TEntity], priority: Double): Unit = js.native
  
  /**
    * When a data change occurs, the data change callbacks of the specified type
    * will be called.  The rules are:
    *
    * - when the data watch fires, that is considered a ROW change (the data watch only notices
    *   added or removed rows)
    * - when the api is called to inform us of a change, the declared type of that change is used
    * - when a cell edit completes, the EDIT callbacks are triggered
    * - when the columnDef watch fires, the COLUMN callbacks are triggered
    * - when the options watch fires, the OPTIONS callbacks are triggered
    *
    * For a given event:
    * - ALL calls ROW, EDIT, COLUMN, OPTIONS and ALL callbacks
    * - ROW calls ROW and ALL callbacks
    * - EDIT calls EDIT and ALL callbacks
    * - COLUMN calls COLUMN and ALL callbacks
    * - OPTIONS calls OPTIONS and ALL callbacks
    *
    * @param {(grid: IGridInstance) => void} callback function to be called
    * @param {Array<string>} types the types of data change you want to be informed of.  Values from
    * the uiGridConstants.dataChange values ( ALL, EDIT, ROW, COLUMN, OPTIONS ).  Optional and defaults to
    * ALL
    * @returns {Function} deregister function - a function that can be called to deregister this callback
    */
  def registerDataChangeCallback(callback: js.Function1[/* grid */ IGridInstanceOf[TEntity], Unit]): js.Function = js.native
  def registerDataChangeCallback(callback: js.Function1[/* grid */ IGridInstanceOf[TEntity], Unit], types: js.Array[String]): js.Function = js.native
  
  /**
    * When the build creates rows from gridOptions.data, the rowBuilders will be called to add
    * additional properties to the row.
    * @param {IRowBuilder} rowBuilder Function to be called
    */
  def registerRowBuilder(rowBuilder: IRowBuilder[TEntity]): Unit = js.native
  
  /**
    * Register a "rows processor" function. When the rows are updated,
    * the grid calls each registered "rows processor", which has a chance
    * to alter the set of rows (sorting, etc) as long as the count is not
    * modified.
    *
    * @param {IRowProcessor} rowProcessor rows processor function, which
    * is run in the context of the grid (i.e. this for the function will be the grid), and must
    * return the updated rows list, which is passed to the next processor in the chain
    * @param {number} priority the priority of this processor.
    *        In general we try to do them in 100s to leave room for other people to inject rows processors at
    *        intermediate priorities.  Lower priority rowsProcessors run earlier. At present all rows visible
    *        is running at 50, filter is running at 100, sort is at 200, grouping at 400, selectable rows at
    *        500, pagination at 900 (pagination will generally want to be last)
    */
  def registerRowsProcessor(rowProcessor: IRowProcessor[TEntity], priority: Double): Unit = js.native
  
  /**
    * registered a styleComputation function
    *
    * If the function returns a value it will be appended into the grid's `<style>` block
    * @param {IStyleComputation} styleComputation function
    */
  def registerStyleComputation(styleComputation: js.Function1[/* $scope */ IScope, String]): Unit = js.native
  
  /**
    * Remove a registered rows processor
    * @param {IRowProcessor} rows processor function
    */
  def removeRowsProcessor(rows: IRowProcessor[TEntity]): Unit = js.native
  
  /**
    * Return the columns that the grid is currently being sorted by
    * @param {IGridColumn} [excludedColumn] Optional GridColumn to exclude from having its sorting reset
    */
  def resetColumnSorting(excludedColumn: IGridColumnOf[TEntity]): Unit = js.native
  
  /**
    * set one of the uiGridConstants.scrollDirection values (UP, DOWN, LEFT, RIGHT, NONE),
    * which tells us which direction we are scrolling. Set to NONE via debounced method
    */
  var scrollDirection: js.UndefOr[Double] = js.native
  
  /**
    * Scroll the grid such that the specified
    * row and column is in view
    * @param {TEntity} rowEntity gridOptions.data[] array element to make visible
    * @param {IColumnDef} colDef to make visible
    * @returns {ng.IPromise<any>} a promise that is resolved after any scrolling is finished
    */
  def scrollTo(): IPromise[_] = js.native
  def scrollTo(rowEntity: TEntity): IPromise[_] = js.native
  def scrollTo(rowEntity: TEntity, colDef: IColumnDefOf[TEntity]): IPromise[_] = js.native
  def scrollTo(rowEntity: js.UndefOr[scala.Nothing], colDef: IColumnDefOf[TEntity]): IPromise[_] = js.native
  
  /**
    * Scrolls the grid to make a certain row and column combo visible,
    * in the case that it is not completely visible on the screen already.
    * @param {IGridRow} gridRow row to make visible
    * @param {IGridColumn} gridCol column to make visible
    * @returns {ng.IPromise<any>} a promise that is resolved when scrolling is complete
    */
  def scrollToIfNecessary(gridRow: IGridRowOf[TEntity], gridCol: IGridColumnOf[TEntity]): IPromise[_] = js.native
  
  /**
    * Set the sorting on a given column, optionally resetting any existing sorting on the Grid.
    * Emits the sortChanged event whenever the sort criteria are changed.
    * @param {IGridColumn} column Column to set the sorting on
    * @param {uiGridConstants.ASC|uiGridConstants.DESC} [direction] Direction to sort by,
    *        either descending or ascending.  If not provided, the column will iterate through the sort
    *        directions: ascending, descending, unsorted.
    * @param {boolean} [add] Add this column to the sorting. If not provided or set to `false`, the Grid will
    *        reset any existing sorting and sort by this column only
    * @returns {ng.IPromise<IGridColumn>} A resolved promise that supplies the column.
    */
  def sortColumn(column: IGridColumnOf[TEntity]): IPromise[IGridColumnOf[TEntity]] = js.native
  def sortColumn(column: IGridColumnOf[TEntity], direction: js.UndefOr[scala.Nothing], add: Boolean): IPromise[IGridColumnOf[TEntity]] = js.native
  def sortColumn(column: IGridColumnOf[TEntity], direction: String): IPromise[IGridColumnOf[TEntity]] = js.native
  def sortColumn(column: IGridColumnOf[TEntity], direction: String, add: Boolean): IPromise[IGridColumnOf[TEntity]] = js.native
  
  /**
    * flags all render containers to update their canvas height
    */
  def updateCanvasHeight(): Unit = js.native
  
  /**
    * recalculates the footer height,
    * registered as a dataChangeCallback on uiGridConstants.dataChange.OPTIONS
    * @param {string} name column name
    */
  def updateFooterHeightCallback(name: String): Unit = js.native
}
