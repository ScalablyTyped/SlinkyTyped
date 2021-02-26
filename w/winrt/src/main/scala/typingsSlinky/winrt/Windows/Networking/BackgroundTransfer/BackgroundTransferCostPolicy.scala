package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTransferCostPolicy extends StObject
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
@js.native
object BackgroundTransferCostPolicy extends StObject {
  
  @js.native
  sealed trait default extends BackgroundTransferCostPolicy
  
  @js.native
  sealed trait always extends BackgroundTransferCostPolicy
  
  @js.native
  sealed trait unrestrictedOnly extends BackgroundTransferCostPolicy
}
