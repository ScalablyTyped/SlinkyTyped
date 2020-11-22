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
  * An activity indicator that lets the user know an action is taking place.
  */
@js.native
trait ActivityIndicator extends View {
  
  /**
    * Color of the message text, as a color name or hex triplet.
    */
  var color: String | Color = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ActivityIndicatorClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ActivityIndicatorDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ActivityIndicatorDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ActivityIndicatorFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ActivityIndicatorKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ActivityIndicatorLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ActivityIndicatorLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ActivityIndicatorPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ActivityIndicatorPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ActivityIndicatorSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ActivityIndicatorSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ActivityIndicatorTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ActivityIndicatorTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ActivityIndicatorTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ActivityIndicatorTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ActivityIndicatorTwofingertapEvent): Unit = js.native
  
  /**
    * Font used for the message text.
    */
  var font: Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicator.color> property.
    * @deprecated Access <Titanium.UI.ActivityIndicator.color> instead.
    */
  def getColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicator.font> property.
    * @deprecated Access <Titanium.UI.ActivityIndicator.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
    * @deprecated Access <Titanium.UI.ActivityIndicator.indicatorColor> instead.
    */
  def getIndicatorColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicator.message> property.
    * @deprecated Access <Titanium.UI.ActivityIndicator.message> instead.
    */
  def getMessage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
    * @deprecated Access <Titanium.UI.ActivityIndicator.messageid> instead.
    */
  def getMessageid(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicator.style> property.
    * @deprecated Access <Titanium.UI.ActivityIndicator.style> instead.
    */
  def getStyle(): Double = js.native
  
  /**
    * Width of the view. Only accepts value of <Titanium.UI.SIZE>, which must be explicitly set in order to
    * display the message and to position the view correctly.
    */
  @JSName("height")
  var height_ActivityIndicator: String = js.native
  
  /**
    * Color of the animated indicator.
    */
  var indicatorColor: String | Color = js.native
  
  /**
    * Message text.
    */
  var message: String = js.native
  
  /**
    * Key identifying a string in the locale file to use for the message text.
    */
  var messageid: String = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicator.color> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicator.color> instead.
    */
  def setColor(color: String): Unit = js.native
  def setColor(color: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicator.font> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicator.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicator.indicatorColor> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicator.indicatorColor> instead.
    */
  def setIndicatorColor(indicatorColor: String): Unit = js.native
  def setIndicatorColor(indicatorColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicator.message> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicator.message> instead.
    */
  def setMessage(message: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicator.messageid> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicator.messageid> instead.
    */
  def setMessageid(messageid: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicator.style> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicator.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  
  /**
    * The style for the activity indicator.
    */
  var style: Double = js.native
  
  /**
    * Width of the view. Only accepts value of <Titanium.UI.SIZE>, which must be explicitly set in order to
    * display the message and to position the view correctly.
    */
  @JSName("width")
  var width_ActivityIndicator: String = js.native
}
