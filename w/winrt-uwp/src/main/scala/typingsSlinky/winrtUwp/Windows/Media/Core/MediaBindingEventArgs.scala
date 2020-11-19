package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.canceled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaBindingEventArgs extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canceled(`type`: canceled, listener: TypedEventHandler[MediaBindingEventArgs, _]): Unit = js.native
  
  /**
    * Informs the system that the app might continue to perform work after the Binding event handler returns.
    * @return The requested deferral.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets the MediaBinder associated with the binding event. */
  var mediaBinder: MediaBinder = js.native
  
  /** Occurs when the binding operation is cancelled. */
  def oncanceled(ev: js.Any with WinRTEvent[MediaBindingEventArgs]): Unit = js.native
  /** Occurs when the binding operation is cancelled. */
  @JSName("oncanceled")
  var oncanceled_Original: TypedEventHandler[MediaBindingEventArgs, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canceled(`type`: canceled, listener: TypedEventHandler[MediaBindingEventArgs, _]): Unit = js.native
  
  /**
    * Sets the media content to be bound to the MediaSource .
    * @param stream A stream containing the media content.
    * @param contentType A string specifying the content type of the media content.
    */
  def setStream(stream: IRandomAccessStream, contentType: String): Unit = js.native
  
  /**
    * Sets the media content to be bound to the MediaSource .
    * @param stream A stream reference containing the media content to be bound.
    * @param contentType A string specifying the content type of the media content.
    */
  def setStreamReference(stream: IRandomAccessStreamReference, contentType: String): Unit = js.native
  
  /**
    * Sets the URI of the media content to be bound to the MediaSource .
    * @param uri The URI of the media content to be bound.
    */
  def setUri(uri: Uri): Unit = js.native
}
