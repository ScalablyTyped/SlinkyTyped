package typingsSlinky.web3CoreHelpers.mod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionRevertInstructionError extends Error {
  
  var reason: String = js.native
  
  var signature: String = js.native
}
object TransactionRevertInstructionError {
  
  @scala.inline
  def apply(message: String, name: String, reason: String, signature: String): TransactionRevertInstructionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRevertInstructionError]
  }
  
  @scala.inline
  implicit class TransactionRevertInstructionErrorMutableBuilder[Self <: TransactionRevertInstructionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
