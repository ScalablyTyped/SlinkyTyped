package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.sourcerequested
import typingsSlinky.winrtUwp.winrtUwpStrings.sourceselected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to Play To capabilities. */
@js.native
trait PlayToManager extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcerequested(
    `type`: sourcerequested,
    listener: TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceselected(`type`: sourceselected, listener: TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs]): Unit = js.native
  
  /** Enables or disables the default source selection for Play To. */
  var defaultSourceSelection: Boolean = js.native
  
  /** Occurs when a user requests media to stream to a Play To target device. */
  def onsourcerequested(ev: PlayToSourceRequestedEventArgs with WinRTEvent[PlayToManager]): Unit = js.native
  /** Occurs when a user requests media to stream to a Play To target device. */
  @JSName("onsourcerequested")
  var onsourcerequested_Original: TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs] = js.native
  
  /** Occurs when a Play To source element has been selected. */
  def onsourceselected(ev: PlayToSourceSelectedEventArgs with WinRTEvent[PlayToManager]): Unit = js.native
  /** Occurs when a Play To source element has been selected. */
  @JSName("onsourceselected")
  var onsourceselected_Original: TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcerequested(
    `type`: sourcerequested,
    listener: TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceselected(`type`: sourceselected, listener: TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs]): Unit = js.native
}
