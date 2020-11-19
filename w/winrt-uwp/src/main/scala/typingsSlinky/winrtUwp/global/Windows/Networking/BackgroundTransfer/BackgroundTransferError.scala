package typingsSlinky.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrtUwp.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide errors encountered during a transfer operation. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
@js.native
abstract class BackgroundTransferError ()
  extends typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferError
/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
@js.native
object BackgroundTransferError extends js.Object {
  
  /**
    * Gets the specific error using the returned HRESULT value. Possible values are defined by WebErrorStatus .
    * @param hresult An HRESULT returned during the operation.
    * @return The error encountered.
    */
  def getStatus(hresult: Double): WebErrorStatus = js.native
}
