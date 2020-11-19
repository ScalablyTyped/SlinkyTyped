package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Session")
@js.native
abstract class Session protected ()
  extends typingsSlinky.sipJs.apiMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, options: SessionOptions) = this()
}
