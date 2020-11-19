package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Calls

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for the application to get access to the PhoneCallHistoryStore . */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager")
@js.native
abstract class PhoneCallHistoryManager ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryManager
/* static members */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager")
@js.native
object PhoneCallHistoryManager extends js.Object {
  
  /**
    * Requests the PhoneCallHistoryStore associated with the calling application.
    * @param accessType The type of access requested for the PhoneCallHistoryStore object.
    * @return An asynchronous operation that returns a PhoneCallHistoryStore object on successful completion.
    */
  def requestStoreAsync(accessType: typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStore] = js.native
}
