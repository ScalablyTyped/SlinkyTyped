package typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.revoked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports managing a request for extended foreground execution. */
@js.native
trait ExtendedExecutionForegroundSession extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_revoked(`type`: revoked, listener: TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs]): Unit = js.native
  
  /** Closes the session and removes the application's extended execution capability. */
  def close(): Unit = js.native
  
  /** Gets or sets a string to display in the shell. */
  var description: String = js.native
  
  /** This event occurs when the system revokes extended execution. */
  def onrevoked(ev: ExtendedExecutionForegroundRevokedEventArgs with WinRTEvent[_]): Unit = js.native
  /** This event occurs when the system revokes extended execution. */
  @JSName("onrevoked")
  var onrevoked_Original: TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs] = js.native
  
  /** Gets or sets the reason for the extended execution request. */
  var reason: ExtendedExecutionForegroundReason = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_revoked(`type`: revoked, listener: TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs]): Unit = js.native
  
  /**
    * Requests extended execution
    * @return The result of the request.
    */
  def requestExtensionAsync(): IPromiseWithIAsyncOperation[ExtendedExecutionForegroundResult] = js.native
}
