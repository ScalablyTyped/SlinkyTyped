package typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasPasswordHistoryResult extends js.Object
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
@js.native
object EasPasswordHistoryResult extends js.Object {
  
  @js.native
  sealed trait canBeCompliant extends EasPasswordHistoryResult
  
  @js.native
  sealed trait compliant extends EasPasswordHistoryResult
  
  @js.native
  sealed trait invalidParameter extends EasPasswordHistoryResult
  
  @js.native
  sealed trait notEvaluated extends EasPasswordHistoryResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasPasswordHistoryResult
}
