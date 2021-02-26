package typingsSlinky.winjs.mod

import org.scalablytyped.runtime.StObject
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
object ErrorFromName {
  
  @JSImport("winjs", "ErrorFromName")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Constructors
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "ErrorFromName.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
