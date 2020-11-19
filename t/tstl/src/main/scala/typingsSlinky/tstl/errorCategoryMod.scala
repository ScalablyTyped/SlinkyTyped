package typingsSlinky.tstl

import typingsSlinky.tstl.errorCodeMod.ErrorCode
import typingsSlinky.tstl.errorConditionMod.ErrorCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/ErrorCategory", JSImport.Namespace)
@js.native
object errorCategoryMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ErrorCategory () extends js.Object {
    
    /**
      * Get default error condition.
      *
      * @param val Identifier of an error condition.
      * @return The error condition.
      */
    def default_error_condition(`val`: Double): ErrorCondition = js.native
    
    /**
      * Test equivalence.
      *
      * @param code An error code.
      * @param val_cond Identifier of an error condition.
      * @return Whether equivalent or not.
      */
    def equivalent(code: ErrorCode, val_cond: Double): Boolean = js.native
    /**
      * Test equivalence.
      *
      * @param val_code Identifier of an error code.
      * @param cond An error condition.
      * @return Whether equivalent or not.
      */
    def equivalent(val_code: Double, cond: ErrorCondition): Boolean = js.native
    
    /**
      * Get error message.
      *
      * @param val Identifier of an error condition.
      * @return The error message.
      */
    def message(`val`: Double): String = js.native
    
    /**
      * Get category name.
      */
    def name(): String = js.native
  }
}
