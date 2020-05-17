package typingsSlinky.winjs.WinJS.UI

import typingsSlinky.winjs.WinJS.Utilities.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a layout for the ListView in which items are arranged in a vertical list.
  **/
@js.native
trait ListLayout extends js.Object {
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
  /**
    * Gets or sets the position of group headers.
    **/
  var groupHeaderPosition: HeaderPosition = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: js.Any = js.native
  /**
    * Gets or sets the orientation of the GridLayout.
    **/
  var orientation: Orientation = js.native
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
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  def hitTest(x: Double, y: Double): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def initialize(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel
    * @param lastPixel
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
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def setupAnimations(): Unit = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def uninitialize(): Unit = js.native
}

object ListLayout {
  @scala.inline
  def apply(
    backdropColor: String,
    disableBackdrop: Boolean,
    dragLeave: () => Unit,
    dragOver: () => Unit,
    executeAnimations: () => Unit,
    getAdjacent: (js.Any, Key) => js.Any,
    groupHeaderPosition: HeaderPosition,
    hitTest: (Double, Double) => Unit,
    initialize: () => Unit,
    itemsFromRange: (Double, Double) => Unit,
    layout: (js.Any, js.Any, js.Any, js.Any) => Unit,
    numberOfItemsPerItemsBlock: js.Any,
    orientation: Orientation,
    setupAnimations: () => Unit,
    uninitialize: () => Unit
  ): ListLayout = {
    val __obj = js.Dynamic.literal(backdropColor = backdropColor.asInstanceOf[js.Any], disableBackdrop = disableBackdrop.asInstanceOf[js.Any], dragLeave = js.Any.fromFunction0(dragLeave), dragOver = js.Any.fromFunction0(dragOver), executeAnimations = js.Any.fromFunction0(executeAnimations), getAdjacent = js.Any.fromFunction2(getAdjacent), groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], hitTest = js.Any.fromFunction2(hitTest), initialize = js.Any.fromFunction0(initialize), itemsFromRange = js.Any.fromFunction2(itemsFromRange), layout = js.Any.fromFunction4(layout), numberOfItemsPerItemsBlock = numberOfItemsPerItemsBlock.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setupAnimations = js.Any.fromFunction0(setupAnimations), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[ListLayout]
  }
  @scala.inline
  implicit class ListLayoutOps[Self <: ListLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackdropColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDragOver(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecuteAnimations(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAdjacent(value: (js.Any, Key) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdjacent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGroupHeaderPosition(value: HeaderPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitTest(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemsFromRange(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsFromRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLayout(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNumberOfItemsPerItemsBlock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfItemsPerItemsBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupAnimations(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUninitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninitialize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

