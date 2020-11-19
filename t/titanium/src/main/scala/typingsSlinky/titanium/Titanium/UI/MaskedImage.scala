package typingsSlinky.titanium.Titanium.UI

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
  * A control that displays an image composited with a background image or color.
  */
@js.native
trait MaskedImage extends View {
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: MaskedImageClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: MaskedImageDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: MaskedImageDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: MaskedImageFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: MaskedImageKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: MaskedImageLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: MaskedImageLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: MaskedImagePinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: MaskedImagePostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: MaskedImageSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: MaskedImageSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: MaskedImageTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: MaskedImageTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: MaskedImageTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: MaskedImageTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: MaskedImageTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.image> property.
    * @deprecated Access <Titanium.UI.MaskedImage.image> instead.
    */
  def getImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.mask> property.
    * @deprecated Access <Titanium.UI.MaskedImage.mask> instead.
    */
  def getMask(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.mode> property.
    * @deprecated Access <Titanium.UI.MaskedImage.mode> instead.
    */
  def getMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.tint> property.
    * @deprecated Access <Titanium.UI.MaskedImage.tint> instead.
    */
  def getTint(): String = js.native
  
  /**
    * Image drawn as the Foreground image.
    */
  var image: String = js.native
  
  /**
    * Image drawn as the background image.
    */
  var mask: String = js.native
  
  /**
    * Blend mode to use to combine layers.
    */
  var mode: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.image> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.image> instead.
    */
  def setImage(image: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.mask> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.mask> instead.
    */
  def setMask(mask: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.mode> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.mode> instead.
    */
  def setMode(mode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.tint> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.tint> instead.
    */
  def setTint(tint: String): Unit = js.native
  
  /**
    * Color to combine with the image, as a color name or hex triplet.
    */
  var tint: String = js.native
}
