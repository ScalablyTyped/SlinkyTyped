package typingsSlinky.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  var error: typingsSlinky.stripeV3.stripe.Error = js.native
}
object Error {
  
  @scala.inline
  def apply(error: typingsSlinky.stripeV3.stripe.Error): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: typingsSlinky.stripeV3.stripe.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
