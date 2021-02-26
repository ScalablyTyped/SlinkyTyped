package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.setupIntents.SetupIntentCancelationReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var cancellation_reason: js.UndefOr[SetupIntentCancelationReason] = js.native
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancellation_reason(value: SetupIntentCancelationReason): Self = StObject.set(x, "cancellation_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellation_reasonUndefined: Self = StObject.set(x, "cancellation_reason", js.undefined)
  }
}
