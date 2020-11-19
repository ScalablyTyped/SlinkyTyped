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
  * A progress bar.
  */
@js.native
trait ProgressBar extends View {
  
  /**
    * Color of the progress bar message, as a color name or hex triplet.
    */
  var color: String = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ProgressBarClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ProgressBarDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ProgressBarDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ProgressBarFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ProgressBarKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ProgressBarLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ProgressBarLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ProgressBarPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ProgressBarPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ProgressBarSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ProgressBarSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ProgressBarTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ProgressBarTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ProgressBarTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ProgressBarTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ProgressBarTwofingertapEvent): Unit = js.native
  
  /**
    * Font for the progress bar text.
    */
  var font: Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.color> property.
    * @deprecated Access <Titanium.UI.ProgressBar.color> instead.
    */
  def getColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.font> property.
    * @deprecated Access <Titanium.UI.ProgressBar.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.max> property.
    * @deprecated Access <Titanium.UI.ProgressBar.max> instead.
    */
  def getMax(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.message> property.
    * @deprecated Access <Titanium.UI.ProgressBar.message> instead.
    */
  def getMessage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.min> property.
    * @deprecated Access <Titanium.UI.ProgressBar.min> instead.
    */
  def getMin(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.style> property.
    * @deprecated Access <Titanium.UI.ProgressBar.style> instead.
    */
  def getStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.trackTintColor> property.
    * @deprecated Access <Titanium.UI.ProgressBar.trackTintColor> instead.
    */
  def getTrackTintColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ProgressBar.value> property.
    * @deprecated Access <Titanium.UI.ProgressBar.value> instead.
    */
  def getValue(): Double = js.native
  
  /**
    * Maximum value of the progress bar.
    */
  var max: Double = js.native
  
  /**
    * Progress bar text.
    */
  var message: String = js.native
  
  /**
    * Minimum value of the progress bar.
    */
  var min: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.color> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.color> instead.
    */
  def setColor(color: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.font> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.max> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.max> instead.
    */
  def setMax(max: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.message> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.message> instead.
    */
  def setMessage(message: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.min> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.min> instead.
    */
  def setMin(min: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.style> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.trackTintColor> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.trackTintColor> instead.
    */
  def setTrackTintColor(trackTintColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ProgressBar.value> property.
    * @deprecated Set the value using <Titanium.UI.ProgressBar.value> instead.
    */
  def setValue(value: Double): Unit = js.native
  
  /**
    * Style of the progress bar.
    */
  var style: Double = js.native
  
  /**
    * The color shown for the portion of the progress bar that is not filled.
    */
  var trackTintColor: String = js.native
  
  /**
    * Current value of the progress bar.
    */
  var value: Double = js.native
}
