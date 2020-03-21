package typingsSlinky.tstl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "SystemError")
@js.native
class SystemError protected ()
  extends typingsSlinky.tstl.exceptionMod.SystemError {
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

