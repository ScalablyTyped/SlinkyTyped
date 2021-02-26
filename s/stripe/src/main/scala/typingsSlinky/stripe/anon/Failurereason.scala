package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.declined
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.not_required
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.processing_error
import typingsSlinky.stripe.stripeStrings.succeeded
import typingsSlinky.stripe.stripeStrings.user_abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Failurereason extends StObject {
  
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.native
  
  var return_url: String = js.native
  
  var status: pending | succeeded | not_required | failed = js.native
  
  var url: String = js.native
}
object Failurereason {
  
  @scala.inline
  def apply(return_url: String, status: pending | succeeded | not_required | failed, url: String): Failurereason = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failurereason]
  }
  
  @scala.inline
  implicit class FailurereasonMutableBuilder[Self <: Failurereason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure_reason(value: user_abort | declined | processing_error): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
    
    @scala.inline
    def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending | succeeded | not_required | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
