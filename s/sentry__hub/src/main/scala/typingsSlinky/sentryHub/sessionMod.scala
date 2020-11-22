package typingsSlinky.sentryHub

import typingsSlinky.sentryHub.anon.OmitSessionContextstarted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/hub/dist/session", JSImport.Namespace)
@js.native
object sessionMod extends js.Object {
  
  @js.native
  class Session ()
    extends typingsSlinky.sentryTypes.sessionMod.Session {
    def this(context: OmitSessionContextstarted) = this()
  }
}
