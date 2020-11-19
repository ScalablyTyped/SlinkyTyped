package typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallHistoryEntryOtherAppReadAccess extends js.Object
/** The level of read access provided to other applications. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess")
@js.native
object PhoneCallHistoryEntryOtherAppReadAccess extends js.Object {
  
  /** Other applications have full read access to this PhoneCallHistoryEntry object. */
  @js.native
  sealed trait full extends PhoneCallHistoryEntryOtherAppReadAccess
  
  /** Other applications can only read system-level information. */
  @js.native
  sealed trait systemOnly extends PhoneCallHistoryEntryOtherAppReadAccess
}
