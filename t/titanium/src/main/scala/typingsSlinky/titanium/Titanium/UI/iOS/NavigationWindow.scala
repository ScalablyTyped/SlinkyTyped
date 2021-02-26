package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.Titanium.UI.Window
import typingsSlinky.titanium.titaniumStrings.blur
import typingsSlinky.titanium.titaniumStrings.click
import typingsSlinky.titanium.titaniumStrings.close
import typingsSlinky.titanium.titaniumStrings.dblclick
import typingsSlinky.titanium.titaniumStrings.doubletap
import typingsSlinky.titanium.titaniumStrings.focus
import typingsSlinky.titanium.titaniumStrings.keypressed
import typingsSlinky.titanium.titaniumStrings.longpress
import typingsSlinky.titanium.titaniumStrings.open
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
  * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
  * content.
  * @deprecated Use [Titanium.UI.NavigationWindow](Titanium.UI.NavigationWindow) instead.
  */
@js.native
trait NavigationWindow extends Window {
  
  /**
    * Closes a window and removes it from the navigation window.
    */
  def closeWindow(window: Window, options: js.Any): Unit = js.native
  
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: NavigationWindowBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: NavigationWindowClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: NavigationWindowCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: NavigationWindowDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: NavigationWindowDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: NavigationWindowFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: NavigationWindowKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: NavigationWindowLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open, event: NavigationWindowOpenEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: NavigationWindowPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: NavigationWindowPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: NavigationWindowSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: NavigationWindowSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: NavigationWindowTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: NavigationWindowTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: NavigationWindowTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: NavigationWindowTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: NavigationWindowTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
    * @deprecated Access <Titanium.UI.iOS.NavigationWindow.window> instead.
    */
  def getWindow(): Window = js.native
  
  /**
    * Opens a window within the navigation window.
    */
  def openWindow(window: Window, options: js.Any): Unit = js.native
  
  /**
    * Closes all windows that are currently opened inside the navigation window.
    */
  def popToRootWindow(options: js.Any): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
    * @deprecated Set the value using <Titanium.UI.iOS.NavigationWindow.window> instead.
    */
  def setWindow(window: Window): Unit = js.native
  
  /**
    * Window to add to this navigation window.
    */
  var window: Window = js.native
}
