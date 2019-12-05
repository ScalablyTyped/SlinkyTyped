package typingsSlinky.uiDashGrid.uiDashGridMod

import typingsSlinky.uiDashGrid.uiDashGridMod.cellNav.ICellNavApi
import typingsSlinky.uiDashGrid.uiDashGridMod.edit.IGridEditApi
import typingsSlinky.uiDashGrid.uiDashGridMod.expandable.IGridExpandableApi
import typingsSlinky.uiDashGrid.uiDashGridMod.exporter.IGridExporterApi
import typingsSlinky.uiDashGrid.uiDashGridMod.grouping.IGridGroupingApi
import typingsSlinky.uiDashGrid.uiDashGridMod.importer.IGridImporterApi
import typingsSlinky.uiDashGrid.uiDashGridMod.infiniteScroll.IGridInfiniteScrollApi
import typingsSlinky.uiDashGrid.uiDashGridMod.moveColumns.IGridMoveColumnsApi
import typingsSlinky.uiDashGrid.uiDashGridMod.pagination.IGridPaginationApi
import typingsSlinky.uiDashGrid.uiDashGridMod.pinning.IGridPinningApi
import typingsSlinky.uiDashGrid.uiDashGridMod.resizeColumns.IGridResizeColumnsApi
import typingsSlinky.uiDashGrid.uiDashGridMod.rowEdit.IGridRowEditApi
import typingsSlinky.uiDashGrid.uiDashGridMod.saveState.IGridSaveStateApi
import typingsSlinky.uiDashGrid.uiDashGridMod.selection.IGridSelectionApi
import typingsSlinky.uiDashGrid.uiDashGridMod.treeBase.IGridTreeBaseApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridApiOf[TEntity] extends js.Object {
  /**
    * Cell Nav Api
    */
  var cellNav: ICellNavApi[TEntity] = js.native
  /**
    * Move Columns Api
    */
  var colMovable: IGridMoveColumnsApi = js.native
  /**
    * Grid row resizable Api
    */
  var colResizable: IGridResizeColumnsApi = js.native
  /**
    * Core Api
    */
  var core: IGridCoreApi[TEntity] = js.native
  /**
    * Edit Api
    */
  var edit: IGridEditApi[TEntity] = js.native
  /**
    * Expandable Api
    */
  var expandable: IGridExpandableApi[TEntity] = js.native
  /**
    * Exporter Api
    */
  var exporter: IGridExporterApi = js.native
  /**
    * A grid instance is made available in the gridApi.
    */
  var grid: IGridInstanceOf[TEntity] = js.native
  /**
    * Grouping Api
    */
  var grouping: IGridGroupingApi[TEntity] = js.native
  /**
    * Importer Api
    */
  var importer: IGridImporterApi = js.native
  /**
    * Infinite Scroll Api
    */
  var infiniteScroll: IGridInfiniteScrollApi[TEntity] = js.native
  /**
    * Pagination Api
    */
  var pagination: IGridPaginationApi = js.native
  /**
    * Pinning Api
    */
  var pinning: IGridPinningApi[TEntity] = js.native
  /**
    * Grid Row Edit Api
    */
  var rowEdit: IGridRowEditApi[TEntity] = js.native
  /**
    * Grid Save State Api
    */
  var saveState: IGridSaveStateApi = js.native
  /**
    * Selection Api
    */
  var selection: IGridSelectionApi[TEntity] = js.native
  /**
    * Tree Base Api
    */
  var treeBase: IGridTreeBaseApi[TEntity] = js.native
  /**
    * Registers a new event for the given feature. The event will get a .raise and .on prepended to it
    *
    * .raise.eventName() - takes no arguments
    *
    * .on.eventName(scope, callBackFn, _this)
    * scope - a scope reference to add a deregister call to the scopes .$on('destroy').
    * Scope is optional and can be a null value, but in this case you must deregister it yourself via the returned
    * deregister function
    * callBackFn - The function to call
    * _this - optional this context variable for callbackFn. If omitted, grid.api will be used for the context
    *
    * .on.eventName returns a dereg function that will remove the listener. It's not necessary to use it as the
    * listener will be removed when the scope is destroyed.
    * @param featureName name of the feature that raises the event
    * @param eventName name of the event
    */
  def registerEvent(featureName: String, eventName: String): Unit = js.native
  /**
    * Registers features and events from a simple objectMap.
    * eventObjectMap must be in this format (multiple features allowed)
    * @param eventObjectMap map of feature/event names
    */
  def registerEventsFromObject(eventObjectMap: js.Any): Unit = js.native
  /**
    * Registers a new event for the given feature
    * @param featureName name of the feature
    * @param methodName name of the method
    * @param callBackFn function to execute
    * @param _this binds to callBackFn. Defaults to gridApi.grid
    */
  def registerMethod(featureName: String, methodName: String, callBackFn: js.Function, _this: js.Any): Unit = js.native
  /**
    * Registers features and methods from a simple objectMap.
    * eventObjectMap must be in this format (multiple features allowed)
    * {featureName: { methodNameOne:function(args){}, methodNameTwo:function(args){} }
    * @param eventObjectMap map of feature/event names
    * @param _this binds this to _this for all functions. Defaults to gridApi.grid
    */
  def registerMethodsFromObject(eventObjectMap: js.Any, _this: js.Any): Unit = js.native
  def suppressEvents(listenerFuncs: js.Array[js.Function], callBackFn: js.Function): Unit = js.native
  /**
    * Used to execute a function while disabling the specified event listeners.
    * Disables the listenerFunctions, executes the callbackFn, and then enables the listenerFunctions again
    * @param listenerFuncs listenerFunc or array of listenerFuncs to suppress.
    *                      These must be the same functions that were used in the .on.eventName method
    * @param callBackFn function to execute
    */
  def suppressEvents(listenerFuncs: js.Function, callBackFn: js.Function): Unit = js.native
}

