package typingsSlinky.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/exceptions", JSImport.Namespace)
@js.native
object coreExceptionsMod extends js.Object {
  @js.native
  abstract class Exception protected ()
    extends typingsSlinky.sipJs.exceptionMod.Exception {
    protected def this(message: String) = this()
  }
  
  @js.native
  class TransactionStateError ()
    extends typingsSlinky.sipJs.transactionStateErrorMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @js.native
  class TransportError ()
    extends typingsSlinky.sipJs.transportErrorMod.TransportError {
    def this(message: String) = this()
  }
  
}

