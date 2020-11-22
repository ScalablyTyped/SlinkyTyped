package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Titanium.Proxy
import typingsSlinky.titanium.titaniumStrings.refreshend
import typingsSlinky.titanium.titaniumStrings.refreshstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RefreshControl is a representation of the native iOS
  * [UIRefreshControl](https://developer.apple.com/documentation/uikit/uirefreshcontrol)
  * and Android [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html).
  */
@js.native
trait RefreshControl extends Proxy {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_refreshend(
    name: refreshend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ RefreshControlRefreshendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_refreshstart(
    name: refreshstart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ RefreshControlRefreshstartEvent, Unit]
  ): Unit = js.native
  
  /**
    * Tells the control that a refresh operation was started programmatically.
    */
  def beginRefreshing(): Unit = js.native
  
  /**
    * Tells the control that a refresh operation has ended.
    */
  def endRefreshing(): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_refreshend(name: refreshend): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_refreshend(name: refreshend, event: RefreshControlRefreshendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_refreshstart(name: refreshstart): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_refreshstart(name: refreshstart, event: RefreshControlRefreshstartEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.RefreshControl.tintColor> property.
    * @deprecated Access <Titanium.UI.RefreshControl.tintColor> instead.
    */
  def getTintColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.RefreshControl.title> property.
    * @deprecated Access <Titanium.UI.RefreshControl.title> instead.
    */
  def getTitle(): AttributedString = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_refreshend(
    name: refreshend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ RefreshControlRefreshendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_refreshstart(
    name: refreshstart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ RefreshControlRefreshstartEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.RefreshControl.tintColor> property.
    * @deprecated Set the value using <Titanium.UI.RefreshControl.tintColor> instead.
    */
  def setTintColor(tintColor: String): Unit = js.native
  def setTintColor(tintColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.RefreshControl.title> property.
    * @deprecated Set the value using <Titanium.UI.RefreshControl.title> instead.
    */
  def setTitle(title: AttributedString): Unit = js.native
  
  /**
    * The tint color for the refresh control, as a color name or hex triplet.
    */
  var tintColor: String | Color = js.native
  
  /**
    * The attributed title of the control.
    */
  var title: AttributedString = js.native
}
