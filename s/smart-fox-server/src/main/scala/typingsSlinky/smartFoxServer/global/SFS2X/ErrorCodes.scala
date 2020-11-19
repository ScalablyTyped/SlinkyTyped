package typingsSlinky.smartFoxServer.global.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.ErrorCodes")
@js.native
class ErrorCodes ()
  extends typingsSlinky.smartFoxServer.SFS2X.ErrorCodes
/* static members */
@JSGlobal("SFS2X.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  
  /**
    * Sets the text of the error message corresponding to the passed error code.
    * @param {number} code    The code of the error message to be modified.
    * @param {string} message The new error message, including the placeholders for runtime informations.
    */
  def setErrorMessage(code: Double, message: String): Unit = js.native
}
