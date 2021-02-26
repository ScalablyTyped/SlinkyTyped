package typingsSlinky.titanium.Titanium.UI.Android

import typingsSlinky.titanium.Titanium.UI.View
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CardView provides a layout container with rounded corners and a shadow indicating the view is elevated.
  */
@js.native
trait CardView extends View {
  
  /**
    * Background color for CardView as a color name or hex triplet.
    */
  @JSName("backgroundColor")
  var backgroundColor_CardView: String = js.native
  
  /**
    * Corner radius for CardView.
    */
  @JSName("borderRadius")
  var borderRadius_CardView: Double = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: CardViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: CardViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: CardViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: CardViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: CardViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: CardViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: CardViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: CardViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: CardViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: CardViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: CardViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: CardViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: CardViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: CardViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: CardViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: CardViewTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.maxElevation> property.
    * @deprecated Access <Titanium.UI.Android.CardView.maxElevation> instead.
    */
  def getMaxElevation(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.padding> property.
    * @deprecated Access <Titanium.UI.Android.CardView.padding> instead.
    */
  def getPadding(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.paddingBottom> property.
    * @deprecated Access <Titanium.UI.Android.CardView.paddingBottom> instead.
    */
  def getPaddingBottom(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.paddingLeft> property.
    * @deprecated Access <Titanium.UI.Android.CardView.paddingLeft> instead.
    */
  def getPaddingLeft(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.paddingRight> property.
    * @deprecated Access <Titanium.UI.Android.CardView.paddingRight> instead.
    */
  def getPaddingRight(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.paddingTop> property.
    * @deprecated Access <Titanium.UI.Android.CardView.paddingTop> instead.
    */
  def getPaddingTop(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.preventCornerOverlap> property.
    * @deprecated Access <Titanium.UI.Android.CardView.preventCornerOverlap> instead.
    */
  def getPreventCornerOverlap(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.CardView.useCompatPadding> property.
    * @deprecated Access <Titanium.UI.Android.CardView.useCompatPadding> instead.
    */
  def getUseCompatPadding(): Boolean = js.native
  
  /**
    * Maximum Elevation for CardView.
    */
  var maxElevation: Double = js.native
  
  /**
    * Inner padding between the edges of the Card and children of the CardView.
    */
  var padding: Double = js.native
  
  /**
    * Inner padding between the bottom edge of the Card and children of the CardView.
    */
  var paddingBottom: Double = js.native
  
  /**
    * Inner padding between the left edge of the Card and children of the CardView.
    */
  var paddingLeft: Double = js.native
  
  /**
    * Inner padding between the right edge of the Card and children of the CardView.
    */
  var paddingRight: Double = js.native
  
  /**
    * Inner padding between the top edge of the Card and children of the CardView.
    */
  var paddingTop: Double = js.native
  
  /**
    * Add padding to CardView on API level 20 and before to prevent intersections between
    * the Card content and rounded corners.
    */
  var preventCornerOverlap: Boolean = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.maxElevation> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.maxElevation> instead.
    */
  def setMaxElevation(maxElevation: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.padding> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.padding> instead.
    */
  def setPadding(padding: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.paddingBottom> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.paddingBottom> instead.
    */
  def setPaddingBottom(paddingBottom: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.paddingLeft> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.paddingLeft> instead.
    */
  def setPaddingLeft(paddingLeft: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.paddingRight> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.paddingRight> instead.
    */
  def setPaddingRight(paddingRight: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.paddingTop> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.paddingTop> instead.
    */
  def setPaddingTop(paddingTop: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.preventCornerOverlap> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.preventCornerOverlap> instead.
    */
  def setPreventCornerOverlap(preventCornerOverlap: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.CardView.useCompatPadding> property.
    * @deprecated Set the value using <Titanium.UI.Android.CardView.useCompatPadding> instead.
    */
  def setUseCompatPadding(useCompatPadding: Boolean): Unit = js.native
  
  /**
    * Add padding on API level 21 and above to have the same measurements with previous versions.
    */
  var useCompatPadding: Boolean = js.native
}
