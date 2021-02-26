package typingsSlinky.titanium.Titanium.UI.Android

import typingsSlinky.titanium.Titanium.UI.Toolbar
import typingsSlinky.titanium.Titanium.UI.View
import typingsSlinky.titanium.titaniumStrings.change
import typingsSlinky.titanium.titaniumStrings.click
import typingsSlinky.titanium.titaniumStrings.close
import typingsSlinky.titanium.titaniumStrings.dblclick
import typingsSlinky.titanium.titaniumStrings.doubletap
import typingsSlinky.titanium.titaniumStrings.focus
import typingsSlinky.titanium.titaniumStrings.keypressed
import typingsSlinky.titanium.titaniumStrings.longclick
import typingsSlinky.titanium.titaniumStrings.longpress
import typingsSlinky.titanium.titaniumStrings.open
import typingsSlinky.titanium.titaniumStrings.pinch
import typingsSlinky.titanium.titaniumStrings.postlayout
import typingsSlinky.titanium.titaniumStrings.singletap
import typingsSlinky.titanium.titaniumStrings.slide
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
  * A panel that displays the app's main navigation options on the left edge of the screen.
  */
@js.native
trait DrawerLayout extends View {
  
  /**
    * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is locked closed.
    */
  val LOCK_MODE_LOCKED_CLOSED: Double = js.native
  
  /**
    * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is locked opened.
    */
  val LOCK_MODE_LOCKED_OPEN: Double = js.native
  
  /**
    * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is reset to default lock state.
    */
  val LOCK_MODE_UNDEFINED: Double = js.native
  
  /**
    * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is unlocked.
    */
  val LOCK_MODE_UNLOCKED: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    name: close,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutCloseEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    name: open,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutOpenEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slide(
    name: slide,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutSlideEvent, Unit]
  ): Unit = js.native
  
  /**
    * Get or set the center view
    */
  var centerView: View = js.native
  
  /**
    * Close the left view.
    */
  def closeLeft(): Unit = js.native
  
  /**
    * Close the right view.
    */
  def closeRight(): Unit = js.native
  
  /**
    * Determine the drawer indicator status
    */
  var drawerIndicatorEnabled: Boolean = js.native
  
  /**
    * Get or set the drawerLockMode
    */
  var drawerLockMode: Double = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: DrawerLayoutChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: DrawerLayoutClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: DrawerLayoutCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: DrawerLayoutDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: DrawerLayoutDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: DrawerLayoutFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: DrawerLayoutKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: DrawerLayoutLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: DrawerLayoutLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open, event: DrawerLayoutOpenEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: DrawerLayoutPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: DrawerLayoutPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: DrawerLayoutSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_slide(name: slide): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_slide(name: slide, event: DrawerLayoutSlideEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: DrawerLayoutSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: DrawerLayoutTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: DrawerLayoutTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: DrawerLayoutTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: DrawerLayoutTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: DrawerLayoutTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.centerView> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.centerView> instead.
    */
  def getCenterView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> instead.
    */
  def getDrawerIndicatorEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.drawerLockMode> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.drawerLockMode> instead.
    */
  def getDrawerLockMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.isLeftOpen> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.isLeftOpen> instead.
    */
  def getIsLeftOpen(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.isLeftVisible> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.isLeftVisible> instead.
    */
  def getIsLeftVisible(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.isRightOpen> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.isRightOpen> instead.
    */
  def getIsRightOpen(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.isRightVisible> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.isRightVisible> instead.
    */
  def getIsRightVisible(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.leftView> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.leftView> instead.
    */
  def getLeftView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.leftWidth> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.leftWidth> instead.
    */
  def getLeftWidth(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.rightView> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.rightView> instead.
    */
  def getRightView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.rightWidth> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.rightWidth> instead.
    */
  def getRightWidth(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.toolbar> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.toolbar> instead.
    */
  def getToolbar(): Toolbar = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.DrawerLayout.toolbarEnabled> property.
    * @deprecated Access <Titanium.UI.Android.DrawerLayout.toolbarEnabled> instead.
    */
  def getToolbarEnabled(): Boolean = js.native
  
  /**
    * Disallow touch events on a specific view.
    */
  def interceptTouchEvent(view: View, disallowIntercept: Boolean): Unit = js.native
  
  /**
    * Determine whether the left drawer is open
    */
  var isLeftOpen: Boolean = js.native
  
  /**
    * Determine whether the left drawer is visible
    */
  var isLeftVisible: Boolean = js.native
  
  /**
    * Determine whether the right drawer is open
    */
  var isRightOpen: Boolean = js.native
  
  /**
    * Determine whether the right drawer is visible
    */
  var isRightVisible: Boolean = js.native
  
  /**
    * Get or set the view of the left drawer
    */
  var leftView: View = js.native
  
  /**
    * Get or set the width of the left drawer
    */
  var leftWidth: Double = js.native
  
  /**
    * Open the left view.
    */
  def openLeft(): Unit = js.native
  
  /**
    * Open the right view.
    */
  def openRight(): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    name: close,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutCloseEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    name: open,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutOpenEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slide(
    name: slide,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DrawerLayoutSlideEvent, Unit]
  ): Unit = js.native
  
  /**
    * Get or set the view of the right drawer
    */
  var rightView: View = js.native
  
  /**
    * Get or set the width of the right drawer
    */
  var rightWidth: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.centerView> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.centerView> instead.
    */
  def setCenterView(centerView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> instead.
    */
  def setDrawerIndicatorEnabled(drawerIndicatorEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.drawerLockMode> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.drawerLockMode> instead.
    */
  def setDrawerLockMode(drawerLockMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.isLeftOpen> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.isLeftOpen> instead.
    */
  def setIsLeftOpen(isLeftOpen: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.isLeftVisible> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.isLeftVisible> instead.
    */
  def setIsLeftVisible(isLeftVisible: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.isRightOpen> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.isRightOpen> instead.
    */
  def setIsRightOpen(isRightOpen: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.isRightVisible> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.isRightVisible> instead.
    */
  def setIsRightVisible(isRightVisible: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.leftView> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.leftView> instead.
    */
  def setLeftView(leftView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.leftWidth> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.leftWidth> instead.
    */
  def setLeftWidth(leftWidth: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.rightView> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.rightView> instead.
    */
  def setRightView(rightView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.rightWidth> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.rightWidth> instead.
    */
  def setRightWidth(rightWidth: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.toolbar> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.toolbar> instead.
    */
  def setToolbar(toolbar: Toolbar): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.DrawerLayout.toolbarEnabled> property.
    * @deprecated Set the value using <Titanium.UI.Android.DrawerLayout.toolbarEnabled> instead.
    */
  def setToolbarEnabled(toolbarEnabled: Boolean): Unit = js.native
  
  /**
    * Toggle the visibility of the left view.
    */
  def toggleLeft(): Unit = js.native
  
  /**
    * Toggle the visibility of the right view.
    */
  def toggleRight(): Unit = js.native
  
  /**
    * A Toolbar instance to use as a toolbar.
    */
  var toolbar: Toolbar = js.native
  
  /**
    * Determine whether to enable the toolbar.
    */
  var toolbarEnabled: Boolean = js.native
}
