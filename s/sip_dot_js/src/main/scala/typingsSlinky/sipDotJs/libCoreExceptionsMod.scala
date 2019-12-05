package typingsSlinky.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/exceptions", JSImport.Namespace)
@js.native
object libCoreExceptionsMod extends js.Object {
  @js.native
  abstract class Exception protected ()
    extends typingsSlinky.sipDotJs.libCoreExceptionsExceptionMod.Exception {
    protected def this(message: String) = this()
  }
  
  @js.native
  class TransactionStateError ()
    extends typingsSlinky.sipDotJs.libCoreExceptionsTransactionDashStateDashErrorMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @js.native
  class TransportError ()
    extends typingsSlinky.sipDotJs.libCoreExceptionsTransportDashErrorMod.TransportError {
    def this(message: String) = this()
  }
  
}

