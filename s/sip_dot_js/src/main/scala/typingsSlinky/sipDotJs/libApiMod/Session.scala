package typingsSlinky.sipDotJs.libApiMod

import typingsSlinky.sipDotJs.libApiSessionDashOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Session")
@js.native
abstract class Session protected ()
  extends typingsSlinky.sipDotJs.libApiSessionMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent) = this()
  protected def this(userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent, options: SessionOptions) = this()
}

