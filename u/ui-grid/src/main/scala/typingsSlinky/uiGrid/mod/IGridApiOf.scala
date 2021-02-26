package typingsSlinky.uiGrid.mod

import typingsSlinky.uiGrid.mod.cellNav.ICellNavApi
import typingsSlinky.uiGrid.mod.edit.IGridEditApi
import typingsSlinky.uiGrid.mod.expandable.IGridExpandableApi
import typingsSlinky.uiGrid.mod.exporter.IGridExporterApi
import typingsSlinky.uiGrid.mod.grouping.IGridGroupingApi
import typingsSlinky.uiGrid.mod.importer.IGridImporterApi
import typingsSlinky.uiGrid.mod.infiniteScroll.IGridInfiniteScrollApi
import typingsSlinky.uiGrid.mod.moveColumns.IGridMoveColumnsApi
import typingsSlinky.uiGrid.mod.pagination.IGridPaginationApi
import typingsSlinky.uiGrid.mod.pinning.IGridPinningApi
import typingsSlinky.uiGrid.mod.resizeColumns.IGridResizeColumnsApi
import typingsSlinky.uiGrid.mod.rowEdit.IGridRowEditApi
import typingsSlinky.uiGrid.mod.saveState.IGridSaveStateApi
import typingsSlinky.uiGrid.mod.selection.IGridSelectionApi
import typingsSlinky.uiGrid.mod.treeBase.IGridTreeBaseApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridApiOf[TEntity] extends StObject {
  
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
  
  def suppressEvents(listenerFuncs: js.Array[js.Function], callBackFn: js.Function): Unit = js.native
  /**
    * Used to execute a function while disabling the specified event listeners.
    * Disables the listenerFunctions, executes the callbackFn, and then enables the listenerFunctions again
    * @param listenerFuncs listenerFunc or array of listenerFuncs to suppress.
    *                      These must be the same functions that were used in the .on.eventName method
    * @param callBackFn function to execute
    */
  def suppressEvents(listenerFuncs: js.Function, callBackFn: js.Function): Unit = js.native
  
  /**
    * Tree Base Api
    */
  var treeBase: IGridTreeBaseApi[TEntity] = js.native
}
