package typingsSlinky.winrtUwp.Windows.Web.Http.Filters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpCacheWriteBehavior extends js.Object
/** Indicates if content returned by requests used by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces is written to the local HTTP cache. */
@JSGlobal("Windows.Web.Http.Filters.HttpCacheWriteBehavior")
@js.native
object HttpCacheWriteBehavior extends js.Object {
  
  /** Use the default behavior of WinInet. This usually results in writing the response to the local HTTP cache. */
  @js.native
  sealed trait default extends HttpCacheWriteBehavior
  
  /** Never write the response to the local HTTP cache. */
  @js.native
  sealed trait noCache extends HttpCacheWriteBehavior
}
