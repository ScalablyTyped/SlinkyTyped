package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typingsSlinky.winrtUwp.Windows.Foundation.AsyncStatus
import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction
import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the sending of a message. */
@js.native
trait SendSmsMessageOperation extends StObject {
  
  /** Cancels the asynchronous operation. */
  def cancel(): Unit = js.native
  
  /** Closes the asynchronous operation. */
  def close(): Unit = js.native
  
  /** A handler for the completed event of an asynchronous action. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  /** A handler for the completed event of an asynchronous action. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError = js.native
  
  /** Retrieves the result of the asynchronous operation. */
  def getResults(): Unit = js.native
  
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double = js.native
  
  /** Specifies the status of the asynchronous message operation. */
  var status: AsyncStatus = js.native
}
