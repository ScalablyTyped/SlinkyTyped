package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.messageavailablechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for handling message events. */
@js.native
trait RcsEndUserMessageManager extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageavailablechanged(
    `type`: messageavailablechanged,
    listener: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): Unit = js.native
  
  /** Occurs when a new message is available. */
  def onmessageavailablechanged(ev: RcsEndUserMessageAvailableEventArgs with WinRTEvent[RcsEndUserMessageManager]): Unit = js.native
  /** Occurs when a new message is available. */
  @JSName("onmessageavailablechanged")
  var onmessageavailablechanged_Original: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageavailablechanged(
    `type`: messageavailablechanged,
    listener: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): Unit = js.native
}
