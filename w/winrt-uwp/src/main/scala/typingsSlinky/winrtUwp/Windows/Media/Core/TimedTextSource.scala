package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a source of timed text data. */
@js.native
trait TimedTextSource extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
  
  /** Occurs when the TimedTextSource is resolved. */
  def onresolved(ev: TimedTextSourceResolveResultEventArgs with WinRTEvent[TimedTextSource]): Unit = js.native
  /** Occurs when the TimedTextSource is resolved. */
  @JSName("onresolved")
  var onresolved_Original: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
}
