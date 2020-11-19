package typingsSlinky.winjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Properties
//#region Objects
/**
  * An error object.
  **/
@JSImport("winjs", "ErrorFromName")
@js.native
class ErrorFromName protected ()
  extends typingsSlinky.winjs.WinJS.ErrorFromName {
  //#region Constructors
  /**
    * Creates an Error object with the specified name and message properties.
    * @constructor
    * @param name The name of this error. The name is meant to be consumed programmatically and should not be localized.
    * @param message The message for this error. The message is meant to be consumed by humans and should be localized.
    **/
  def this(name: String) = this()
  def this(name: String, message: String) = this()
}
/* static members */
@JSImport("winjs", "ErrorFromName")
@js.native
object ErrorFromName extends js.Object {
  
  //#endregion Constructors
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}
