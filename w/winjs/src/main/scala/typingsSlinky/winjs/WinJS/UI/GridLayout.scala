package typingsSlinky.winjs.WinJS.UI

import typingsSlinky.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a grid layout for the ListView in which items are arranged in a horizontal grid.
  **/
@js.native
trait GridLayout extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var backdropColor: String = js.native
  
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var disableBackdrop: Boolean = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragLeave(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragOver(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def executeAnimations(): Unit = js.native
  
  /**
    * Determines the next item to receive keyboard focus.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: js.Any, pressedKey: Key): js.Any = js.native
  
  /**
    * Gets or sets the position of group headers.
    **/
  var groupHeaderPosition: HeaderPosition = js.native
  
  /**
    * This property is no longer supported. Starting with the Windows Library for JavaScript 2.0, use a CellSpanningLayout.
    **/
  var groupInfo: js.Function = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  def hitTest(x: Double, y: Double): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  def initialize(site: ILayoutSite2, groupsEnabled: Boolean): Unit = js.native
  
  /**
    * This property is no longer supported. Starting with the Windows Library for JavaScript 2.0, use a CellSpanningLayout.
    **/
  var itemInfo: js.Function = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param tree
    * @param changedRange
    * @param modifiedItems
    * @param modifiedGroups
    **/
  def layout(tree: js.Any, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): Unit = js.native
  
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the maximumRowsOrColumns property.
    **/
  var maxRows: Double = js.native
  
  /**
    * Gets or set the maximum number of rows or columns, depending on the orientation, to display before content begins to wrap.
    **/
  var maximumRowsOrColumns: Double = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: js.Any = js.native
  
  /**
    * Gets or sets the orientation of the GridLayout.
    **/
  var orientation: Orientation = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def setupAnimations(): Unit = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def uninitialize(): Unit = js.native
}
object GridLayout {
  
  @scala.inline
  def apply(
    backdropColor: String,
    disableBackdrop: Boolean,
    dragLeave: () => Unit,
    dragOver: () => Unit,
    executeAnimations: () => Unit,
    getAdjacent: (js.Any, Key) => js.Any,
    groupHeaderPosition: HeaderPosition,
    groupInfo: js.Function,
    hitTest: (Double, Double) => Unit,
    initialize: (ILayoutSite2, Boolean) => Unit,
    itemInfo: js.Function,
    itemsFromRange: (Double, Double) => Unit,
    layout: (js.Any, js.Any, js.Any, js.Any) => Unit,
    maxRows: Double,
    maximumRowsOrColumns: Double,
    numberOfItemsPerItemsBlock: js.Any,
    orientation: Orientation,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): GridLayout = {
    val __obj = js.Dynamic.literal(backdropColor = backdropColor.asInstanceOf[js.Any], disableBackdrop = disableBackdrop.asInstanceOf[js.Any], dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction0(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], groupInfo = groupInfo.asInstanceOf[js.Any], hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction2(initialize), itemInfo = itemInfo.asInstanceOf[js.Any], itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), maxRows = maxRows.asInstanceOf[js.Any], maximumRowsOrColumns = maximumRowsOrColumns.asInstanceOf[js.Any], numberOfItemsPerItemsBlock = numberOfItemsPerItemsBlock.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[GridLayout]
  }
  
  @scala.inline
  implicit class GridLayoutMutableBuilder[Self <: GridLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBackdrop(value: Boolean): Self = StObject.set(x, "disableBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragLeave(value: () => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDragOver(value: () => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteAnimations(value: () => Unit): Self = StObject.set(x, "executeAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAdjacent(value: (js.Any, Key) => js.Any): Self = StObject.set(x, "getAdjacent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupHeaderPosition(value: HeaderPosition): Self = StObject.set(x, "groupHeaderPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupInfo(value: js.Function): Self = StObject.set(x, "groupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitTest(value: (Double, Double) => Unit): Self = StObject.set(x, "hitTest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitialize(value: (ILayoutSite2, Boolean) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemInfo(value: js.Function): Self = StObject.set(x, "itemInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsFromRange(value: (Double, Double) => Unit): Self = StObject.set(x, "itemsFromRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLayout(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRowsOrColumns(value: Double): Self = StObject.set(x, "maximumRowsOrColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfItemsPerItemsBlock(value: js.Any): Self = StObject.set(x, "numberOfItemsPerItemsBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupAnimations(value: () => Unit): Self = StObject.set(x, "setupAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUninitialize(value: () => Unit): Self = StObject.set(x, "uninitialize", js.Any.fromFunction0(value))
  }
}
