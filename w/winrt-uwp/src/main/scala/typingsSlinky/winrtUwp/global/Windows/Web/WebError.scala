package typingsSlinky.winrtUwp.global.Windows.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides error status resulting from a web service operation. */
@JSGlobal("Windows.Web.WebError")
@js.native
abstract class WebError ()
  extends typingsSlinky.winrtUwp.Windows.Web.WebError
/* static members */
@JSGlobal("Windows.Web.WebError")
@js.native
object WebError extends js.Object {
  
  /**
    * Gets a WebErrorStatus value based on an error encountered by a web service operation.
    * @param hresult The error encountered by a web service operation represented as an hResult.
    * @return The error status value for a web service operation.
    */
  def getStatus(hresult: Double): typingsSlinky.winrtUwp.Windows.Web.WebErrorStatus = js.native
}
