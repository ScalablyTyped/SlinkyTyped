package typingsSlinky.tstl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  @js.native
  class DomainError protected ()
    extends typingsSlinky.tstl.exceptionLogicErrorMod.DomainError {
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
    extends typingsSlinky.tstl.exceptionErrorCategoryMod.ErrorCategory
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCode ()
    extends typingsSlinky.tstl.exceptionErrorCodeMod.ErrorCode {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error instance.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typingsSlinky.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition ()
    extends typingsSlinky.tstl.exceptionErrorConditionMod.ErrorCondition {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typingsSlinky.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class Exception ()
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
    extends typingsSlinky.tstl.exceptionLogicErrorMod.InvalidArgument {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LengthError protected ()
    extends typingsSlinky.tstl.exceptionLogicErrorMod.LengthError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LogicError protected ()
    extends typingsSlinky.tstl.exceptionLogicErrorMod.LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OutOfRange protected ()
    extends typingsSlinky.tstl.exceptionLogicErrorMod.OutOfRange {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OverflowError protected ()
    extends typingsSlinky.tstl.exceptionRuntimeErrorMod.OverflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RangeError protected ()
    extends typingsSlinky.tstl.exceptionRuntimeErrorMod.RangeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RuntimeError protected ()
    extends typingsSlinky.tstl.exceptionRuntimeErrorMod.RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class SystemError protected ()
    extends typingsSlinky.tstl.exceptionSystemErrorMod.SystemError {
    /**
      * Initializer Constructor.
      *
      * @param code An error code.
      * @param message A detailed error message.
      */
    def this(code: typingsSlinky.tstl.exceptionErrorCodeMod.ErrorCode) = this()
    def this(code: typingsSlinky.tstl.exceptionErrorCodeMod.ErrorCode, message: String) = this()
    /**
      * Construct from references.
      *
      * @param val Identnfier of an error code in *category*.
      * @param category An error category.
      * @param message A detailed error message.
      */
    def this(`val`: Double, category: typingsSlinky.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
    def this(
      `val`: Double,
      category: typingsSlinky.tstl.exceptionErrorCategoryMod.ErrorCategory,
      message: String
    ) = this()
  }
  
  @js.native
  class UnderflowError protected ()
    extends typingsSlinky.tstl.exceptionRuntimeErrorMod.UnderflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  var domain_error: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionLogicErrorMod.DomainError] = js.native
  var error_category: Instantiable0[typingsSlinky.tstl.exceptionErrorCategoryMod.ErrorCategory] = js.native
  var error_code: Instantiable0[typingsSlinky.tstl.exceptionErrorCodeMod.ErrorCode] = js.native
  var error_condition: Instantiable0[typingsSlinky.tstl.exceptionErrorConditionMod.ErrorCondition] = js.native
  val exception: Instantiable0[typingsSlinky.tstl.exceptionExceptionMod.Exception] = js.native
  var invalid_argument: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionLogicErrorMod.InvalidArgument] = js.native
  var length_error: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionLogicErrorMod.LengthError] = js.native
  var logic_error: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionLogicErrorMod.LogicError] = js.native
  var out_of_range: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionLogicErrorMod.OutOfRange] = js.native
  var overflow_error: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionRuntimeErrorMod.OverflowError] = js.native
  var range_error: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionRuntimeErrorMod.RangeError] = js.native
  var runtime_error: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionRuntimeErrorMod.RuntimeError] = js.native
  var system_error: Instantiable2[
    /* code */ typingsSlinky.tstl.exceptionErrorCodeMod.ErrorCode, 
    js.UndefOr[/* message */ String], 
    typingsSlinky.tstl.exceptionSystemErrorMod.SystemError
  ] = js.native
  var underflow_error: Instantiable1[/* message */ String, typingsSlinky.tstl.exceptionRuntimeErrorMod.UnderflowError] = js.native
  def get_terminate(): js.UndefOr[js.Function0[Unit]] = js.native
  def set_terminate(func: js.Function0[Unit]): Unit = js.native
  def terminate(): Unit = js.native
}

