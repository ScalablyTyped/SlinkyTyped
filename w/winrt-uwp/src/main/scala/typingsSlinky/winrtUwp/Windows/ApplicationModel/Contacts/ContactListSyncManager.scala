package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.syncstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for syncing contact information with the server. */
@js.native
trait ContactListSyncManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[ContactListSyncManager, _]): Unit = js.native
  
  /** Gets the last time a sync was attempted with the server. */
  var lastAttemptedSyncTime: js.Date = js.native
  
  /** Gets the last time the ContactList was successfully synced with the server. */
  var lastSuccessfulSyncTime: js.Date = js.native
  
  /** Occurs when the sync status with the server has changed. */
  def onsyncstatuschanged(ev: js.Any with WinRTEvent[ContactListSyncManager]): Unit = js.native
  /** Occurs when the sync status with the server has changed. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: TypedEventHandler[ContactListSyncManager, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[ContactListSyncManager, _]): Unit = js.native
  
  /** Gets the ContactListSyncStatus . */
  var status: ContactListSyncStatus = js.native
  
  /**
    * Asynchronously attempts to sync with the contacts server.
    * @return A Boolean value indicating if the sync was successful.
    */
  def syncAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}
