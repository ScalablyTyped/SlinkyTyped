package typingsSlinky.titanium.Titanium.UI.iPad

import typingsSlinky.titanium.ShowPopoverParams
import typingsSlinky.titanium.Titanium.UI.View
import typingsSlinky.titanium.titaniumStrings.click
import typingsSlinky.titanium.titaniumStrings.dblclick
import typingsSlinky.titanium.titaniumStrings.doubletap
import typingsSlinky.titanium.titaniumStrings.hide
import typingsSlinky.titanium.titaniumStrings.keypressed
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Popover is used to manage the presentation of content in a popover.
  */
@js.native
trait Popover extends View {
  
  @JSName("addEventListener")
  def addEventListener_hide(name: hide, callback: js.ThisFunction1[/* this */ this.type, /* event */ PopoverHideEvent, Unit]): Unit = js.native
  
  /**
    * Indicates the arrow direction of the popover.
    */
  var arrowDirection: Double = js.native
  
  /**
    * View to use for the popover content. Must be set before calling the `show()` method.
    */
  var contentView: View = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: PopoverClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: PopoverDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: PopoverDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_hide(name: hide): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_hide(name: hide, event: PopoverHideEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: PopoverKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: PopoverLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: PopoverPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: PopoverPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: PopoverSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: PopoverSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: PopoverTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: PopoverTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: PopoverTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: PopoverTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: PopoverTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iPad.Popover.arrowDirection> property.
    * @deprecated Access <Titanium.UI.iPad.Popover.arrowDirection> instead.
    */
  def getArrowDirection(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iPad.Popover.contentView> property.
    * @deprecated Access <Titanium.UI.iPad.Popover.contentView> instead.
    */
  def getContentView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iPad.Popover.passthroughViews> property.
    * @deprecated Access <Titanium.UI.iPad.Popover.passthroughViews> instead.
    */
  def getPassthroughViews(): js.Array[View] = js.native
  
  /**
    * Passthrough views to use when the popover is shown.
    */
  var passthroughViews: js.Array[View] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_hide(name: hide, callback: js.ThisFunction1[/* this */ this.type, /* event */ PopoverHideEvent, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iPad.Popover.arrowDirection> property.
    * @deprecated Set the value using <Titanium.UI.iPad.Popover.arrowDirection> instead.
    */
  def setArrowDirection(arrowDirection: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iPad.Popover.contentView> property.
    * @deprecated Set the value using <Titanium.UI.iPad.Popover.contentView> instead.
    */
  def setContentView(contentView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iPad.Popover.passthroughViews> property.
    * @deprecated Set the value using <Titanium.UI.iPad.Popover.passthroughViews> instead.
    */
  def setPassthroughViews(passthroughViews: js.Array[View]): Unit = js.native
  
  /**
    * Displays the popover.
    */
  def show(options: ShowPopoverParams): Unit = js.native
}
