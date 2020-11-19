package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.CoverFlowImageType
import typingsSlinky.titanium.Titanium.Blob
import typingsSlinky.titanium.Titanium.Filesystem.File
import typingsSlinky.titanium.Titanium.UI.View
import typingsSlinky.titanium.titaniumStrings.change
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The cover flow view is a container showing animated three-dimensional images in a style
  * consistent with the cover flow presentation style used for iPod, iTunes, and file browsing.
  */
@js.native
trait CoverFlowView extends View {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CoverFlowViewChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: CoverFlowViewChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: CoverFlowViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: CoverFlowViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: CoverFlowViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: CoverFlowViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: CoverFlowViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: CoverFlowViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: CoverFlowViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: CoverFlowViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: CoverFlowViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: CoverFlowViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: CoverFlowViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: CoverFlowViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: CoverFlowViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: CoverFlowViewTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.CoverFlowView.images> property.
    * @deprecated Access <Titanium.UI.iOS.CoverFlowView.images> instead.
    */
  def getImages(): js.Array[Blob | CoverFlowImageType | File | String] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.CoverFlowView.selected> property.
    * @deprecated Access <Titanium.UI.iOS.CoverFlowView.selected> instead.
    */
  def getSelected(): Double = js.native
  
  /**
    * Images to display in the view.
    */
  var images: js.Array[Blob | CoverFlowImageType | File | String] = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ CoverFlowViewChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Index to make selected.
    */
  var selected: Double = js.native
  
  /**
    * Changes the image for a specified index.
    */
  def setImage(index: Double, image: String): Unit = js.native
  def setImage(index: Double, image: CoverFlowImageType): Unit = js.native
  def setImage(index: Double, image: Blob): Unit = js.native
  def setImage(index: Double, image: File): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.CoverFlowView.images> property.
    * @deprecated Set the value using <Titanium.UI.iOS.CoverFlowView.images> instead.
    */
  def setImages(images: js.Array[Blob | CoverFlowImageType | File | String]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.CoverFlowView.selected> property.
    * @deprecated Set the value using <Titanium.UI.iOS.CoverFlowView.selected> instead.
    */
  def setSelected(selected: Double): Unit = js.native
}
