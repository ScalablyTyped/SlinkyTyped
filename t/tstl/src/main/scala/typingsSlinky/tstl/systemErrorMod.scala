package typingsSlinky.tstl

import typingsSlinky.tstl.errorCategoryMod.ErrorCategory
import typingsSlinky.tstl.errorCodeMod.ErrorCode
import typingsSlinky.tstl.runtimeErrorMod.RuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/SystemError", JSImport.Namespace)
@js.native
object systemErrorMod extends js.Object {
  
  @js.native
  class SystemError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param code An error code.
      * @param message A detailed error message.
      */
    def this(code: ErrorCode) = this()
    def this(code: ErrorCode, message: String) = this()
    /**
      * Construct from references.
      *
      * @param val Identnfier of an error code in *category*.
      * @param category An error category.
      * @param message A detailed error message.
      */
    def this(`val`: Double, category: ErrorCategory) = this()
    def this(`val`: Double, category: ErrorCategory, message: String) = this()
    
    /**
      * Get error code.
      *
      * @return The error code.
      */
    def code(): ErrorCode = js.native
    
    var code_ : ErrorCode = js.native
  }
}
