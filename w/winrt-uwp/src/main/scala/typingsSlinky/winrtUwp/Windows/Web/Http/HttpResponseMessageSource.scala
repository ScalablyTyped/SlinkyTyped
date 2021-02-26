package typingsSlinky.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpResponseMessageSource extends StObject
/** Indicates the source of the data received in the HttpResponseMessage . */
@JSGlobal("Windows.Web.Http.HttpResponseMessageSource")
@js.native
object HttpResponseMessageSource extends StObject {
  
  /** The data was from the local cache. */
  @js.native
  sealed trait cache extends HttpResponseMessageSource
  
  /** The data was received over the network. */
  @js.native
  sealed trait network extends HttpResponseMessageSource
  
  /** A default value that should not be returned under normal circumstances. */
  @js.native
  sealed trait none extends HttpResponseMessageSource
}
