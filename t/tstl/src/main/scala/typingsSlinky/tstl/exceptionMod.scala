package typingsSlinky.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  
  @JSName("get_terminate")
  def getTerminate(): js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSName("set_terminate")
  def setTerminate(func: js.Function0[Unit]): Unit = js.native
  
  def terminate(): Unit = js.native
  
  @js.native
  class DomainError protected ()
    extends typingsSlinky.tstl.domainErrorMod.DomainError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ErrorCategory ()
    extends typingsSlinky.tstl.errorCategoryMod.ErrorCategory
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCode ()
    extends typingsSlinky.tstl.errorCodeMod.ErrorCode {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error instance.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typingsSlinky.tstl.errorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition ()
    extends typingsSlinky.tstl.errorConditionMod.ErrorCondition {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typingsSlinky.tstl.errorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  class Exception protected ()
    extends typingsSlinky.tstl.exceptionExceptionMod.Exception {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class InvalidArgument protected ()
    extends typingsSlinky.tstl.invalidArgumentMod.InvalidArgument {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LengthError protected ()
    extends typingsSlinky.tstl.lengthErrorMod.LengthError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LogicError protected ()
    extends typingsSlinky.tstl.logicErrorMod.LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OutOfRange protected ()
    extends typingsSlinky.tstl.outOfRangeMod.OutOfRange {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OverflowError protected ()
    extends typingsSlinky.tstl.overflowErrorMod.OverflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RangeError protected ()
    extends typingsSlinky.tstl.rangeErrorMod.RangeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RuntimeError protected ()
    extends typingsSlinky.tstl.runtimeErrorMod.RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class SystemError protected ()
    extends typingsSlinky.tstl.systemErrorMod.SystemError {
    /**
      * Initializer Constructor.
      *
      * @param code An error code.
      * @param message A detailed error message.
      */
    def this(code: typingsSlinky.tstl.errorCodeMod.ErrorCode) = this()
    def this(code: typingsSlinky.tstl.errorCodeMod.ErrorCode, message: String) = this()
    /**
      * Construct from references.
      *
      * @param val Identnfier of an error code in *category*.
      * @param category An error category.
      * @param message A detailed error message.
      */
    def this(`val`: Double, category: typingsSlinky.tstl.errorCategoryMod.ErrorCategory) = this()
    def this(`val`: Double, category: typingsSlinky.tstl.errorCategoryMod.ErrorCategory, message: String) = this()
  }
  
  @js.native
  class UnderflowError protected ()
    extends typingsSlinky.tstl.underflowErrorMod.UnderflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
}
