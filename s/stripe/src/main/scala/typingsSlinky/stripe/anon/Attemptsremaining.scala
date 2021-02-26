package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attemptsremaining extends StObject {
  
  var attempts_remaining: Double = js.native
  
  var status: pending | succeeded | failed = js.native
}
object Attemptsremaining {
  
  @scala.inline
  def apply(attempts_remaining: Double, status: pending | succeeded | failed): Attemptsremaining = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attemptsremaining]
  }
  
  @scala.inline
  implicit class AttemptsremainingMutableBuilder[Self <: Attemptsremaining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempts_remaining(value: Double): Self = StObject.set(x, "attempts_remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending | succeeded | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
