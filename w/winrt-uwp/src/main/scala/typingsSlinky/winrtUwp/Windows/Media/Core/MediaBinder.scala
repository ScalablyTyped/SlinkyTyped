package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaBinder extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_binding(`type`: binding, listener: TypedEventHandler[MediaBinder, MediaBindingEventArgs]): Unit = js.native
  
  /** Occurs when a media player is ready for the media content to be bound to a MediaSource . Use the handler for this to set the media content for the source by calling SetStream , SetStreamReference , or SetUri . */
  def onbinding(ev: MediaBindingEventArgs with WinRTEvent[MediaBinder]): Unit = js.native
  /** Occurs when a media player is ready for the media content to be bound to a MediaSource . Use the handler for this to set the media content for the source by calling SetStream , SetStreamReference , or SetUri . */
  @JSName("onbinding")
  var onbinding_Original: TypedEventHandler[MediaBinder, MediaBindingEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_binding(`type`: binding, listener: TypedEventHandler[MediaBinder, MediaBindingEventArgs]): Unit = js.native
  
  /** Gets the MediaSource object associated with the MediaBinder . */
  var source: MediaSource = js.native
  
  /** Gets or sets an app-specified string that is used to identify the media content that the app should bind when the Binding event is raised. */
  var token: String = js.native
}
