package typingsSlinky.winrtUwp.Windows.Web.Http.Filters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpCookieUsageBehavior extends js.Object
/** Defines the cookie usage behavior that is used in the CookieUsageBehavior property. */
@JSGlobal("Windows.Web.Http.Filters.HttpCookieUsageBehavior")
@js.native
object HttpCookieUsageBehavior extends js.Object {
  
  /** Automatically handle cookies. */
  @js.native
  sealed trait default extends HttpCookieUsageBehavior
  
  /** Do not handle cookies automatically. */
  @js.native
  sealed trait noCookies extends HttpCookieUsageBehavior
}
