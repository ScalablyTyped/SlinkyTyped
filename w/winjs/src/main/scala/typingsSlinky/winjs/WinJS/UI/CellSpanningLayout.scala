package typingsSlinky.winjs.WinJS.UI

import typingsSlinky.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a grid and items can span multiple grid cells.
  **/
@js.native
trait CellSpanningLayout extends StObject {
  
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
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: js.Any, pressedKey: Key): js.Any = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the position of group headers relative to their items.
    **/
  var groupHeaderPosition: HeaderPosition = js.native
  
  /**
    * Gets or sets a function that enables cell-spanning and establishes base cell dimensions.
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
    * Gets or sets a function that returns the width and height of an item, as well as whether it should appear in a new column. Setting this function improves performance because the ListView can allocate space for an item without having to measure it first.
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
  def layout(tree: ILayoutSite2, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): Unit = js.native
  
  /**
    * Gets or set the maximum number of rows or columns, depending on the orientation, to display before content begins to wrap.
    **/
  var maximumRowsOrColumns: Double = js.native
  
  /**
    * This API supports the Windows Library for JavaScript infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: js.Any = js.native
  
  /**
    * Gets the orientation of the CellSpanningLayout. For a CellSpanningLayout, this property always returns Orientation.horizontal.
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
object CellSpanningLayout {
  
  @scala.inline
  def apply(
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
    layout: (ILayoutSite2, js.Any, js.Any, js.Any) => Unit,
    maximumRowsOrColumns: Double,
    numberOfItemsPerItemsBlock: js.Any,
    orientation: Orientation,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): CellSpanningLayout = {
    val __obj = js.Dynamic.literal(dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction0(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], groupInfo = groupInfo.asInstanceOf[js.Any], hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction2(initialize), itemInfo = itemInfo.asInstanceOf[js.Any], itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), maximumRowsOrColumns = maximumRowsOrColumns.asInstanceOf[js.Any], numberOfItemsPerItemsBlock = numberOfItemsPerItemsBlock.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[CellSpanningLayout]
  }
  
  @scala.inline
  implicit class CellSpanningLayoutMutableBuilder[Self <: CellSpanningLayout] (val x: Self) extends AnyVal {
    
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
    def setLayout(value: (ILayoutSite2, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction4(value))
    
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
