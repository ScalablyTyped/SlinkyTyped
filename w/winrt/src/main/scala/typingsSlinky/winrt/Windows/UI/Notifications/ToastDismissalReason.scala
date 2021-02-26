package typingsSlinky.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToastDismissalReason extends StObject
@JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
@js.native
object ToastDismissalReason extends StObject {
  
  @js.native
  sealed trait applicationHidden extends ToastDismissalReason
  
  @js.native
  sealed trait timedOut extends ToastDismissalReason
  
  @js.native
  sealed trait userCanceled extends ToastDismissalReason
}
