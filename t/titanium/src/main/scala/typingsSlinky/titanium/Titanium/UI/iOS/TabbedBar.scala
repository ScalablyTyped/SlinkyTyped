package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.BarItemType
import typingsSlinky.titanium.Titanium.UI.View
import typingsSlinky.titanium.titaniumStrings.click
import typingsSlinky.titanium.titaniumStrings.dblclick
import typingsSlinky.titanium.titaniumStrings.doubletap
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
  * A button bar that maintains a selected state.
  * @deprecated Use [Titanium.UI.TabbedBar](Titanium.UI.TabbedBar) instead.
  */
@js.native
trait TabbedBar extends View {
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TabbedBarClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TabbedBarDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TabbedBarDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TabbedBarKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TabbedBarLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TabbedBarPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TabbedBarPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TabbedBarSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TabbedBarSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TabbedBarTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TabbedBarTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TabbedBarTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TabbedBarTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TabbedBarTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.TabbedBar.index> property.
    * @deprecated Access <Titanium.UI.iOS.TabbedBar.index> instead.
    */
  def getIndex(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.TabbedBar.labels> property.
    * @deprecated Access <Titanium.UI.iOS.TabbedBar.labels> instead.
    */
  def getLabels(): js.Array[BarItemType | String] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.TabbedBar.style> property.
    * @deprecated Access <Titanium.UI.iOS.TabbedBar.style> instead.
    */
  def getStyle(): Double = js.native
  
  /**
    * Index of the currently selected button.
    */
  var index: Double = js.native
  
  /**
    * Array of labels for the tabbed bar.
    */
  var labels: js.Array[BarItemType | String] = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.TabbedBar.index> property.
    * @deprecated Set the value using <Titanium.UI.iOS.TabbedBar.index> instead.
    */
  def setIndex(index: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.TabbedBar.labels> property.
    * @deprecated Set the value using <Titanium.UI.iOS.TabbedBar.labels> instead.
    */
  def setLabels(labels: js.Array[BarItemType | String]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.TabbedBar.style> property.
    * @deprecated Set the value using <Titanium.UI.iOS.TabbedBar.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  
  /**
    * Style of the tabbed bar.
    */
  var style: Double = js.native
}
