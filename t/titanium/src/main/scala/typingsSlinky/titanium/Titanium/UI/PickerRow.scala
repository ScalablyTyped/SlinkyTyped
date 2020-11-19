package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Font
import typingsSlinky.titanium.titaniumStrings.click
import typingsSlinky.titanium.titaniumStrings.dblclick
import typingsSlinky.titanium.titaniumStrings.doubletap
import typingsSlinky.titanium.titaniumStrings.focus
import typingsSlinky.titanium.titaniumStrings.keypressed
import typingsSlinky.titanium.titaniumStrings.longclick
import typingsSlinky.titanium.titaniumStrings.longpress
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
  * A picker row, representing a selectable item in a <Titanium.UI.Picker>.
  */
@js.native
trait PickerRow extends View {
  
  /**
    * Color of the item text, as a color name or hex triplet.
    */
  var color: String = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: PickerRowClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: PickerRowDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: PickerRowDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: PickerRowFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: PickerRowKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: PickerRowLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: PickerRowLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: PickerRowPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: PickerRowPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: PickerRowSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: PickerRowSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: PickerRowTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: PickerRowTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: PickerRowTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: PickerRowTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: PickerRowTwofingertapEvent): Unit = js.native
  
  /**
    * Font to use for the item text.
    */
  var font: Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.PickerRow.color> property.
    * @deprecated Access <Titanium.UI.PickerRow.color> instead.
    */
  def getColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.PickerRow.font> property.
    * @deprecated Access <Titanium.UI.PickerRow.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.PickerRow.title> property.
    * @deprecated Access <Titanium.UI.PickerRow.title> instead.
    */
  def getTitle(): String = js.native
  
  /**
    * Sets the value of the <Titanium.UI.PickerRow.color> property.
    * @deprecated Set the value using <Titanium.UI.PickerRow.color> instead.
    */
  def setColor(color: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.PickerRow.font> property.
    * @deprecated Set the value using <Titanium.UI.PickerRow.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.PickerRow.title> property.
    * @deprecated Set the value using <Titanium.UI.PickerRow.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * Item text.
    */
  var title: String = js.native
}
