package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CountError extends js.Object
/**
  * Indicates that the IListDataAdapter was unable to provide a count.
  **/
@JSGlobal("WinJS.UI.CountError")
@js.native
object CountError extends js.Object {
  
  /**
    * An attempt to count items timed out.
    **/
  @js.native
  sealed trait noResponse extends CountError
}
