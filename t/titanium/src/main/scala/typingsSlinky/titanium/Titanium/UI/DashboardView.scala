package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.titaniumStrings.click
import typingsSlinky.titanium.titaniumStrings.commit
import typingsSlinky.titanium.titaniumStrings.dblclick
import typingsSlinky.titanium.titaniumStrings.delete
import typingsSlinky.titanium.titaniumStrings.doubletap
import typingsSlinky.titanium.titaniumStrings.dragend_
import typingsSlinky.titanium.titaniumStrings.dragstart_
import typingsSlinky.titanium.titaniumStrings.edit
import typingsSlinky.titanium.titaniumStrings.keypressed
import typingsSlinky.titanium.titaniumStrings.longpress
import typingsSlinky.titanium.titaniumStrings.move
import typingsSlinky.titanium.titaniumStrings.pagechanged
import typingsSlinky.titanium.titaniumStrings.pinch
import typingsSlinky.titanium.titaniumStrings.postlayout
import typingsSlinky.titanium.titaniumStrings.singletap
import typingsSlinky.titanium.titaniumStrings.swipe
import typingsSlinky.titanium.titaniumStrings.touchcancel
import typingsSlinky.titanium.titaniumStrings.touchend
import typingsSlinky.titanium.titaniumStrings.touchmove
import typingsSlinky.titanium.titaniumStrings.touchstart
import typingsSlinky.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dashboard view is an iOS Springboard-like view of <Titanium.UI.DashboardItem> items that may
  * be deleted and reordered by the user using its built-in edit mode.
  */
@js.native
trait DashboardView extends View {
  
  @JSName("addEventListener")
  def addEventListener_commit(
    name: commit,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewCommitEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_edit(
    name: edit,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewEditEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_move(
    name: move,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewMoveEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagechanged(
    name: pagechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewPagechangedEvent, Unit]
  ): Unit = js.native
  
  /**
    * The number of columns of items in the view.
    */
  var columnCount: Double = js.native
  
  /**
    * Items to display in this view.
    */
  var data: js.Array[DashboardItem] = js.native
  
  /**
    * Determines whether edit mode is activated by a longpress of an item.
    */
  var editable: Boolean = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: DashboardViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_commit(name: commit): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_commit(name: commit, event: DashboardViewCommitEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: DashboardViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_delete(name: delete, event: DashboardViewDeleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: DashboardViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragend(name: dragend_, event: DashboardViewDragendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dragstart(name: dragstart_, event: DashboardViewDragstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_edit(name: edit): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_edit(name: edit, event: DashboardViewEditEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: DashboardViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: DashboardViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_move(name: move, event: DashboardViewMoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pagechanged(name: pagechanged): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pagechanged(name: pagechanged, event: DashboardViewPagechangedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: DashboardViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: DashboardViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: DashboardViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: DashboardViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: DashboardViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: DashboardViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: DashboardViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: DashboardViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: DashboardViewTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardView.columnCount> property.
    * @deprecated Access <Titanium.UI.DashboardView.columnCount> instead.
    */
  def getColumnCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardView.data> property.
    * @deprecated Access <Titanium.UI.DashboardView.data> instead.
    */
  def getData(): js.Array[DashboardItem] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardView.editable> property.
    * @deprecated Access <Titanium.UI.DashboardView.editable> instead.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardView.rowCount> property.
    * @deprecated Access <Titanium.UI.DashboardView.rowCount> instead.
    */
  def getRowCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.DashboardView.wobble> property.
    * @deprecated Access <Titanium.UI.DashboardView.wobble> instead.
    */
  def getWobble(): Boolean = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_commit(
    name: commit,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewCommitEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_delete(
    name: delete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewDeleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    name: dragend_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewDragendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    name: dragstart_,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewDragstartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_edit(
    name: edit,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewEditEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_move(
    name: move,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewMoveEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagechanged(
    name: pagechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DashboardViewPagechangedEvent, Unit]
  ): Unit = js.native
  
  /**
    * The number of rows of items in the view.
    */
  var rowCount: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardView.columnCount> property.
    * @deprecated Set the value using <Titanium.UI.DashboardView.columnCount> instead.
    */
  def setColumnCount(columnCount: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardView.data> property.
    * @deprecated Set the value using <Titanium.UI.DashboardView.data> instead.
    */
  def setData(data: js.Array[DashboardItem]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardView.editable> property.
    * @deprecated Set the value using <Titanium.UI.DashboardView.editable> instead.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardView.rowCount> property.
    * @deprecated Set the value using <Titanium.UI.DashboardView.rowCount> instead.
    */
  def setRowCount(rowCount: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.DashboardView.wobble> property.
    * @deprecated Set the value using <Titanium.UI.DashboardView.wobble> instead.
    */
  def setWobble(wobble: Boolean): Unit = js.native
  
  /**
    * Enable edit mode.
    */
  def startEditing(): Unit = js.native
  
  /**
    * Disable edit mode.
    */
  def stopEditing(): Unit = js.native
  
  /**
    * Determines whether the wobble visual editing cue is enabled in edit mode.
    */
  var wobble: Boolean = js.native
}
