package typingsSlinky.winrtUwp.global.Windows.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides error status resulting from a web service operation. */
@JSGlobal("Windows.Web.WebError")
@js.native
abstract class WebError ()
  extends typingsSlinky.winrtUwp.Windows.Web.WebError
object WebError {
  
  /**
    * Gets a WebErrorStatus value based on an error encountered by a web service operation.
    * @param hresult The error encountered by a web service operation represented as an hResult.
    * @return The error status value for a web service operation.
    */
  /* static member */
  @JSGlobal("Windows.Web.WebError.getStatus")
  @js.native
  def getStatus(hresult: Double): typingsSlinky.winrtUwp.Windows.Web.WebErrorStatus = js.native
}
